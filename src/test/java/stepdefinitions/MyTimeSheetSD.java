package stepdefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.MyTimeSheetS;

public class MyTimeSheetSD {

    private static final Logger logger = LoggerFactory.getLogger(MyTimeSheetSD.class);

    @Steps
    MyTimeSheetS myTimeSheetS;

    @Then("the user clicks the dayEntry shortcut {string}")
    public void theUserClicksTheDayEntryShortcut(String shortcutText) {
        myTimeSheetS.theUserClicksTheDayEntryShortcut(shortcutText);
        logger.info("the user clicks the dayEntry shortcut"+shortcutText);
    }
}
