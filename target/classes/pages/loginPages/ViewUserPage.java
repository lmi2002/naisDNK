package pages.loginPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class ViewUserPage extends ParentPage {

    public ViewUserPage(WebDriver webDriver) {
        super(webDriver, "/user/view?id=7967");
    }

    @FindBy(xpath = ".//div[@class='inspector-ava']")
    private WebElement inspectorAvatar;

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Безтужев Денис')]")
    private WebElement userNameIsTrue;

    @FindBy(css = "a.btn-open-inspector-cart")
    private WebElement btnInspectorMenu;

    @FindBy(xpath = ".//*[@href='/user/update?id=7967']//i[@class='icon-pencil']")
    private WebElement iconUpdate;

    @FindBy(xpath = ".//button[@class='close_modal icon-cancel']")
    private WebElement btnCloseModal;

    @FindBy(xpath = ".//div[@class='col-xs-12']//a[@href='mailto:d.beztuzhev12@brdo.com.ua' and contains(text(),'d.beztuzhev12@brdo.com.ua')]")
    private WebElement emailIsTrue;

    @FindBy(xpath = ".//div[@class='col-xs-12']//a[@href='tel:+380952222222' and contains(text(),'+380952222222')]")
    private WebElement phoneIsTrue;

    @FindBy(xpath = ".//a[@href='#']//i[@class='icon-details']")
    private WebElement iconViewInspCard;

    @FindBy(xpath = ".//div[@class='bbody']//a[contains(text(),'d.beztuzhev12@brdo.com.ua')]")
    private WebElement emailInCardIsTrue;

    @FindBy(xpath = ".//div[@class='bbody']//a[contains(text(),'+380952222222')]")
    private WebElement phoneInCardIsTrue;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block' and @href='/user/update?id=7967']")
    private WebElement btnUpdateFromUserCard;

    @FindBy(xpath = ".//i[@class='icon-close']")
    private WebElement iconClose;

    @Step
    public boolean isInspectorAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inspectorAvatar);
    }

    @Step
    public void isUserNameIsTrue() {
        Assert.assertTrue("Username not displayed", webDriver.getPageSource().contains("Безтужев Денис"));
    }

    @Step
    public void clickOnBtnInspectorMenu() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnElement(btnInspectorMenu);
    }

    @Step
    public void clickOnIconUpdate() {
        actionsWithOurElements.clickOnElement(iconUpdate);
    }

    @Step
    public void clickOnBtnCloseModal() {
        actionsWithOurElements.clickOnElement(btnCloseModal);
    }

    @Step
    public void clickOnIconViewInspCard() {
        actionsWithOurElements.clickOnElement(iconViewInspCard);
    }

    @Step
    public void updatedUserNameIsTrue() {
        Assert.assertTrue("Updated username not displayed", webDriver.getPageSource().contains("Ходос Денис"));
    }

    @Step
    public void updatedEmailIsTrue() {
        Assert.assertTrue("Updated Email is not displayed", webDriver.getPageSource().contains("d.beztuzhev12@brdo.com.ua"));
    }

    @Step
    public void updatedPhoneIsTrue() {
        Assert.assertTrue("Updated Phone number is not displayed", webDriver.getPageSource().contains("+380952222222"));
    }

    @Step
    public void updatedEmailInCardIsTrue() {
        Assert.assertTrue("Updated Email in Cart is not displayed", webDriver.getPageSource().contains("d.beztuzhev12@brdo.com.ua"));
    }

    @Step
    public void updatedPhoneInCardIsTrue() {
        Assert.assertTrue("Updated Phone number in Cart is not displayed", webDriver.getPageSource().contains("+380952222222"));
    }

    @Step
    public void clickOnBtnUpdateFromUserCard() {
        actionsWithOurElements.clickOnElement(btnUpdateFromUserCard);
    }

    @Step
    public void checkEmailInCard() {
        Assert.assertTrue("Email in Cart is not displayed", webDriver.getPageSource().contains("d.beztuzhev@brdo.com.ua"));
    }

    @Step
    public void checkPhoneInCard() {
        Assert.assertTrue("Phone number in Cart is not displayed", webDriver.getPageSource().contains("+380952225555"));
    }

    @Step
    public void clickOnIconClose() {
        actionsWithOurElements.clickOnElement(iconClose);
    }

}



