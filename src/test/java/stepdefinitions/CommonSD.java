package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.CommonS;

public class CommonSD {

    private static final Logger logger = LoggerFactory.getLogger(CommonSD.class);

    @Steps
    CommonS commonS;

    @Given("Der Benutzer ruft die Ampada Anmeldeseite auf")
    public void derBenutzerRuftDieAmpadaAnmeldeseiteAuf() {
        commonS.userOpenPage();
        logger.info("Der Benutzer ruft die Ampada Anmeldeseite auf");
    }

    @And("the user enters in the inputFiled {string} {string} username")
    public void theUserEntersInTheInputFiledUsername(String labelText, String inputText) {
        commonS.userEntersInInputField(labelText, inputText);
        logger.info("the user enters in the inputFiled" + labelText + " " + inputText +" username");
    }

    @Then("the user sees the error message {string}")
    public void theUserSeesTheErrorMessage(String errorText) {
        commonS.userSeesErrorMessage(errorText);
        logger.info("the user sees the error message " + errorText);
    }

    @And("user clears inputField {string}")
    public void userClearsInputField(String labelText) {
        commonS.userClearsInputField(labelText);
        logger.info("user clears inputField " + labelText);
    }

    @And("the user clicks the button {string}")
    public void theUserClicksTheButton(String buttonText) {
        commonS.theUserClicksTheButton(buttonText);
        logger.info("the user clicks the button  " + buttonText);
    }
}
