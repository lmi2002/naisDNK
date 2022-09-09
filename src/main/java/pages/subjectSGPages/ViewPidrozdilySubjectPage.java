package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewPidrozdilySubjectPage extends ParentPage {

    public ViewPidrozdilySubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/branches?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//h3[contains(text(),'Відокремлені підрозділи')]")
    private WebElement vidokremleniPidroxdilyTitle;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement vidokremleniPidroxdilyTab;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/view/branches?subject_id=15076");
    }

    @Step
    public boolean vidokremleniPidroxdilyTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(vidokremleniPidroxdilyTitle);
    }

    @Step
    public void checkIsVidokremleniPidroxdilyTitlePresent() {
        Assert.assertTrue("Vidokremleni Pidroxdily Title is not displayed", vidokremleniPidroxdilyTitleIsDisplayed());
    }


    @Step
    public boolean vidokremleniPidroxdilyTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(vidokremleniPidroxdilyTab);
    }

    @Step
    public void checkIsVidokremleniPidroxdilyTabPresent() {
        Assert.assertTrue("Vidokremleni Pidroxdily Tab is not displayed", vidokremleniPidroxdilyTabIsDisplayed());
    }

}
