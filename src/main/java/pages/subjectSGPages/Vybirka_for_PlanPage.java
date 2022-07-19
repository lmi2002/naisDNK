package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class Vybirka_for_PlanPage extends ParentPage {

    public MainMenu mainMenu;

    public Vybirka_for_PlanPage(WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/index?regulator_id=50&sphere_id=136&planning_period_id=6");
    }

    @FindBy(xpath = ".//h3[@class='page_title' and contains(text(),'Вибірка суб')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@name='selection_all']")
    private WebElement checkboxInGrid;

    @FindBy(xpath = ".//button[@value='load_excel_1']")
    private WebElement dowmloadVybirkaSGBtn;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project/regulators?planning_period_id=6']")
    private WebElement goToPerelikTerOrgLink;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project/spheres?planning_period_id=6']")
    private WebElement goToPerelikSphereLink;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project-inspection/archive-list?planning_period_id=6']")
    private WebElement goToArchiveLink;

    @FindBy(xpath = ".//li[@class='list-group-item']//a[@href='/plan-project-inspection/check-errors?planning_period_id=6&regulator_id=61']")
    private WebElement checkErrorsLink;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[1]/div[2]/ul/li[2]/a")
    private WebElement synhronVybirkaLink;

    @FindBy(xpath = ".//li[@class='list-group-item']//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=61']")
    private WebElement goToProjectPlanTabLink;

    @FindBy(xpath = ".//*[@id='set-subject-check-date']")
    private WebElement setInspDateBtn;

    @FindBy(xpath = ".//*[@id='set-subject-term-date']")
    private WebElement setInspTerminBtn;

    @FindBy(xpath = ".//*[@id='subject-select-date']")
    private WebElement inspDate_ModalWind_Field;

    @FindBy(xpath = ".//*[@id='save-subject-date-attribute-btn']")
    private WebElement saveDate_ModalWind_Btn;

    @FindBy(xpath = ".//*[@id='select2-subject-select-term-container']")
    private WebElement termin_ModalWind_Field;

    @FindBy(xpath = ".//span[2]/ul/li[2]")
    private WebElement termin_ModalWind_Item;

    @FindBy(xpath = ".//*[@id='save-subject-term-attribute-btn']")
    private WebElement saveTermin_ModalWind_Btn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Передати в центральний апарат')]")
    private WebElement sendToCABtn;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean dowmloadVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dowmloadVybirkaSGBtn);
    }

    @Step
    public boolean goToProjectPlanTabLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToProjectPlanTabLink);
    }

    @Step
    public boolean goToPerelikTerOrgLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToPerelikTerOrgLink);
    }

    @Step
    public boolean goToPerelikSphereLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToPerelikSphereLink);
    }

    @Step
    public boolean goToArchiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToArchiveLink);
    }

    @Step
    public boolean checkErrorsLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(checkErrorsLink);
    }

    @Step
    public boolean synhronVybirkaLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(synhronVybirkaLink);
    }

    @Step
    public boolean sendToCABtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sendToCABtn);
    }

    @Step
    public void clickOnSetInspDateBtn() {
        actionsWithOurElements.clickOnElement(setInspDateBtn);
    }

    @Step
    public void enterDateInToInputField(String date) {
        actionsWithOurElements.enterTextInInput(inspDate_ModalWind_Field, date);
    }

    @Step
    public void clickOnInspDate_ModalWind_Field() {
        actionsWithOurElements.clickOnElement(inspDate_ModalWind_Field);
    }

    @Step
    public void clickOnSaveDate_ModalWind_Btn() {
        actionsWithOurElements.clickOnElement(saveDate_ModalWind_Btn);
    }


    @Step
    public void clickOnSetInspTerminBtn() {
        actionsWithOurElements.clickOnElement(setInspTerminBtn);
    }

    @Step
    public void clickOnTermin_ModalWind_Field() {
        actionsWithOurElements.clickOnElement(termin_ModalWind_Field);
    }

    @Step
    public void clickOnTermin_ModalWind_Item() {
        actionsWithOurElements.clickOnElement(termin_ModalWind_Item);
    }

    @Step
    public void clickOnSaveTermin_ModalWind_Btn() {
        actionsWithOurElements.clickOnElement(saveTermin_ModalWind_Btn);
    }

    @Step
    public void clickOnCheckbox_SelectAll_InGrid(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(checkboxInGrid, expectedState);
    }

    @Step
    public void clickOnSendToCABtn() {
        actionsWithOurElements.clickOnElement(sendToCABtn);
    }

    public void pause (int minute) {
        try {
            Thread.sleep(minute * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
