package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyTimeSheetPage extends CommonPage{

    @FindBy(css = ".custom-icon")
    private List<WebElement> shortcutImgs;

    public void theUserClicksTheDayEntryShortcut(String shortcutText) {
        WebElement title = getWebElementFromListByAttribute(shortcutImgs, "title", shortcutText);
        clickOn(title);
    }
}
