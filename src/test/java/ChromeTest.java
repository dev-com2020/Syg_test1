import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChromeTest {

    WebDriver driver;

    @BeforeAll
    static void setupDriverManager() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void setupChromeDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void goToGooglePage() {
        driver.get("https://www.google.pl/");
        String actual = driver.getCurrentUrl();
        assertEquals("https://www.google.pl/", actual);
    }
}