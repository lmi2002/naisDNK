package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PozaplanInsp2019Page extends ParentPage {

    public PozaplanInsp2019Page(WebDriver webDriver) {
        super(webDriver, "/inspection/unplanned?regulatorId=61&planningPeriodId=2&tab=simple");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='9%' and contains(text(),'Підстава перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@name='submitForm']")
    private WebElement downloadBtn;

    @FindBy(xpath = ".//section[1]/div/div[1]/div[2]/div/a[1]")
    private WebElement createInspBtn;

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
        Assert.assertEquals(webDriver.getTitle(), "Позапланові перевірки");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/inspection/unplanned?regulatorId=568&planningPeriodId=2&tab=simple");
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
    public boolean downloadBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadBtn);
    }

    @Step
    public void checkIsDownloadBtnPresent() {
        Assert.assertTrue("Download Btn is not displayed", downloadBtnIsDisplayed());
    }

    @Step
    public boolean isCreateInspBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createInspBtn);
    }

    @Step
    public void checkIsCreateInspBtnPresent() {
        Assert.assertTrue("Create Insp Btn is not displayed", isCreateInspBtnDisplayed());
    }

}
