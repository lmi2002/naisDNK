package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanPerevirkyAll2018Page extends ParentPage {

    public PlanPerevirkyAll2018Page(WebDriver webDriver) {
        super(webDriver, "/report/plan-general?regulator_id=34&planning_period_id=1");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Планові перевірки (загальні дані)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[contains(text(),'Стан перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//button[@id='report-search-btn' and contains(text(),'Шукати')]")
    private WebElement searchBtn;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/report/plan-violations?regulator_id=34&planning_period_id=1']")
    private WebElement planPerevirkyPorushenniaLink;

    @FindBy(xpath = ".//a[@href='/report/unplanned-general?regulator_id=34&planning_period_id=1']")
    private WebElement pozaplanPerevirkyAllLink;

    @FindBy(xpath = ".//a[@href='/report/unplanned-violations?regulator_id=34&planning_period_id=1']")
    private WebElement pozaplanPerevirkyPorushenniaLink;

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
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOnPlanPerevirkyPorushenniaLink() {
        actionsWithOurElements.clickOnElement(planPerevirkyPorushenniaLink);
    }

    @Step
    public void clickOnPozaplanPerevirkyAllLink() {
        actionsWithOurElements.clickOnElement(pozaplanPerevirkyAllLink);
    }

    @Step
    public void clickOnPozaplanPerevirkyPorushenniaLink() {
        actionsWithOurElements.clickOnElement(pozaplanPerevirkyPorushenniaLink);
    }
}
