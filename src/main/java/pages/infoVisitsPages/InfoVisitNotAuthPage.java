package pages.infoVisitsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InfoVisitNotAuthPage extends ParentPage {

    public InfoVisitNotAuthPage(WebDriver webDriver) {
        super(webDriver, "/inspection-info-visit/all");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='8%' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2018 рік')]")
    private WebElement za2018Link;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2019 рік')]")
    private WebElement za2019Link;

    @FindBy(xpath = ".//*[@href='/inspection-info-visit/all?planning_period_id=4' and contains(text(),'За 2020 рік')]")
    private WebElement za2020Link;

    @FindBy(xpath = ".//a[@data-original-title='Переглянути']")
    private WebElement viewInfoVisitCardBtn;

    @FindBy(xpath = ".//a[@data-original-title='Перенести в архів']")
    private WebElement sendInfoVisitToArchiveBtn;

    @FindBy(xpath = ".//input[@name='InspectionInfoVisitSearch[name]']")
    private WebElement searchSGByNameField;

    @FindBy(xpath = ".//input[@name='InspectionInfoVisitSearch[code]']")
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
        Assert.assertEquals(webDriver.getTitle(), "Результати інформаційних відвідувань");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/inspection-info-visit/all");
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
    public void clickOn2018Link() {
        actionsWithOurElements.clickOnElement(za2018Link);
    }

    @Step
    public void clickOn2019Link() {
        actionsWithOurElements.clickOnElement(za2019Link);
    }

    @Step
    public void clickOnViewInfoVisitCardBtn() {
        actionsWithOurElements.clickOnElement(viewInfoVisitCardBtn);
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



