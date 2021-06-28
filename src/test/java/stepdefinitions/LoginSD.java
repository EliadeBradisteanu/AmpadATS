package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.LoginS;

public class LoginSD {

    private static final Logger logger = LoggerFactory.getLogger(LoginSD.class);

    @Steps
    LoginS loginS;

    @Given("the user logs in into the Ampada Site")
    public void theUserLogsInIntoTheAmpadaSite() {
        loginS.theUserLogsInIntoTheAmpadaSite();
        logger.info("the user logs in into the Ampada Site");
    }




}
