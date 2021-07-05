package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import static util.Constants.LOGGEDIN_USER;

public class LoginPage extends CommonPage{

    @FindBy(css = ".m-12")
    private WebElementFacade loggedInUser;

    public void theUserLogsInIntoTheAmpadaSite() {
        this.open();
        userEntersInInputField("Username or email", propertyManager.getUSERNAME());
        userEntersInInputField("Password", propertyManager.getPASSWORD());
        theUserClicksTheButton("Sign In");

        Assert.assertEquals(LOGGEDIN_USER, loggedInUser.getText());
    }

}
