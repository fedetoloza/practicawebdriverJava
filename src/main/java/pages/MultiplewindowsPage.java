package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiplewindowsPage {

    private WebDriver driver;
    private By clickhereLink = By.linkText("Click Here");

    public MultiplewindowsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickHere(){
        driver.findElement(clickhereLink).click();
    }
}
