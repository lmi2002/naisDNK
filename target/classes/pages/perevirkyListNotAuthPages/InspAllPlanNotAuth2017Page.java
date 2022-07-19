package pages.perevirkyListNotAuthPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspAllPlanNotAuth2017Page extends ParentPage {

    public InspAllPlanNotAuth2017Page(WebDriver webDriver) {
        super(webDriver, "/inspection/all-planned?planning_period_id=3");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати позапланових перевірок')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Підстава перевірки')]")
    private WebElement gridElement;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

}

