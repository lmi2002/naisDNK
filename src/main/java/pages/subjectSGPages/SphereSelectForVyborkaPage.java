package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SphereSelectForVyborkaPage extends ParentPage {

    public SphereSelectForVyborkaPage(WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=262&sphereId=136&tab=main");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(css = "div.col-auto > div > div > ul > li:nth-child(1) > a")
    private WebElement saveFileLink;

    @FindBy(xpath = ".//a[contains(text(),'Об')]")
    private WebElement objectLink;

    @FindBy(xpath = ".//*[@id='select2-w2-container']")
    private WebElement selectYearField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[2]/div/span/span[1]/span/span[2]")
    private WebElement selectRegulatorField;

    @FindBy(xpath = ".//*[@id='select2-w1-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'2021')]")
    private WebElement item2021;

    @FindBy(xpath = ".//tr[1]/td[11]//a[@class='btn-open-inspector-cart'] ")
    private WebElement menuSGBtn;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[11]/div/ul/li[1]/a")
    private WebElement viewCardSGLink;

    @FindBy(xpath = ".//tr[1]//td[11]//a[@title='Редагувати в сфері']")
    private WebElement editCardSGLink;

    @FindBy(xpath = ".//button[contains(text(),'Додати в сферу')]")
    private WebElement addInToSphereLink;

    @FindBy(xpath = ".//button[contains(text(),'Додати в плановий період')]")
    private WebElement addInToPlanPeriodLink;

    @FindBy(css = "div.col-auto > div > div > ul > li:nth-child(3) > a")
    private WebElement addInToArchiveLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/div/a")
    private WebElement mainDropdownMenu;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[3]")
    private WebElement sendToVybirkaBtn;

    @FindBy(xpath = ".//a[contains(text(),'Перейти до рейтингу СГ')]")
    private WebElement goToRatingSGLink;

    @FindBy(css = " div.col-auto > div > a:nth-child(1)")
    private WebElement addSGBtn;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[2]")
    private WebElement importBtn;

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/index?regulatorId=262&sphereId=136&tab=main");
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean saveFileLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveFileLink);
    }

    @Step
    public boolean importBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(importBtn);
    }

    @Step
    public boolean sendToVybirkaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sendToVybirkaBtn);
    }

    @Step
    public boolean addInToArchiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addInToArchiveLink);
    }

    @Step
    public boolean addSGLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGBtn);
    }

    @Step
    public void clickOnAddSGLink() {
        actionsWithOurElements.clickOnElement(addSGBtn);
    }

    @Step
    public void clickOnSelectYearField() {
        actionsWithOurElements.clickOnElement(selectYearField);
    }

    @Step
    public void clickOnSelectRegulatorField() {
        actionsWithOurElements.clickOnElement(selectRegulatorField);
    }

    @Step
    public void clickOnSphereField() {
        actionsWithOurElements.clickOnElement(sphereField);
    }

    @Step
    public void clickOn2021YearItem() {
        actionsWithOurElements.clickOnElement(item2021);
    }

    @Step
    public boolean addInToSphereLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addInToSphereLink);
    }

    @Step
    public boolean addInToPlanPeriodLinkIsDisplayed () {
        return actionsWithOurElements.isElementDisplayed(addInToPlanPeriodLink);
    }

    @Step
    public void clickOnMenuSGBtn() {
        actionsWithOurElements.clickOnElement(menuSGBtn);
    }

    @Step
    public void clickOnViewCardSGLink() {
        actionsWithOurElements.clickOnElement(viewCardSGLink);
    }

    @Step
    public void clickOnEditCardSGLink() {
        actionsWithOurElements.clickOnElement(editCardSGLink);
    }


    @Step
    public boolean objectLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(objectLink);
    }

    @Step
    public void clickOnImportBtn() {
        actionsWithOurElements.clickOnElement(importBtn);
    }

    @Step
    public void clickOnMainDropdownMenu() {
        actionsWithOurElements.clickOnElement(mainDropdownMenu);
    }

}
