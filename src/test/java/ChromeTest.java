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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 411);
        deviceMetrics.put("height", 823);
        deviceMetrics.put("pixelRatio", 3.0);

        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 " +
                "(iPhone14,3; U; CPU iPhone OS 15_0 like Mac OS X) " +
                "AppleWebKit/602.1.50 (KHTML, like Gecko) " +
                "Version/10.0 Mobile/19A346 Safari/602.1");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
//        chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    void search() throws InterruptedException {
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?wersja=1");
        WebElement cookie = driver.findElement(By.xpath("//*[@id='stopkaCookiePolicy']/div/div[2]/div[1]/span"));
        cookie.click();
        WebElement wyszSczegolowe = driver.findElement(By.className("wyszukiwanie-szczegolowe"));
        wyszSczegolowe.click();
        WebElement checkbox = driver.findElement(By.id("label-4-21"));
        checkbox.click();
        WebElement szukaj = driver.findElement(By.xpath("//*[@id='podkategorie']/div[3]/button[2]"));
        szukaj.click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement cookie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='stopkaCookiePolicy']/div/div[2]/div[1]/span")));

//        Thread.sleep(2);
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(scrFile, new File("src/main/resources/screen1.jpg"));
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }


    @Test
    public void linksTest(){
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?wersja=1");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());
        long count = links.stream().filter(WebElement::isDisplayed).count();
        System.out.println("Total link visible: " + count);
    }

    @Test
    public void imgAltTest(){
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?wersja=1");
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total img: " + images.size());
        List<WebElement> imagesWithOutAlt = images.stream()
                .filter(item -> item.getAttribute("alt") == "")
                        .collect(Collectors.toList());
        System.out.println("Total img without alt atrr " + imagesWithOutAlt);
    }

//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
}