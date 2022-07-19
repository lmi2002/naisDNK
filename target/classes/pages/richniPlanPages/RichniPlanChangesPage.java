package pages.richniPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RichniPlanChangesPage extends ParentPage {

    public RichniPlanChangesPage (WebDriver webDriver) {
        super(webDriver, "/plan-change/index?plan_project_id=622");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[(text()) and contains(text(),'Річний план (.xls, .xlsx)')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[contains(text(),'1')]")
    private WebElement gridListNumberElement;

    @FindBy(xpath = ".//*[@id='w0']/table/tbody")
    private WebElement saveNakaz_1_lineBtn;

    @FindBy(xpath = ".//tr[2]//td[5]//a[contains(text(),'Зберегти')]")
    private WebElement saveNakaz_2_lineBtn;


    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public boolean isGridListNumberElementDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListNumberElement);
    }

    @Step
    public void checkIsGridListNumberElementPresent() {
        Assert.assertTrue("Grid List Number Element is not displayed", isGridListNumberElementDisplayed());
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
        Assert.assertEquals(webDriver.getTitle(), "Зміни річного плану");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/plan-change/index?plan_project_id=622");
    }

    @Step
    public boolean isSaveNakaz_1_lineBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz_1_lineBtn);
    }

    @Step
    public void checkIsSaveNakaz_1_lineBtnPresent() {
        Assert.assertTrue("SaveNakaz_1_lineBtn is not displayed", isSaveNakaz_1_lineBtnDisplayed());
    }

    @Step
    public boolean isSaveNakaz_2_lineBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveNakaz_2_lineBtn);
    }

    @Step
    public void checkIsSaveNakaz_2_lineBtnPresent() {
        Assert.assertTrue("SaveNakaz_2_lineBtn is not displayed", isSaveNakaz_2_lineBtnDisplayed());
    }
}
