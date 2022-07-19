package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep3ResultsPage extends ParentPage {

    public InspCreateStep3ResultsPage (WebDriver webDriver) {
        super(webDriver, "/inspection/update?id=2130727&step=results");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//input[@id='annualinspectionresults-result_act_date']")
    private WebElement actDateField;

    @FindBy(xpath = ".//td[@class='old day' and contains(text(),'30')]")
    private WebElement actDateItem;

    @FindBy(xpath = ".//input[@id='annualinspectionresults-result_act_number']")
    private WebElement inputActNumber;

    @FindBy(xpath = ".//span[@id='select2-annualinspectionresults-timing-container']")
    private WebElement inspTimingField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement inspTimingItem;

    @FindBy(xpath = ".//span[@class='btn btn_link btn-block' and contains(text(),'Додати інспектора')]")
    private WebElement addInspectorBtn;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Богоявленкський Валерій Леонідович')]")
    private WebElement inspectorItem;

    @FindBy(xpath = ".//span[@id='select2-inspector-id-container']")
    private WebElement selectInspectorField;

    @FindBy(xpath = ".//input[@id='inspector-certificate_number']")
    private WebElement inspCertificateNumberField;

    @FindBy(xpath = ".//a[@class='table_action_btn icon-garbage remove-item']")
    private WebElement delInspectorBtn;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmDelInspectorBtn;

    @FindBy(xpath = ".//button[@id='save-result-step']")
    private WebElement saveResultStepBtn;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block' and contains(text(),'Додати')]")
    private WebElement addInspModalBtn;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=before_beginning']")
    private WebElement step2Link;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public void clickOnActDateField() {
        actionsWithOurElements.clickOnElement(actDateField);
    }

    @Step
    public void clickOnActDateItem() {
        actionsWithOurElements.clickOnElement(actDateItem);
    }

    @Step
    public void enterDateInputField (String date) {
        actionsWithOurElements.enterTextInInput(actDateField, date);
    }

    @Step
    public void enterActNumberInToInputField (String actNumber) {
        actionsWithOurElements.enterTextInInput(inputActNumber, actNumber);
    }

    @Step
    public void clickOnInspTimingField() {
        actionsWithOurElements.clickOnElement(inspTimingField);
    }

    @Step
    public void clickOnInspTimingItem() {
        actionsWithOurElements.clickOnElement(inspTimingItem);
    }

    @Step
    public void clickOnDelInspectorBtn() {
        actionsWithOurElements.clickOnElement(delInspectorBtn);
    }

    @Step
    public void clickOnConfirmDelInspectorBtn() {
        actionsWithOurElements.clickOnElement(confirmDelInspectorBtn);
    }

    @Step
    public void clickOnSaveResultStepBtn() {
        actionsWithOurElements.clickOnElement(saveResultStepBtn);
    }

    @Step
    public void clickOnAddInspectorBtn() {
        actionsWithOurElements.clickOnElement(addInspectorBtn);
    }

    @Step
    public void clickOnInspectorField() {
        actionsWithOurElements.clickOnElement(selectInspectorField);
    }

    @Step
    public void clickOnInspectorItem() {
        actionsWithOurElements.clickOnElement(inspectorItem);
    }

    @Step
    public void checkIsInspPosadaPresent() {
        Assert.assertTrue("Inspector`s 'Посада' is not displayed", webDriver.getPageSource().contains("Головний державний інспектор"));
    }

    @Step
    public void enterInspCertificateNumberInToInputField (String certifNumber) {
        actionsWithOurElements.enterTextInInput(inspCertificateNumberField, certifNumber);
    }

    @Step
    public void clickOnAddInspModalBtn() {
        actionsWithOurElements.clickOnElement(addInspModalBtn);
    }

    @Step
    public void checkIsInspNamePresent() {
        Assert.assertTrue("Added Inspector is not displayed", webDriver.getPageSource().contains("Богоявленкський Валерій Леонідович"));
    }

    @Step
    public void clickOnStep2Link() {
        actionsWithOurElements.clickOnElement(step2Link);
    }

}
