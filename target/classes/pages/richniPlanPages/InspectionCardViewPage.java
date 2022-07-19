package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspectionCardViewPage extends ParentPage {

    public InspectionCardViewPage(WebDriver webDriver) {
        super(webDriver, "/inspection/view?id=1469155");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//h3[@class='inspection_title' and contains(text(),'Загальні дані з плану перевірок')]")
    private WebElement inspectionTitle;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;


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
        Assert.assertEquals(webDriver.getTitle(), "КОМУНАЛЬНЕ ПІДПРИЄМСТВО \"ВИРОБНИЧЕ УПРАВЛІННЯ КОМУНАЛЬНОГО ГОСПОДАРСТВА\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/inspection/view?id=1469155");
    }

    @Step
    public boolean inspectionTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inspectionTitle);
    }

    @Step
    public void checkIsInspectionTitlePresent() {
        Assert.assertTrue("Inspection Title is not displayed", inspectionTitleIsDisplayed());
    }

    @Step
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public void checkIsSaveBtnPresent() {
        Assert.assertTrue("Save Btn is not displayed", saveBtnIsDisplayed());
    }


}
