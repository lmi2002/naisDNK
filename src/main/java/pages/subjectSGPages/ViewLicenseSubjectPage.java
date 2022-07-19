package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewLicenseSubjectPage extends ParentPage {

    public ViewLicenseSubjectPage(WebDriver webDriver) {
        super(webDriver, "/subject/view/licensing?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//div[contains(text(),'Дані про ліцензування відсутні')]")
    private WebElement licenseTitle;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/view/licensing?subject_id=15076");
    }

    @Step
    public boolean licenseTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(licenseTitle);
    }

    @Step
    public void checkIsLicenseTitlePresent() {
        Assert.assertTrue("License Title is not displayed", licenseTitleIsDisplayed());
    }

}
