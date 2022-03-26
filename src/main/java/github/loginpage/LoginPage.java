package github.loginpage;

import github.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage implements LoginPageLocators {

    private final WebElement loginField = webDriver.findElement(LOGIN_FIELD);
    private final WebElement passwordField = webDriver.findElement(PASSWORD_FIELD);
    private final WebElement signInButton = webDriver.findElement(SIGN_IN_BTN);

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkLoginByUser(String login, String password) {
        loginField.click();
        loginField.sendKeys(login);
        passwordField.click();
        passwordField.sendKeys(password);
        signInButton.click();
    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}
