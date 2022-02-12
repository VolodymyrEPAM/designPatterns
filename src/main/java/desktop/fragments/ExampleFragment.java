package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleFragment extends AbstractFragment {
    @FindBy(xpath = "//div[@class='user-nav']")
    private static  WebElement navigationBar;

    public ExampleFragment(WebElement rootElement) {
        super(rootElement);
    }

    public static WebElement getNavigationBar() {
        return navigationBar;
    }

    @Override
    public WebElement getRootElement() {
        return navigationBar;
    }
}
