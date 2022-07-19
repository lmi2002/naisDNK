package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanPerevirkyPorushennia2016Page extends ParentPage {

    public PlanPerevirkyPorushennia2016Page(WebDriver webDriver) {
        super(webDriver, "/report/plan-violations?regulator_id=61&planning_period_id=5");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Планові перевірки (порушення)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[contains(text(),'Дата прийняття документа про застосування санкцій')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//a[@href='/report/plan-violations?regulator_id=61&planning_period_id=3']")
    private WebElement link2017;

    @FindBy(xpath = ".//button[@id='report-search-btn' and contains(text(),'Шукати')]")
    private WebElement searchBtn;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public void clickOn2017Link() {
        actionsWithOurElements.clickOnElement(link2017);
    }

    @Step
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }

}
