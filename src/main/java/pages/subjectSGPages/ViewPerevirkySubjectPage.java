package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewPerevirkySubjectPage extends ParentPage {

    public ViewPerevirkySubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/inspections?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[contains(text(),'Перевірки 2020')]")
    private WebElement perevirkyTitle;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement perevirkyTab;

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
        Assert.assertEquals(webDriver.getTitle(), "\"РЕНТАЛ ГРУП\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/view/inspections?subject_id=15076");
    }

    @Step
    public boolean perevirkyTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(perevirkyTitle);
    }

    @Step
    public void checkIsPerevirkyTitlePresent() {
        Assert.assertTrue("Perevirky Title is not displayed", perevirkyTitleIsDisplayed());
    }

    @Step
    public boolean perevirkyTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(perevirkyTab);
    }

    @Step
    public void checkIsPerevirkyTabPresent() {
        Assert.assertTrue("Perevirky Tab is not displayed", perevirkyTabIsDisplayed());

    }
}
