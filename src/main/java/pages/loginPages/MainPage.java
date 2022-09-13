package pages.loginPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class MainPage extends ParentPage {

    @FindBy(xpath = ".//div[contains(text(),'Ільченко Володимир')]")
    private WebElement userNameDisplayed;

    public MainPage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    private String url = configProperties.base_url() + "";
    //private String url = "https://inspections.gov.ua";

    public MainMenu mainMenu;

    @FindBy(css = "div:nth-child(3) > div > span > span.selection > span")
    private WebElement yearField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement yearItem;

    @FindBy(xpath = ".//span[@id='select2-inspectionsearch-regulator_id-container']")
    private WebElement regulatorNameField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement regulatorNameSearchField;

    @FindBy(xpath = ".//input[@id='inspectionsearch-search']")
    private WebElement companyNameField;

    @FindBy(xpath = ".//input[@id='inspectionsearch-search']")
    private WebElement sgNameSearchField;

    @FindBy(xpath = ".//th[@width='13%' and contains(text(),'Предмет перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-5')]")
    private WebElement searchResultBySG;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement searchResultByAll;

    @FindBy(xpath = ".//*[@id='w0']/div[4]/div/button")
    private WebElement searchEventsBtn;

    @FindBy(xpath = ".//a[@href='/site/index?tab=annual']")
    private WebElement richniInspLink;

    @FindBy(xpath = ".//span[@class='text-danger']")
    private WebElement tz_3_ON_Link;

    @FindBy(xpath = ".//button[@class='close_modal icon-cancel']")
    private WebElement closeModalWinBtn;

    @FindBy(xpath = ".//a[@href='/inspection/view?id=3116436' and contains(text(),'ПУЛЬС')]")
    private WebElement searchResultByEDRPOU;


    @Step
    public void openPage() {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public boolean isUserNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(userNameDisplayed);
    }

    @Step
    public void checkIsUserNamePresent() {
        Assert.assertTrue("User Name is not displayed", isUserNameDisplayed());
    }

    @Step
    public void clickOnYearField() {
        actionsWithOurElements.clickOnElement(yearField);
    }

    @Step
    public void clickOnYearItem() {
        actionsWithOurElements.clickOnElement(yearItem);
    }

    @Step
    public void clickOnRegulatorNameField() {
        actionsWithOurElements.clickOnElement(regulatorNameField);
    }

    @Step
    public void clickOnSGNameField() {
        actionsWithOurElements.clickOnElement(sgNameSearchField);
    }

    @Step
    public void enterSGNameInToSearchField(String regulatorName) {
        actionsWithOurElements.enterTextInInput(sgNameSearchField, regulatorName);
    }

    @Step
    public void enterRegulatorNameInToSearchField(String regulatorName) {
        actionsWithOurElements.enterTextInInput(regulatorNameSearchField, regulatorName);
    }

    @Step
    public void enterCompanyNameInToInputField(String companyName) {
        actionsWithOurElements.enterTextInInput(companyNameField, companyName);
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
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean searchResultBySGIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultBySG);
    }

    @Step
    public void checkIsSearchResultBySGPresent() {
        Assert.assertTrue("Search Result By SG is not displayed", searchResultBySGIsDisplayed());
    }

    @Step
    public boolean searchResultByAllIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultByAll);
    }

    @Step
    public void checkIsSearchResultByAllPresent() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue("Search Result By All is not displayed", searchResultByAllIsDisplayed());
    }

    @Step
    public boolean searchResultByEDRPOUIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResultByEDRPOU);
    }

    @Step
    public void checkIsCompanyNamePresent() {
        Assert.assertTrue("Search Result is not displayed", searchResultByEDRPOUIsDisplayed());
    }

    @Step
    public void clickOnSearchEventsBtn() {
        actionsWithOurElements.clickOnElement(searchEventsBtn);
        logger.info("Element -SearchEventsBtn- was clicked");
    }

    @Step
    public void clickOnRichniInspLink() {
        actionsWithOurElements.clickOnElement(richniInspLink);
        logger.info("Element -RichniInspLink- was clicked");
    }

    @Step
    public void clickOnTZ_3_ON_Link() {
        actionsWithOurElements.clickOnElement(tz_3_ON_Link);
        logger.info("Element -TZ_3_ON_Link- was clicked");
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
        logger.info("Element -CloseModalWinBtn- was clicked");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/");
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Головна");
    }
}

