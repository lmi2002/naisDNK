package pages.preventiveZahodyPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PreventiveZahodyNotAuthPage extends ParentPage {

    public PreventiveZahodyNotAuthPage (WebDriver webDriver) {
        super(webDriver, "/preventive-measure/all");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати превентивних заходів')]")
    private WebElement pageTitleNotAuth;

    @FindBy(xpath = ".//th[@width='12%' and contains(text(),'Сфери')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span[@class='icon-download']")
    private WebElement downloadFileBtn;

    @FindBy(xpath = ".//a[@href='/preventive-measure/create?planning_period_id=4']")
    private WebElement createPrevZahBtn;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?tab=archived&planning_period_id=4']")
    private WebElement archiveLink;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=1&tab=main']")
    private WebElement za2018Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=2&tab=main']")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/preventive-measure/index?planning_period_id=4&tab=main']")
    private WebElement za2020Link;

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
    public boolean downloadFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadFileBtn);
    }

    @Step
    public boolean archiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveLink);
    }

    @Step
    public boolean link2018IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2018Link);
    }

    @Step
    public boolean link2019IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2019Link);
    }

    @Step
    public boolean link2020IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2020Link);
    }

    @Step
    public boolean createPrevZahBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createPrevZahBtn);
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



