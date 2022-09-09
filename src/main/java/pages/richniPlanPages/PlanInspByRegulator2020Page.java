package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanInspByRegulator2020Page extends ParentPage {

    public PlanInspByRegulator2020Page(WebDriver webDriver) {
        super(webDriver, "/plan/annual?planningPeriodId=4&regulatorId=39");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='20%' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2018 рік')]")
    private WebElement planInspListLink2018;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2019 рік')]")
    private WebElement planInspListLink2019;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2021 рік')]")
    private WebElement planInspListLink2021;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public boolean isGridListElementsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", isGridListElementsDisplayed());
    }

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
        Assert.assertEquals(webDriver.getTitle(), "Планові перевірки (Державна служба України з питань праці)");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan/annual?planningPeriodId=4&regulatorId=39");
    }

    @Step
    public void clickOnPlanInspListLink2018() {
        actionsWithOurElements.clickOnElement(planInspListLink2018);
    }

    @Step
    public void clickOnPlanInspListLink2019() {
        actionsWithOurElements.clickOnElement(planInspListLink2019);
    }

    @Step
    public void clickOnPlanInspListLink2021() {
        actionsWithOurElements.clickOnElement(planInspListLink2021);
    }
}
