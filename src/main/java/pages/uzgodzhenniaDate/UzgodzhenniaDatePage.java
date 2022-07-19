package pages.uzgodzhenniaDate;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UzgodzhenniaDatePage extends ParentPage {

    public UzgodzhenniaDatePage(WebDriver webDriver) {
        super(webDriver, "/date-proposal/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='regulator_id' and contains(text(),'Іні')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//h3[@class='inspection_title' and contains(text(),'Перелік пропозицій на зміну дати перевірки')]")
    private WebElement pageInspTitle;


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
        try {
            Assert.assertEquals(webDriver.getTitle(), "Перелік запитів на узгодження дат");
            logger.info(" Page title is correct");
        } catch (Exception e) {
            actionsWithOurElements.stopTestAndPrintMessage();
        }
    }

    @Step
    public void checkIsPageURLPresent() {
        try {
            Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/date-proposal/index");
            logger.info(" Page URL is correct");
        } catch (Exception e) {
            actionsWithOurElements.stopTestAndPrintMessage();
        }
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

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean checkIsPageInspTitle_Present(String title) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(pageInspTitle), title);
    }
}
