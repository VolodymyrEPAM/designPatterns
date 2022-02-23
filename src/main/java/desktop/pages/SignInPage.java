package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBar;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Constants.SIGN_IN_PAGE_URL;
import static java.lang.String.format;

@Getter
public class SignInPage extends AbstractPage {
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='text']")
    private WebElement nameInputField;
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='email']")
    private WebElement emailInputField;
    @FindBy(xpath = "//form[@id='ap_register_form']//input[@type='password']")
    private WebElement passwordInputField;
    @FindBy(xpath = "//form[@id='ap_register_form']")
    private WebElement registerForm;

    public Boolean isFieldDisplayed(String fieldName){
        return registerForm.findElement(By.xpath(format("//input[@type='%s']", fieldName))).isDisplayed();
    }

    @Override
    public String getPageUrl() {
        return SIGN_IN_PAGE_URL;
    }

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private final WebElement navigationBar = NavigationBar.getNavigationBar();
}
