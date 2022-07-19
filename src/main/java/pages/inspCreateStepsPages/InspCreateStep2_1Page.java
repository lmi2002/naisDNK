package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep2_1Page extends ParentPage {

    public InspCreateStep2_1Page (WebDriver webDriver) {
        super(webDriver, "/inspection/create-reason?inspectionId=2130727");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//input[@id='inspectionreason-date']")
    private WebElement dateField;

    @FindBy(xpath = ".//td[@class='old day' and contains(text(),'30')]")
    private WebElement dateItem;

    @FindBy(xpath = ".//input[@name='InspectionReason[number]']")
    private WebElement inputDocNumber;

    @FindBy(xpath = ".//span[@id='select2-inspectionreason-type-container']")
    private WebElement docTypeField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Рішення')]")
    private WebElement docTypeItem;

    @FindBy(xpath = ".//span[@id='select2-inspectionreason-regulator_id-container']")
    private WebElement regulatorField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement regulatorItem;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block' and contains(text(),'Додати направлення')]")
    private WebElement addDocBtn;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public void clickOnDateField() {
        actionsWithOurElements.clickOnElement(dateField);
    }

    @Step
    public void clickOnDateItem() {
        actionsWithOurElements.clickOnElement(dateItem);
    }

    @Step
    public void enterDocNumberInToInputField (String docNumber) {
        actionsWithOurElements.enterTextInInput(inputDocNumber, docNumber);
    }

    @Step
    public void enterDateInToInputField (String date) {
        actionsWithOurElements.enterTextInInput(dateField, date);
    }

    @Step
    public void clickOnDocTypeField() {
        actionsWithOurElements.clickOnElement(docTypeField);
    }

    @Step
    public void clickOnDocTypeItem() {
        actionsWithOurElements.clickOnElement(docTypeItem);
    }

    @Step
    public void clickOnRegulatorField() {
        actionsWithOurElements.clickOnElement(regulatorField);
    }

    @Step
    public void clickOnRegulatorItem() {
        actionsWithOurElements.clickOnElement(regulatorItem);
    }

    @Step
    public void clickOnAddDocBtn() {
        actionsWithOurElements.clickOnElement(addDocBtn);
    }

}
