package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep5SanctionsPage extends ParentPage {


    public InspCreateStep5SanctionsPage(WebDriver webDriver) {
        super(webDriver, "/inspection/update?id=2130727&step=sanction");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//span[@id='select2-annualinspection-has_sanctions-container']")
    private WebElement sanctionsField;

    @FindBy(xpath = ".//li[@class='select2-results__option']")
    private WebElement sanctionItem;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block']")
    private WebElement saveStepBtn;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=before_beginning']")
    private WebElement step2Link;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=results']")
    private WebElement step3Link;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=document']")
    private WebElement step4Link;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public void clickOnSanctionsField() {
        actionsWithOurElements.clickOnElement(sanctionsField);
    }

    @Step
    public void clickOnSanctionItem() {
        actionsWithOurElements.clickOnElement(sanctionItem);
    }

    @Step
    public void clickOnSaveStepBtn() {
        actionsWithOurElements.clickOnElement(saveStepBtn);
    }

    @Step
    public void clickOnStep2Link() {
        actionsWithOurElements.clickOnElement(step2Link);
    }

    @Step
    public void clickOnStep3Link() {
        actionsWithOurElements.clickOnElement(step3Link);
    }

    @Step
    public void clickOnStep4Link() {
        actionsWithOurElements.clickOnElement(step4Link);
    }

}

