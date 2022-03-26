package github;

import core.drivers.BrowsersType;
import core.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage{

    protected WebDriver webDriver;

//    protected WebDriver initDriver(BrowsersType typeOfDriver) {
//        return DriverSingleton.getDriverSingleton(typeOfDriver);
//    }


    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
