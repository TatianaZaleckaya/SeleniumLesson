package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class GithubCheck {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void finish(){
        driver.quit();
    }


    @Test
    public void gitHubCheck() throws InterruptedException {
        driver.get("https://github.com");
        driver.findElement(By.xpath("//a[@href='/login']"));
        WebElement singIn = driver.findElement(By.xpath("//a[@href='/login']"));
        singIn.click();
        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
        login.click();
        login.sendKeys("nekhaevna2212@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("MIStati2212");
        WebElement submit = driver.findElement(By.xpath("//input[@name='commit']"));
        submit.click();
        WebElement result = waiter(By.xpath("//a[@href='/TatianaZaleckaya/SeleniumLesson']"));
        Assert.assertTrue(result.isDisplayed());


    }
    private WebElement waiter(By by) {

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    }

