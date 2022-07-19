package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep1Page extends ParentPage {

    public InspCreateStep1Page(WebDriver webDriver) {
        super(webDriver, "/inspection/create?planning_period_id=6");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Створити перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//h3[contains(text(),'Виберіть суб')]")
    private WebElement subjectBlock;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//*[@id='select2-annualinspectioncommon-subject_id-container']")
    private WebElement selectSGField;

    @FindBy(xpath = ".//span[1]/input")
    private WebElement searchSGField;

    @FindBy(xpath = ".//span[1]/input")
    private WebElement inputSGName;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement sgItem;

    @FindBy(xpath = ".//section[1]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/div/div/div[2]/div[1]/div/span/span[1]/span/span[2]")
    private WebElement sphereField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[activity_type]']")
    private WebElement inspTypeField;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[phone]']")
    private WebElement phoneNumberField;

    @FindBy(xpath = ".//input[@name='AnnualInspectionCommon[email]']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement kvedField;

    @FindBy(xpath = ".//*[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement kvedItem;

    @FindBy(xpath = ".//span[@aria-labelledby= 'select2-annualinspectioncommon-subject_size-container']")
    private WebElement rozmirSubjectField;

    @FindBy(xpath = ".//li[@class= 'select2-results__option' and contains(text(),'Середній')]")
    private WebElement rozmirSubjectItem;

    @FindBy(xpath = ".//span[@id='select2-annualinspectioncommon-risk-container']")
    private WebElement riskLevelField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement riskLevelItem;

    @FindBy(xpath = ".//p[@class='result_table_title' and contains(text(),'Підстава №')]")
    private WebElement pidstava1Title;

    @FindBy(xpath = ".//input[@name='UnplannedReason[0][first_number]']")
    private WebElement zayavaNumberField;

    @FindBy(xpath = ".//input[@name='UnplannedReason[0][first_date]']")
    private WebElement calendarZayavaField;

    @FindBy(xpath = ".//div[7]/div[1]/table/tbody/tr[1]/td[1]")
    private WebElement dateZayava;

    @FindBy(xpath = ".//button[@data-btn= 'save_branch']")
    private WebElement addObjectBtn;

    @FindBy(xpath = ".//span[@id='add_unplanned_reason_btn']")
    private WebElement addPidstava2Link;

    @FindBy(xpath = ".//span[@id='select2-unplannedreason-1-id_unplanned_reason_group-container']")
    private WebElement pidstava2docField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),' ліцензування видів господарської')]")
    private WebElement pidstava2docItem;

    @FindBy(xpath = ".//*[@id='update-inspection']/div[1]/div[2]/div[2]/div/div[2]/p/button")
    private WebElement pidstava2DeleteBtn;

    @FindBy(xpath = ".//button[@data-btn='save_inspection']")
    private WebElement saveStep1Btn;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean subjectBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subjectBlock);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOnSelectSGField() {
        actionsWithOurElements.clickOnElement(selectSGField);
    }

    @Step
    public void clickOnSearchSGField() {
        actionsWithOurElements.clickOnElement(searchSGField);
    }

    @Step
    public void enterSGNameInToInputField(String sgName) {
        actionsWithOurElements.enterTextInInput(inputSGName, sgName);
    }

    @Step
    public void enterDateInToInputField(String date) {
        actionsWithOurElements.enterTextInInput(calendarZayavaField, date);
    }

    @Step
    public void clickOnSGItem() {
        actionsWithOurElements.clickOnElement(sgItem);
    }

    @Step
    public void clickOnSphereField() {
        actionsWithOurElements.clickOnElement(sphereField);
    }

    @Step
    public void clickOnSphereItem() {
        actionsWithOurElements.clickOnElement(sphereItem);
    }

    @Step
    public void clickOnInspTypeField() {
        actionsWithOurElements.clickOnElement(inspTypeField);
    }

    @Step
    public void enterInspTypeInToInputField(String inspType) {
        actionsWithOurElements.enterTextInInput(inspTypeField, inspType);
    }

    @Step
    public void enterPhoneNumberInToInputField(String phoneNumber) {
        actionsWithOurElements.enterTextInInput(phoneNumberField, phoneNumber);
    }

    @Step
    public void enterEmailInToInputField(String email) {
        actionsWithOurElements.enterTextInInput(emailField, email);
    }

    @Step
    public void clickOnKvedField() {
        actionsWithOurElements.clickOnElement(kvedField);
    }

    @Step
    public void clickOnKvedItem() {
        actionsWithOurElements.clickOnElement(kvedItem);
    }

    @Step
    public void clickOnRozmirSubjectField() {
        actionsWithOurElements.clickOnElement(rozmirSubjectField);
    }

    @Step
    public void clickOnRozmirSubjectItem() {
        actionsWithOurElements.clickOnElement(rozmirSubjectItem);
    }

    @Step
    public void clickOnRiskLevelField() {
        actionsWithOurElements.clickOnElement(riskLevelField);
    }

    @Step
    public void clickOnRiskLevelItem() {
        actionsWithOurElements.clickOnElement(riskLevelItem);
    }

    @Step
    public boolean pidstava1TitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pidstava1Title);
    }

    @Step
    public void enterZayavaNumberInToInputField(String zayavaNumber) {
        actionsWithOurElements.enterTextInInput(zayavaNumberField, zayavaNumber);
    }

    @Step
    public void clickOnCalendarZayavaField() {
        actionsWithOurElements.clickOnElement(calendarZayavaField);
    }

    @Step
    public void clickOnDateZayava() {
        actionsWithOurElements.clickOnElement(dateZayava);
    }

    @Step
    public void clickOnAddPidstava2Link() {
        actionsWithOurElements.clickOnElement(addPidstava2Link);
    }

    @Step
    public void clickOnPidstava2docField() {
        actionsWithOurElements.clickOnElement(pidstava2docField);
    }

    @Step
    public void clickOnPidstava2docItem() {
        actionsWithOurElements.clickOnElement(pidstava2docItem);
    }

    @Step
    public void clickOnPidstava2DeleteBtn() {
        actionsWithOurElements.clickOnElement(pidstava2DeleteBtn);
    }

    @Step
    public void clickOnAddObjectBtn() {
        actionsWithOurElements.clickOnElement(addObjectBtn);
    }

    @Step
    public void clickOnSaveStep1Btn() {
        actionsWithOurElements.clickOnElement(addObjectBtn);
    }

}


