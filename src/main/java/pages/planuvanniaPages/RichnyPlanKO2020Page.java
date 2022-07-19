package pages.planuvanniaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichnyPlanKO2020Page extends ParentPage {

    public RichnyPlanKO2020Page(WebDriver webDriver) {
        super(webDriver, "/plan-inspection/index?planning_period_id=4&regulator_id=61");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='page_header']//a[@href='/planning-period/index']")
    private WebElement backToPlanuvanniaPageLink;

    @FindBy(xpath = ".//button[@value='load_plan_inspection']")
    private WebElement downloadFileBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirkaSGBtn;

    @FindBy(xpath = ".//*[@id='select2-w0-container']")
    private WebElement sphereSelectField;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement actualInspLink;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Архів')]")
    private WebElement archiveInspLink;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean sphereSelectFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereSelectField);
    }

    @Step
    public void checkIsSphereSelectFieldPresent() {
        Assert.assertTrue("Sphere Select Field is not displayed", sphereSelectFieldIsDisplayed());
    }

    @Step
    public boolean actualInspLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(actualInspLink);
    }

    @Step
    public void checkIsActualInspLinkPresent() {
        Assert.assertTrue("Actual Insp Link is not displayed", actualInspLinkIsDisplayed());
    }

    @Step
    public boolean archiveInspLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveInspLink);
    }

    @Step
    public void checkIsArchiveInspLinkPresent() {
        Assert.assertTrue("Sphere Select Field is not displayed", archiveInspLinkIsDisplayed());
    }

    @Step
    public boolean downloadFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileBtn);
    }

    @Step
    public void checkIsDownloadFileBtnPresent() {
        Assert.assertTrue("Download File Btn is not displayed", downloadFileBtnIsDisplayed());
    }

    @Step
    public boolean goToVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirkaSGBtn);
    }

    @Step
    public void goToVybirkaSGBtnPresent() {
        Assert.assertTrue("Go To Vybirka SG Btn is not displayed", goToVybirkaSGBtnIsDisplayed());
    }

    @Step
    public boolean backToPlanuvanniaPageLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToPlanuvanniaPageLink);
    }

    @Step
    public void checkIsBackToPlanuvanniaPageLinkPresent() {
        Assert.assertTrue("BackToPlanuvanniaPageLink is NOT displayed", webDriver.getPageSource().contains("повернутися до планових періодів"));
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
        Assert.assertEquals(webDriver.getTitle(), "Річний план контролюючого органу");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-inspection/index?planning_period_id=4&regulator_id=61");
    }
}
