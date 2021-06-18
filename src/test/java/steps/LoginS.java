package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginS {

    private LoginPage loginPage;

    @Step("user logs into the Apmapada Home Page")
    public void userLogsIntoTheApmapadaHomePage() {
        loginPage.userLogsIntoTheApmapadaHomePage();
    }
}
