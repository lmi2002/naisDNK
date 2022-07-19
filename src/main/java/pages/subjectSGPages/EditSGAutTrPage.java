package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EditSGAutTrPage extends ParentPage {

    public EditSGAutTrPage (WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=50&planningPeriodId=6&sphereId=162&tab=main");
    }

    @FindBy(xpath = ".//*[@id='save-required-btn']")
    private WebElement saveDataBtn;

    @FindBy(xpath = ".//input[@id='fsubjectregulator-mark']")
    private WebElement balField;

    @FindBy(xpath = ".//section[1]/div[1]/div/div[1]/div/a")
    private WebElement perelikSGBtn;

    @FindBy(xpath = ".//input[@name='FSubjectRegulator[last_planned_date]']")
    private WebElement dateField;

    @FindBy(xpath = ".//label[@class='has-star']")
    private WebElement inspCheckbox;

    @FindBy(xpath = ".//*[@id='process-load-btn']")
    private WebElement downloadSGBtn;


    @Step
    public void clickOnSaveDataBtn() {
        actionsWithOurElements.clickOnElement(saveDataBtn);
        logger.info("Element -SaveDataBtn- was clicked");
    }

    @Step
    public void inputBalInToInputField(String bal) {
        actionsWithOurElements.enterTextInInput(balField, bal);
    }

    @Step
    public void inputDateInToInputField(String date) {
        actionsWithOurElements.enterTextInInput(dateField, date);
    }

    @Step
    public void clickOnPerelikSGBtn() {
        actionsWithOurElements.clickOnElement(perelikSGBtn);
        logger.info("Element -PerelikSGBtn- was clicked");
    }

    @Step
    public void goBackPage() {
        actionsWithOurElements.goBackInBrowser();
    }

    @Step
    public void clickOnCheckboxInsp (String expectedState) {
        actionsWithOurElements.setStateToCheckBox(inspCheckbox, expectedState);
        logger.info("Element -CheckboxInsp- was clicked");
    }

    @Step
    public void clickOnDownloadSGBtn() {
        actionsWithOurElements.clickOnElement(downloadSGBtn);
        logger.info("Element -DownloadSGBtn- was clicked");
    }

    @Step
    public void clearTextInInputDateField() {
        actionsWithOurElements.clearTextInInput(dateField);
        logger.info("Text In Input Date Field was cleared");
    }

    @Step
    public void clearTextInInputBalField() {
        actionsWithOurElements.clearTextInInput(balField);
        logger.info("Text In Input Bal Field was cleared");
    }

    @Step
    public void waiting() throws InterruptedException {
        actionsWithOurElements.pause();
    }

}

