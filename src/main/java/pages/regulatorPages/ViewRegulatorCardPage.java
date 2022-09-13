package pages.regulatorPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewRegulatorCardPage extends ParentPage {

    public ViewRegulatorCardPage(WebDriver webDriver) {
        super(webDriver, "/regulator/view?id=5");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='17%' and contains(text(),'Назва')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='inspector-info']")
    private WebElement inspectorInfoBlock;

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
        Assert.assertEquals(webDriver.getTitle(), "Контролюючі органи");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/regulator/view?id=5");
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
    public boolean inspectorInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inspectorInfoBlock);
    }

    @Step
    public void checkIsInspectorInfoBlockPresent() {
        Assert.assertTrue("Inspector Info Block is not displayed", inspectorInfoBlockIsDisplayed());
    }

}
