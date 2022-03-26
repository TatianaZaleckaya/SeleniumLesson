package github.loginpage;

import org.openqa.selenium.By;

public interface LoginPageLocators {

    final By LOGIN_FIELD = By.xpath("//input[@name='login']");
    final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
    final By SIGN_IN_BTN = By.xpath("//input[@name='commit']");
}
