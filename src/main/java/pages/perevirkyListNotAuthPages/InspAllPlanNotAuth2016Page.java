package pages.perevirkyListNotAuthPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspAllPlanNotAuth2016Page extends ParentPage {

    public InspAllPlanNotAuth2016Page(WebDriver webDriver) {
        super(webDriver, "/inspection/all-planned?planning_period_id=8");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати планових перевірок')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Код')]")
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
