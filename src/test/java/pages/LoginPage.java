package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("http://id.ampada.com/auth/realms/Ampada-Prod/protocol/openid-connect/auth?client_id=ams-prod&redirect_uri=http%3A%2F%2Ftimesheet.ampada.com%2F&state=40aa903a-6552-4fcd-86d8-5103b2785ef4&response_mode=fragment&response_type=code&scope=openid&nonce=736ea01f-deb6-4070-93ab-3a9a1540e76b")
public class LoginPage extends BasePage{

    @FindBy(css = ".pui-table__row-container")
    private List<WebElement> tableCells;

    @FindBy(css = "button")
    private List<WebElement> buttons;

    public void userLogsIntoTheApmapadaHomePage() {
        this.open();
    }
}