package pages.ratingSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RatingSGWithSpherePage extends ParentPage {

    public RatingSGWithSpherePage(WebDriver webDriver) {
        super(webDriver, "/subject-rating/index?regulatorId=262&sphereId=136");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort ='code' and contains(text(),'Код')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[1]/div/div[1]/div/span/span[1]/span")
    private WebElement sphereField;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/div[1]/div/div[2]/div/span/span[1]/span")
    private WebElement regulatorField;

    @FindBy(xpath = ".//a[@class ='btn btn_link' and contains(text(),'Історія рейтингів')]")
    private WebElement ratingHistoryBtn;

    @FindBy(xpath = ".//button[@id ='approve_rating' and contains(text(),'Затвердити рейтинг')]")
    private WebElement approveRatingBtn;

    @FindBy(xpath = ".//span[@class ='icon-download']")
    private WebElement iconDownload;

    @FindBy(xpath = ".//*[@id='w2']/table/tbody/tr[1]/td[2]/a")
    private WebElement sgNameLink;

    @FindBy(xpath = ".//tr[1]//td[6 and contains(text(),'70.00')]")
    private WebElement allMaxBal;

    @FindBy(xpath = ".//h4[@class='modal_title' and contains(text(),'Успіх')]")
    private WebElement uspih_modalWin_message;

    @FindBy(xpath = ".//a[@class='btn-block btn btn-primary' and contains(text(),'Перейти до історії рейтингів')]")
    private WebElement goToRatingHistory_modalWin_btn;


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
        Assert.assertEquals(webDriver.getTitle(), "Рейтинг суб'єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject-rating/index?regulatorId=568&sphereId=123");
    }

    @Step
    public boolean isGridElementDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", isGridElementDisplayed());
    }

    @Step
    public boolean isGridListElementsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", isGridListElementsDisplayed());
    }

    @Step
    public boolean isSphereFieldDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereField);
    }

    @Step
    public void checkIsSphereFieldPresent() {
        Assert.assertTrue("Sphere Field is not displayed", isSphereFieldDisplayed());
    }

    @Step
    public boolean isRegulatorFieldDisplayed() {
        return actionsWithOurElements.isElementDisplayed(regulatorField);
    }

    @Step
    public void checkIsRegulatorFieldPresent() {
        Assert.assertTrue("Regulator Field is not displayed", isRegulatorFieldDisplayed());
    }

    @Step
    public boolean isRatingHistoryBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(ratingHistoryBtn);
    }

    @Step
    public void checkIsRatingHistoryBtnPresent() {
        Assert.assertTrue("Rating History Btn is not displayed", isRatingHistoryBtnDisplayed());
    }

    @Step
    public boolean isApproveRatingBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approveRatingBtn);
    }

    @Step
    public void checkIsApproveRatingBtnPresent() {
        Assert.assertTrue("Approve Rating Btn is not displayed", isApproveRatingBtnDisplayed());
    }

    @Step
    public boolean isIconDownloadDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approveRatingBtn);
    }

    @Step
    public void checkIsIconDownloadPresent() {
        Assert.assertTrue("Icon Download is not displayed", isIconDownloadDisplayed());
    }
    @Step
    public boolean isSGNameLinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sgNameLink);
    }

    @Step
    public void checkIsSGNameLinkPresent() {
        Assert.assertTrue("SG Name Link in the grid is not displayed", isSGNameLinkDisplayed());
    }

    @Step
    public boolean isAllMaxBalDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allMaxBal);
    }

    @Step
    public void checkIsAllMaxBalPresentOnFirstPosition() {
        Assert.assertTrue("All max Bal (70.00) in the grid is not displayed", isAllMaxBalDisplayed());
    }

    @Step
    public void clickOnRatingHistoryBtn() {
        actionsWithOurElements.clickOnElement(ratingHistoryBtn);
    }

    @Step
    public void clickOnApproveRatingBtn() {
        actionsWithOurElements.clickOnElement(approveRatingBtn);
    }

    @Step
    public boolean isUspih_modalWin_messageDisplayed() {
        return actionsWithOurElements.isElementDisplayed(uspih_modalWin_message);
    }

    @Step
    public void checkIsUspih_modalWin_messagePresent() {
        actionsWithOurElements.isElementDisplayed(uspih_modalWin_message);
        Assert.assertTrue("Uspih_modalWin_message is not displayed", isUspih_modalWin_messageDisplayed());
    }

    @Step
    public void clickOnGoToRatingHistory_modalWin_btn() {
        actionsWithOurElements.clickOnElement(goToRatingHistory_modalWin_btn);
    }
}