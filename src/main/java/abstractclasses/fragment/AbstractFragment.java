package abstractclasses.fragment;

import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {

    private WebElement rootElement;

    public AbstractFragment(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }
}
