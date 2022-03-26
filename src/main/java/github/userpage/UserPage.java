package github.userpage;

import github.BasePage;
import github.navbar.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage extends BasePage implements UserPageLocators {

    private final Navbar navbar;

    public UserPage(WebDriver webDriver) {
        super(webDriver);
        this.navbar = new Navbar(webDriver);
    }

    public Navbar getNavbar() {
        return navbar;
    }
}
