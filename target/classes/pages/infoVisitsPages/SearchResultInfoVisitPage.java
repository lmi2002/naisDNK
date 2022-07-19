package pages.infoVisitsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultInfoVisitPage extends ParentPage {

    public SearchResultInfoVisitPage(WebDriver webDriver) {
        super(webDriver, "/inspection-info-visit/index?InspectionInfoVisitSearch%5Bname%5D=&InspectionInfoVisitSearch%5Bcode%5D=24949128&InspectionInfoVisitSearch%5Bbrand_name%5D=&InspectionInfoVisitSearch%5Blocation%5D=&InspectionInfoVisitSearch%5Bsls_activity_type_id%5D=&InspectionInfoVisitSearch%5Bdate%5D=&InspectionInfoVisitSearch%5Bstatus%5D=&InspectionInfoVisitSearch%5Bsphere_id%5D=&InspectionInfoVisitSearch%5Bregulator_id%5D=");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='8%' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement searchResult;

    @FindBy(xpath = ".//a[@class='btn btn-primary' and contains(text(),'Створити інформаційне відвідування')]")
    private WebElement createInfoVisitBtn;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Архів')]")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=1']")
    private WebElement za2018Link;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=2']")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/index?planning_period_id=4']")
    private WebElement za2020Link;

    @FindBy(xpath = ".//a[@data-original-title='Переглянути']")
    private WebElement viewInfoVisitCardBtn;

    @FindBy(xpath = ".//a[@data-original-title='Оновити']")
    private WebElement updateInfoVisitBtn;

    @FindBy(xpath = ".//span[@data-original-title='Перенести в архів']")
    private WebElement sendInfoVisitToArchiveBtn;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection-info-visit/index?InspectionInfoVisitSearch%5Bname%5D=&InspectionInfoVisitSearch%5Bcode%5D=19393752&InspectionInfoVisitSearch%5Bbrand_name%5D=&InspectionInfoVisitSearch%5Blocation%5D=&InspectionInfoVisitSearch%5Bsls_activity_type_id%5D=&InspectionInfoVisitSearch%5Bdate%5D=&InspectionInfoVisitSearch%5Bstatus%5D=&InspectionInfoVisitSearch%5Bsphere_id%5D=&InspectionInfoVisitSearch%5Bregulator_id%5D=&planning_period_id=7");
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
    public boolean searchResultIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchResult);
    }

    @Step
    public void checkIsSearchResultPresent() {
        Assert.assertTrue("Search Result is not displayed", searchResultIsDisplayed());
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
    public boolean createInfoVisitBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createInfoVisitBtn);
    }

    @Step
    public void checkIsCreateInfoVisitBtnPresent() {
        Assert.assertTrue("CreateInfoVisitBtn is not displayed", createInfoVisitBtnIsDisplayed());
    }

    @Step
    public void clickOnCreateInfoVisitBtn() {
        actionsWithOurElements.clickOnElement(createInfoVisitBtn);
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
    public boolean viewInfoVisitCardBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(viewInfoVisitCardBtn);
    }

    @Step
    public void checkIsViewInfoVisitCardBtnPresent() {
        Assert.assertTrue("View Info Visit Card Btn is not displayed", viewInfoVisitCardBtnIsDisplayed());
    }

    @Step
    public boolean updateInfoVisitBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateInfoVisitBtn);
    }

    @Step
    public void checkIsUpdateInfoVisitBtnPresent() {
        Assert.assertTrue("Update Info Visit Btn is not displayed", updateInfoVisitBtnIsDisplayed());
    }

    @Step
    public boolean sendInfoVisitToArchiveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sendInfoVisitToArchiveBtn);
    }

    @Step
    public void checkIsSendInfoVisitToArchiveBtnPresent() {
        Assert.assertTrue("Send Info Visit To Archive Btn is not displayed", sendInfoVisitToArchiveBtnIsDisplayed());
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
    public void clickOnArchiveLink() {
        actionsWithOurElements.clickOnElement(archiveLink);
    }

    @Step
    public void clickOnViewInfoVisitCardBtn() {
        actionsWithOurElements.clickOnElement(viewInfoVisitCardBtn);
    }

    @Step
    public void clickOnUpdateInfoVisitBtn() {
        actionsWithOurElements.clickOnElement(updateInfoVisitBtn);
    }

    @Step
    public void clickOnSendInfoVisitToArchiveBtn() {
        actionsWithOurElements.clickOnElement(sendInfoVisitToArchiveBtn);
    }

}
