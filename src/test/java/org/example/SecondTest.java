package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//неявное ожидание

    }

    @AfterClass
    public void finish() {
        driver.quit();

    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.by");
        driver.findElement(By.xpath("//input[@name='q']"));
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.click();
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);

        // WebElement result = new WebDriverWait(driver, Duration.ofSeconds(6))
        //     .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//cite[contains(text(),'https://www.java.com')]/../../h3[text()='Загрузка Java для всех операционных систем']")));


        //  WebElement result = driver.findElement(By.xpath("//cite[contains(text(),'https://www.java.com')]/../../h3[text()='Загрузка Java для всех операционных систем']"));


       WebElement result = waiter(By.xpath("//cite[contains(text(),'https://www.java.com')]/../../h3[text()='Загрузка Java для всех операционных систем']"));

        Assert.assertTrue(result.isDisplayed());

    }

    private void getSleep() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("You have exception");
        }


    }

    private WebElement waiter(By by) {

        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(6))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

}
