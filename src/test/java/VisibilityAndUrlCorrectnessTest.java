import desktop.fragments.NavigationBar;
import desktop.pages.SignInPage;
import driver.SingletonDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static constants.Constants.*;
import static org.junit.Assert.assertTrue;

public class VisibilityAndUrlCorrectnessTest {
    private WebDriver driver = SingletonDriver.getDriver();
    private List<String> params = new ArrayList<String>() {{
        add(NAME);
        add(EMAIL);
        add(PASSWORD);
    }};

    @Before
    public void setUp() {
        driver.get(SIGN_IN_PAGE_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void verifyVisibilityOfElementsAndUrlCorrectness() {
        SignInPage signInPage = new SignInPage(driver);


        SoftAssertions softly = new SoftAssertions();
        params.forEach(parameter -> softly.assertThat(signInPage.isFieldDisplayed(parameter))
                .describedAs("Verify visibility of %s element", parameter)
                .isTrue());
        softly.assertAll();

        NavigationBar.clickHomeIcon();
        assertTrue((driver).getCurrentUrl().equals(HOME_PAGE_URL));
    }

    @After
    public void tierDown(){
        driver.close();
    }
}
