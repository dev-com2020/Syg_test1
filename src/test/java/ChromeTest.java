import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChromeTest {

    WebDriver driver;
    ChromeOptions chromeOptions;

    @BeforeAll
    static void setupDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    void search() throws InterruptedException {
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?wersja=1");
        WebElement wyszSczegolowe = driver.findElement(By.className("wyszukiwanie-szczegolowe"));
//        WebElement cookie = driver.findElement(By.xpath("//*[@id='stopkaCookiePolicy']/div/div[2]/div[1]/span"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cookie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='stopkaCookiePolicy']/div/div[2]/div[1]/span")));
        cookie.click();
        wyszSczegolowe.click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("src/main/resources/screen1.jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
}