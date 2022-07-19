package pages.complexPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ComplexPlanPage extends ParentPage {

    public ComplexPlanPage(WebDriver webDriver) {
        super(webDriver, "/complex-plan/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//th[contains(text(),'Комплексний план/Проект комплексного плану')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//a[@href='/complex-plan-change/index?complex_plan_id=65']")
    private WebElement complexPlanChangesList2018Link;

    @FindBy(xpath = ".//a[@href='/complex-plan-change/index?complex_plan_id=68']")
    private WebElement complexPlanChangesList2019Link;

    @FindBy(xpath = ".//a[@href='/complex-plan-change/index?complex_plan_id=69']")
    private WebElement complexPlanChangesList2020Link;

    @FindBy(xpath = ".//a[@href='/complex-plan-change/index?complex_plan_id=72']")
    private WebElement complexPlanChangesList2021Link;

    @FindBy(xpath = ".//tr[1]//td[6]//a[@class='btn btn-primary' and contains(text(),'Зберегти')]")
    private WebElement saveNakaz2018Btn;

    @FindBy(xpath = ".//tr[2]//td[6]//a[@class='btn btn-primary' and contains(text(),'Зберегти')]")
    private WebElement saveNakaz2019Btn;

    @FindBy(xpath = ".//tr[3]//td[6]//a[@class='btn btn-primary' and contains(text(),'Зберегти')]")
    private WebElement saveNakaz2020Btn;

    @FindBy(xpath = ".//tr[4]//td[6]//a[@class='btn btn-primary' and contains(text(),'Зберегти')]")
    private WebElement saveNakaz2021Btn;

    @FindBy(xpath = ".//tr[1]//td[2]//a[contains(text(),'Завантажити xls')]")
    private WebElement downloadComplexPlan2018link;

    @FindBy(xpath = ".//tr[2]//td[2]//a[contains(text(),'Завантажити xls')]")
    private WebElement downloadComplexPlan2019link;

    @FindBy(xpath = ".//tr[3]//td[2]//a[contains(text(),'Завантажити xls')]")
    private WebElement downloadComplexPlan2020link;

    @FindBy(xpath = ".//tr[4]//td[2]//a[contains(text(),'Завантажити xls')]")
    private WebElement downloadComplexPlan2021link;

    @FindBy(xpath = ".//tr[1]//td[7]//a[contains(text(),'Перейти')]")
    private WebElement goToNakazListAboutChanges2018Link;

    @FindBy(xpath = ".//tr[2]//td[7]//a[contains(text(),'Перейти')]")
    private WebElement goToNakazListAboutChanges2019Link;

    @FindBy(xpath = ".//tr[3]//td[7]//a[contains(text(),'Перейти')]")
    private WebElement goToNakazListAboutChanges2020Link;

    @FindBy(xpath = ".//tr[4]//td[7]//a[contains(text(),'Перейти')]")
    private WebElement goToNakazListAboutChanges2021Link;

    @FindBy(xpath = ".//tr[1]//td[2]//a[contains(text(),'Перейти')]")
    private WebElement goToComplexPlan2018Link;

    @FindBy(xpath = ".//tr[2]//td[2]//a[contains(text(),'Перейти')]")
    private WebElement goToComplexPlan2019Link;

    @FindBy(xpath = ".//tr[3]//td[2]//a[contains(text(),'Перейти')]")
    private WebElement goToComplexPlan2020Link;

    @FindBy(xpath = ".//tr[4]//td[2]//a[contains(text(),'Перейти')]")
    private WebElement goToComplexPlan2021Link;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean isGridListNumberElementDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListNumberElementPresent() {
        Assert.assertTrue("GridListNumberElement is not displayed", isGridListNumberElementDisplayed());
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
        Assert.assertEquals(webDriver.getTitle(), "Комплексний план");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/complex-plan/index");
    }

    @Step
    public boolean isSaveNakaz2018BtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz2018Btn);
    }

    @Step
    public void checkIsSaveNakaz2018BtnPresent() {
        Assert.assertTrue("Save Nakaz 2018 Btn is not displayed", isSaveNakaz2018BtnDisplayed());
    }
    @Step
    public boolean isSaveNakaz2019BtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz2019Btn);
    }

    @Step
    public void checkIsSaveNakaz2019BtnPresent() {
        Assert.assertTrue("Save Nakaz 2019 Btn is not displayed", isSaveNakaz2019BtnDisplayed());
    }

    @Step
    public boolean isSaveNakaz2020BtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz2020Btn);
    }

    @Step
    public void checkIsSaveNakaz2020BtnPresent() {
        Assert.assertTrue("Save Nakaz 2020 Btn is not displayed", isSaveNakaz2020BtnDisplayed());
    }

    @Step
    public boolean isSaveNakaz2021BtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz2021Btn);
    }

    @Step
    public void checkIsSaveNakaz2021BtnPresent() {
        Assert.assertTrue("Save Nakaz 2020 Btn is not displayed", isSaveNakaz2021BtnDisplayed());
    }

    @Step
    public boolean isGoToNakazListAboutChanges2018LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToNakazListAboutChanges2018Link);
    }

    @Step
    public void checkIsGoToNakazListAboutChanges2018LinkPresent() {
        Assert.assertTrue("Go To Nakaz List About Changes 2018 Link is not displayed", isGoToNakazListAboutChanges2018LinkDisplayed());
    }

    @Step
    public boolean isGoToNakazListAboutChanges2019LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToNakazListAboutChanges2019Link);
    }

    @Step
    public void checkIsGoToNakazListAboutChanges2019LinkPresent() {
        Assert.assertTrue("Go To Nakaz List About Changes 2019 Link is not displayed", isGoToNakazListAboutChanges2019LinkDisplayed());
    }

    @Step
    public boolean isGoToNakazListAboutChanges2020LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToNakazListAboutChanges2020Link);
    }

    @Step
    public void checkIsGoToNakazListAboutChanges2020LinkPresent() {
        Assert.assertTrue("Go To Nakaz List About Changes 2020 Link is not displayed", isGoToNakazListAboutChanges2020LinkDisplayed());
    }

    @Step
    public boolean isGoToNakazListAboutChanges2021LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToNakazListAboutChanges2021Link);
    }

    @Step
    public void checkIsGoToNakazListAboutChanges2021LinkPresent() {
        Assert.assertTrue("Go To Nakaz List About Changes 2021 Link is not displayed", isGoToNakazListAboutChanges2021LinkDisplayed());
    }

    @Step
    public boolean isDownloadComplexPlan2018linkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadComplexPlan2018link);
    }

    @Step
    public void checkIsDownloadComplexPlan2018linkPresent() {
        Assert.assertTrue("Download Complex Plan 2018 link is not displayed", isDownloadComplexPlan2018linkDisplayed());
    }
    @Step
    public boolean isDownloadComplexPlan2019linkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadComplexPlan2019link);
    }

    @Step
    public void checkIsDownloadComplexPlan2019linkPresent() {
        Assert.assertTrue("Download Complex Plan 2019 link is not displayed", isDownloadComplexPlan2019linkDisplayed());
    }

    @Step
    public boolean isDownloadComplexPlan2020linkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadComplexPlan2020link);
    }

    @Step
    public void checkIsDownloadComplexPlan2020linkPresent() {
        Assert.assertTrue("Download Complex Plan 2020 link is not displayed", isDownloadComplexPlan2020linkDisplayed());
    }

    @Step
    public boolean isDownloadComplexPlan2021linkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadComplexPlan2021link);
    }

    @Step
    public void checkIsDownloadComplexPlan2021linkPresent() {
        Assert.assertTrue("Download Complex Plan 2021 link is not displayed", isDownloadComplexPlan2021linkDisplayed());
    }

    @Step
    public boolean isGoToComplexPlan2018LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToComplexPlan2018Link);
    }

    @Step
    public void checkIsGoToComplexPlan2018LinkPresent() {
        Assert.assertTrue("Go To Complex Plan 2018 Link is not displayed", isGoToComplexPlan2018LinkDisplayed());
    }

    @Step
    public boolean isGoToComplexPlan2019LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToComplexPlan2019Link);
    }

    @Step
    public void checkIsGoToComplexPlan2019LinkPresent() {
        Assert.assertTrue("Go To Complex Plan 2019 Link is not displayed", isGoToComplexPlan2019LinkDisplayed());
    }

    @Step
    public boolean isGoToComplexPlan2020LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToComplexPlan2020Link);
    }

    @Step
    public void checkIsGoToComplexPlan2020LinkPresent() {
        Assert.assertTrue("Go To Complex Plan 2020 Link is not displayed", isGoToComplexPlan2020LinkDisplayed());
    }

    @Step
    public boolean isGoToComplexPlan2021LinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToComplexPlan2021Link);
    }

    @Step
    public void checkIsGoToComplexPlan2021LinkPresent() {
        Assert.assertTrue("Go To Complex Plan 2021 Link is not displayed", isGoToComplexPlan2021LinkDisplayed());
    }

    @Step
    public void clickOnGoToComplexPlan2018Link() {
        actionsWithOurElements.clickOnElement(goToComplexPlan2018Link);
    }

    @Step
    public void clickOnGoToComplexPlan2019Link() {
        actionsWithOurElements.clickOnElement(goToComplexPlan2019Link);
    }

    @Step
    public void clickOnGoToComplexPlan2020Link() {
        actionsWithOurElements.clickOnElement(goToComplexPlan2020Link);
    }

    @Step
    public void clickOnGoToComplexPlan2021Link() {
        actionsWithOurElements.clickOnElement(goToComplexPlan2021Link);
    }

    @Step
    public void clickOnGoToNakazListAboutChanges2018Link() {
        actionsWithOurElements.clickOnElement(goToNakazListAboutChanges2018Link);
    }

    @Step
    public void clickOnGoToNakazListAboutChanges2019Link() {
        actionsWithOurElements.clickOnElement(goToNakazListAboutChanges2019Link);
    }

    @Step
    public void clickOnGoToNakazListAboutChanges2020Link() {
        actionsWithOurElements.clickOnElement(goToNakazListAboutChanges2020Link);
    }

    @Step
    public void clickOnGoToNakazListAboutChanges2021Link() {
        actionsWithOurElements.clickOnElement(goToNakazListAboutChanges2021Link);
    }


}
