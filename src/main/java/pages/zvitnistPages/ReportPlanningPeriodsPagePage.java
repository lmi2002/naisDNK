package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ReportPlanningPeriodsPagePage extends ParentPage {

    public ReportPlanningPeriodsPagePage(WebDriver webDriver) {
        super(webDriver, "/report/planning-period");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Звітність по планових періодах')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[contains(text(),'Плановий період')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=7']")
    private WebElement report2015link;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=5']")
    private WebElement report2016link;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=3']")
    private WebElement report2017link;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=1']")
    private WebElement report2018link;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=2']")
    private WebElement report2019link;

    @FindBy(xpath = ".//a[@href= '/report/planned?regulator_id=34&planning_period_id=4']")
    private WebElement report2020link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=7']")
    private WebElement reportInfo2015link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=5']")
    private WebElement reportInfo2016link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=3']")
    private WebElement reportInfo2017link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=1']")
    private WebElement reportInfo2018link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=2']")
    private WebElement reportInfo2019link;

    @FindBy(xpath = ".//a[@href= '/report/plan-general?regulator_id=34&planning_period_id=4']")
    private WebElement reportInfo2020link;

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
    public void clickOnReport2015link() {
        actionsWithOurElements.clickOnElement(report2015link);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOnReport2016link() {
        actionsWithOurElements.clickOnElement(report2016link);

    }

    @Step
    public void clickOnReport2017link() {
        actionsWithOurElements.clickOnElement(report2017link);
    }

    @Step
    public void clickOnReport2018link() {
        actionsWithOurElements.clickOnElement(report2018link);
    }

    @Step
    public void clickOnReport2019link() {
        actionsWithOurElements.clickOnElement(report2019link);
    }

    @Step
    public void clickOnReport2020link() {
        actionsWithOurElements.clickOnElement(report2020link);
    }

    @Step
    public void clickOnReportInfo2015link() {
        actionsWithOurElements.clickOnElement(reportInfo2015link);
    }

    @Step
    public void clickOnReportInfo2016link() {
        actionsWithOurElements.clickOnElement(reportInfo2016link);
    }

    @Step
    public void clickOnReportInfo2017link() {
        actionsWithOurElements.clickOnElement(reportInfo2017link);
    }

    @Step
    public void clickOnReportInfo2018link() {
        actionsWithOurElements.clickOnElement(reportInfo2018link);
    }

    @Step
    public void clickOnReportInfo2019link() {
        actionsWithOurElements.clickOnElement(reportInfo2019link);
    }

    @Step
    public void clickOnReportInfo2020link() {
        actionsWithOurElements.clickOnElement(reportInfo2020link);
    }
}
