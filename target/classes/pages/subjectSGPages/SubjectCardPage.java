package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SubjectCardPage extends ParentPage {

    public SubjectCardPage(WebDriver webDriver) {
        super(webDriver, "/subject/subject/edit?subject_id=63563&regulator_id=262&sphere_id=162");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Редагування суб’єкта господарювання')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@href='/subject/index?regulatorId=61&sort=code' and contains(text(),'Код')]")
    private WebElement subTitle1;

    @FindBy(xpath = ".//*[@href='#collapseExample2' and contains(text(),'Об’єкти суб’єкта господарювання')]")
    private WebElement subTitle2;

    @FindBy(xpath = ".//*[@href='#collapseExample3' and contains(text(),'Відокремлені підрозділи суб’єкта господарювання')]")
    private WebElement subTitle3;

    @FindBy(xpath = ".//*[@href='#collapseExample4' and contains(text(),'Загальні дані для планування')]")
    private WebElement subTitle4;

    @FindBy(xpath = ".//*[@href='/subject/index?regulatorId=61&sphereId=182']")
    private WebElement perelikSGLink;

    @FindBy(xpath = ".//span[@data-target='#add_obj']")
    private WebElement addObjectBtn;

    @FindBy(xpath = ".//button[@id='save-required-btn']")
    private WebElement saveDataBtn;

    @FindBy(xpath = ".//input[@id='subjectobject-name']")
    private WebElement inputObjectName;

    @FindBy(xpath = ".//input[@id='subjectobject-location']")
    private WebElement inputObjectLocation;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-subjectobject-subject_parted_id-container']")
    private WebElement pidrozdilField;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-subjectobject-subject_parted_id-container']")
    private WebElement selectPidrozdilItem;

    @FindBy(xpath = ".//*[@id='fsubjectobjects-last_planned_date-kvdate']/span")
    private WebElement calendarObjectBtn;

    @FindBy(xpath = ".//input[@id='fsubjectobjects-last_planned_date']")
    private WebElement calendarObjectDateField;

    @FindBy(xpath = ".//div[8]/div[1]/table/tbody/tr[2]/td[1]")
    private WebElement dateObjectItem;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block']")
    private WebElement addObjectModalBtn;

    @FindBy(xpath = ".//button[@class='btn btn-primary' and contains(text(),'Зберегти об’єкти суб’єкта господарювання')]")
    private WebElement saveObjectBtn;

    @FindBy(xpath = ".//div[contains(text(),'Цех')]")
    private WebElement newObject;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[9]/span")
    private WebElement deleteObjectBtn;

    @FindBy(xpath = ".//button[@data-bb-handler='confirm']")
    private WebElement confirmDeleteObjectBtn;

    @FindBy(xpath = ".//*[@id='fsubjectregulator-last_planned_date']")
    private WebElement dateOfLastPlanInspField;

    @FindBy(xpath = ".//div[7]/div[1]/table/tbody/tr[2]/td[1]")
    private WebElement dateAllDataPlanItem;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-fsubjectregulator-risk-container']")
    private WebElement risksField;

    @FindBy(xpath = ".//ul[@class='select2-results__options']//*[contains(text(),'Середній')]")
    private WebElement riskItem;

    @FindBy(xpath = ".//input[@id='fsubjectregulator-mark']")
    private WebElement balField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement planPeriodField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'2022')]")
    private WebElement planPeriodItem;

    @FindBy(xpath = ".//button[@class='btn btn-primary' and contains(text(),'Зберегти обов')]")
    private WebElement savePlanPeriodBtn;

    @FindBy(xpath = ".//*[@id='process-load-btn']")
    private WebElement downloadSGBtn;

    @FindBy(xpath = ".//span[@class='select2-selection__choice__remove']")
    private WebElement delPlanPeriodItem;

    @FindBy(xpath = ".//span[@class='select2-selection__clear']")
    private WebElement deleteRiskLevel;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean subTitle1IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subTitle1);
    }

    @Step
    public boolean subTitle2IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subTitle2);
    }

    @Step
    public boolean subTitle3IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subTitle3);
    }

    @Step
    public boolean subTitle4IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subTitle4);
    }

    @Step
    public boolean perelikSGLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(perelikSGLink);
    }

    @Step
    public void clickOnAddObjectBtn() {
        actionsWithOurElements.clickOnElement(addObjectBtn);
    }

    @Step
    public void clickOnSaveDataBtn() {
        actionsWithOurElements.clickOnElement(saveDataBtn);
    }

    @Step
    public boolean downloadSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadSGBtn);
    }

    @Step
    public void inputObjectNameInToInputField(String objectName) {
        actionsWithOurElements.enterTextInInput(inputObjectName, objectName);
    }

    @Step
    public void inputDateOfLastPlanInspInToInputField(String dateOfLastInsp) {
        actionsWithOurElements.enterTextInInput(dateOfLastPlanInspField, dateOfLastInsp);
    }

    @Step
    public void inputBalInToInputField(String bal) {
        actionsWithOurElements.enterTextInInput(balField, bal);
    }

    @Step
    public void inputObjectLocationInToInputField(String objectLocation) {
        actionsWithOurElements.enterTextInInput(inputObjectLocation, objectLocation);
    }

    @Step
    public void clickOnPidrozdilField() {
        actionsWithOurElements.clickOnElement(pidrozdilField);
    }

    @Step
    public void clickOnPidrozdilItem() {
        actionsWithOurElements.clickOnElement(selectPidrozdilItem);
    }

    @Step
    public void clickOnCalendarObjectBtn() {
        actionsWithOurElements.clickOnElement(calendarObjectBtn);
    }

    @Step
    public void clickOnDateObjectItem() {
        actionsWithOurElements.clickOnElement(dateObjectItem);
    }

    @Step
    public void clickOnAddObjectModalBtn() {
        actionsWithOurElements.clickOnElement(addObjectModalBtn);
    }

    @Step
    public void clickOnSaveObjectBtn() {
        actionsWithOurElements.clickOnElement(saveObjectBtn);
    }

    @Step
    public boolean newObjectIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(newObject);
    }

    @Step
    public void clickOnDeleteObjectBtn() {
        actionsWithOurElements.clickOnElement(deleteObjectBtn);
    }

    @Step
    public void clickOnConfirmDeleteObjectBtn() {
        actionsWithOurElements.clickOnElement(confirmDeleteObjectBtn);
    }

    @Step
    public void clickOnDateOfLastPlanInspField() {
        actionsWithOurElements.clickOnElement(dateOfLastPlanInspField);
    }

    @Step
    public void clickOnDateAllDataPlanItem() {
        actionsWithOurElements.clickOnElement(dateAllDataPlanItem);
    }

    @Step
    public void clickOnRisksField() {
        actionsWithOurElements.clickOnElement(risksField);
    }

    @Step
    public void clickOnBalField() {
        actionsWithOurElements.clickOnElement(balField);
    }

    @Step
    public void clickOnRiskItem() {
        actionsWithOurElements.clickOnElement(riskItem);
    }

    @Step
    public void clickOnPlanPeriodField() {
        actionsWithOurElements.clickOnElement(planPeriodField);
    }

    @Step
    public void clickOnPlanPeriodItem() {
        actionsWithOurElements.clickOnElement(planPeriodItem);
    }

    @Step
    public void clickOnSavePlanPeriodBtn() {
        actionsWithOurElements.clickOnElement(savePlanPeriodBtn);
    }

    @Step
    public void clickOnDownloadSGBtn() {
        actionsWithOurElements.clickOnElement(downloadSGBtn);
    }

    @Step
    public void clickOnDeletePlanPeriodItem() {
        actionsWithOurElements.clickOnElement(delPlanPeriodItem);
    }

    @Step
    public void clickOnCalendarObjectDateField() {
        actionsWithOurElements.clickOnElement(calendarObjectDateField);
    }

    @Step
    public void inputCalendarObjectDateFieldInToInputField(String dateOfLastInsp) {
        actionsWithOurElements.enterTextInInput(calendarObjectDateField, dateOfLastInsp);
    }

    @Step
    public void deletePlanPeriodItem() {
        if (actionsWithOurElements.isElementDisplayed(delPlanPeriodItem)) {

            clickOnDeletePlanPeriodItem();

        } else {

            actionsWithOurElements.isElementDisplayed(savePlanPeriodBtn);
        }
    }
        @Step
        public void clickOnDeleteRiskLevel () {
            actionsWithOurElements.clickOnElement(deleteRiskLevel);
        }

    }
