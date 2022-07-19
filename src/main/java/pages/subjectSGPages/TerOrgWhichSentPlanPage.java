package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class TerOrgWhichSentPlanPage extends ParentPage {

    public TerOrgWhichSentPlanPage (WebDriver webDriver) {
        super(webDriver, "/plan-project/regulators?planning_period_id=6");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='count_inspection' and contains(text(),'Кількість перевірок в вибірках')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//div[@class = 'summary' and (text()) and contains(text(),'Всього')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span[@class = 'select2-selection__rendered']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//a[@class = 'btn btn-primary' and (text()) and contains(text(),'Відхилити затвердження')]")
    private WebElement disapprovePlanBtn;

    @FindBy(xpath = ".//p[@class = 'modal_note' and (text()) and contains(text(),'Успішно відхилено затведження проекту плану')]")
    private WebElement uspih_disapprove_message_modalWin;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement closeModalWinBtn;

    @FindBy(xpath = ".//span[@class = 'red' and (text()) and contains(text(),'У процесі')]")
    private WebElement planSendStatus;

    @FindBy(xpath = ".//a[@class='back-arrow']")
    private WebElement backToVybirkaLink;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean sphereFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereField);
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
        Assert.assertEquals(webDriver.getTitle(), "Територіальні органи");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-project/regulators?planning_period_id=6");
    }

    @Step
    public boolean isDisapprovePlanBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(disapprovePlanBtn);
    }

    @Step
    public void checkIsDisapprovePlanBtnPresent() {
        Assert.assertTrue("DisapprovePlanBtn is not displayed", isDisapprovePlanBtnDisplayed());
    }

    @Step
    public void checkIsDisapprovePlanBtnNOTPresent() {
        Assert.assertFalse("DisapprovePlanBtn is displayed", isDisapprovePlanBtnDisplayed());
    }

    @Step
    public void clickOnDisapprovePlanBtn() {
        actionsWithOurElements.clickOnElement(disapprovePlanBtn);
    }

    @Step
    public void clickOnSphereField() {
        actionsWithOurElements.clickOnElement(sphereField);
    }

    @Step
    public void clickOnSphereItem() {
        actionsWithOurElements.clickOnElement(sphereItem);
    }

    @Step
    public void checkIsUspih_disapprove_message_modalWinPresent() {
        Assert.assertTrue("Uspih_disapprove_message_modalWin is not displayed", webDriver.getPageSource().contains("Успішно відхилено затведження проекту плану"));
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
    }

    @Step
    public boolean isPlanSendStatus_vProcesi_Displayed() {
        return actionsWithOurElements.isElementDisplayed(planSendStatus);
    }

    @Step
    public void checkIsPlanSendStatus_vProcesi_Present() {
        Assert.assertTrue("PlanSendStatus_vProcesi_ is displayed", isPlanSendStatus_vProcesi_Displayed());
    }

    @Step
    public void clickOnBackToVybirkaLink() {
        actionsWithOurElements.clickOnElement(backToVybirkaLink);
    }
}

