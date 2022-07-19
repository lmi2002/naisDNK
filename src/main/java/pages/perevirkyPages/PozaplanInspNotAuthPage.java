package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PozaplanInspNotAuthPage extends ParentPage {

    public PozaplanInspNotAuthPage (WebDriver webDriver) {
        super(webDriver, "/inspection/all-unplanned");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Підстава перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2018 рік')]")
    private WebElement item2018;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2019 рік')]")
    private WebElement item2019;

    @FindBy(xpath = ".//tr[1]/td[10]/a[@data-original-title='Переглянути картку']")
    private WebElement viewInspCardBtn;

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
        Assert.assertEquals(webDriver.getTitle(), "Результати позапланових перевірок");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection/all-unplanned");
    }

    @Step
    public void checkIsPagePROD_URLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.gov.ua/inspection/all-unplanned");
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
    public void clickOn2018YearItem() {
        actionsWithOurElements.clickOnElement(item2018);
    }

    @Step
    public void clickOn2019YearItem() {
        actionsWithOurElements.clickOnElement(item2019);
    }

    @Step
    public boolean viewInspCardBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(viewInspCardBtn);
    }

    @Step
    public void checkIsViewInspCardBtnIsPresent() {
        Assert.assertTrue("View Insp Card Btn Is is not displayed", viewInspCardBtnIsDisplayed());
    }

    @Step
    public void clickOnViewInspCardBtn() {
        actionsWithOurElements.clickOnElement(viewInspCardBtn);
    }

}
