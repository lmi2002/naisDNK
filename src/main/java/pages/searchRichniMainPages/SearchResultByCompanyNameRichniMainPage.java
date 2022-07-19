package pages.searchRichniMainPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultByCompanyNameRichniMainPage extends ParentPage {

    public SearchResultByCompanyNameRichniMainPage(WebDriver webDriver) {
        super(webDriver, "/site/index?AnnualInspection%5Bname%5D=ХАДО&AnnualInspection%5Bregulator_id%5D=&planning_period_id=6&tab=annual");
    }

    @FindBy(xpath = ".//span[@id='select2-w3-container']")
    private WebElement yearField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement year2018Item;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement year2020Item;

    @FindBy(xpath = ".//span[@id='select2-AnnualInspection-regulator-container']")
    private WebElement sgNameField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement sgNameSearchField;

    @FindBy(xpath = ".//input[@name='AnnualInspection[name]']")
    private WebElement companyNameField;

    @FindBy(xpath = ".//th[@width='13%' and contains(text(),'Предмет перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'2 500')]")
    private WebElement searchResultByYear;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement searchResultBySG;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1')]")
    private WebElement searchResultByAll;

    @FindBy(xpath = ".//*[@id='w2']/div[4]/div/button")
    private WebElement searchEventsBtn;

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Річні плани за 2018 рік')]")
    private WebElement pageTitle;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }


    @Step
    public void clickOnYearField() {
        actionsWithOurElements.clickOnElement(yearField);
    }

    @Step
    public void clickOnYear2018Item() {
        actionsWithOurElements.clickOnElement(year2018Item);
    }

    @Step
    public void clickOnYear2020Item() {
        actionsWithOurElements.clickOnElement(year2020Item);
    }

    @Step
    public void clickOnSGNameField() {
        actionsWithOurElements.clickOnElement(sgNameField);
    }

    @Step
    public void enterSGNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(sgNameSearchField, sgName);
    }

    @Step
    public void enterCompanyNameInToInputField(String companyName) {
        actionsWithOurElements.enterTextInInput(companyNameField, companyName);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }


    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean searchResultByYearIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultByYear);
    }

    @Step
    public boolean searchResultBySGIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultBySG);
    }

    @Step
    public boolean searchResultByAllIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultByAll);
    }

    @Step
    public void checkIsCompanyNamePresent() {
        Assert.assertTrue("Searched Company is not displayed", webDriver.getPageSource().contains("\"КИСЕНЬ\""));
    }

    @Step
    public void clickOnSearchEventsBtn() {
        actionsWithOurElements.clickOnElement(searchEventsBtn);
    }

}

