package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DocumentsPage extends ParentPage {

    public DocumentsPage(WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=npa");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Законодавство')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'НПА')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@class='form-control']")
    private WebElement enterNPAName;

    @FindBy(xpath = ".//input[@name='NPADocumentBaseSearch[name]']")
    private WebElement searchBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement addDocumentBtn;

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
    public void clickOnSearchBtn() {
        actionsWithOurElements.clickOnElement(searchBtn);
    }

    @Step
    public void clickOnAddDocumentBtn() {
        actionsWithOurElements.clickOnElement(addDocumentBtn);
    }

    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Законодавство");
    }

    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/document/index?documentType=npa");
    }

    public void checkIsPageURLProdPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/index?documentType=npa");
    }


}