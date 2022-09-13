package pages.audytPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AudytPage extends ParentPage {

    public AudytPage (WebDriver webDriver) {
        super(webDriver, "/audit/audit");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'На')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='btn btn-primary' and contains(text(),'Створити аудит')]")
    private WebElement addAudytBtn;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Архів')]")
    private WebElement archiveLink;

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
        Assert.assertEquals(webDriver.getTitle(), "Аудит");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/audit/audit");
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
    public boolean addAudytBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addAudytBtn);
    }

    @Step
    public void checkIsAddAudytBtnPresent() {
        Assert.assertTrue("Add Organization Btn is not displayed", addAudytBtnIsDisplayed());
    }

    @Step
    public void clickOnAudytBtn() {
        actionsWithOurElements.clickOnElement(addAudytBtn);
    }

    @Step
    public boolean archiveLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(archiveLink);
    }

    @Step
    public void checkIsArchiveLinkIsDisplayedPresent() {
        Assert.assertTrue("Archive Link is not displayed", archiveLinkIsDisplayed());

    }
}