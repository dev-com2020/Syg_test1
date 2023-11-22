import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WindowHanlingTest {

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


        chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies", 2);
        chromeOptions.setExperimentalOption("prefs",prefs);
        chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://guidebook.seleniumacademy.com/Window.html");
    }

    @Test
    void handleWindow(){
        String firstWindow = driver.getWindowHandle();
        System.out.println("First Window Handle: " + firstWindow);
        WebElement link = driver.findElement(By.linkText("Google Search"));
        link.click();

        String secondWindow = driver.getWindowHandle();
        System.out.println("Second Window Handel: " + secondWindow);
        System.out.println("Number of window handless so far: " +
                driver.getWindowHandles().size());
        driver.switchTo().window(firstWindow);

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

}
