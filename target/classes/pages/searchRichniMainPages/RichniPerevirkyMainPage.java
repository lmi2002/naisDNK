package pages.searchRichniMainPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichniPerevirkyMainPage extends ParentPage {

    @FindBy(xpath = ".//div[contains(text(),'Безтужев Денис')]")
    private WebElement userNameDisplayed;

    public RichniPerevirkyMainPage(WebDriver webDriver) {
        super(webDriver, "/site/index?tab=annual");
    }

    @FindBy(css = "#w0 > div.col-md-2 > div > span > span.selection > span > span.select2-selection__arrow")
    private WebElement yearField;

    @FindBy(xpath = ".//ul[@class='select2-results__options']//li[contains(text(),'2018')]")
    private WebElement year2018Item;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement year2021Item;

    @FindBy(css = "#w0 > div:nth-child(2) > div > span > span.selection > span > span.select2-selection__arrow")
    private WebElement regulatorNameField;

    @FindBy(css = "input.select2-search__field")
    private WebElement regulatorNameSearchField;

    @FindBy(xpath = ".//input[@name='InspectionSearch[search]']")
    private WebElement companyNameField;

    @FindBy(xpath = ".//th[@width='13%' and contains(text(),'Предмет перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'4 527')]")
    private WebElement searchResultByYear;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement searchResultBySG;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1')]")
    private WebElement searchResultByAll;

    @FindBy(css = "button.btn.btn-primary")
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
    public void clickOnYear2021Item() {
        actionsWithOurElements.clickOnElement(year2021Item);
    }

    @Step
    public void clickOnRegulatorNameField() {
        actionsWithOurElements.clickOnElement(regulatorNameField);
    }

    @Step
    public void enterRegulatorNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(regulatorNameSearchField, sgName);
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
        Assert.assertTrue("Searched Company is not displayed", webDriver.getPageSource().contains("ХАДО"));
    }

    @Step
    public void clickOnSearchEventsBtn() {
        actionsWithOurElements.clickOnElement(searchEventsBtn);
    }

}
