package pages.trainingMaterialPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewTrainingMaterialPage extends ParentPage {

    public ViewTrainingMaterialPage (WebDriver webDriver) {
        super(webDriver, "/training-material/view?id=5");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@class='back-arrow']")
    private WebElement backToMaterialsListLink;

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm']")
    private WebElement updateBtn;

    @FindBy(xpath = ".//table[@class='table table-striped table-bordered detail-view']")
    private WebElement tableBlock;


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
        Assert.assertEquals(webDriver.getTitle(), "мсап");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/training-material/view?id=13");
    }

    @Step
    public boolean isBackToMaterialsListLinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToMaterialsListLink);
    }

    @Step
    public void checkIsBackToMaterialsListLinkPresent() {
        Assert.assertTrue("Back To Materials List Link is not displayed", isBackToMaterialsListLinkDisplayed());
    }

    @Step
    public boolean isUpdateBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateBtn);
    }

    @Step
    public void checkIsUpdateBtnPresent() {
        Assert.assertTrue("Update Btn is not displayed", isUpdateBtnDisplayed());
    }

    @Step
    public void clickOnBackToMaterialsListLink() {
        actionsWithOurElements.clickOnElement(backToMaterialsListLink);
    }

    @Step
    public boolean isTableBlockDisplayed() {
        return actionsWithOurElements.isElementDisplayed(tableBlock);
    }

    @Step
    public void checkIsTableBlockPresent() {
        Assert.assertTrue("Table Block is not displayed", isTableBlockDisplayed());
    }
}
