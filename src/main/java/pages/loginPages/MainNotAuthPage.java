package pages.loginPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.MainMenu;
import parentPage.ParentPage;

public class MainNotAuthPage extends ParentPage {

    private String url = "https://inspections.test.nais.gov.ua";
    private String urlProd = "https://inspections.gov.ua";

    public MainMenu mainMenu;

    @FindBy(xpath = ".//*[@id='w5']/li[5]/a")
    private WebElement mainNotAuthPageAvatar;

    @FindBy(xpath = ".//span[contains(text(),'Увійти')]")
    private WebElement uviytyMainMenuNotAuthItem;

    public MainNotAuthPage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    @Step
    public void openPage() {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public void openPageProd() {
        try {
            webDriver.get(urlProd);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(mainNotAuthPageAvatar);
    }

    @Step
    public void clickOnUviyty() {
        actionsWithOurElements.clickOnElement(uviytyMainMenuNotAuthItem);
        logger.info("Element -Uviyty- was clicked");
    }


}