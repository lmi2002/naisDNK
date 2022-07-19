package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateDocumentPage extends ParentPage {

    public CreateDocumentPage(WebDriver webDriver) {
        super(webDriver, "/document/create?documentType=npa");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'НПА: Додавання')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-sm-4 col-md-3']")
    private WebElement infoBlockMenu;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement selectActBox;

    @FindBy(xpath = ".//li[contains(text(),'Додати інший нормативний акт')]")
    private WebElement addAnotherActLink;

    @FindBy(xpath = ".//input[@aria-controls='select2-search-document-base-results']")
    private WebElement enterDocName;

    @FindBy(xpath = ".//div/div/div[1]/div/div/div[2]/span/span[1]/span/span[2]")
    private WebElement npaLink;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean infoBlockMenuIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlockMenu);
    }

    @Step
    public boolean selectActBoxIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(selectActBox);
    }

    @Step
    public void enterDocNameInToSearchField(String docName) {
        actionsWithOurElements.enterTextInInput(enterDocName, docName);
    }

    @Step
    public void clickOnAddAnotherActLink() {
        actionsWithOurElements.clickOnElement(addAnotherActLink);
    }

    @Step
    public void clickOnNPALink() {
        actionsWithOurElements.clickOnElement(npaLink);
    }

}
