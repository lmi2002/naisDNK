package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ReportPlanPerevirkyAll2017Page extends ParentPage {

    public ReportPlanPerevirkyAll2017Page(WebDriver webDriver) {
        super(webDriver, "/report/planned?regulator_id=61&planning_period_id=3");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Звіт про виконання річного плану (Держпраці)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

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

   }
