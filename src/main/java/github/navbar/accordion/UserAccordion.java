package github.navbar.accordion;

import github.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserAccordion extends BasePage implements UserAccordionLocators {

    private WebElement userAccordionTitle;

    public UserAccordion(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUserAccordionTitle() {
        return userAccordionTitle;
    }
}
