package pages.complexPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ComplexPlanningPeriod2021Page extends ParentPage {

    public ComplexPlanningPeriod2021Page(WebDriver webDriver) {
        super(webDriver, "\n");
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
        Assert.assertEquals(webDriver.getTitle(), "План здійснення комплексних заходів державного нагляду (контролю) органів державного нагляду (контролю) на 2021 рік");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/plan/complex?planningPeriodId=6");
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
