package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Index {
    WebDriver driver;
    public Index(WebDriver driver){
        this.driver = driver;
    }

    By contact = By.xpath("//*[@id=\"top\"]/body/div[1]/div[2]/div[3]/div/div[2]/ul/li[2]/a");

    public void clickContact(){
        driver.findElement(contact).click();
    }

    public String getHeading() {
        return driver.getTitle();

    }
}