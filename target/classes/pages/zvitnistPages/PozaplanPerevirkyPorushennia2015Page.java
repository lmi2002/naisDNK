package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PozaplanPerevirkyPorushennia2015Page extends ParentPage  {

    public PozaplanPerevirkyPorushennia2015Page(WebDriver webDriver) {
        super(webDriver, "/report/unplanned-violations?regulator_id=61&planning_period_id=7");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Позапланові перевірки (порушення)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//a[@href='/report/plan-violations?regulator_id=61&planning_period_id=8']")
    private WebElement link2016;

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
    public void checkIsGridElementIsDisplayedPresent() {
        Assert.assertTrue("Grid Element Is Displayed is not displayed", gridElementIsDisplayed());
    }

    @Step
    public void clickOn2016Link() {
        actionsWithOurElements.clickOnElement(link2016);
    }

    @Step
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }


}
