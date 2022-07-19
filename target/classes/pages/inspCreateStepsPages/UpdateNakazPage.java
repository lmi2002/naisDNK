package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UpdateNakazPage extends ParentPage {

    public UpdateNakazPage(WebDriver webDriver) {
        super(webDriver, "/inspection/update-reason?inspectionId=2130727&id=383473");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//*[@href='/inspection/update?id=2130727&step=before_beginning&sort=type' and contains(text(),'Тип документу')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//*[@id='part-btn-37']")
    private WebElement question1Btn;

    @FindBy(xpath = ".//*[@id='part-btn-39']")
    private WebElement question2Btn;

    @FindBy(xpath = ".//*[@id='part-btn-40']")
    private WebElement question3Btn;

    @FindBy(xpath = ".//*[@id='part-btn-41']")
    private WebElement question4Btn;

    @FindBy(xpath = ".//input[@id='questions-check-all']")
    private WebElement allCheckboxItem;

    @FindBy(xpath = ".//button[@id='save-answers-btn']")
    private WebElement saveQuestionBtn;

    @FindBy(xpath = ".//section[1]/div/div/div/div/div[4]/div/div/div[2]/div/div/div[2]/table/thead/tr[1]/th[1]/div/label/input")
    private WebElement allCheckboxItemQ2;

    @FindBy(xpath = ".//input[@name='InspectionReason[direction_number]']")
    private WebElement directionNumberField;

    @FindBy(xpath = ".//input[@id='inspectionreason-direction_date']")
    private WebElement calendarField;

    @FindBy(xpath = ".//*[@data-date='1590969600000']")
    private WebElement calendarDateItem1;

    @FindBy(xpath = ".//span[@id='select2-inspectionreason-event_form-container']")
    private WebElement inspFormField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Огляд')]")
    private WebElement inspFormItem;

    @FindBy(xpath = ".//input[@id='inspectionreason-date_start']")
    private WebElement inspDateStartField;

    @FindBy(xpath = ".//input[@id='inspectionreason-date_finish']")
    private WebElement inspDateFinishField;

    @FindBy(xpath = ".//*[@data-date='1591142400000']")
    private WebElement calendarDateItem2;

    @FindBy(xpath = ".//span[@data-target='#add_inspector']")
    private WebElement addInspectorBtn;

    @FindBy(xpath = ".//span[@id='select2-inspector-id-container']")
    private WebElement inspectorSelectField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Автутова Антоніна Вікторівна")
    private WebElement inspectorItem;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block' and contains(text(),'Додати')]")
    private WebElement addBtn;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void clickOnQuestion1Btn() {
        actionsWithOurElements.clickOnElement(question1Btn);
    }

    @Step
    public void clickOnQuestion2Btn() {
        actionsWithOurElements.clickOnElement(question2Btn);
    }

    @Step
    public void clickOnQuestion3Btn() {
        actionsWithOurElements.clickOnElement(question3Btn);
    }

    @Step
    public void clickOnQuestion4Btn() {
        actionsWithOurElements.clickOnElement(question4Btn);
    }

    @Step
    public void setCheckBoxForAllItems() {
        actionsWithOurElements.setStateToCheckBox(allCheckboxItem, "check");
    }

    @Step
    public void setCheckBoxForAllItemsQ2() {
        actionsWithOurElements.setStateToCheckBox(allCheckboxItemQ2, "check");
    }

    @Step
    public void clickOnSaveQuestionBtn() {
        actionsWithOurElements.clickOnElement(saveQuestionBtn);
    }

    @Step
    public void enterDirectionNumberInToInputField(String directionNumber) {
        actionsWithOurElements.enterTextInInput(directionNumberField, directionNumber);
    }

    @Step
    public void clickOnCalendarField() {
        actionsWithOurElements.clickOnElement(calendarField);
    }

    @Step
    public void clickOnCalendarDateItem1() {
        actionsWithOurElements.clickOnElement(calendarDateItem1);
    }

    @Step
    public void clickOnInspFormField() {
        actionsWithOurElements.clickOnElement(inspFormField);
    }

    @Step
    public void clickOnInspFormItem() {
        actionsWithOurElements.clickOnElement(inspFormItem);
    }

    @Step
    public void clickOnInspDateStartField() {
        actionsWithOurElements.clickOnElement(inspDateStartField);
    }

    @Step
    public void clickOnInspDateFinishField() {
        actionsWithOurElements.clickOnElement(inspDateFinishField);
    }

    @Step
    public void clickOnCalendarDateItem2() {
        actionsWithOurElements.clickOnElement(calendarDateItem2);
    }

    @Step
    public void clickOnAddInspectorBtn() {
        actionsWithOurElements.clickOnElement(addInspectorBtn);
    }

    @Step
    public void clickOnInspectorSelectField() {
        actionsWithOurElements.clickOnElement(inspectorSelectField);
    }

    @Step
    public void clickOnInspectorItem() {
        actionsWithOurElements.clickOnElement(inspectorItem);
    }

    @Step
    public void clickOnAddBtn() {
        actionsWithOurElements.clickOnElement(addBtn);
    }

    @Step
    public void clickOnSaveBtn() {
        actionsWithOurElements.clickOnElement(saveBtn);
    }


}
