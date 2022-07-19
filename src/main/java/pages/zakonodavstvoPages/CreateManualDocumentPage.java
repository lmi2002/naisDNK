package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateManualDocumentPage extends ParentPage {

    public CreateManualDocumentPage (WebDriver webDriver) {
        super(webDriver, "/document/create-manual?documentType=npa");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'НПА: Додавання')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-sm-4 col-md-3']")
    private WebElement infoBlockMenu;

    @FindBy(xpath = ".//input[@id='documentbase-name']")
    private WebElement enterDocumentName;

    @FindBy(xpath = ".//input[@id='documentbase-short_name']")
    private WebElement enterDocumentShortName;

    @FindBy(xpath = ".//span[@id='select2-npa-id_document_type-container']")
    private WebElement selectActType;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'ДСТУ')]")
    private WebElement actTypeDSTU;

    @FindBy(xpath = ".//input[@id='documentbase-number']")
    private WebElement enterActNumber;

    @FindBy(xpath = ".//span[@class='select2-selection__placeholder' and contains(text(),'Виберіть статус...')]")
    private WebElement statusField;

    @FindBy(xpath = ".//li[contains(text(),'Не визначено')]")
    private WebElement selectStatus;

    @FindBy(xpath = ".//input[@id='documentbase-link']")
    private WebElement enterLink;

    @FindBy(xpath = ".//span[contains(text(),'Виберіть видавника...')]")
    private WebElement npaField;

    @FindBy(xpath = ".//li[contains(text(),'Адміністрація Державної прикордонної служби України')]")
    private WebElement selectNpa;

    @FindBy(xpath = ".//input[@id='documentbase-date_acceptance']")
    private WebElement dateField;

    @FindBy(xpath = ".//div[7]/div[1]/table/tbody/tr[1]/td[1]")
    private WebElement selectData;

    @FindBy(xpath = ".//input[@id='documentbase-number_edrnpa']")
    private WebElement enterNpaNumber;

    @FindBy(xpath = ".//span[contains(text(),'Виберіть тип НПА, яким затверджено...')]")
    private WebElement npaTypeField;

    @FindBy(xpath = ".//li[contains(text(),'Закон України')]")
    private WebElement selectNpaType;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement selectSphere;

    @FindBy(xpath = ".//i[@class='glyphicon glyphicon-unchecked']")
    private WebElement selectAllSphere;

    @FindBy(xpath = ".//button[contains(text(),'Створити')]")
    private WebElement createBtn;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean infoBlockMenuIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlockMenu);
    }

    @Step
    public void enterDocumentNameInToField(String nameDoc) {
        actionsWithOurElements.enterTextInInput(enterDocumentName, nameDoc);
    }

    @Step
    public void enterDocumentShortNameInToField(String shortNameAct) {
        actionsWithOurElements.enterTextInInput(enterDocumentShortName, shortNameAct);
    }

    @Step
    public void enterDateInToField (String date) {
        actionsWithOurElements.enterTextInInput(dateField, date);
    }

    @Step
    public void clickOnActType() {
        actionsWithOurElements.clickOnElement(selectActType);
    }

    @Step
    public void clickOnActTypeDSTU() {
        actionsWithOurElements.clickOnElement(actTypeDSTU);
    }

    @Step
    public void enterActNumberInToField(String actNumber) {
        actionsWithOurElements.enterTextInInput(enterActNumber, actNumber);
    }

    @Step
    public void clickOnStatusField() {
        actionsWithOurElements.clickOnElement(statusField);
    }

    @Step
    public void clickOnSelectStatus() {
        actionsWithOurElements.clickOnElement(selectStatus);
    }

    @Step
    public void enterLinkInToField(String link) {
        actionsWithOurElements.enterTextInInput(enterLink, link);
    }

    @Step
    public void clickOnNpaField() {
        actionsWithOurElements.clickOnElement(npaField);
    }

    @Step
    public void clickOnSelectNpa() {
        actionsWithOurElements.clickOnElement(selectNpa);
    }

    @Step
    public void clickOnDataField() {
        actionsWithOurElements.clickOnElement(dateField);
    }

    @Step
    public void clickOnSelectData() {
        actionsWithOurElements.clickOnElement(selectData);
    }

    @Step
    public void enterNpaNumber(String npaNumber) {
        actionsWithOurElements.enterTextInInput(enterNpaNumber, npaNumber);
    }

    @Step
    public void clickOnNpaTypeField() {
        actionsWithOurElements.clickOnElement(npaTypeField);
    }

    @Step
    public void clickOnSelectNpaType() {
        actionsWithOurElements.clickOnElement(selectNpaType);
    }

    @Step
    public void clickOnSelectSphere() {
        actionsWithOurElements.clickOnElement(selectSphere);
    }

    @Step
    public void clickOnSelectAllSphere() {
        actionsWithOurElements.clickOnElement(selectAllSphere);
    }


    @Step
    public void clickOnCreateBtn() {
        actionsWithOurElements.clickOnElement(createBtn);
    }



}
