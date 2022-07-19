package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspViewPage extends ParentPage {

    public InspViewPage (WebDriver webDriver) {
        super(webDriver, "/inspection/view?id=2130727");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

}
