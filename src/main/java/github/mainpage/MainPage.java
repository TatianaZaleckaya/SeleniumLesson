package github.mainpage;

import github.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage implements MainPageLocators{

    private WebElement singIn = webDriver.findElement(SIGN_IN_BTN);

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSingIn() {
        return singIn;
    }
}
