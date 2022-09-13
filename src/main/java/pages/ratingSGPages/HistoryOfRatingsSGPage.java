package pages.ratingSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HistoryOfRatingsSGPage extends ParentPage {
    public HistoryOfRatingsSGPage (WebDriver webDriver) {
        super(webDriver, "/subject-rating/history?regulatorId=262&sphereId=136");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort ='date_created' and contains(text(),'Дата ство')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class ='btn btn-mini' and contains(text(),'Повернутись до рейтингу')]")
    private WebElement backToRatingPageLink;

    @FindBy(xpath = ".//a[@class ='btn-block btn btn-primary use-rating']")
    private WebElement useInRatingBtn;

    @FindBy(xpath = ".//a[@class ='btn-block btn btn-default']")
    private WebElement deleteRatingVersionBtn;

    @FindBy(xpath = ".//button[@class ='btn btn-sing' and contains(text(),'Поточна версія')]")
    private WebElement potochnaVersionBtn;

    @FindBy(xpath = ".//*[@id='pa3py6aka-modal-alert']/div/button")
    private WebElement closeModalWinBtn;

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
        Assert.assertEquals(webDriver.getTitle(), "Історія рейтингів");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject-rating/history?regulatorId=568&sphereId=123");
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
    public boolean isBackToRatingPageLinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToRatingPageLink);
    }

    @Step
    public void checkIsBackToRatingPagePresent() {
        Assert.assertTrue("Back To Rating Page Link is not displayed", isBackToRatingPageLinkDisplayed());
    }

    @Step
    public boolean isUseInRatingBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(useInRatingBtn);
    }

    @Step
    public void checkIsUseInRatingBtnPresent() {
        Assert.assertTrue("Use In Rating Btn is not displayed", isUseInRatingBtnDisplayed());
    }

    @Step
    public boolean isDeleteRatingVersionBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(deleteRatingVersionBtn);
    }

    @Step
    public void checkIsDeleteRatingVersionBtnPresent() {
        Assert.assertTrue("Delete Rating Version Btn is not displayed", isDeleteRatingVersionBtnDisplayed());
    }

    @Step
    public boolean isPotochnaVersionBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(potochnaVersionBtn);
    }

    @Step
    public void checkIsPotochnaVersionBtnPresent() {
        Assert.assertTrue("Potochna Version Btn is not displayed", isPotochnaVersionBtnDisplayed());
    }

    @Step
    public void clickOnBackToRatingPageLink() {
        actionsWithOurElements.clickOnElement(backToRatingPageLink);
    }

    @Step
    public void clickOnDeleteRatingVersionBtn() {
        actionsWithOurElements.clickOnElement(deleteRatingVersionBtn);
    }

    @Step
    public void clickOKinAlertWindow() {
        webDriver.switchTo().alert().accept();
    }

    @Step
    public void checkIs_Uspih_message_modalWinPresent() {
        Assert.assertTrue("Успіх_Рейтинг успішно видалено_message_modalWin is not displayed", webDriver.getPageSource().contains("Рейтинг успішно видалено"));
    }

    @Step
    public void clickOnCloseModalWinBtn() {
        actionsWithOurElements.clickOnElement(closeModalWinBtn);
    }

    @Step
    public void checkIs_EmptyList_message_Present() {
        Assert.assertTrue("Нічого не знайдено_message_is not displayed", webDriver.getPageSource().contains("го не зна"));
    }
}
