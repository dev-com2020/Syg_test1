import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Index;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestIndexShop {

    WebDriver driver;
    ChromeOptions chromeOptions;

    Index index;


    @BeforeAll
    static void setupDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupChromeDriver() {

        chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);
        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies", 2);
        chromeOptions.setExperimentalOption("prefs",prefs);

        driver = new ChromeDriver(chromeOptions);
        index = new Index(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo-store.seleniumacademy.com/");
    }

    @Test
    void contact(){
        index.clickContact();
        System.out.println("Strona wyświetlona to: " + index.getHeading());
    }

}
