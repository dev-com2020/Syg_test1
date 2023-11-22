import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Maps {

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
//        Cookie cookies = new Cookie("PRIVACY_POLICY", "TRUE", "/", null);


        //        chromeOptions.addArguments("--disable-notifications");

        chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies", 2);
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void goMaps() {
        driver.get("https://rjps.mrips.gov.pl/RJPS/WJ/start.do?stronaListy=1&liczbaPozycjiLista=20&wersja=1&widocznyPanel=mapa");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loaderId")));
        WebElement cookie = driver.findElement(By.xpath("//*[@id='stopkaCookiePolicy']/div/div[2]/div[1]/span"));
        cookie.click();
        WebElement input = driver.findElement(By.id("miejscowosc"));
        input.sendKeys("Kraków, małopolskie");
        input.sendKeys(Keys.ENTER);
        WebElement map = driver.findElement(By.className("mapa"));
        Actions actions = new Actions(driver);
        actions.moveToElement(map).build().perform();
        actions.contextClick().perform();
    }
}
