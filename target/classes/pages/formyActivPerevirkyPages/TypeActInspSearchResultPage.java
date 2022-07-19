package pages.formyActivPerevirkyPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class TypeActInspSearchResultPage extends ParentPage {

    public TypeActInspSearchResultPage(WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=act_inspection_document&CommonSearch%5Bparts.id%5D=&CommonSearch%5Bname%5D=Про+затвердження+Положення+про+організацію+та+здійснення+державного+гірничого+нагляду%2C&CommonSearch%5BdocumentType.id%5D=&CommonSearch%5Bpublisher.id%5D=&CommonSearch%5Bdate_acceptance%5D=&CommonSearch%5Bnumber%5D=&CommonSearch%5Bdocument.spheres.id%5D=&CommonSearch%5Bdocument.id_regulator%5D=61&CommonSearch%5Bid_status%5D=");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Форми актів перевірки')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@style='width:11%' and contains(text(),'Орган, що додав')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-3')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-2')]")
    private WebElement gridSearchListElements;

    @FindBy(xpath = ".//a[@class='table_action_btn icon-details']")
    //private WebElement viewCardBtn;
    private List<WebElement> viewCardBtn;


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
    public void clickOnViewCardBtn() {
        actionsWithOurElements.clickOnElement(viewCardBtn.get(2));
    }

    @Step
    public boolean gridSearchListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridSearchListElements);
    }

}
