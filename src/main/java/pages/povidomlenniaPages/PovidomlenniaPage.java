package pages.povidomlenniaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PovidomlenniaPage extends ParentPage {

    public PovidomlenniaPage(WebDriver webDriver) {
        super(webDriver, "/notification/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@class='select2-selection__rendered']")
    private WebElement notificationTypeField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'Заповнення планових перевірок')]")
    private WebElement notificType1Item;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'Проведення планових перевірок')]")
    private WebElement notificType2Item;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Оновлення даних про суб’єкт господарювання')]")
    private WebElement notificType3Item;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Закінчення строку на виконання порушень')]")
    private WebElement notificType4Item;

    @FindBy(xpath = ".//input[@id='notificationsearch-created_at']")
    private WebElement dateField;

    @FindBy(xpath = ".//ul[@class='list-group full_note_list']")
    private WebElement listInTable;

    @Step
    public boolean notificationTypeFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(notificationTypeField);
    }

    @Step
    public boolean notificType1ItemIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(notificType1Item);
    }

    @Step
    public boolean notificType2ItemIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(notificType2Item);
    }

    @Step
    public boolean notificType3ItemIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(notificType3Item);
    }

    @Step
    public boolean notificType4ItemIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(notificType4Item);
    }

    @Step
    public boolean dateFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dateField);
    }

    @Step
    public boolean listInTableIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(listInTable);
    }

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Системні повідомлення");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/notification/index");
    }

    @Step
    public void clickOnNotificationTypeField() {
        actionsWithOurElements.clickOnElement(notificationTypeField);
    }

}
