package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ProjectRichnogoPlanuPage extends ParentPage {

    public ProjectRichnogoPlanuPage(WebDriver webDriver) {
        super(webDriver, "/regulators-plans/view?planning_period_id=6&regulator_id=39");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'Найменування суб’єкта господарювання')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@value='load_plan_inspection']")
    private WebElement downloadBtn;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }


    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
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
        Assert.assertEquals(webDriver.getTitle(), "Проект річного плану: Державна служба України з надзвичайних ситуацій");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/regulators-plans/view?planning_period_id=6&regulator_id=39");
    }

    @Step
    public boolean isDownloadBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadBtn);
    }

    @Step
    public void checkIsDownloadBtnPresent() {
        Assert.assertTrue("Download Btn is not displayed", isDownloadBtnDisplayed());
    }

}
