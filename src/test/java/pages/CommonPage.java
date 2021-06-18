package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.Constants.RED;

@DefaultUrl("http://id.ampada.com/auth/realms/Ampada-Prod/protocol/openid-connect/auth?client_id=ams-prod&redirect_uri=http%3A%2F%2Ftimesheet.ampada.com%2F&state=40aa903a-6552-4fcd-86d8-5103b2785ef4&response_mode=fragment&response_type=code&scope=openid&nonce=736ea01f-deb6-4070-93ab-3a9a1540e76b")
public class CommonPage extends BasePage{

    @FindBy(css = ".form-group")
    private List<WebElement> inputs;

    @FindBy(css = "input")
    private List<WebElement> inputs1;

    @FindBy(css = "#input-error")
    private WebElement errorMessage;

    public void userOpenPage() {
        this.open();
    }

    public void userEntersInInputField(String labelText, String inputText) {
        WebElement  foundInput = getWebElementFromListByText(inputs, labelText)
                .findElement(By.tagName("input"));

        typeInto(foundInput, inputText);
    }

    public void userSeesErrorMessage(String errorText) {
        // assert body text
        /*System.out.println(getBody().getText());
        Assert.assertTrue(getBody().getText().contains(errorText));*/

        Assert.assertEquals(RED, errorMessage.getCssValue("color"));
        Assert.assertEquals(errorText, errorMessage.getText());
    }

    public void userClearsInputField(String labelText) {
        WebElement  foundInput = getWebElementFromListByText(inputs, labelText)
                .findElement(By.tagName("input"));
        foundInput.clear();
    }

    public void theUserClicksTheButton(String buttonText) {
        WebElement foundInput =
                getWebElementFromListByAttribute(inputs1, "value", buttonText);
        foundInput.click();
    }
}
