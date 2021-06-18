package stepdefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.LoginS;

public class LoginSD {

    private static final Logger logger = LoggerFactory.getLogger(LoginSD.class);

    @Steps
    LoginS loginS;

    @Given("^user logs into the Apmapada Home Page$")
    public void userLogsIntoTheApmapadaHomePage() {
        loginS.userLogsIntoTheApmapadaHomePage();
        logger.info("user logs into the Apmapada Home Page");
    }
}
