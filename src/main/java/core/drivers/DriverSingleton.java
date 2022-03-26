package core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {

    private static ChromeDriver chromeDriver;
    private static EdgeDriver edgeDriver;
    private static FirefoxDriver firefoxDriver;

    public static WebDriver getDriverSingleton(BrowsersType driver) {

        switch (driver) {
            case CHROME: {
                if (chromeDriver == null) {
                    System.setProperty("webdriver.chrome.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\chromedriver.exe");
                    return new ChromeDriver();
                } else {
                    return chromeDriver;
                }
            }
            case EDGE: {
                if (edgeDriver == null) {
                    System.setProperty("webdriver.edge.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\msedgedriver.exe");
                    return new EdgeDriver();
                } else {
                    return edgeDriver;
                }

            }
            default: {
                if (firefoxDriver == null) {
                    System.setProperty("webdriver.gecko.driver", "D:\\MavenGitTestNG\\src\\main\\resources\\geckodriver.exe");
                    return new FirefoxDriver();
                } else {
                    return firefoxDriver;
                }
            }
        }
    }


}
