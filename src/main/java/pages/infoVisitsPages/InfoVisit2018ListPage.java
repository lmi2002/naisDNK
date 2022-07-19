package pages.infoVisitsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InfoVisit2018ListPage extends ParentPage {


    public InfoVisit2018ListPage(WebDriver webDriver) {
        super(webDriver, "/inspection-info-visit/index?planning_period_id=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='8%' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span[@class='icon-download']")
    private WebElement downloadFileBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary' and contains(text(),'Створити інформаційне відвідування')]")
    private WebElement createInfoVisitBtn;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=4&archive=1']")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=1']")
    private WebElement za2018Link;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=2']")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=4']")
    private WebElement za2020Link;


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
        Assert.assertEquals(webDriver.getTitle(), "Інформаційні відвідування");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection-info-visit/index?planning_period_id=1");
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
    public void checkIsLink2020Present() {
        Assert.assertTrue("Link 2020 is not displayed", link2020IsDisplayed());
    }

    @Step
    public boolean createInfoVisitBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createInfoVisitBtn);
    }

    @Step
    public void checkIsCreateInfoVisitBtnPresent() {
        Assert.assertTrue("CreateInfoVisitBtn is not displayed", createInfoVisitBtnIsDisplayed());
    }

}
