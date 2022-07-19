package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class Vybirka2021AfterSendingToCAPage extends ParentPage {

    public Vybirka2021AfterSendingToCAPage (WebDriver webDriver) {
        super(webDriver, "/plan-project-inspection/index?planning_period_id=6&regulator_id=262");
    }

    public MainMenu mainMenu;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до проекту плану')]")
    private WebElement goToProjectPlanBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до переліку сфер контролю')]")
    private WebElement goToPerelikSphereBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до архіву')]")
    private WebElement goToArchiveBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Переглянути частину проекту плану')]")
    private WebElement seePartOfProjectPlanBtn;

    @FindBy(xpath = ".//button[@id='page_use']")
    private WebElement algorytmPlanBtn;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//button[@class='btn btn-blue' and contains(text(),'Скачати вибірку СГ')]")
    private WebElement downloadVybirka_Btn;

    @FindBy(xpath = ".//body/div[1]/div/button")
    private WebElement closeModalWinBtn;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
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
    public boolean algorytmPlanBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(algorytmPlanBtn);
    }

    @Step
    public boolean seePartOfProjectPlanBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(seePartOfProjectPlanBtn);
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
        Assert.assertEquals(webDriver.getTitle(), "Вибірка суб’єктів господарювання (Київське міжрегіональне управління Укртрансбезпеки)");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-project-inspection/index?planning_period_id=6&regulator_id=262");
    }

    @Step
    public void checkIsUspih_ProjectPlanSentToCA_message_modalWinPresent() {
        Assert.assertTrue("Uspih_Проект плану передано в центральний апарат_message_modalWin is not displayed", webDriver.getPageSource().contains("Проект плану передано в центральний апарат"));
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
    }

}

