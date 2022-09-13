package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PozaplanPerevirkyPorushennia2020Page extends ParentPage {

    public PozaplanPerevirkyPorushennia2020Page(WebDriver webDriver) {
        super(webDriver, "/report/unplanned-violations?regulator_id=34&planning_period_id=4");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Позапланові перевірки (порушення)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div/div/div/div[4]/div/div/table/thead/tr/th[7]/a")
    private WebElement gridElement;

    @FindBy(xpath = ".//button[@id='report-search-btn' and contains(text(),'Шукати')]")
    private WebElement searchBtn;

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
    public boolean searchBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(searchBtn);
    }

}
