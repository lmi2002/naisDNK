package pages.audytPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AccreditedOrganizationsPage extends ParentPage {

    public AccreditedOrganizationsPage (WebDriver webDriver) {
        super(webDriver, "/audit/accredited-organizations");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@href='/audit/accredited-organizations/index?sort=name' and contains(text(),'На')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/audit/accredited-organizations/create' and contains(text(),'Додати організацію')]")
    private WebElement addOrganizationBtn;

    @FindBy(xpath = ".//*[@id='accredited-organization-contract-gridview']/table/tbody/tr[2]/td[6]/a[2]")
    private WebElement deleteAccreditedOrgIcon;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmDeleteActionModalBtn;




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
        Assert.assertEquals(webDriver.getTitle(), "Організації, уповноважені здійснювати аудит");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/audit/accredited-organizations");
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
    public boolean gridListElementsAreDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkAreGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements are not displayed", gridListElementsAreDisplayed());
    }

        @Step
    public boolean addOrganizationBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addOrganizationBtn);
    }

    @Step
    public void checkIsAddOrganizationBtnPresent() {
        Assert.assertTrue("AddOrganizationBtn is not displayed", addOrganizationBtnIsDisplayed());
    }

    @Step
    public void clickOnAddOrganizationBtn() {
        actionsWithOurElements.clickOnElement(addOrganizationBtn);
    }

}
