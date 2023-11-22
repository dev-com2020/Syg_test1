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
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        deviceMetrics.put("width", 1411);
        deviceMetrics.put("height", 823);
        deviceMetrics.put("pixelRatio", 1.0);

        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Windows NT 6.1; WOW64) " +
                "AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/47.0.2526.111 Safari/537.36");


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);

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
        int imagesWithoutAltCount = 0;
        for (WebElement image : images) {
            String altText = image.getAttribute("alt");
            if (altText == null || altText.isEmpty()) {
                imagesWithoutAltCount++;
            }
        }
        System.out.println("Total img without alt atrr " + imagesWithoutAltCount);
    }

    @Test
    public void h3finder(){
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?podkategorie=21&stronaListy=1&sortowanie=0&liczbaPozycjiLista=20&wersja=1&widocznyPanel=lista");
        List<WebElement> headers = driver.findElements(By.tagName("h3"));
        System.out.println("Total h3: " + headers.size());
        for (WebElement header : headers) {
            String headerText = header.getText();
            System.out.println(headerText);
        }
    }
    @Test
    @DisplayName("Wyszukiwanie GOPS Gnojnik")
    public void elementH3Finder(){
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?podkategorie=21&stronaListy=1&sortowanie=0&liczbaPozycjiLista=20&wersja=1&widocznyPanel=lista");
        List<WebElement> headers = driver.findElements(By.tagName("h3"));
        boolean found = headers.stream().anyMatch(header -> header.getText().equals("GOPS Gnojnik"));
        assertTrue(found, "GOPS Gnojnik nie został znaleziony");
        }

//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
}