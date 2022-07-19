package pages.resultsInspZaZvernenniamPage;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ResultsInspZaZvernenniam2020Page extends ParentPage {

    public ResultsInspZaZvernenniam2020Page (WebDriver webDriver) {
        super(webDriver, "/index?planning_period_id=4");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='7%' and contains(text(),'Посилання на перевірку')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/inspection-complaint/index?planning_period_id=1' and contains(text(),'За 2018 рік')]")
    private WebElement za2018YearLink;

    @FindBy(xpath = ".//a[@href='/inspection-complaint/index?planning_period_id=2' and contains(text(),'За 2019 рік')]")
    private WebElement za2019YearLink;

    @FindBy(xpath = ".//a[@href='/inspection-complaint/index?planning_period_id=4' and contains(text(),'За 2020 рік')]")
    private WebElement za2020YearLink;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean u2018YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2018YearLink);
    }

    @Step
    public boolean u2019YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2019YearLink);
    }

    @Step
    public boolean u2020YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2020YearLink);
    }

    @Step
    public void clickOnU2018YearLink() {
        actionsWithOurElements.clickOnElement(za2018YearLink);
    }

    @Step
    public void clickOnU2019YearLink() {
        actionsWithOurElements.clickOnElement(za2019YearLink);
    }

    @Step
    public void clickOnU2020YearLink() {
        actionsWithOurElements.clickOnElement(za2020YearLink);
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
        Assert.assertEquals(webDriver.getTitle(), "Результати перевірок за зверненнями фізичних та юридичних осіб");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/index?planning_period_id=4");
    }

}
