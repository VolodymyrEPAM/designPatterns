package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.ExampleFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExamplePage extends AbstractPage {
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='text']")
    private WebElement nameInputField;
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='password']")
    private WebElement passwordInputField;

    private final WebElement navigationBar = ExampleFragment.getNavigationBar();

    @Override
    public String getPageUrl() {
        return "https://www.bookdepository.com/account/login/to/account";
    }

    public ExamplePage(WebDriver driver) {
        super(driver);
    }
}
