package org.example.github;

import core.drivers.BrowsersType;
import core.drivers.DriverSingleton;
import github.BasePage;
import github.loginpage.LoginPage;
import github.mainpage.MainPage;
import github.navbar.accordion.UserAccordion;
import github.navbar.accordion.UserAccordionLocators;
import github.userpage.UserPage;
import org.example.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class GithubCheck extends BaseTest {

    @BeforeClass
    public void setUp() {
        initDriver(BrowsersType.CHROME);
        BasePage page = new BasePage(driver);
    }

    @AfterClass
    void fin() {
        driver.quit();
    }

    @Test
    public void gitHubCheck() {
        open("https://github.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.getSingIn().click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkLoginByUser(DataLoginTest.POSITIVE.login, DataLoginTest.POSITIVE.password);

        UserPage userPage = new UserPage(driver);
        userPage.getNavbar().getUserMenuBtn().click();

        Assert.assertTrue(waiter(UserAccordionLocators.USER_ACCORDION_TITLE).isDisplayed());
    }

    private WebElement waiter(By by) {

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    void getSleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

