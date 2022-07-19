package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewObjectsSubjectPage extends ParentPage {

    public ViewObjectsSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/objects?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//h3[contains(text(),'єкти')]")
    private WebElement objectsTitle;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement objectsTab;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/view/objects?subject_id=15076");
    }

    @Step
    public boolean objectsTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(objectsTitle);
    }

    @Step
    public void checkIsObjectsTitlePresent() {
        Assert.assertTrue("Objects Title is not displayed", objectsTitleIsDisplayed());
    }

    @Step
    public boolean objectsTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(objectsTab);
    }

    @Step
    public void checkIsObjectsTabPresent() {
        Assert.assertTrue("Objects Tab is not displayed", objectsTabIsDisplayed());
    }


}
