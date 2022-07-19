package pages.loginPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UpdateUserPage extends ParentPage {

    public UpdateUserPage(WebDriver webDriver) {
        super(webDriver, "/user/update?id=7967");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані профілю')]")
    private WebElement updateUserPageTitle;

    @FindBy(xpath = ".//input[@name='UserUpdate[pib]']")
    private WebElement enterPIB;

    @FindBy(xpath = ".//input[@name='UserUpdate[email]']")
    private WebElement enterEmail;

    @FindBy(xpath = ".//input[@name='UserUpdate[phone]']")
    private WebElement enterPhone;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-flat']")
    private WebElement btnUpdate;


    @Step
    public boolean isUpdateUserPageTitleDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateUserPageTitle);
    }

    @Step
    public void enterPIBInToInputField(String userPIB) {
        actionsWithOurElements.enterTextInInput(enterPIB, userPIB);
    }

    @Step
    public void enterEmailInToInputField(String userEmail) {
        actionsWithOurElements.enterTextInInput(enterEmail, userEmail);
    }

    @Step
    public void enterPhoneInToInputField(String userPhone) {
        actionsWithOurElements.enterTextInInput(enterPhone, userPhone);
    }

    @Step
    public void clickOnBtnUpdate() {
        actionsWithOurElements.clickOnElement(btnUpdate);
    }

}
