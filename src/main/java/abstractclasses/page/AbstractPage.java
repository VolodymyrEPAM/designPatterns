package abstractclasses.page;

import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    private String pageUrl;
    private String pageUrlPattern;

    public AbstractPage(WebDriver driver) {
        driver = SingletonDriver.getDriver();
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}
