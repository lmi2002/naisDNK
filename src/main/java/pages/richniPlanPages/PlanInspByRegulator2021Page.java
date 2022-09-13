package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanInspByRegulator2021Page extends ParentPage {

    public PlanInspByRegulator2021Page(WebDriver webDriver) {
        super(webDriver, "/plan/annual?regulatorId=39&planningPeriodId=6");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='20%' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2018 рік')]")
    private WebElement planInspListLink2018;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2019 рік')]")
    private WebElement planInspListLink2019;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'За 2021 рік')]")
    private WebElement planInspListLink2021;

    @Step
    public boolean planInspListLink2018IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planInspListLink2018);
    }

    @Step
    public void checkIsPlanInspListLink2018Present() {
        Assert.assertTrue("Plan Insp List Link 2018 is not displayed", planInspListLink2018IsDisplayed());
    }

    @Step
    public boolean planInspListLink2019IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planInspListLink2019);
    }

    @Step
    public void checkIsPlanInspListLink2019Present() {
        Assert.assertTrue("Plan Insp List Link 2019 is not displayed", planInspListLink2019IsDisplayed());
    }

    @Step
    public boolean planInspListLink2021IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planInspListLink2021);
    }

    @Step
    public void checkIsPlanInspListLink2021Present() {
        Assert.assertTrue("Plan Insp List Link 2021 is not displayed", planInspListLink2021IsDisplayed());
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
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan/annual?regulatorId=39&planningPeriodId=6");
    }

}
