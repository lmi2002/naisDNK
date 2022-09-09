package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ReportPlanPerevirkyAll2019Page extends ParentPage {

    public ReportPlanPerevirkyAll2019Page(WebDriver webDriver) {
        super(webDriver, "/report/planned?regulator_id=34&planning_period_id=2");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Звіт про виконання річного плану (Держпраці)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
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

    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Річні звіти контролюючих органів");
    }

    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(),configProperties.base_url() + "/report/index?planning_period_id=6");
    }

    public void checkIsPageURLProdPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://inspections.gov.ua/report/index?planning_period_id=4");
    }
}
