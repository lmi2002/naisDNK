package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ZvitProPorushenniaVymogKO2021Page extends ParentPage {

    public ZvitProPorushenniaVymogKO2021Page (WebDriver webDriver) {
        super(webDriver, "/report/violation-of-requirements?year=2021&regulator_id=103&sphere_id=130");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//*[@id='select2-regulator-container']")
    private WebElement koField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[1]/div/div[2]/div/span/span[1]/span")
    private WebElement planPeriodField;

    @FindBy(xpath = ".//*[@id='select2-sphere-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//div[@class='inspector-table-wrap']")
    private WebElement gridBody;

    @FindBy(xpath = ".//span[@class='select2-results']//li[contains(text(),'За 2018 рік')]")
    private WebElement za2018Item;

    @FindBy(xpath = ".//span[@class='select2-results']//li[contains(text(),'За 2019 рік')]")
    private WebElement za2019Item;

    @FindBy(xpath = ".//span[@class='select2-results']//li[contains(text(),'За 2020 рік')]")
    private WebElement za2020Item;

    @FindBy(xpath = ".//span[@class='select2-results']//li[contains(text(),'За 2021 рік')]")
    private WebElement za2021Item;


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
        Assert.assertEquals(webDriver.getTitle(), "Звіт про порушення вимог");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/report/violation-of-requirements?year=2021&regulator_id=205&sphere_id=93");
    }

    @Step
    public boolean koFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(koField);
    }

    @Step
    public void checkIsKOFieldPresent() {
        Assert.assertTrue("KO Field is not displayed", koFieldIsDisplayed());
    }

    @Step
    public boolean planPeriodFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planPeriodField);
    }

    @Step
    public void checkIsPlanPeriodFieldPresent() {
        Assert.assertTrue("Plan Period Field is not displayed", planPeriodFieldIsDisplayed());
    }

    @Step
    public boolean gridBodyIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridBody);
    }

    @Step
    public void checkIsGridBodyPresent() {
        Assert.assertTrue("Grid Body is not displayed", gridBodyIsDisplayed());
    }

    @Step
    public boolean sphereFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereField);
    }

    @Step
    public void checkIsSphereFieldPresent() {
        Assert.assertTrue("Sphere Field is not displayed", sphereFieldIsDisplayed());
    }

    @Step
    public void clickOnZa2018Item() {
        actionsWithOurElements.clickOnElement(za2018Item);
    }

    @Step
    public void clickOnZa2019Item() {
        actionsWithOurElements.clickOnElement(za2019Item);
    }

    @Step
    public void clickOnZa2020Item() {
        actionsWithOurElements.clickOnElement(za2020Item);
    }

    @Step
    public void clickOnZa2021Item() {
        actionsWithOurElements.clickOnElement(za2021Item);
    }

    @Step
    public void clickOnPlanPeriodField() {
        actionsWithOurElements.clickOnElement(planPeriodField);
    }

}
