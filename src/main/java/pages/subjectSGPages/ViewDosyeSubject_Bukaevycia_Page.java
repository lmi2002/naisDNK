package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewDosyeSubject_Bukaevycia_Page extends ParentPage {

    public ViewDosyeSubject_Bukaevycia_Page(WebDriver webDriver) {
        super(webDriver, "/subject/view/about?subject_id=63563");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//td[contains(text(),'12')]")
    private WebElement ballOfLastChanges_12;

    @FindBy(xpath = ".//td[contains(text(),'22')]")
    private WebElement ballOfLastChanges_22;


    @FindBy(xpath = ".//td[contains(text(),'80')]")
    private WebElement ballOfLastChanges_80;

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
        Assert.assertEquals(webDriver.getTitle(), "ТОВАРИСТВО З ОБМЕЖЕНОЮ ВІДПОВІДАЛЬНІСТЮ \"БУКАЄВИЦЯ\"ЛТД");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/view/about?subject_id=63563");
    }

    @Step
    public boolean checkIs_ball_12_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(ballOfLastChanges_12);

        if (dateOfLastInspection.equals("12")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public boolean checkIs_ball_22_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(ballOfLastChanges_22);

        if (dateOfLastInspection.equals("22")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public boolean checkIs_ball_80_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(ballOfLastChanges_80);

        if (dateOfLastInspection.equals("80")) {
            return false;
        } else {
            return true;
        }
    }

}
