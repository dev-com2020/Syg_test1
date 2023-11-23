import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;


public class GoogleSearchSteps {

    WebDriver driver;


    @Given("Open the browser and navigate to Google")
    public void open_the_browser_and_navigate_to_Google(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo-store.seleniumacademy.com/");
    }


    @When("Enter search term {string}")
    public void enterSearchTerm(String arg0) {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(arg0);
        search.sendKeys(Keys.ENTER);

    }

    @Then("Verify the search results are {string}")
    public void verifyTheSearchResultsAre(String arg0) {
        assertTrue(arg0.toUpperCase(),driver.findElement(By.className("page-title")).getText().contains(arg0.toUpperCase()));
    }

}
