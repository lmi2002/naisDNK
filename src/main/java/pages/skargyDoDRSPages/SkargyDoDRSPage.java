package pages.skargyDoDRSPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SkargyDoDRSPage extends ParentPage {
    public SkargyDoDRSPage(WebDriver webDriver) {
        super(webDriver, "/subject/view/complaints?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[contains(text(),'Створити скаргу до ДРС')]")
    private WebElement createSkargaBtn;

    @FindBy(xpath = ".//span[@id='select2-subject-complain-inspections-container']")
    private WebElement inspSelectField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement inspItem;

    @FindBy(xpath = ".//textarea[@name='SubjectRequests[text]']")
    private WebElement skargaTextField;

    @FindBy(xpath = ".//button[contains(text(),'Зберегти скаргу')]")
    private WebElement saveSkargaBtn;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement closeModalWinBtn;

    @FindBy(xpath = ".//p[contains(text(),'Скаргу успішно створено!')]")
    private WebElement createSkarga_message;

    @FindBy(xpath = ".//td[contains(text(),'Новий')]")
    private WebElement newStatus;



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
        Assert.assertEquals(webDriver.getTitle(), "Створити скаргу до ДРС");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/view/complaints?subject_id=15076");
    }

    @Step
    public void clickOnCreateSkargaBtn() {
        actionsWithOurElements.clickOnElement(createSkargaBtn);
    }

    @Step
    public void clickOnInspSelectField() {
        actionsWithOurElements.clickOnElement(inspSelectField);
    }

    @Step
    public void clickOnInspItem() {
        actionsWithOurElements.clickOnElement(inspItem);
    }

    @Step
    public void enterSkargaTextInToInputField(String skargaText) {
        actionsWithOurElements.enterTextInInput(skargaTextField, skargaText);
    }

    @Step
    public void clickOnSaveSkargaBtn() {
        actionsWithOurElements.clickOnElement(saveSkargaBtn);
    }

    @Step
    public boolean isUspih_createSkarga_message_modalWinDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createSkarga_message);
    }

    @Step
    public void checkIsUspih_createSkarga_message_modalWinPresent() {
        Assert.assertTrue("Uspih_createSkarga_message_in modalWin is not displayed", isUspih_createSkarga_message_modalWinDisplayed());
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
    }

    @Step
    public void checkIsUspih_deleteSkarga_message_modalWinPresent() {
        Assert.assertTrue("Uspih_deleteSkarga_message_modalWin is not displayed", webDriver.getPageSource().contains("Скаргу успішно видалено!"));
    }

}
