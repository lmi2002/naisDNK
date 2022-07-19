package pages.preventiveZahodyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PreventiveZahodyPage extends ParentPage {

    public PreventiveZahodyPage(WebDriver webDriver) {
        super(webDriver, "/preventive-measure/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='12%' and contains(text(),'Сфери')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span[@class='icon-download']")
    private WebElement downloadFileBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary' and contains(text(),'Створити превентивний захід')]")
    private WebElement createPrevZahBtn;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Архів')]")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=1&tab=main']")
    private WebElement za2018Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=2&tab=main']")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=4&tab=main']")
    private WebElement za2020Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=7&tab=main']")
    private WebElement za2022Link;

    @FindBy(xpath = ".//a[@data-original-title='Переглянути']")
    private WebElement viewPrevZahCardBtn;

    @FindBy(xpath = ".//a[@data-original-title='Оновити']")
    private WebElement updatePrevZahBtn;

    @FindBy(xpath = ".//a[@data-original-title='Перенести в архів']")
    private WebElement sendPrevZahToArchiveBtn;

    @FindBy(xpath = ".//input[@name='PreventiveMeasureSearch[subjectNames]']")
    private WebElement searchSGByNameField;

    @FindBy(xpath = ".//input[@name='PreventiveMeasureSearch[subjectCodes]']")
    private WebElement searchSGByCodeField;

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
        Assert.assertEquals(webDriver.getTitle(), "Превентивні заходи");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/preventive-measure/index");
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
    public boolean downloadFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileBtn);
    }

    @Step
    public void checkIsDownloadFileBtnPresent() {
        Assert.assertTrue("Download File Btn is not displayed", downloadFileBtnIsDisplayed());
    }

    @Step
    public boolean archiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveLink);
    }

    @Step
    public void checkIsArchiveLinkPresent() {
        Assert.assertTrue("Archive Link is not displayed", archiveLinkIsDisplayed());
    }

    @Step
    public boolean link2018IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2018Link);
    }

    @Step
    public void checkIsLink2018Present() {
        Assert.assertTrue("Link 2018 is not displayed", link2018IsDisplayed());
    }

    @Step
    public boolean link2019IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2019Link);
    }

    @Step
    public void checkIsLink2019Present() {
        Assert.assertTrue("Link 2019 is not displayed", link2019IsDisplayed());
    }

    @Step
    public boolean link2020IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2020Link);
    }

    @Step
    public boolean link2022IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2020Link);
    }

    @Step
    public void checkIsLink2020Present() {
        Assert.assertTrue("Link 2020 is not displayed", link2020IsDisplayed());
    }

    @Step
    public void checkIsLink2022Present() {
        Assert.assertTrue("Link 2022 is not displayed", link2022IsDisplayed());
    }

    @Step
    public boolean createPrevZahBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createPrevZahBtn);
    }

    @Step
    public void checkIsCreatePrevZahBtnPresent() {
        Assert.assertTrue("Create Prev Zah Btn is not displayed", createPrevZahBtnIsDisplayed());
    }

    @Step
    public void clickOnCreatePrevZahBtn() {
        actionsWithOurElements.clickOnElement(createPrevZahBtn);
    }

    @Step
    public void clickOn2018Link() {
        actionsWithOurElements.clickOnElement(za2018Link);
    }

    @Step
    public void clickOn2019Link() {
        actionsWithOurElements.clickOnElement(za2019Link);
    }

    @Step
    public void clickOn2020Link() {
        actionsWithOurElements.clickOnElement(za2020Link);
    }

    @Step
    public void clickOn2022Link() {
        actionsWithOurElements.clickOnElement(za2022Link);
    }

    @Step
    public void clickOnArchiveLink() {
        actionsWithOurElements.clickOnElement(archiveLink);
    }

    @Step
    public void clickOnViewPrevZahCardBtn() {
        actionsWithOurElements.clickOnElement(viewPrevZahCardBtn);
    }

    @Step
    public void clickOnUpdatePrevZahBtn() {
        actionsWithOurElements.clickOnElement(updatePrevZahBtn);
    }

    @Step
    public void enterSGNameInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(searchSGByNameField, sgName);
    }

    @Step
    public void enterSGCodeInToSearchField(String sgName) {
        actionsWithOurElements.enterTextInInput(searchSGByCodeField, sgName);
    }

}


