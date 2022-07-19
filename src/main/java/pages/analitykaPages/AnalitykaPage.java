package pages.analitykaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AnalitykaPage extends ParentPage {

    private String url = "https://admin-inspections.test.nais.gov.ua/site/login";

    public AnalitykaPage (WebDriver webDriver) {
        super(webDriver, "/site/login");
    }

    @FindBy(xpath = ".//*[contains(text(),'Аналітичний модуль')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//h2[contains(text(),'KPI')]")
    private WebElement tabTitle;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[3]/div[1]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_ТипПеревірки_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[3]/div[2]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_НаявністьПорушень_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[3]/div[3]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_НаявністьСанкцій_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[3]/div[4]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_СтупіньРизику_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[3]/div[5]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_СтанПеревірки_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[4]/div[1]/div[2]/div/div/div/div/article/div[1]/div/div/div")
    private WebElement block_Вимір_;

    @FindBy(xpath = ".//*[@id='page-wrap']/div/div/div/div[4]/div[2]/div[2]/div/div/div/div/article/div[1]/div/div")
    private WebElement block_Період_;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean tabTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(tabTitle);
    }

    @Step
    public void checkIsTabTitlePresent() {
        Assert.assertTrue("Tab Title is not displayed", tabTitleIsDisplayed());
    }

    @Step
    public boolean block_ТипПеревірки_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_ТипПеревірки_);
    }

    @Step
    public void checkIsBlock_ТипПеревірки_Present()  {
        Assert.assertTrue("Block_ТипПеревірки_is not displayed", block_ТипПеревірки_isDisplayed());
    }

    @Step
    public boolean block_НаявністьПорушень_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_НаявністьПорушень_);
    }

    @Step
    public void checkIsBlock_НаявністьПорушень_Present() {
        Assert.assertTrue("Block_НаявністьПорушень_is not displayed", block_НаявністьПорушень_isDisplayed());
    }

    @Step
    public boolean block_НаявністьСанкцій_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_НаявністьСанкцій_);
    }

    @Step
    public void checkIsBlock_НаявністьСанкцій_Present() {
        Assert.assertTrue("Block_НаявністьСанкцій_is not displayed", block_НаявністьСанкцій_isDisplayed());
    }

    @Step
    public boolean block_СтупіньРизику_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_СтупіньРизику_);
    }

    @Step
    public void checkIsBlock_СтупіньРизику_Present() {
       Assert.assertTrue("Block_СтупіньРизику_is not displayed", block_СтупіньРизику_isDisplayed());
    }

    @Step
    public boolean block_СтанПеревірки_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_СтанПеревірки_);
    }

    @Step
    public void checkIsBlock_СтанПеревірки_Present() {
        Assert.assertTrue("Block_СтанПеревірки_is not displayed", block_СтанПеревірки_isDisplayed());
    }

    @Step
    public boolean block_Вимір_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_Вимір_);
    }

    @Step
    public void checkIsBlock_Вимір_Present() {
       Assert.assertTrue("Block_Вимір_is not displayed", block_Вимір_isDisplayed());
    }

    @Step
    public boolean block_Період_isDisplayed() {
        return actionsWithOurElements.isElementDisplayed(block_Період_);
    }

    @Step
    public void checkIsBlock_Період_Present() {
       Assert.assertTrue("Block_Період_is not displayed", block_Період_isDisplayed());
    }

    @Step
    public void pause() throws InterruptedException {
        actionsWithOurElements.pause();
    }

    @Step
    public void openPage() {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

}
