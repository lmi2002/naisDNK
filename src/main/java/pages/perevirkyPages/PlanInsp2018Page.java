package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanInsp2018Page extends ParentPage {

    public PlanInsp2018Page(WebDriver webDriver) {
        super(webDriver, "/inspection/planned?planningPeriodId=1&tab=simple");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='8%' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@value='load_planned_inspection']")
    private WebElement downloadBtn;

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
        Assert.assertEquals(webDriver.getTitle(), "План Відділ з питань державного архітектурно-будівельного контролю виконавчого комітету Криворізької міської ради");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/inspection/planned?planningPeriodId=1&tab=simple");
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

}
