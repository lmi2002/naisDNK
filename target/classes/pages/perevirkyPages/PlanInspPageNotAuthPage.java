package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanInspPageNotAuthPage extends ParentPage {

    public PlanInspPageNotAuthPage (WebDriver webDriver) {
        super(webDriver, "/inspection/all-planned");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати планових перевірок')]")
    private WebElement pageTitleNotAuth;

    @FindBy(xpath = ".//th[@width='10%' and contains(text(),'Тероргани ')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement searchListElements;

    @FindBy(xpath = ".//button[@value='load_planned_inspection']")
    private WebElement downloadFileLink;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Розширені дані перевірок')]")
    private WebElement allInspDateLink;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[3]/div/div/span/span[1]/span/span[2]")
    private WebElement selectYearField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[2]/div/span/span[1]/span/span[2]")
    private WebElement selectRegulatorField;

    @FindBy(xpath = ".//span[contains(text(),'Державна служба України з питань праці')]")
    private WebElement regulatorItem;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div/div/div[1]/div/div/span/span[1]/span/span[2]")
    private WebElement selectSphereField;

    @FindBy(xpath = ".//li[contains(text(),'2018')]")
    private WebElement item2018;

    @FindBy(xpath = ".//li[contains(text(),'2019')]")
    private WebElement item2019;

    @FindBy(xpath = ".//li[contains(text(),'2020')]")
    private WebElement item2020;

    @FindBy(xpath = ".//li[contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//input[@name='AnnualInspectionUnplanned[name]']")
    private WebElement searchSGField;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement menuInspBtn;

    @FindBy(xpath = ".//a[@title='Переглянути картку перевірки']")
    private WebElement viewInspCardBtn;

    @FindBy(xpath = ".//a[@title='Оновити']")
    private WebElement updateInspBtn;

    @FindBy(xpath = ".//a[@title='Зберегти в .xlsx']")
    private WebElement downloadInspBtn;

    @FindBy(xpath = ".//a[@title='Перенести в архів']")
    private WebElement goToArchiveInspBtn;


    @Step
    public boolean pageTitleNotAuthIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitleNotAuth);
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
    public boolean downloadFileLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileLink);
    }

    @Step
    public boolean allInspDateLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInspDateLink);
    }

    @Step
    public void clickOnAllInspDateLink() {
        actionsWithOurElements.clickOnElement(allInspDateLink);
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
    public void clickOnSelectRegulatorItem() {
        actionsWithOurElements.clickOnElement(regulatorItem);
    }

    @Step
    public void clickOnSphereItem() {
        actionsWithOurElements.clickOnElement(sphereItem);
    }

    @Step
    public void clickOn2018YearItem() {
        actionsWithOurElements.clickOnElement(item2018);
    }

    @Step
    public void clickOn2019YearItem() {
        actionsWithOurElements.clickOnElement(item2019);
    }

    @Step
    public void clickOn2020YearItem() {
        actionsWithOurElements.clickOnElement(item2020);
    }

    @Step
    public void enterSGNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(searchSGField, sgName);
    }

    @Step
    public boolean searchSGResultIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchListElements);
    }

    @Step
    public boolean menuInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(menuInspBtn);
    }

    @Step
    public void clickOnMenuInspBtn() {
        actionsWithOurElements.clickOnElement(menuInspBtn);
    }

    @Step
    public void clickOnViewInspCardBtn() {
        actionsWithOurElements.clickOnElement(viewInspCardBtn);
    }

    @Step
    public void clickOnUpdateInspBtn() {
        actionsWithOurElements.clickOnElement(updateInspBtn);
    }

    @Step
    public boolean viewInspCardBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(viewInspCardBtn);
    }

    @Step
    public boolean updateInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateInspBtn);
    }

    @Step
    public boolean downloadInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadInspBtn);
    }

    @Step
    public boolean goToArchiveInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToArchiveInspBtn);
    }

}
