package steps;

import net.thucydides.core.annotations.Step;
import pages.CommonPage;

public class CommonS {

    private CommonPage commonPage;

    @Step("Der Benutzer ruft die Ampada Anmeldeseite auf")
    public void userOpenPage() {
        commonPage.userOpenPage();
    }

    @Step("the user enters in the inputFiled {0} {0} username")
    public void userEntersInInputField(String labelText, String inputText) {
        commonPage.userEntersInInputField(labelText, inputText);
    }

    @Step("the user sees the error message {0}")
    public void userSeesErrorMessage(String errorText) {
        commonPage.userSeesErrorMessage(errorText);
    }

    @Step("user clears inputField {0}")
    public void userClearsInputField(String labelText) {
        commonPage.userClearsInputField(labelText);
    }

    @Step("the user clicks the button {0}")
    public void theUserClicksTheButton(String buttonText) {
        commonPage.theUserClicksTheButton(buttonText);
    }
}
