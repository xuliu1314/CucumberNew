package pageobjects.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleStaticHomePage {
    public static WebElement element = null;

    public static WebElement searchInputLable(String search, WebDriver driver){

       return element = driver.findElement(By.name("q"));

    }
    public  static void searchForSomeThing(String search,WebDriver driver){
        searchInputLable(search, driver).sendKeys(search);
        searchInputLable(search, driver).submit();
    }


}
