package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewZvernennyaSubjectPage extends ParentPage {

    public ViewZvernennyaSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/appeal?subject_id=15076");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'ПРУЖИННИЙ ЦЕНТР УКРАЇНА')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//h3[contains(text(),'Звернення')]")
    private WebElement zvernennyaTitle;

    @FindBy(xpath = ".//div[@class='table-responsive']")
    private WebElement zvernennyaTab;

    @FindBy(xpath = ".//a[@class='btn btn-blue']")
    private WebElement addBtn;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean zvernennyaTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(zvernennyaTitle);
    }

    @Step
    public boolean zvernennyaTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(zvernennyaTab);
    }

    @Step
    public boolean addBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addBtn);
    }

}
