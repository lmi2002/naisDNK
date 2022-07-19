package pages.audytPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateAudytPage extends ParentPage {

    public CreateAudytPage (WebDriver webDriver) {
        super(webDriver, "/audit/audit/create?temp_key=cc7f1716-878b-4905-a773-6bede1aca4ec");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;
}
