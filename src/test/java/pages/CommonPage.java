package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.Constants.RED;

@DefaultUrl("http://tool.ampada.com:9173/")
//@DefaultUrl("http://www.google.com")
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
