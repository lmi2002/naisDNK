package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class SubjectsListPage extends ParentPage {

    public MainMenu mainMenu;

    //public SubjectsListPage(WebDriver webDriver) {super(webDriver, "/subject/index?regulatorId=61");} //охорона праці

    public SubjectsListPage(WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=205");
    } //Київське міжрегіональне управління Укртрансбезпеки

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Перелік суб')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement searchListElements;

    @FindBy(xpath = ".//a[@href='/subject/index?tab=main&regulatorId=61&export=load_subject']")
    private WebElement saveFileLink;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Об')]")
    private WebElement objectLink;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[3]/div/div/span/span[1]/span/span[2]")
    private WebElement selectYearField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[2]/div/span/span[1]/span/span[2]")
    private WebElement selectRegulatorField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement regulatorItem;

    @FindBy(xpath = ".//*[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Державний нагляд (контроль) у сфері захисту рослин')]")
    private WebElement sphereAutoTranspItem;

    @FindBy(xpath = ".//li[contains(text(),'2016')]")
    private WebElement item2016;

    @FindBy(xpath = ".//li[contains(text(),'2017')]")
    private WebElement item2017;

    @FindBy(xpath = ".//li[contains(text(),'2018')]")
    private WebElement item2018;

    @FindBy(xpath = ".//li[contains(text(),'2019')]")
    private WebElement item2019;

    @FindBy(xpath = ".//li[contains(text(),'2020')]")
    private WebElement item2020;

    @FindBy(xpath = ".//li[contains(text(),'2021')]")
    private WebElement item2021;

    @FindBy(xpath = ".//input[@name='SubjectSearch[full_name]']")
    private WebElement searchSGFieldByName;

    @FindBy(xpath = ".//input[@name='SubjectSearch[code]']")
    private WebElement searchSGFieldByCode;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement menuSGBtn;

    @FindBy(xpath = ".//*[@id='w4']/table/tbody/tr/td[9]/div/ul/li[1]/a")
    private WebElement viewCardSGLink;

    @FindBy(xpath = ".//button[@class='btn btn_link' and contains(text(),'Додати в сферу')]")
    private WebElement addInToSphereLink;

    @FindBy(xpath = ".//button[@class='btn btn_link' and contains(text(),'Додати в плановий період')]")
    private WebElement addInToPlanPeriodLink;

    @FindBy(xpath = ".//a[@href='/subject/index?tab=archived&regulatorId=61']")
    private WebElement addInToArchiveLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/div/a")
    private WebElement mainDropdownMenu;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[3]")
    private WebElement sendToVybirkaBtn;

    @FindBy(xpath = ".//a[@id='show-rating-btn' and contains(text(),'Перейти до рейтингу СГ')]")
    private WebElement goToRatingSGLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[1]")
    private WebElement addSGBtn;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[2]")
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
    public void clickOnAddSGBtn() {
        actionsWithOurElements.clickOnElement(addSGBtn);
        logger.info("Element -AddSGBtn- was clicked");
    }

    @Step
    public void clickOnSelectYearField() {
        actionsWithOurElements.clickOnElement(selectYearField);
        logger.info("Element -SelectYearField- was clicked");
    }

    @Step
    public void clickOnSelectRegulatorField() {
        actionsWithOurElements.clickOnElement(selectRegulatorField);
        logger.info("Element -SelectRegulatorField- was clicked");
    }

    @Step
    public void clickOnRegulatorItem() {
        actionsWithOurElements.clickOnElement(regulatorItem);
        logger.info("Element -RegulatorItem- was clicked");
    }

    @Step
    public void clickOnSphereField() {
        actionsWithOurElements.clickOnElement(sphereField);
        logger.info("Element -SphereField- was clicked");
    }

    @Step
    public void clickOnSphereItem() {
        actionsWithOurElements.clickOnElement(sphereItem);
        logger.info("Element -SphereItem- was clicked");
    }

    @Step
    public void clickOn2016YearItem() {
        actionsWithOurElements.clickOnElement(item2016);
        logger.info("Element -2016YearItem- was clicked");
    }

    @Step
    public void clickOn2017YearItem() {
        actionsWithOurElements.clickOnElement(item2017);
        logger.info("Element -2017YearItem- was clicked");
    }

    @Step
    public void clickOn2018YearItem() {
        actionsWithOurElements.clickOnElement(item2018);
        logger.info("Element -2018YearItem- was clicked");
    }

    @Step
    public void clickOn2019YearItem() {
        actionsWithOurElements.clickOnElement(item2019);
        logger.info("Element -2019YearItem- was clicked");
    }

    @Step
    public void clickOn2020YearItem() {
        actionsWithOurElements.clickOnElement(item2020);
        logger.info("Element -2020YearItem- was clicked");
    }

    @Step
    public void clickOn2021YearItem() {
        actionsWithOurElements.clickOnElement(item2021);
        logger.info("Element -2021YearItem- was clicked");
    }

    @Step
    public void inputSGNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(searchSGFieldByName, sgName);
    }

    @Step
    public void inputEdrpouCodeInToInputField(String sgCode) {
        actionsWithOurElements.enterTextInInput(searchSGFieldByCode, sgCode);
    }

    @Step
    public boolean searchSGResultIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchListElements);
    }

    @Step
    public boolean addInToSphereLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addInToSphereLink);
    }

    @Step
    public boolean addInToPlanPeriodLink() {
        return actionsWithOurElements.isElementDisplayed(addInToPlanPeriodLink);
    }

    @Step
    public void clickOnMenuSGBtn() {
        actionsWithOurElements.clickOnElement(menuSGBtn);
        logger.info("Element -MenuSGBtn- was clicked");
    }

    @Step
    public void clickOnViewCardSGLink() {
        actionsWithOurElements.clickOnElement(viewCardSGLink);
        logger.info("Element -ViewCardSGLink- was clicked");
    }

    @Step
    public boolean objectLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(objectLink);
    }

    @Step
    public void clickOnImportBtn() {
        actionsWithOurElements.clickOnElement(importBtn);
        logger.info("Element -ImportBtn- was clicked");
    }

    @Step
    public void clickOnMainDropdownMenu() {
        actionsWithOurElements.clickOnElement(mainDropdownMenu);
        logger.info("Element -MainDropdownMenu- was clicked");
    }

    @Step
    public void clickOnSphereAutoTranspItem() {
        actionsWithOurElements.clickOnElement(sphereAutoTranspItem);
        logger.info("Element -SphereAutoTranspItem- was clicked");
    }

}
