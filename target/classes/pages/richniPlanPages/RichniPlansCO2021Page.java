package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichniPlansCO2021Page extends ParentPage {

    public RichniPlansCO2021Page(WebDriver webDriver) {
        super(webDriver, "/regulators-plans/index?tab=tab_central_regulators_plans_2021");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w2-container' and contains(text(),'За 2021 рік')]")
    private WebElement yearField;

    @FindBy(xpath = ".//span[@class='select2-selection__rendered' and contains(text(),'Центральні органи')]")
    private WebElement organTypeField;

    @FindBy(xpath = ".//a[@data-sort='is_approved' and contains(text(),'Формування проекту річного плану')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//tr[1]//td[7]//a[@class='btn btn-primary' and contains(text(),'Скачати')]")
    private WebElement downloadBtn;

    @FindBy(xpath = ".//tr[1]//td[8]//a[contains(text(),'Перейти')]")
    private WebElement goToLink;

    @FindBy(xpath = ".//a[(text()) and contains(text(),'Державна служба України з надзвичайних ситуацій')]")
    private WebElement goToRegulatorsPageLink;

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
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Річні плани");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/regulators-plans/index?tab=tab_central_regulators_plans_2021");
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
        return actionsWithOurElements.isElementDisplayed(yearField);
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
        Assert.assertTrue("Download Btn is not displayed", isDownloadBtnDisplayed());
    }

    @Step
    public boolean isGoToLinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(goToLink);
    }

    @Step
    public void checkIsGoToLinkPresent() {
        Assert.assertTrue("GoToLink is not displayed", isGoToLinkDisplayed());
    }

    @Step
    public void clickOnGoToRegulatorsPageLink() {
        actionsWithOurElements.clickOnElement(goToRegulatorsPageLink);
    }
}

