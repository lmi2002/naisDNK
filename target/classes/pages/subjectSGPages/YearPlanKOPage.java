package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class YearPlanKOPage extends ParentPage {

    public YearPlanKOPage (WebDriver webDriver) {
        super(webDriver, "/plan-inspection/index?planning_period_id=6&regulator_id=61");
    }

    public MainMenu mainMenu;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@href='/plan-project-inspection/index?planning_period_id=6&sort=risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@value='load_plan_inspection']")
    private WebElement dowmloadBtn;

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

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirkaSGBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Передати в центральний апарат')]")
    private WebElement sendToCABtn;

    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Помилки за періодичностю')]")
    private WebElement errorsByPeriodBtn;

    @FindBy(xpath = ".//*[@id='to-archive']")
    private WebElement moveToArchiveBtn;

    @FindBy(xpath = ".//section[1]/div/div/div[3]/div/ul/li[2]/a")
    private WebElement archiveTab;

    @FindBy(xpath = ".//input[@name='selection_all']")
    private WebElement checkboxInGrid;

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
        Assert.assertEquals(webDriver.getTitle(), "Річний план контролюючого органу");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-inspection/index?planning_period_id=6&regulator_id=61");
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
    public boolean downloadBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dowmloadBtn);
    }

    @Step
    public void checkIsDownloadBtnPresent() {
        Assert.assertTrue("Download .xlsx Btn is not displayed", downloadBtnIsDisplayed());
    }

    @Step
    public boolean goToVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirkaSGBtn);
    }

    @Step
    public void checkIsGoToVybirkaSGBtnPresent() {
        Assert.assertTrue("GoTo Vybirka SG Btn is not displayed", goToVybirkaSGBtnIsDisplayed());
    }

    @Step
    public boolean goToArchiveTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveTab);
    }

    @Step
    public void checkIsArchiveTabPresent() {
        Assert.assertTrue("GoTo Vybirka SG Btn is not displayed", goToArchiveTabIsDisplayed());
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
    public boolean archiveTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveTab);
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
    public void clickOnArchiveTab() {
        actionsWithOurElements.clickOnElement(archiveTab);
    }

    @Step
    public void clickOnConfirmMoveToArchiveBtn() {
        actionsWithOurElements.clickOnElement(archiveTab);
    }

    @Step
    public void clickOnCheckbox_SelectAll_InGrid(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(checkboxInGrid, expectedState);
    }
}

