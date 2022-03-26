package github.navbar;

import github.BasePage;
import github.navbar.accordion.UserAccordion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navbar extends BasePage implements NavbarLocators {

    private final WebElement userMenuBtn = webDriver.findElement(USER_MENU_BTN);

//    private final UserAccordion userAccordion;

    public Navbar(WebDriver webDriver) {
        super(webDriver);
//        this.userAccordion = new UserAccordion(webDriver);
    }

    public WebElement getUserMenuBtn() {
        return userMenuBtn;
    }

//    public UserAccordion getUserAccordion() {
//        return userAccordion;
//    }
}
