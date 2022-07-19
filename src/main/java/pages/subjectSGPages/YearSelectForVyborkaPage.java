package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class YearSelectForVyborkaPage extends ParentPage {

    public YearSelectForVyborkaPage (WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=262&planningPeriodId=6&sphereId=136&tab=main");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Вибірка суб')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/subject/index?tab=main&regulatorId=61&export=load_subject']")
    private WebElement saveFileLink;

    @FindBy(xpath = ".//a[contains(text(),'Об')]")
    private WebElement objectLink;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[3]/div/div/span/span[1]/span/span[2]")
    private WebElement selectYearField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[2]/div/span/span[1]/span/span[2]")
    private WebElement selectRegulatorField;

    @FindBy(xpath = ".//*[@id='select2-w1-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//li[contains(text(),'2021')]")
    private WebElement item2021;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement menuSGBtn;

    @FindBy(xpath = ".//*[@id='w4']/table/tbody/tr/td[9]/div/ul/li[1]/a")
    private WebElement viewCardSGLink;

    @FindBy(xpath = ".//button[contains(text(),'Додати в сферу')]")
    private WebElement addInToSphereLink;

    @FindBy(xpath = ".//button[contains(text(),'Додати в плановий період')]")
    private WebElement addInToPlanPeriodLink;

    @FindBy(xpath = ".//a[@href='/subject/index?tab=archived&regulatorId=61']")
    private WebElement addInToArchiveLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/div/a")
    private WebElement mainDropdownMenu;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[3]")
    private WebElement sendToVybirkaBtn;

    @FindBy(xpath = ".//a[contains(text(),'Перейти до рейтингу СГ')]")
    private WebElement goToRatingSGLink;

    @FindBy(xpath = ".//a[contains(text(),'Перейти в вибірку')]")
    private WebElement goToVybirkaBtn;

    @FindBy(xpath = ".//a[contains(text(),'Додати СГ')]")
    private WebElement addSGBtn;

    @FindBy(xpath = ".//a[contains(text(),'Імпортування суб')]")
    private WebElement importBtn;

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
    public boolean addInToPlanPeriodLinkIsDisplayed() {
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

    @Step
    public boolean goToVybirkaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirkaBtn);
    }
    @Step
    public void clickOnGoToVybirkaBtn() {
        actionsWithOurElements.clickOnElement(goToVybirkaBtn);
    }

}


