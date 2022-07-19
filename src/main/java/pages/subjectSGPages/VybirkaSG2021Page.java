package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class VybirkaSG2021Page extends ParentPage {

    public VybirkaSG2021Page(WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/index?planning_period_id=6");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//*[@id='set-subject-planning-period']")
    private WebElement checkboxInGrid;

    @FindBy(xpath = ".//button[@value='load_excel_1']")
    private WebElement dowmloadVybirkaSGBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до проекту плану')]")
    private WebElement goToProjectPlanBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до переліку сфер контролю')]")
    private WebElement goToPerelikSphereBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до архіву')]")
    private WebElement goToArchiveBtn;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[1]/div[2]/ul/li[1]/a")
    private WebElement synhronInspBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Передати в центральний апарат')]")
    private WebElement sendToCABtn;

    @FindBy(xpath = ".//button[@id='page_use']")
    private WebElement algorytmPlanBtn;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[4]")
    private WebElement sphereAutTranspItem;

    //Адміністратор ЦА

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[1]/div[2]/ul/li[1]/a")
    private WebElement checkOnErrors_CA_Btn;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement errorsCheck_ModalWind_Close_CA_Btn;

    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Помилки за періодичностю')]")
    private WebElement errorsByPeriod_CA_Btn;

    @FindBy(xpath = ".//*[@id='sync_subjects_planning']")
    private WebElement synhronAllVybirka_CA_Btn;

    @FindBy(xpath = ".//section[1]/div/div/div[1]/div[2]/div/a[1]")
    private WebElement goToProjectPlan_CA_Btn;

    @FindBy(xpath = ".//*[@id='sync_subjects_planning_modal']/div/div/p[2]/a")
    private WebElement goToProjectPlan_ModalWind_CA_Btn;

    @FindBy(xpath = ".//section[1]/div/div/div[1]/div[2]/div/a[2]")
    private WebElement goToPerelikTerOrg_CA_Btn;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement closeModalWinBtn;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement menuSGBtn;


    @Step
    public void clickOnCheckOnErrors_CA_Btn() {
        actionsWithOurElements.clickOnElement(checkOnErrors_CA_Btn);
    }

    @Step
    public void checkErrorsCheck_ModalWind_Uspih_CA_messagePresent() {
        Assert.assertTrue("Success message is not displayed", webDriver.getPageSource().contains("Вибірку перевірено на помилки. Відфільтруйте за помилковими СГ для отримання результату."));
    }

    @Step
    public void clickOnErrorsCheck_ModalWind_Close_CA_Btn() {
        actionsWithOurElements.clickOnElement(errorsCheck_ModalWind_Close_CA_Btn);
    }

    @Step
    public void clickOnErrorsByPeriod_CA_Btn() {
        actionsWithOurElements.clickOnElement(errorsByPeriod_CA_Btn);
    }

    @Step
    public void clickOnSynhronAllVybirka_CA_Btn() {
        actionsWithOurElements.clickOnElement(synhronAllVybirka_CA_Btn);
    }

    @Step
    public void clickOnGoToProjectPlan_ModalWind_CA_Btn() {
        actionsWithOurElements.clickOnElement(goToProjectPlan_ModalWind_CA_Btn);
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
    public boolean goToToProjectPlanBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToProjectPlanBtn);
    }

    @Step
    public boolean goToToPerelikSphereBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToPerelikSphereBtn);
    }

    @Step
    public boolean goToToArchiveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToArchiveBtn);
    }

    @Step
    public boolean synhronInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(synhronInspBtn);
    }

    @Step
    public boolean sendToCABtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sendToCABtn);
    }

    @Step
    public boolean dowmloadVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dowmloadVybirkaSGBtn);
    }

    @Step
    public boolean algorytmPlanBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(algorytmPlanBtn);
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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-project-inspection/index?planning_period_id=6");
    }

    @Step
    public void clickOnSynhronInspBtn() {
        actionsWithOurElements.clickOnElement(synhronInspBtn);
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
    public void clickOnGoToPerelikTerOrg_CA_Btn() {
        actionsWithOurElements.clickOnElement(goToPerelikTerOrg_CA_Btn);
    }

    @Step
    public void clickOnGoToArchiveBtn() {
        actionsWithOurElements.clickOnElement(goToArchiveBtn);
    }

    @Step
    public void checkIsUspih_BackFromArchive_message_modalWinPresent() {
        Assert.assertTrue("Uspih_BackFromArchive_message_modalWin is not displayed", webDriver.getPageSource().contains("Рядок успішно повернуто з архіву"));
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
    }

    @Step
    public void clickOnGoToProjectPlan_CA_Btn() {
        actionsWithOurElements.clickOnElement(goToProjectPlan_CA_Btn);
    }

    @Step
    public void clickOnMenuSGBtn() {
        actionsWithOurElements.clickOnElement(menuSGBtn);
    }

    @Step
    public void clickOnSphereAutTranspItem() {
        actionsWithOurElements.clickOnElement(sphereAutTranspItem);
    }

}
