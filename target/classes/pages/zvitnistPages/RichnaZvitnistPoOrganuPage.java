package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichnaZvitnistPoOrganuPage extends ParentPage {

    public RichnaZvitnistPoOrganuPage(WebDriver webDriver) {

        super(webDriver, "/report/by-sphere");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Рік')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//*[@class='table_action_btn icon-download' and @href='/report/export?year=2019']")
    private WebElement download2019Icon;

    @FindBy(xpath = ".//*[@class='table_action_btn icon-download' and @href='/report/export?year=2020']")
    private WebElement download2020Icon;

    @FindBy(xpath = ".//*[@class='table_action_btn icon-pencil' and @href='/report/edit?year=2019']")
    private WebElement edit2019Icon;

    @FindBy(xpath = ".//*[@class='table_action_btn icon-pencil' and @href='/report/edit?year=2020']")
    private WebElement edit2020Icon;

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
        Assert.assertEquals(webDriver.getTitle(), "Інформація про результати контрольно-наглядової діяльності");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/report/by-sphere");
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
    public boolean download2019IconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(download2019Icon);
    }

    @Step
    public void checkIsDownload2019IconPresent() {
        Assert.assertTrue("Download 2019 Icon is not displayed", download2019IconIsDisplayed());
    }

    @Step
    public boolean download2020IconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(download2020Icon);
    }

    @Step
    public void checkIsDownload2020IconPresent() {
        Assert.assertTrue("Download 2020 Icon is not displayed", download2020IconIsDisplayed());
    }

    @Step
    public boolean edit2019IconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(edit2019Icon);
    }

    @Step
    public void checkIsEdit2019IconPresent() {
        Assert.assertTrue("Edit 2019 Icon is not displayed", edit2019IconIsDisplayed());
    }

    @Step
    public boolean edit2020IconIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(edit2020Icon);
    }

    @Step
    public void checkIsEdit2020IconPresent() {
        Assert.assertTrue("Edit 2020 Icon is not displayed", edit2020IconIsDisplayed());
    }

    @Step
    public void clickOnEdit2019Icon() {
        actionsWithOurElements.clickOnElement(edit2019Icon);
    }
}