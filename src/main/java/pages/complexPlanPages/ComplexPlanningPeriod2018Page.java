package pages.complexPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ComplexPlanningPeriod2018Page extends ParentPage {

    public ComplexPlanningPeriod2018Page(WebDriver webDriver) {
        super(webDriver, "/plan/complex?planningPeriodId=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement gridBlock;

    @FindBy(xpath = ".//a[@data-sort='name']")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

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
        Assert.assertEquals(webDriver.getTitle(), "План здійснення комплексних заходів державного нагляду (контролю) органів державного нагляду (контролю) на 2018 рік");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/plan/complex?planningPeriodId=1");
    }

    @Step
    public boolean checkThatGridBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridBlock);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean isGridListNumberElementDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }
}
