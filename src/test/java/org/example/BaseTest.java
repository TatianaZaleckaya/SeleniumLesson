package org.example;

import core.drivers.BrowsersType;
import core.drivers.DriverSingleton;
import github.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    void beforeBaseTest() {
    }

    @AfterClass
    void finishTest() {
        driver.quit();
    }

    protected void initDriver(BrowsersType typeOfDriver) {
        driver = DriverSingleton.getDriverSingleton(typeOfDriver);
    }

    protected void open(String url) {
        driver.get(url);
    }
}
