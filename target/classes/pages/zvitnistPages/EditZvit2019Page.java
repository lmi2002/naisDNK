package pages.zvitnistPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EditZvit2019Page extends ParentPage {

    public EditZvit2019Page (WebDriver webDriver) {

        super(webDriver, "/report/edit?year=2019");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Сфера')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[contains(text(),'Зберегти')]")
    private WebElement saveBtn;

    @FindBy(xpath = ".//a[@class='back_link']")
    private WebElement backToZvitListLink;

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
        Assert.assertEquals(webDriver.getTitle(), "Редагування звіту");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/report/edit?year=2019");
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public void checkIsSaveBtnPresent() {
        Assert.assertTrue("Save Btn is not displayed", saveBtnIsDisplayed());
    }

    @Step
    public boolean backToZvitListLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToZvitListLink);
    }

    @Step
    public void checkIsBackToZvitListLinkPresent() {
        Assert.assertTrue("Back To Zvit List Link is not displayed", backToZvitListLinkIsDisplayed());
    }

}
