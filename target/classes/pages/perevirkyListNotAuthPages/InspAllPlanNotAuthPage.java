package pages.perevirkyListNotAuthPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspAllPlanNotAuthPage extends ParentPage {

    public InspAllPlanNotAuthPage (WebDriver webDriver) {
        super(webDriver, "/inspection/all-planned");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати планових перевірок')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/inspection/all-planned?planning_period_id=8']")
    private WebElement link2016;

    @FindBy(xpath = ".//a[@href='/inspection/all-planned?planning_period_id=3']")
    private WebElement link2017;

    @FindBy(xpath = ".//a[@href='/inspection/all-planned?planning_period_id=1']")
    private WebElement link2018;

    @FindBy(xpath = ".//a[@href='/inspection/all-planned?planning_period_id=2']")
    private WebElement link2019;

    @FindBy(xpath = ".//a[@href='/inspection/view?id=1394084']")
    private WebElement viewInspCard;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
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
    public void clickOnViewInspCard() {
        actionsWithOurElements.clickOnElement(viewInspCard);
    }

    @Step
    public void clickOnLink2016() {
        actionsWithOurElements.clickOnElement(link2016);
    }

    @Step
    public void clickOnLink2017() {
        actionsWithOurElements.clickOnElement(link2017);
    }

    @Step
    public void clickOnLink2018() {
        actionsWithOurElements.clickOnElement(link2018);
    }

    @Step
    public void clickOnLink2019() {
        actionsWithOurElements.clickOnElement(link2019);
    }

}
