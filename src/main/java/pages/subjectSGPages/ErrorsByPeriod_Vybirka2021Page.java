package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ErrorsByPeriod_Vybirka2021Page extends ParentPage {

    public ErrorsByPeriod_Vybirka2021Page(WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/index?PlanProjectInspectionSearch%5Bis_error%5D=1&planning_period_id=6&regulator_id=50");
    }

    public ArchiveVybirka2021Page archiveVybirka2021Page;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@name='selection_all']")
    private WebElement checkboxInGrid;

    @FindBy(xpath = ".//*[@id='to-archive']")
    private WebElement sendSGToArchiveBtn;

    @FindBy(xpath = ".//button[@class='btn btn-warning']")
    private WebElement confirm_Modal_Btn;

    @FindBy(xpath = ".//*[@id='pa3py6aka-modal-alert']/div/button")
    private WebElement close_ModalWin_Uspih_Btn;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[1]/div[2]/ul/li[2]/a")
    private WebElement synhronAllVybirka_CA_Btn;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[1]/div[2]/ul/li[3]/a")
    private WebElement goToProjectPlan_CA_Btn;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
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
        Assert.assertEquals(webDriver.getTitle(), "Вибірка суб’єктів господарювання (Всі)");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan-project-inspection/index?PlanProjectInspectionSearch%5Bis_error%5D=1&planning_period_id=6&regulator_id=50");
    }

    @Step
    public void clickOnSendSGToArchiveBtn() {
        actionsWithOurElements.clickOnElement(sendSGToArchiveBtn);
    }

    @Step
    public void clickOnSynhronAllVybirka_CA_Btn() {
        actionsWithOurElements.clickOnElement(synhronAllVybirka_CA_Btn);
    }

    @Step
    public void sendSGToArchiveIfPresent() {
        if (actionsWithOurElements.isElementDisplayed(sendSGToArchiveBtn)) {

            clickOnSendSGToArchiveBtn();
            clickOnConfirm_Modal_Btn();
            archiveVybirka2021Page.checkSendToArchive_ModalWind_Uspih_CA_messagePresent();
            archiveVybirka2021Page.clickOnSendToArchive_ModalWind_Close_CA_Btn();
            archiveVybirka2021Page.gridListElementsIsDisplayed();
            archiveVybirka2021Page.clickOnBackToVybirkaBtn();

        } else {
            clickOnSynhronAllVybirka_CA_Btn();
        }
    }

    @Step
    public void clickOnConfirm_Modal_Btn() {
        actionsWithOurElements.clickOnElement(confirm_Modal_Btn);
    }

    @Step
    public void clickOnClose_ModalWin_Uspih_Btn() {
        actionsWithOurElements.clickOnElement(close_ModalWin_Uspih_Btn);
    }

    @Step
    public void clickOnCheckbox_SelectAll_InGrid(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(checkboxInGrid, expectedState);
    }

    @Step
    public void clickOnGoToProjectPlan_CA_Btn() {
        actionsWithOurElements.clickOnElement(goToProjectPlan_CA_Btn);
    }
}