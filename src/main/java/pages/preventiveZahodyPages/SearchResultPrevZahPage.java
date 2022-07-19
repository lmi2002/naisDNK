package pages.preventiveZahodyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultPrevZahPage extends ParentPage {

    public SearchResultPrevZahPage(WebDriver webDriver) {
        super(webDriver, "/preventive-measure/index?PreventiveMeasureSearch%5BsubjectNames%5D=&PreventiveMeasureSearch%5BsubjectCodes%5D=41558674&PreventiveMeasureSearch%5BactivityTypeNames%5D=&PreventiveMeasureSearch%5Bmeasure_time%5D=&PreventiveMeasureSearch%5Bis_finished%5D=&PreventiveMeasureSearch%5Btype%5D=&PreventiveMeasureSearch%5Bsphere_id%5D=&PreventiveMeasureSearch%5Bregulator_id%5D=&planning_period_id=4&tab=main");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='12%' and contains(text(),'Сфери')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement searchResult;

    @FindBy(xpath = ".//span[@class='icon-download']")
    private WebElement downloadFileBtn;

    @FindBy(xpath = ".//a[@href='/preventive-measure/create?planning_period_id=4']")
    private WebElement createPrevZahBtn;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?tab=archived&planning_period_id=7']")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=1&tab=main']")
    private WebElement za2018Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=2&tab=main']")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=4&tab=main']")
    private WebElement za2020Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=4&tab=main']")
    private WebElement za2022Link;

    @FindBy(xpath = ".//a[@data-original-title='Переглянути']")
    private WebElement viewPrevZahCardBtn;

    @FindBy(xpath = ".//a[@data-original-title='Оновити']")
    private WebElement updatePrevZahBtn;

    @FindBy(xpath = ".//a[@data-original-title='Перенести в архів']")
    private WebElement sendPrevZahToArchiveBtn;


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
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/preventive-measure/index?PreventiveMeasureSearch%5BsubjectNames%5D=&PreventiveMeasureSearch%5BsubjectCodes%5D=19393752&PreventiveMeasureSearch%5BactivityTypeNames%5D=&PreventiveMeasureSearch%5Bmeasure_time%5D=&PreventiveMeasureSearch%5Bis_finished%5D=&PreventiveMeasureSearch%5Btype%5D=&PreventiveMeasureSearch%5Bsphere_id%5D=&PreventiveMeasureSearch%5Bregulator_id%5D=&planning_period_id=7&tab=main");
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
    public boolean searchResultIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResult);
    }

    @Step
    public void checkIsSearchResultPresent() {
        Assert.assertTrue("Search Result is not displayed", searchResultIsDisplayed());
    }

    @Step
    public boolean downloadFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileBtn);
    }

    @Step
    public void checkIsDownloadFileBtnPresent() {
        Assert.assertTrue("DownloadFileBtn is not displayed", downloadFileBtnIsDisplayed());
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
    public boolean viewPrevZahCardBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(viewPrevZahCardBtn);
    }

    @Step
    public void checkIsViewPrevZahCardBtnPresent() {
        Assert.assertTrue("View Prev Zah Card Btn is not displayed", viewPrevZahCardBtnIsDisplayed());
    }

    @Step
    public boolean updatePrevZahBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updatePrevZahBtn);
    }

    @Step
    public void checkIsUpdatePrevZahBtnPresent() {
        Assert.assertTrue("Update Prev Zah Btn is not displayed", updatePrevZahBtnIsDisplayed());
    }

    @Step
    public boolean sendPrevZahToArchiveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sendPrevZahToArchiveBtn);
    }

    @Step
    public void checkIsSendPrevZahToArchiveBtnPresent() {
        Assert.assertTrue("Send Prev Zah To Archive Btn is not displayed", sendPrevZahToArchiveBtnIsDisplayed());
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
        return actionsWithOurElements.isElementDisplayed(za2022Link);
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
    public void clickOnSendPrevZahToArchiveBtn() {
        actionsWithOurElements.clickOnElement(sendPrevZahToArchiveBtn);
    }

}
