package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    private static final WebDriver driver = new ChromeDriver();

    public static WebDriver getDriver() {
        return driver;
    }
}
