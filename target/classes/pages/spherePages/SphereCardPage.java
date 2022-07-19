package pages.spherePages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SphereCardPage extends ParentPage {

    public SphereCardPage(WebDriver webDriver) {
        super(webDriver, "/sphere/view?id=124");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='goal_id' and contains(text(),'Ціль')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//h3[contains(text(),'Перелік ризиків')]")
    private WebElement gridTitle;

    @FindBy(xpath = ".//div[@class='common-info']")
    private WebElement infoBlock;

    @FindBy(xpath = ".//a[@href='/sphere/view?id=124&tab=criteria']")
    private WebElement criteriaItem;

    @FindBy(xpath = ".//a[@href='/sphere/view?id=124&tab=question']")
    private WebElement questionListItem;

    @FindBy(xpath = ".//a[@href='/sphere/view?id=124&tab=requirements']")
    private WebElement vymogyItem;

    @FindBy(xpath = ".//a[@href='/sphere/view?id=124&tab=npa']")
    private WebElement perelikNPAItem;


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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/sphere/view?id=124");
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

    @Step
    public void clickOnCriteriaItem() {
        actionsWithOurElements.clickOnElement(criteriaItem);
    }

    @Step
    public void clickOnQuestionListItem() {
        actionsWithOurElements.clickOnElement(questionListItem);
    }

    @Step
    public void clickOnVymogyItem() {
        actionsWithOurElements.clickOnElement(vymogyItem);
    }

    @Step
    public void clickOnPerelikNPAItem() {
        actionsWithOurElements.clickOnElement(perelikNPAItem);
    }


}
