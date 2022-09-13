package pages.planuvanniaPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PlanuvanniaPage extends ParentPage {

    public PlanuvanniaPage(WebDriver webDriver) {
        super(webDriver, "/planning-period/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[contains(text(),'Рік')]")
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

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=2&regulator_id=568' and contains(text(),'Перейти до проекту плану')]")
    private WebElement goToYearPlan2019Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=4&regulator_id=568' and contains(text(),'Перейти до річного плану')]")
    private WebElement goToYearPlan2020Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=6&regulator_id=568' and contains(text(),'Перейти до річного плану')]")
    private WebElement goToYearPlan2021Btn;

    @FindBy(xpath = ".//a[@href='/plan-inspection/index?planning_period_id=7&regulator_id=568' and contains(text(),'Перейти до річного плану')]")
    private WebElement goToYearPlan2022Btn;

    @FindBy(xpath = ".//a[@href='/plan-project-inspection/index?planning_period_id=8' and contains(text(),'Перейти до вибірки СГ')]")
    private WebElement goToVybirka2023Btn;

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
    public boolean goToYearPlan2022BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToYearPlan2022Btn);
    }

    @Step
    public boolean goToVybirka2023BtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToVybirka2023Btn);
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
    public void checkIsGoToVybirka2018BtnPresent() {
        Assert.assertTrue("GoToVybirka2018Btn is not displayed", goToVybirka2018BtnIsDisplayed());
    }

    @Step
    public void checkIsGoToYearPlan2019BtnPresent() {
        Assert.assertTrue("GoToYearPlan2019Btn is not displayed", goToYearPlan2019BtnIsDisplayed());
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
    public void checkIsGoToYearPlan2022BtnPresent() {
        Assert.assertTrue("GoToYearPlan2021Btn is not displayed", goToYearPlan2022BtnIsDisplayed());
    }

    @Step
    public void checkIsGoToVybirka2023BtnPresent() {
        Assert.assertTrue("GoToYearPlan2021Btn is not displayed", goToVybirka2023BtnIsDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Планові періоди");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/planning-period/index");
    }

    @Step
    public void checkIsAlgorytmPlanInfoBlockPresent() {
        Assert.assertTrue("Information block contains no text", webDriver.getPageSource().contains("Алгоритм планування заходів державного нагляду (контролю) на наступний плановий період"));
    }

    @Step
    public void checkIsAlgorytmPlanInfoBlockLinkPresent() {
        Assert.assertTrue("Посилання на алгоритм не відображається", webDriver.getPageSource().contains("Посилання на алгоритм"));
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
    public void clickOnGoToYearPlan2021Btn() {
        actionsWithOurElements.clickOnElement(goToYearPlan2021Btn);
    }

    @Step
    public void clickOnGoToYearPlan2022Btn() {
        actionsWithOurElements.clickOnElement(goToYearPlan2022Btn);
    }

    @Step
    public void clickOnGoToVybirka2023Btn() {
        actionsWithOurElements.clickOnElement(goToVybirka2023Btn);
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
