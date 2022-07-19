package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichniPlansMainPage extends ParentPage {

    @FindBy(xpath = ".//div[contains(text(),'Безтужев Денис')]")
    private WebElement userNameDisplayed;

    public RichniPlansMainPage(WebDriver webDriver) {
        super(webDriver, "/regulators-plans/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w2-container' and contains(text(),'За 2021 рік')]")
    private WebElement yearField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement year2018Item;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[2]")
    private WebElement year2019Item;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement year2020Item;

    @FindBy(xpath = ".//span[@title='За 2021 рік']")
    private WebElement year2021Item;

    @FindBy(xpath = ".//span[@class='select2-selection__rendered' and contains(text(),'Центральні органи')]")
    private WebElement organTypeField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'Центральні органи')]")
    private WebElement typeCentralOrgItem;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'ОМС')]")
    private WebElement typeOMCItem;

    @FindBy(xpath = ".//a[@data-sort='is_approved' and contains(text(),'Формування проекту річного плану')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//tr[1]//td[7]//a[@class='btn btn-primary' and contains(text(),'Скачати')]")
    private WebElement downloadBtn;

    @FindBy(xpath = ".//td[2]//a[contains(text(),'Державна служба України з надзвичайних ситуацій')]")
    private WebElement regulatorsNameLink;

    @FindBy(xpath = ".//tr[2]//a[contains(text(),'Перейти')]")
    private WebElement goToNakazListAboutChangesLink;

    @Step
    public void clickOnYearField() {
        actionsWithOurElements.clickOnElement(yearField);
    }

    @Step
    public void clickOnYear2018Item() {
        actionsWithOurElements.clickOnElement(year2018Item);
    }

    @Step
    public void clickOnYear2019Item() {
        actionsWithOurElements.clickOnElement(year2019Item);
    }

    @Step
    public void clickOnYear2020Item() {
        actionsWithOurElements.clickOnElement(year2020Item);
    }

    @Step
    public void clickOnYear2021Item() {
        actionsWithOurElements.clickOnElement(year2021Item);
    }

    @Step
    public void clickOnOrganTypeField() {
        actionsWithOurElements.clickOnElement(organTypeField);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }


    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsOrganNamePresent() {
        Assert.assertTrue("Regulator's name is not displayed", webDriver.getPageSource().contains("Державна служба України з надзвичайних ситуацій"));
    }

    @Step
    public void clickOnTypeCentralOrgItem() {
        actionsWithOurElements.clickOnElement(typeCentralOrgItem);
    }

    @Step
    public void clickOnTypeOMCItem() {
        actionsWithOurElements.clickOnElement(typeOMCItem);
    }

    @Step
    public void clickOnGoToNakazListAboutChangesLink() {
        actionsWithOurElements.clickOnElement(goToNakazListAboutChangesLink);
    }

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void clickOnRegulatorsNameLink() {
        actionsWithOurElements.clickOnElement(regulatorsNameLink);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public boolean isUserNameDisplayed() {
        return actionsWithOurElements.isElementDisplayed(userNameDisplayed);
    }

    @Step
    public void checkIsUserNamePresent() {
        Assert.assertTrue("User Name is not displayed", isUserNameDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Річні плани");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/regulators-plans/index");
    }

    @Step
    public boolean isOrganTypeItemDisplayed() {
        return actionsWithOurElements.isElementDisplayed(organTypeField);
    }

    @Step
    public void checkIsOrganTypeItemPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isOrganTypeItemDisplayed());
    }

    @Step
    public boolean isYearItemDisplayed() {
        return actionsWithOurElements.isElementDisplayed(year2021Item);
    }

    @Step
    public void checkIsYearItemPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isYearItemDisplayed());
    }

    @Step
    public boolean isDownloadBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadBtn);
    }

    @Step
    public void checkIsDownloadBtnPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isDownloadBtnDisplayed());
    }

    @Step
    public boolean isGoToNakazListAboutChangesLink() {
        return actionsWithOurElements.isElementDisplayed(goToNakazListAboutChangesLink);
    }

    @Step
    public void checkIsGoToNakazListAboutChangesLinkPresent() {
        Assert.assertTrue("OrganTypeItem is not displayed", isGoToNakazListAboutChangesLink());
    }

}
