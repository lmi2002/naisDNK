package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class Subject_Vybirka_Sphere_Year_SelectedPage extends ParentPage {

    public Subject_Vybirka_Sphere_Year_SelectedPage (WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=262&planningPeriodId=6&sphereId=136&tab=main");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span[@id='select2-w1-container']")
    private WebElement regulatorField;

    @FindBy(xpath = ".//*[@id='select2-w2-container']")
    private WebElement yearField;

    @FindBy(xpath = ".//a[@data-sort='code' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/div/a")
    private WebElement dropdownMenuBtn;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[1]")
    private WebElement addSGBtn;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[2]")
    private WebElement importSGBtn;

    @FindBy(xpath = ".//a[@class='btn btn_link' and contains(text(), 'Перейти в вибірку')]")
    private WebElement goToVybirkaBtn;

    @FindBy(xpath = ".//a[@id='move_subjects_planning_info']")
    private WebElement addSGinVybirkaBtn;

    @FindBy(xpath = ".//*[@id='set-subject-sphere']")
    private WebElement addSGinSphereBtn;

    @FindBy(xpath = ".//*[@id='set-subject-planning-period']")
    private WebElement addSGinPlanPeriodBtn;

    @FindBy(xpath = ".//*[@id='set-subject-planning-period']")
    private WebElement checkboxInGrid;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[2]/ul/li[2]/a")
    private WebElement goToObjectsLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[3]")
    private WebElement moveToVybirkaBtn;

    @FindBy(xpath = ".//h4[@class='modal-title' and contains(text(), 'Перенести у вибірку')]")
    private WebElement moveToVybirka_ModalWin_title;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block' and contains(text(), 'Перенести у вибірку')]")
    private WebElement moveToVybirka_ModalWin_Btn;

    @FindBy(xpath = ".//div[4]//h4[@class='modal_title' and contains(text(), 'Успіх')]")
    private WebElement uspih_ModalWin_title;

    @FindBy(xpath = ".//a[@class='btn-block btn btn-primary' and contains(text(), 'Перейти до вибірки')]")
    private WebElement goToVybirka_ModalWin_Btn;

    @FindBy(xpath = ".//*[@id='move-subjects-planning-container']//b[contains(text(),'23')][1]")
    private WebElement totalNumberSG_ModalWin;

    @FindBy(xpath = ".//*[@id='move-subjects-planning-container']//b[contains(text(),'19')]")
    private WebElement totalNumberSG_ForPlan_ModalWin;


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
    public boolean regulatorFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(regulatorField);
    }

    @Step
    public boolean yearFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(yearField);
    }

    @Step
    public boolean dropdownMenuBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dropdownMenuBtn);
    }

    @Step
    public boolean addSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGBtn);
    }

    @Step
    public boolean importSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(importSGBtn);
    }

    @Step
    public boolean addSGinVybirkaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGinVybirkaBtn);
    }

    @Step
    public boolean addSGinSphereBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGinSphereBtn);
    }

    @Step
    public boolean addSGinPlanPeriodBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGinPlanPeriodBtn);
    }

    @Step
    public boolean checkboxInGridIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(checkboxInGrid);
    }

    @Step
    public boolean goToObjectsLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToObjectsLink);
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
        Assert.assertEquals(webDriver.getTitle(), "Вибірка суб'єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/index?regulatorId=262&planningPeriodId=6&sphereId=136&tab=main");
    }

    @Step
    public boolean isMoveToVybirkaBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(moveToVybirkaBtn);
    }

    @Step
    public void clickOnMoveToVybirkaBtn() {
        actionsWithOurElements.clickOnElement(moveToVybirkaBtn);
    }

    @Step
    public void clickOnAddSGBtn() {
        actionsWithOurElements.clickOnElement(addSGBtn);
    }

    @Step
    public void clickOnCheckboxInGrid_AllSubjects() {
        actionsWithOurElements.clickOnElement(checkboxInGrid);
    }

    @Step
    public void clickOnAddSGinVybirkaBtn() {
        actionsWithOurElements.clickOnElement(addSGinVybirkaBtn);
    }

    @Step
    public void clickOnGoToVybirkaBtn() {
        actionsWithOurElements.clickOnElement(goToVybirkaBtn);
    }

    @Step
    public boolean isMoveToVybirka_ModalWin_titleDisplayed() {
        return actionsWithOurElements.isElementDisplayed(moveToVybirka_ModalWin_title);
    }

    @Step
    public void checkIsMoveToVybirka_ModalWin_titlePresent() {
        Assert.assertTrue("Move To Vybirka_ModalWin_title is not displayed", isMoveToVybirka_ModalWin_titleDisplayed());
    }

    @Step
    public void clickOnMoveToVybirka_ModalWin_Btn() {
        actionsWithOurElements.clickOnElement(moveToVybirka_ModalWin_Btn);
    }

    @Step
    public boolean isUspih_ModalWin_titleDisplayed() {
        return actionsWithOurElements.isElementDisplayed(uspih_ModalWin_title);
    }

    @Step
    public void clickOnGoToVybirka_ModalWin_Btn() {
        actionsWithOurElements.clickOnElement(goToVybirka_ModalWin_Btn);
    }

    @Step
    public boolean isTotalNumberSG_ModalWinDisplayed() {
        return actionsWithOurElements.isElementDisplayed(totalNumberSG_ModalWin);
    }

    @Step
    public void checkIsTotalNumberSG_ModalWinPresent() {
        Assert.assertTrue("TotalNumberSG_ModalWin (23) is not displayed", isTotalNumberSG_ModalWinDisplayed());
    }

    @Step
    public boolean isTotalNumberSG_ForPlan_ModalWinDisplayed() {
        return actionsWithOurElements.isElementDisplayed(totalNumberSG_ForPlan_ModalWin);
    }

    @Step
    public void checkIsTotalNumberSG_ForPlan_ModalWinPresent() {
        Assert.assertTrue("TotalNumberSG_ForPlan_ModalWin (19) is not displayed", isTotalNumberSG_ForPlan_ModalWinDisplayed());
    }
    public void pause (int minute) {
        try {
            Thread.sleep(minute * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
