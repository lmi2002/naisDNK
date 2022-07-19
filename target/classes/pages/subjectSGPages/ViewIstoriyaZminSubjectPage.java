package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewIstoriyaZminSubjectPage extends ParentPage {

    public ViewIstoriyaZminSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/history?subject_id=15076");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[contains(text(),'Відображено змін:')]")
    private WebElement istoriyaZminTitle;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement istoriyaZminTab;

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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject/view/history?subject_id=15076");
    }

    @Step
    public boolean istoriyaZminTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(istoriyaZminTitle);
    }

    @Step
    public void checkIsIstoriyaZminTitlePresent() {
        Assert.assertTrue("Istoriya Zmin Title is not displayed", istoriyaZminTitleIsDisplayed());
    }

    @Step
    public boolean istoriyaZminTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(istoriyaZminTab);
    }


    @Step
    public void checkIsIstoriyaZminTabPresent() {
        Assert.assertTrue("Istoriya Zmin Tab is not displayed", istoriyaZminTabIsDisplayed());
    }

}
