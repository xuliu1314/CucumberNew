package utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ShareDriver extends EventFiringWebDriver {
    private static final WebDriver REAL_DRIVER = new ChromeDriver();
    private static final Thread CLOSE_THREAD = new Thread(REAL_DRIVER::close);

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    public ShareDriver() {
        super(REAL_DRIVER);
    }


}
