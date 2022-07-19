package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;


public class PlanPerevirkyPorushennia2017Page extends ParentPage {

    public PlanPerevirkyPorushennia2017Page(WebDriver webDriver) {
        super(webDriver, "/report/plan-violations?regulator_id=61&planning_period_id=3");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Планові перевірки (порушення)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div/div/div/div[4]/div/div/div[2]/div/div[2]/div[1]/div/table/thead/tr/th[1]/a")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/report/plan-violations?regulator_id=61&planning_period_id=1']")
    private WebElement link2018;

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
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOn2018Link() {
        actionsWithOurElements.clickOnElement(link2018);
    }

    @Step
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }
}
