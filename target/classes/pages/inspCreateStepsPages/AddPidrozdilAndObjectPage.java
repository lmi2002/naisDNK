package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AddPidrozdilAndObjectPage extends ParentPage {

    public AddPidrozdilAndObjectPage(WebDriver webDriver) {
        super(webDriver, "/inspection/update?id=2130727&step=common");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[activity_type]']")
    private WebElement inspTypeField;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[phone]']")
    private WebElement phoneNumberField;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[email]']")
    private WebElement emailField;

    @FindBy(xpath = ".//button[@data-btn='save_inspection']")
    private WebElement saveAndGoNextStepBtn;

    @FindBy(xpath = ".//span[@class='btn btn_link btn-block' and contains(text(),'Додати підставу')]")
    private WebElement pidstavaBlockOpen;

    @FindBy(xpath = ".//span[@class='btn btn_link btn-block' and contains(text(),'Додати підставу')]")
    private WebElement addPidstavaLink;

    @FindBy(xpath = ".//span[@id='select2-unplannedreason-1-id_unplanned_reason_group-container']")
    private WebElement docField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Постанова КМУ від 21.08.2019 №823')]")
    private WebElement docItem;

    @FindBy(xpath = ".//input[@name='UnplannedReason[2][first_number]']")
    private WebElement descriptionField;

    @FindBy(xpath = ".//span[@id='select2-unplannedreason-2-id_document-container']")
    private WebElement actField;

    @FindBy(xpath = ".//input[@aria-controls='select2-unplannedreason-2-id_document-results']")
    private WebElement searchActField;

    @FindBy(xpath = ".//li[@data-select2-id='332']")
    private WebElement actItem;

    @FindBy(xpath = ".//*[@id='unplanned_reason_info']/div/div[1]/div[2]/h5/button")
    private WebElement delPidstava2Btn;

    @FindBy(xpath = ".//span[@class='btn btn-primary btn-sm'and contains(text(),'Додати відокремлений підрозділ')]")
    private WebElement addPidrozdilBtn;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-inspectionsubjectparted-subject_parted_id-container']")
    private WebElement pidrozdilField;

    @FindBy(xpath = ".//*[@id='add_branch']/div/div/div[1]/button")
    private WebElement closeModalWindowBtn;

    @FindBy(xpath = ".//span[@class='btn btn-primary btn-sm' and contains(text(),'Додати об')]")
    private WebElement addObjectBtn;

    @FindBy(xpath = ".//input[@name='SubjectObject[name]']")
    private WebElement objectNameField;

    @FindBy(xpath = ".//input[@name='SubjectObject[location]']")
    private WebElement objectLocationField;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-subjectobject-type_id-container']")
    private WebElement objectTypeField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement objectTypeItem;

    @FindBy(xpath = ".//*[@id='add-object-form']/button")
    private WebElement addObjectModalBtn;

    @FindBy(xpath = ".//a[@class='table_action_btn icon-garbage remove-item']")
    private WebElement delObjectBtn;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmDelObjectBtn;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public void inputInspType(String inspType) {
        actionsWithOurElements.enterTextInInput(inspTypeField, inspType);
    }

    @Step
    public void inputPhoneNumber(String phoneNumber) {
        actionsWithOurElements.enterTextInInput(phoneNumberField, phoneNumber);
    }

    @Step
    public void inputEmail(String email) {
        actionsWithOurElements.enterTextInInput(emailField, email);
    }

    @Step
    public void clickOnSaveAndGoNextStepBtn() {
        actionsWithOurElements.clickOnElement(saveAndGoNextStepBtn);
    }

    @Step
    public void clickOnPidstavaBlockOpen() {
        actionsWithOurElements.clickOnElement(pidstavaBlockOpen);
    }

    @Step
    public void clickOnAddPidstavaLink() {
        actionsWithOurElements.clickOnElement(addPidstavaLink);
    }

    @Step
    public void clickOnDocItem() {
        actionsWithOurElements.clickOnElement(docItem);
    }

    @FindBy(xpath = ".//input[@id='unplannedreason-2-first_date']")
    private WebElement datePidstavaField;

    @FindBy(xpath = ".//td[@class='day' and contains(text(),'16')]")
    private WebElement datePidstavaItem;

    @FindBy(xpath = ".//input[@name='UnplannedReason[2][first_number]']")
    private WebElement inputNumberPidstava;

    @Step
    public void inputDescription(String description) {
        actionsWithOurElements.enterTextInInput(descriptionField, description);
    }

    @Step
    public void enterNumberPidstava(String numberPidstava) {
        actionsWithOurElements.enterTextInInput(descriptionField, numberPidstava);
    }

    @Step
    public void clickOnDocField() {
        actionsWithOurElements.clickOnElement(docField);
    }

    @Step
    public void clickOnDatePidstavaField() {
        actionsWithOurElements.clickOnElement(datePidstavaField);
    }

    @Step
    public void clickOnDatePidstavaItem() {
        actionsWithOurElements.clickOnElement(datePidstavaItem);
    }

    @Step
    public void inputDatePidstava(String datePidstava) {
        actionsWithOurElements.enterTextInInput(datePidstavaField, datePidstava);
    }


    @Step
    public void clickOnActField() {
        actionsWithOurElements.clickOnElement(actField);
    }

    @Step
    public void inputDataInSearchActField(String dataForSearch) {
        actionsWithOurElements.enterTextInInput(searchActField, dataForSearch);
    }

    @Step
    public void clickOnActItem() {
        actionsWithOurElements.clickOnElement(actItem);
    }

    @Step
    public void clickOnDelPidstava2Btn() {
        actionsWithOurElements.clickOnElement(delPidstava2Btn);
    }

    @Step
    public void clickOnAddPidrozdilBtn() {
        actionsWithOurElements.clickOnElement(addPidrozdilBtn);
    }

    @Step
    public void clickOnPidrozdilField() {
        actionsWithOurElements.clickOnElement(pidrozdilField);
    }

    @Step
    public void checkIsPidrozdilNotPresent() {
        Assert.assertTrue("Any Pidrozdil is not present", webDriver.getPageSource().contains("Нічого не знайдено"));
    }

    @Step
    public void clickOnCloseModalWindowBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindowBtn);
    }

    @Step
    public void clickOnAddObjectBtn() {
        actionsWithOurElements.clickOnElement(addObjectBtn);
    }

    @Step
    public void inputObjectName(String objectName) {
        actionsWithOurElements.enterTextInInput(objectNameField, objectName);
    }

    @Step
    public void inputObjectLocation(String objectLocation) {
        actionsWithOurElements.enterTextInInput(objectLocationField, objectLocation);
    }

    @Step
    public void clickOnObjectTypeField() {
        actionsWithOurElements.clickOnElement(objectTypeField);
    }

    @Step
    public void clickOnObjectTypeItem() {
        actionsWithOurElements.clickOnElement(objectTypeItem);
    }

    @Step
    public void clickOnAddObjectModalBtn() {
        actionsWithOurElements.clickOnElement(addObjectModalBtn);
    }

    @Step
    public void clickOnDeleteObjectBtn() {
        actionsWithOurElements.clickOnElement(delObjectBtn);
    }

    @Step
    public void clickOnConfirmDeleteObjectBtn() {
        actionsWithOurElements.clickOnElement(confirmDelObjectBtn);
    }

}
