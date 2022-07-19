package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewDosyeSubjectPage extends ParentPage {

    public ViewDosyeSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/about?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//h3[contains(text(),'Ступені ризику за сферами контролю')]")
    private WebElement stupeniRyzykuTitle;

    @FindBy(xpath = ".//div[@id='sphere-container']")
    private WebElement stupeniRyzykuTab;

    @FindBy(xpath = ".//h2[contains(text(),'Види діяльності (за КВЕД)')]")
    private WebElement zagalnaInfoTitle;

    @FindBy(xpath = ".//div[@class='bbody']")
    private WebElement zagalnaInfoTab;

    @FindBy(xpath = ".//h2[contains(text(),'Види діяльності (за КВЕД)')]")
    private WebElement kvedTitle;

    @FindBy(xpath = ".//div[@class='tbody collapse in']")
    private WebElement kvedTab;

    @FindBy(xpath = ".//h3[contains(text(),'Дані для планування')]")
    private WebElement planningDataTitle;

    @FindBy(xpath = ".//div[@id='last-planned-container']")
    private WebElement planningDataTab;

    @FindBy(xpath = ".//a[@href='/subject/view/branches?subject_id=15076']")
    private WebElement pidrozdilyLink;

    @FindBy(xpath = ".//a[@href='/subject/view/objects?subject_id=15076']")
    private WebElement objectsLink;

    @FindBy(xpath = ".//a[@href='/subject/view/inspections?subject_id=15076']")
    private WebElement perevirkyLink;

    @FindBy(xpath = ".//a[@href='/subject/view/history?subject_id=15076']")
    private WebElement istoriyaZminLink;

    @FindBy(xpath = ".//a[@href='/subject/view/licensing?subject_id=15076']")
    private WebElement licenseLink;

    @FindBy(xpath = ".//a[@href='/subject/view/additional?subject_id=15076']")
    private WebElement dodatkovaInfoLink;

    @FindBy(xpath = ".//a[@href='/subject/view/appeal?subject_id=15076']")
    private WebElement zvernennyaLink;

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
        Assert.assertEquals(webDriver.getTitle(), "ТОВАРИСТВО З ОБМЕЖЕНОЮ ВІДПОВІДАЛЬНІСТЮ \"РЕНТАЛ ГРУП\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/view/about?subject_id=15076");
    }

    @Step
    public boolean stupeniRyzykuTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(stupeniRyzykuTitle);
    }

    @Step
    public void checkIsStupeniRyzykuTitlePresent() {
        Assert.assertTrue("Stupeni Ryzyku Title is not displayed", stupeniRyzykuTitleIsDisplayed());
    }

    @Step
    public boolean stupeniRyzykuTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(stupeniRyzykuTab);
    }

    @Step
    public void checkIsStupeniRyzykuTabPresent() {
        Assert.assertTrue("Stupeni Ryzyku Tab is not displayed", stupeniRyzykuTabIsDisplayed());
    }

    @Step
    public boolean zagalnaInfoTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(zagalnaInfoTitle);
    }

    @Step
    public void checkIsZagalnaInfoTitlePresent() {
        Assert.assertTrue("Zagalna Info Title is not displayed", zagalnaInfoTitleIsDisplayed());
    }

    @Step
    public boolean zagalnaInfoTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(zagalnaInfoTab);
    }

    @Step
    public void checkIsZagalnaInfoTabPresent() {
        Assert.assertTrue("Zagalna Info Tab is not displayed", zagalnaInfoTabIsDisplayed());
    }

    @Step
    public boolean kvedTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(kvedTitle);
    }

    @Step
    public void checkIsKvedTitlePresent() {
        Assert.assertTrue("Kved Title is not displayed", kvedTitleIsDisplayed());
    }

    @Step
    public boolean kvedTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(kvedTab);
    }

    @Step
    public void checkIsKvedTabPresent() {
        Assert.assertTrue("Kved Tab is not displayed", kvedTabIsDisplayed());
    }

    @Step
    public boolean planningDataTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planningDataTitle);
    }

    @Step
    public void checkIsPlanningDataTitlePresent() {
        Assert.assertTrue("Planning Data Title is not displayed", planningDataTitleIsDisplayed());
    }

    @Step
    public boolean planningDataTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planningDataTab);
    }

    @Step
    public void checkIsPlanningDataTablePresent() {
        Assert.assertTrue("Planning Data Tab is not displayed", planningDataTabIsDisplayed());
    }

    @Step
    public void clickOnPidrozdilyLink() {
        actionsWithOurElements.clickOnElement(pidrozdilyLink);
    }

    @Step
    public void clickOnObjectsLink() {
        actionsWithOurElements.clickOnElement(objectsLink);
    }

    @Step
    public void clickOnPerevirkyLink() {
        actionsWithOurElements.clickOnElement(perevirkyLink);
    }

    @Step
    public void clickOnIstoriyaZminLink() {
        actionsWithOurElements.clickOnElement(istoriyaZminLink);
    }

    @Step
    public void clickOnLicenseLink() {
        actionsWithOurElements.clickOnElement(licenseLink);
    }

    @Step
    public void clickOnDodatkovaInfoLink() {
        actionsWithOurElements.clickOnElement(dodatkovaInfoLink);
    }

    @Step
    public void clickOnZvernennyaLink() {
        actionsWithOurElements.clickOnElement(zvernennyaLink);
    }


}
