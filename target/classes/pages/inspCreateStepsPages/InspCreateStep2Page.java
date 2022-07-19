package pages.inspCreateStepsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InspCreateStep2Page extends ParentPage {

    public InspCreateStep2Page (WebDriver webDriver) {
        super(webDriver, "/inspection/update?id=2130727&step=before_beginning");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Оновити дані про перевірку')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//*[@href='/inspection/update?id=2130727&step=before_beginning&sort=type' and contains(text(),'Тип документу')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//a[@class='btn btn-primary' and contains(text(),'Додати наказ і направлення')]")
    private WebElement addNakazBtn;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=common']")
    private WebElement step1Link;

    @FindBy(xpath = ".//a[@href='/inspection/update?id=2130727&step=results']")
    private WebElement step3Link;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void clickOnAddNakazBtn() {
        actionsWithOurElements.clickOnElement(addNakazBtn);
    }

    @Step
    public void clickOnStep1Link() {
        actionsWithOurElements.clickOnElement(step1Link);
    }

    @Step
    public void clickOnStep3Link() {
        actionsWithOurElements.clickOnElement(step3Link);
    }

}
