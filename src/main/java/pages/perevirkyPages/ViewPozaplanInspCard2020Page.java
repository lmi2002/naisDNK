package pages.perevirkyPages;

import io.qameta.allure.Step;
import libs.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewPozaplanInspCard2020Page extends ParentPage {


    public ViewPozaplanInspCard2020Page(WebDriver webDriver) {
        super(webDriver, "/inspection/view?id=2134404");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Оновити інформацію')]")
    private WebElement updateBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;

    @FindBy(xpath = ".//h3[@class='inspection_title' and contains(text(),'Загальні дані')]")
    private WebElement gridtitle;

    @FindBy(xpath = ".//a[@class='back_link']")
    private WebElement backLink;

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
        Assert.assertEquals(webDriver.getTitle(), "\"ЕНЕРГОСЕРВІС\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        // Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/inspection/view?id=3219012");
        String regex = configProperties.base_url() + "/inspection/view\\?id=[0-9]*";
        String str = webDriver.getCurrentUrl();
        Assert.assertTrue(Utils.checkRegex(regex, str));

    }

    @Step
    public boolean gridTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridtitle);
    }

    @Step
    public void checkIsGridTitlePresent() {
        Assert.assertTrue("Grid Title is not displayed", gridTitleIsDisplayed());
    }

    @Step
    public boolean updateBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateBtn);
    }

    @Step
    public void checkIsUpdateBtnPresent() {
        Assert.assertTrue("Update Btn is not displayed", updateBtnIsDisplayed());
    }

    @Step
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public void checkIsSaveBtnPresent() {
        Assert.assertTrue("Save Btn is not displayed", saveBtnIsDisplayed());
    }

    @Step
    public void clickOnBackLink() {
        actionsWithOurElements.clickOnElement(backLink);
    }
}
