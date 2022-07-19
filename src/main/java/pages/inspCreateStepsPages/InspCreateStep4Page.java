package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep4Page extends ParentPage {

    public InspCreateStep4Page (WebDriver webDriver) {
        super(webDriver, "/inspection/update?id=2130727&step=document");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block']")
    private WebElement saveStepBtn;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public void clickOnSaveStepBtn() {
        actionsWithOurElements.clickOnElement(saveStepBtn);
    }


}
