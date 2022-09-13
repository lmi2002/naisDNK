package pages.spherePages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpherePerelikNPAPage extends ParentPage {

    public SpherePerelikNPAPage (WebDriver webDriver) {
        super(webDriver, "/sphere/view?id=217&tab=npa");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Найменування НПА')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//h3[contains(text(),'Перелік НПА')]")
    private WebElement gridTitle;

    @FindBy(xpath = ".//div[@class='common-info']")
    private WebElement infoBlock;



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
        Assert.assertEquals(webDriver.getTitle(), "Безпечність та окремі показники якості харчових продуктів");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/sphere/view?id=217&tab=npa");
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
    public boolean gridTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridTitle);
    }

    @Step
    public void checkIsGridTitlePresent() {
        Assert.assertTrue("Grid Title is not displayed", gridTitleIsDisplayed());
    }

    @Step
    public boolean gridInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlock);
    }

    @Step
    public void checkIsGridInfoBlockPresent() {
        Assert.assertTrue("Grid Info Block is not displayed", gridInfoBlockIsDisplayed());
    }

}

