package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PozaplanInspPage extends ParentPage {

    public PozaplanInspPage(WebDriver webDriver) {
        super(webDriver, "/inspection/unplanned");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Підстава перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement searchListElements;

    @FindBy(xpath = ".//button[@value='load_unplanned_inspection']")
    private WebElement downloadFileLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[2]")
    private WebElement goToArchiveLink;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[1]")
    private WebElement createInspLink;

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

    @FindBy(xpath = ".//li[contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//input[@name='AnnualInspectionUnplanned[name]']")
    private WebElement searchSGField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[2]/div/div/div/table/tbody/tr[1]/td[9]/div/a")
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
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Позапланові перевірки");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection/unplanned");
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
    public boolean searchListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchListElements);
    }

    @Step
    public void checkIsSearchListElementsPresent() {
        Assert.assertTrue("Search List Elements is not displayed", searchListElementsIsDisplayed());
    }

    @Step
    public boolean goToArchiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToArchiveLink);
    }

    @Step
    public void checkIsGoToArchiveLinkPresent() {
        Assert.assertTrue("Go To Archive Link is not displayed", goToArchiveLinkIsDisplayed());
    }

    @Step
    public boolean downloadFileLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileLink);
    }

    @Step
    public void checkIsDownloadFileLinkPresent() {
        Assert.assertTrue("Download File Link is not displayed", downloadFileLinkIsDisplayed());
    }

    @Step
    public boolean createInspLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createInspLink);
    }

    @Step
    public void checkIsCreateInspLinkPresent() {
        Assert.assertTrue("Create Insp Link is not displayed", createInspLinkIsDisplayed());
    }

    @Step
    public boolean allInspDateLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInspDateLink);
    }

    @Step
    public void checkIsAllInspDateLinkPresent() {
        Assert.assertTrue("All Insp Date Link is not displayed", allInspDateLinkIsDisplayed());
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
    public void enterSGNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(searchSGField, sgName);
    }

    @Step
    public boolean searchSGResultIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchListElements);
    }

    @Step
    public void checkIsSearchSGResultPresent() {
        Assert.assertTrue("Search SG Result is not displayed", searchSGResultIsDisplayed());
    }

    @Step
    public boolean menuInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(menuInspBtn);
    }

    @Step
    public void checkIsMenuInspBtnPresent() {
        Assert.assertTrue("Menu Insp Btn is not displayed", menuInspBtnIsDisplayed());
    }

    @Step
    public boolean viewInspCardBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(viewInspCardBtn);
    }

    @Step
    public void checkIsViewInspCardBtnPresent() {
        Assert.assertTrue("ViewInspCardBtn is not displayed", viewInspCardBtnIsDisplayed());
    }

    @Step
    public void clickOnViewInspCardBtn() {
        actionsWithOurElements.clickOnElement(viewInspCardBtn);
    }

    @Step
    public void clickOnMenuInspBtn() {
        actionsWithOurElements.clickOnElement(menuInspBtn);
    }

    @Step
    public void clickOnCreateInspLink() {
        actionsWithOurElements.clickOnElement(createInspLink);
    }

    @Step
    public void clickOnUpdateInspBtn() {
        actionsWithOurElements.clickOnElement(updateInspBtn);
    }

    @Step
    public boolean updateInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateInspBtn);
    }

    @Step
    public void checkIsUpdateInspBtnPresent() {
        Assert.assertTrue("Update Insp Btn is not displayed", updateInspBtnIsDisplayed());
    }

    @Step
    public boolean downloadInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadInspBtn);
    }

    @Step
    public void checkIsDownloadInspBtnPresent() {
        Assert.assertTrue("Download Insp Btn is not displayed", downloadInspBtnIsDisplayed());
    }

    @Step
    public boolean goToArchiveInspBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToArchiveInspBtn);
    }

    @Step
    public void checkIsGoToArchiveInspBtnPresent() {
        Assert.assertTrue("Go To Archive Insp Btn is not displayed", goToArchiveInspBtnIsDisplayed());
    }

}
