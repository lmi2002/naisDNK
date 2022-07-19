package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultPage extends ParentPage {


    public SearchResultPage (WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=npa&NPADocumentBaseSearch%5Bname%5D=Про+заходи+щодо+стимулювання+зовнішньоекономічної+діяльності&NPADocumentBaseSearch%5BdocumentType.id%5D=&NPADocumentBaseSearch%5Bpublisher.id%5D=&NPADocumentBaseSearch%5Bdate_acceptance%5D=&NPADocumentBaseSearch%5Bnumber%5D=&NPADocumentBaseSearch%5Bdocument.spheres.id%5D=&NPADocumentBaseSearch%5Bparts.id%5D=&NPADocumentBaseSearch%5Bdocument.id_regulator%5D=61&NPADocumentBaseSearch%5Bid_status%5D=");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Законодавство')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'НПА')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//span[@class='table_action_btn icon-garbage remove-item']")
    private WebElement deleteBtn;

    @FindBy(xpath = ".//a[@class='table_action_btn icon-pencil']")
    private WebElement updateBtn;

    @FindBy(xpath = ".//h4[(text()) and contains(text(),'Ви дійсно хочете видалити доданий документ?')]")
    private WebElement modalWindowText;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmDeleteBtn;

    @FindBy(xpath = ".//div[@class='empty']")
    private WebElement elementWasDeleted;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOnDeleteBtn() {
        actionsWithOurElements.clickOnElement(deleteBtn);
    }

    @Step
    public void clickOnUpdateBtn() {
        actionsWithOurElements.clickOnElement(updateBtn);
    }

    @Step
    public boolean modalWindowTextIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(modalWindowText);
    }

    @Step
    public void clickOnConfirmDeleteBtn() {
        actionsWithOurElements.clickOnElement(confirmDeleteBtn);
    }

    @Step
    public boolean checkThatElementWasDeleted() {
        return actionsWithOurElements.isElementDisplayed(elementWasDeleted);
    }

}
