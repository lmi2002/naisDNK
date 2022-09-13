package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class Subject_Vybirka_SphereAutTrSelectedPage extends ParentPage {

    public Subject_Vybirka_SphereAutTrSelectedPage (WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=50&sphereId=162&tab=main");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//span[@id='select2-w1-container']")
    private WebElement regulatorField;

    @FindBy(xpath = ".//*[@id='select2-w2-container']")
    private WebElement yearField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[6]")
    private WebElement yearItem;

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

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[3]")
    private WebElement addSGinVybirkaBtn;

    @FindBy(xpath = ".//*[@id='set-subject-sphere']")
    private WebElement addSGinSphereBtn;

    @FindBy(xpath = ".//*[@id='set-subject-planning-period']")
    private WebElement addSGinPlanPeriodBtn;

    @FindBy(xpath = ".//*[@id='set-subject-planning-period']")
    private WebElement checkboxInGrid;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[2]/ul/li[2]/a")
    private WebElement goToObjectsLink;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/index?regulatorId=50&sphereId=162&tab=main");
    }

    @Step
    public void clickOnYearField() {
        actionsWithOurElements.clickOnElement(yearField);
        logger.info("Element -YearField- was clicked");
    }

    @Step
    public void clickOnYearItem() {
        actionsWithOurElements.clickOnElement(yearItem);
        logger.info("Element -YearItem- was clicked");
    }
}
