package abstractclasses.fragment;

import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractFragment {

    private WebElement rootElement;
    protected final WebDriver driver;

    protected AbstractFragment(WebDriver driver) {
        this.driver = SingletonDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }
}
