package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {
    static WebDriver driver;
//    static WebDriver driver = new ChromeDriver();

//    static SingletonDriver singletonDriver = new SingletonDriver();

    private SingletonDriver() {
    }

    public static WebDriver getDriver() {
       if (null == driver) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
        }
        return driver;
    }
}
