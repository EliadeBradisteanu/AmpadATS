package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.Constants.LOGGEDIN_USER;

public class LoginPage extends CommonPage{

    @FindBy(css = ".m-12")
    private WebElement loggedInUser;

    public void theUserLogsInIntoTheAmpadaSite() {
        this.open();
        userEntersInInputField("Username or email", propertyManager.getUSERNAME());
        userEntersInInputField("Password", propertyManager.getPASSWORD());
        theUserClicksTheButton("Sign In");

        Assert.assertEquals(LOGGEDIN_USER, loggedInUser.getText());
    }
}
