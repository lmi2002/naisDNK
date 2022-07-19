package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EditSGPage extends ParentPage {

    public EditSGPage(WebDriver webDriver) {
        super(webDriver, "/subject/subject/edit?subject_id=15076&regulator_id=262&sphere_id=136");
    }

    @FindBy(xpath = ".//button[@id='save-required-btn']")
    private WebElement saveDataBtn;

    @FindBy(xpath = ".//input[@id='fsubjectregulator-mark']")
    private WebElement balField;

    @FindBy(xpath = ".//a[contains(text(),'Перелік СГ')]")
    private WebElement perelikSGBtn;

    @FindBy(xpath = ".//a[contains(text(),'Завантажити суб’єкт господарювання')]")
    private WebElement downloadSGBtn;

    @Step
    public void clickOnSaveDataBtn() {
        actionsWithOurElements.clickOnElement(saveDataBtn);
    }

    @Step
    public void clickOnDownloadSGBtn() {
        actionsWithOurElements.clickOnElement(downloadSGBtn);
    }

    @Step
    public void inputBalInToInputField() {

        int a=30;
        int b=39;
        int balItem = a + (int)(Math.random() * ((b - a) + 1));

        String strBalItem = String.valueOf(balItem);
        actionsWithOurElements.enterTextInInput(balField, strBalItem);
    }

    @Step
    public void clickOnPerelikSGBtn() throws InterruptedException {
        actionsWithOurElements.getElementByScroll(perelikSGBtn);
        waiting();
        actionsWithOurElements.clickOnElement(perelikSGBtn);
    }

    @Step
    public void goBackPage() {
        actionsWithOurElements.goBackInBrowser();
    }

    @Step
    public void waiting() throws InterruptedException {
        actionsWithOurElements.pause();
    }

    @Step
    public void refreshPage() {
        actionsWithOurElements.refreshPage();
    }
}