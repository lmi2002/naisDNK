package pages.planuvanniaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanuvanniaActualPeriodYESPage extends ParentPage {

    public PlanuvanniaActualPeriodYESPage (WebDriver webDriver) {
        super(webDriver, "/planning-period/index?PlanningPeriodSearch%5Bactive%5D=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='year' and contains(text(),'Рік')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//select[@id='planningperiodsearch-active']")
    private WebElement actualPeriodSelectField;

    @FindBy(xpath = ".//button[@id='page_use']")
    private WebElement algorytmPlanuvanniaBtn;

    @FindBy(xpath = ".//div[@class='page_use_block']")
    private WebElement algorytmPlanInfoBlock;

    @FindBy(xpath = ".//a[@href='/plan-project/index?planning_period_id=1' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirka2018Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=2&regulator_id=61' and contains(text(),'Перейти до річного плану')]")
    private WebElement goToYearPlan2019Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=4&regulator_id=61' and contains(text(),'Перейти до проекту плану')]")
    private WebElement goToYearPlan2020Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=61' and contains(text(),'Перейти до проекту плану')]")
    private WebElement goToYearPlan2021Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=61' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirka2021Btn;

    @FindBy(xpath = ".//option[@value='0' and contains(text(),'Ні')]")
    private WebElement actualPeriodNOItem;

    @FindBy(xpath = ".//option[@value='1' and contains(text(),'Так')]")
    private WebElement actualPeriodYESItem;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean algorytmPlanuvanniaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(algorytmPlanuvanniaBtn);
    }

    @Step
    public boolean goToVybirka2018BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirka2018Btn);
    }

    @Step
    public boolean goToYearPlan2019BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToYearPlan2019Btn);
    }

    @Step
    public boolean goToYearPlan2020BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToYearPlan2020Btn);
    }
    @Step
    public boolean goToYearPlan2021BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToYearPlan2021Btn);
    }


    @Step
    public boolean goToVybirka2021BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirka2021Btn);
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
    public void checkIsAlgorytmPlanuvanniaBtnPresent() {
        Assert.assertTrue("AlgorytmPlanuvanniaBtnIsDisplayed is not displayed", algorytmPlanuvanniaBtnIsDisplayed());
    }

    @Step
    public void checkIsGoToVybirka2018BtnNOTPresent() {
        Assert.assertFalse("GoToVybirka2018Btn is displayed", goToVybirka2018BtnIsDisplayed());
    }

    @Step
    public void checkIsGoToYearPlan2019BtnNOTPresent() {
        Assert.assertFalse("GoToYearPlan2019Btn is displayed", goToYearPlan2019BtnIsDisplayed());
    }

    @Step
    public void checkIsGoToYearPlan2020BtnPresent() {
        Assert.assertTrue("GoToYearPlan2020Btn is not displayed", goToYearPlan2020BtnIsDisplayed());
    }
    @Step
    public void checkIsGoToYearPlan2021BtnPresent() {
        Assert.assertTrue("GoToYearPlan2021Btn is not displayed", goToYearPlan2021BtnIsDisplayed());
    }


    @Step
    public void checkIsGoToVybirka2021BtnNOTPresent() {
        Assert.assertFalse("GoToVybirka2021Btn is displayed", goToVybirka2021BtnIsDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Планові періоди");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/planning-period/index?PlanningPeriodSearch%5Bactive%5D=1");
    }

    @Step
    public void clickOnActualPeriodSelectField() {
        actionsWithOurElements.clickOnElement(actualPeriodSelectField);
    }

    @Step
    public void clickOnGoToVybirka2018Btn() {
        actionsWithOurElements.clickOnElement(goToVybirka2018Btn);
    }

    @Step
    public void clickOnGoToYearPlan2019Btn() {
        actionsWithOurElements.clickOnElement(goToYearPlan2019Btn);
    }

    @Step
    public void clickOnAlgorytmPlanuvanniaBtn() {
        actionsWithOurElements.clickOnElement(algorytmPlanuvanniaBtn);
    }

    @Step
    public void clickOnGoToYearPlan2020Btn() {
        actionsWithOurElements.clickOnElement(goToYearPlan2020Btn);
    }

    @Step
    public void clickOnGoToVybirka2021Btn() {
        actionsWithOurElements.clickOnElement(goToVybirka2021Btn);
    }

    @Step
    public void clickOnActualPeriodNOItem() {
        actionsWithOurElements.clickOnElement(actualPeriodNOItem);
    }

    @Step
    public void clickOnActualPeriodYESItem() {
        actionsWithOurElements.clickOnElement(actualPeriodYESItem);
    }
}
