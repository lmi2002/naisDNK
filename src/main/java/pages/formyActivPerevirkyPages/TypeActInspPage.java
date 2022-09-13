package pages.formyActivPerevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class TypeActInspPage extends ParentPage {

    public TypeActInspPage(WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=act_inspection_document");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Форми актів перевірки')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Орган, що додав')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-3')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@name='CommonSearch[name]']")
    private WebElement enterNPAName;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement searchBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement addDocumentBtn;

    @FindBy(xpath = ".//a[@class='table_action_btn icon-details']")
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
    public void clickOnSearchBtn() {
        actionsWithOurElements.clickOnElement(searchBtn);
    }

    @Step
    public void clickOnAddDocumentBtn() {
        actionsWithOurElements.clickOnElement(addDocumentBtn);
    }

    @Step
    public void clickOnViewCardBtn() {
        actionsWithOurElements.clickOnElement(viewCardBtn);
    }

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Форми актів перевірки");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/document/index?documentType=act_inspection_document");
    }

    @Step
    public void checkIsPageURLProdPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/document/index?documentType=act_inspection_document");
    }


}
