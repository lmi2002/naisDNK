package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ReportStatistics2018Page extends ParentPage {

    public ReportStatistics2018Page(WebDriver webDriver) {

        super(webDriver, "/regulator/statistics?planning_period_id=1");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Статистика')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'зва')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//button[@name='submitForm']")
    private WebElement downloadIcon;

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
    public boolean downloadIconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadIcon);
    }


}
