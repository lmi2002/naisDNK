package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanProjectKO2021Page extends ParentPage {

    public PlanProjectKO2021Page (WebDriver webDriver) {
        super(webDriver, "/plan-inspection/index?planning_period_id=6&regulator_id=50");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@value='load_plan_inspection']")
    private WebElement dowmloadVybirkaSGBtn;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div[2]/ul/li[2]/span")
    private WebElement signProjectPlanBtn;

    @FindBy(xpath = ".//a[@class='btn btn-mini' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirkaSGBtn;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean dowmloadVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dowmloadVybirkaSGBtn);
    }

    @Step
    public boolean goToVybirkaSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirkaSGBtn);
    }

    @Step
    public boolean signProjectPlanBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(signProjectPlanBtn);
    }

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
        Assert.assertEquals(webDriver.getTitle(), "Проект плану контролюючого органу");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-inspection/index?planning_period_id=6&regulator_id=50");
    }

    @Step
    public void clickOnSignProjectPlanBtn() {
        actionsWithOurElements.clickOnElement(signProjectPlanBtn);
    }
}
