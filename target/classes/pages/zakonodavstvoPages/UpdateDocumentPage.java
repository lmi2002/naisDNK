package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UpdateDocumentPage extends ParentPage {

    public UpdateDocumentPage(WebDriver webDriver) {
        super(webDriver, "Автоматизоване тестування");
    }

    @FindBy(xpath = ".//button[@class = 'close_modal icon-cancel']")
    private WebElement closeModalWindowBtn;

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'НПА: Оновлення')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-sm-4 col-md-3']")
    private WebElement infoBlockMenu;

    @FindBy(xpath = ".//button[@class='btn btn-info btn-xs add-item']")
    private WebElement addPartBtn;

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement updateBtn;

    @FindBy(xpath = ".//li[@data-select2-id = '20']//span[@class='select2-selection__choice__remove']")
    private WebElement deleteSphere1;

    @FindBy(xpath = ".//input[@id='npa-additional_number']")
    private WebElement enterActNumber;


    @Step
    public void clickOnCloseModalWindowBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindowBtn);
    }

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean infoBlockMenuIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlockMenu);
    }

    @Step
    public boolean addPartBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addPartBtn);
    }

    @Step
    public void enterActNumberInToField(String actNumber) {
        actionsWithOurElements.enterTextInInput(enterActNumber, actNumber);
    }

    @Step
    public void clickOnDeleteSphere1() {
        actionsWithOurElements.clickOnElement(deleteSphere1);
    }

    @Step
    public void clickOnUpdateBtn() {
        actionsWithOurElements.clickOnElement(updateBtn);
    }


}
