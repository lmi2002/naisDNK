package pages.perevirkyListNotAuthPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspAllPlanNotAuth2019Page extends ParentPage {

    public InspAllPlanNotAuth2019Page (WebDriver webDriver) {
        super(webDriver, "/inspection/all-planned?planning_period_id=2");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати планових перевірок')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@width='10%' and contains(text(),'Область')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

}
