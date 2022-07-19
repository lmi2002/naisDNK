package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ReportStatistics2020Page extends ParentPage {

    public ReportStatistics2020Page(WebDriver webDriver) {
        super(webDriver, "/regulator/statistics");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Статистика')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'зва')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//button[@name='submitForm']")
    private WebElement downloadIcon;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=2']")
    private WebElement link2019;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=1']")
    private WebElement link2018;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=3']")
    private WebElement link2017;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=8']")
    private WebElement link2016;

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
    public boolean downloadIconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadIcon);
    }

    @Step
    public void clickOn2019Link() {
        actionsWithOurElements.clickOnElement(link2019);
    }

    @Step
    public void clickOn2018Link() {
        actionsWithOurElements.clickOnElement(link2018);
    }

    @Step
    public void clickOn2017Link() {
        actionsWithOurElements.clickOnElement(link2017);
    }

    @Step
    public void clickOn2016Link() {
        actionsWithOurElements.clickOnElement(link2016);
    }


}
