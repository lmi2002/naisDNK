package pages.riskCriteriaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class RiskCriteriaPage extends ParentPage {

    public RiskCriteriaPage (WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=risk_criteria_document");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Критерії ризику')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@style='width:11%' and contains(text(),'Орган, що додав')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@class='form-control']")
    private WebElement enterNPAName;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-sm']")
    private WebElement searchBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement addDocumentBtn;

    @FindBy(css = "a.table_action_btn.icon-details")
    private WebElement viewCardBtn;

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm']")
    private WebElement cleanFiltersBtn;


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

    @Step
    public void enterNPANameInToSearchField(String npaName) {
        actionsWithOurElements.enterTextInInput(enterNPAName, npaName);
    }

    @Step
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }


    @Step
    public boolean cleanFiltersBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(cleanFiltersBtn);
    }

    @Step
    public boolean addDocumentBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addDocumentBtn);
    }


    @Step
    public void clickOnSearchBtn() {
        actionsWithOurElements.clickOnElement(searchBtn);
    }

    @Step
    public void clickOnAddDocumentBtn() {
        actionsWithOurElements.clickOnElement(addDocumentBtn);
    }

    @Step
    public void clickOnViewCardBtn() {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnElement(viewCardBtn);
    }

    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Критерії ризику");
    }

    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/document/index?documentType=risk_criteria_document");
    }

    public void checkIsPageURLProdPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/index?documentType=risk_criteria_document");
    }

}


