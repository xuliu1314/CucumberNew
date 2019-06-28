package pageobjects.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ShareDriver;

public class GoogleHomePage extends BasePage {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }
    public  WebElement element = null;

    public  WebElement searchInputLable(){

        return element = driver.findElement(By.name("q"));

    }
    public  void searchForSomeThing(String search){
        this.searchInputLable().sendKeys(search);
        this.searchInputLable().submit();
    }

}
