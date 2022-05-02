package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractFragment {
    @FindBy(xpath = "//div[@class='user-nav']")
    private static WebElement navigationBar;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public static WebElement getNavigationBar() {
        return navigationBar;
    }

    public void clickHomeIcon() {
        navigationBar.findElement(By.xpath("//a[@class='home-icon-link']")).click();
    }

    @Override
    public WebElement getRootElement() {
        return navigationBar;
    }
}
