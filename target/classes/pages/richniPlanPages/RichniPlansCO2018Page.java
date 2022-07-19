package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichniPlansCO2018Page extends ParentPage {

    public RichniPlansCO2018Page(WebDriver webDriver) {
        super(webDriver, "/regulators-plans/index?tab=tab_central_regulators_plans_2018");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w2-container' and contains(text(),'За 2018 рік')]")
    private WebElement year2018Field;

    @FindBy(xpath = ".//span[@class='select2-selection__rendered' and contains(text(),'Центральні органи')]")
    private WebElement organTypeField;

    @FindBy(xpath = ".//a[@data-sort='is_approved' and contains(text(),'Формування проекту річного плану')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement year2020Item;

    @Step
    public void clickOnYear2018Field() {
        actionsWithOurElements.clickOnElement(year2018Field);
    }

    @Step
    public void clickOnYear2020Item() {
        actionsWithOurElements.clickOnElement(year2020Item);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsOrganNamePresent() {
        Assert.assertTrue("Regulator's name is not displayed", webDriver.getPageSource().contains("Державна архівна служба України"));
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
        Assert.assertEquals(webDriver.getTitle(), "Річні плани");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/regulators-plans/index?tab=tab_central_regulators_plans_2018");
    }

    @Step
    public boolean isOrganTypeItemDisplayed() {
        return actionsWithOurElements.isElementDisplayed(organTypeField);
    }

    @Step
    public void checkIsOrganTypeItemPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isOrganTypeItemDisplayed());
    }

    @Step
    public boolean isYear2018ItemDisplayed() {
        return actionsWithOurElements.isElementDisplayed(year2018Field);
    }

    @Step
    public void checkIsYear2018ItemPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isYear2018ItemDisplayed());
    }

}
