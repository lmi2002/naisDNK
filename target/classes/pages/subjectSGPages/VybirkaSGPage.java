package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class VybirkaSGPage extends ParentPage {

    public VybirkaSGPage(WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/index?planning_period_id=6");
    }

    public MainMenu mainMenu;

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Вибірка суб')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@href='/plan-project-inspection/index?planning_period_id=6&sort=risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@value='load_excel_1']")
    private WebElement dowmloadVybirkaSGBtn;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=61']")
    private WebElement goToProjectPlanLink;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project/regulators?planning_period_id=6']")
    private WebElement goToPerelikTerOrgLink;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project/spheres?planning_period_id=6']")
    private WebElement goToPerelikSphereLink;

    @FindBy(xpath = ".//div[@class='page_header_bts']//a[@href='/plan-project-inspection/archive-list?planning_period_id=6']")
    private WebElement goToArchiveLink;

    @FindBy(xpath = ".//li[@class='list-group-item']//a[@href='/plan-project-inspection/check-errors?planning_period_id=6&regulator_id=61']")
    private WebElement checkErrorsLink;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Синхронізувати перевірки в рамках територіального органу')]")
    private WebElement synhronVybirkaLink;

    @FindBy(xpath = ".//li[@class='list-group-item']//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=61']")
    private WebElement goToProjectPlanTabLink;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Передати в центральний апарат')]")
    private WebElement sendToCABtn;

    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Помилки за періодичностю')]")
    private WebElement errorsByPeriodBtn;

    @FindBy(xpath = ".//*[@id='to-archive']")
    private WebElement moveToArchiveBtn;

    @FindBy(xpath = ".//button[@class='btn btn-warning']")
    private WebElement confirmMoveToArchiveBtn;

    @FindBy(xpath = ".//input[@name='selection_all']")
    private WebElement checkboxInGrid;

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
    public boolean goToProjectPlanLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToProjectPlanLink);
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
    public boolean goToProjectPlanTabLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToProjectPlanTabLink);
    }

    @Step
    public void clickOnSynhronVybirkaLink() {
        actionsWithOurElements.clickOnElement(synhronVybirkaLink);
    }

    @Step
    public void clickOnSendToCABtn() {
        actionsWithOurElements.clickOnElement(sendToCABtn);
    }

    @Step
    public void clickOnErrorsByPeriodBtn() {
        actionsWithOurElements.clickOnElement(errorsByPeriodBtn);
    }

    @Step
    public void clickOnMoveToArchiveBtn() {
        actionsWithOurElements.clickOnElement(moveToArchiveBtn);
    }

    @Step
    public void clickOnConfirmMoveToArchiveBtn() {
        actionsWithOurElements.clickOnElement(confirmMoveToArchiveBtn);
    }

    @Step
    public void clickOnCheckbox_SelectAll_InGrid(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(checkboxInGrid, expectedState);
    }
}
