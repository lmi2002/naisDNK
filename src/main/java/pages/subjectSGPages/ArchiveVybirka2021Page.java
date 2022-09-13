package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ArchiveVybirka2021Page extends ParentPage {

    public ArchiveVybirka2021Page (WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/archive-list?planning_period_id=6&regulator_id=50");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//p[@class='modal_note' and contains(text(),'Рядок успішно перенесено в архів')]")
    private WebElement sendToArchive_ModalWind_Uspih_CA_message;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement sendToArchive_ModalWind_Close_CA_Btn;

    @FindBy(xpath = ".//a[@class='back-arrow btn btn-mini']")
    private WebElement backToVybirkaBtn;

    @FindBy(xpath = ".//tr[1]//td[10]//a[@class='table_action_btn icon-garbage']")
    private WebElement backFromArchiveBtn;

    @FindBy(xpath = ".//button[@class='btn btn-warning']")
    private WebElement confirmBackFromArchive_ModalWin_Btn;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkSendToArchive_ModalWind_Uspih_CA_messagePresent() {
        Assert.assertTrue("Success message is not displayed", webDriver.getPageSource().contains("Рядки успішно перенесено в архів"));
    }

    @Step
    public void clickOnSendToArchive_ModalWind_Close_CA_Btn() {
        actionsWithOurElements.clickOnElement(sendToArchive_ModalWind_Close_CA_Btn);
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
        Assert.assertEquals(webDriver.getTitle(), "Архів вибірки суб’єктів господарювання (Державна служба України з безпеки на транспорті)");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan-project-inspection/archive-list?planning_period_id=6&regulator_id=50");
    }

    @Step
    public void clickOnBackToVybirkaBtn() {
        actionsWithOurElements.clickOnElement(backToVybirkaBtn);
    }

    @Step
    public void clickOnBackFromArchiveBtn() {
        actionsWithOurElements.clickOnElement(backFromArchiveBtn);
    }

    @Step
    public void clickOnConfirmBackFromArchive_ModalWin_Btn() {
        actionsWithOurElements.clickOnElement(confirmBackFromArchive_ModalWin_Btn);
    }
}
