package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanInspByRegulator2018Page extends ParentPage {

    public PlanInspByRegulator2018Page(WebDriver webDriver) {
        super(webDriver, "/plan/annual?regulatorId=39&planningPeriodId=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='20%' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//*[@id='w0']/table/tbody/tr[1]/td[8]/a[1]")
    private WebElement viewCartBtn;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan/annual?regulatorId=39&planningPeriodId=1");
    }


    @Step
    public void clickOnViewCartBtn() {
        actionsWithOurElements.clickOnElement(viewCartBtn);
    }
}
