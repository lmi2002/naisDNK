package pages.spherePages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SphereQuestionListPage extends ParentPage {

    public SphereQuestionListPage(WebDriver webDriver) {
        super(webDriver, "/sphere/view?id=124&tab=question");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//label[contains(text(),'1 Загальні вимоги')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//*[contains(text(),'Питання для перевірки дотримання вимог')]")
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
        Assert.assertEquals(webDriver.getTitle(), "Будівництво об’єктів, що за класом наслідків (відповідальності) належать до об’єктів з середнім (СС2) та значними (СС3) наслідками, що підлягає ліцензуванню");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/sphere/view?id=124&tab=question");
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
