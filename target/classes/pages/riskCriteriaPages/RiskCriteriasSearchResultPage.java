package pages.riskCriteriaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RiskCriteriasSearchResultPage extends ParentPage {

    public RiskCriteriasSearchResultPage (WebDriver webDriver) {
        super(webDriver, "/document/index?documentType=risk_criteria_document&CommonSearch%5Bparts.id%5D=&CommonSearch%5Bname%5D=Про+затвердження+критеріїв%2C+за+якими+оцінюється+ступінь+ризику+від+провадження+господарської+діяльності+у+сфері+промислової+безпеки&CommonSearch%5BdocumentType.id%5D=&CommonSearch%5Bpublisher.id%5D=&CommonSearch%5Bdate_acceptance%5D=&CommonSearch%5Bnumber%5D=&CommonSearch%5Bdocument.spheres.id%5D=&CommonSearch%5Bdocument.id_regulator%5D=61&CommonSearch%5Bid_status%5D=");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Критерії ризику')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@style='width:11%' and contains(text(),'Орган, що додав')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/document/view?id=1259427&documentType=risk_criteria_document']")
    private WebElement viewCardBtn;


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
        actionsWithOurElements.clickOnElement(viewCardBtn);
    }

}
