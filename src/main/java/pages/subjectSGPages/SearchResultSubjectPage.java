package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultSubjectPage extends ParentPage {

    public SearchResultSubjectPage(WebDriver webDriver) {
        super(webDriver, "/subject/index?SubjectSearch%5Bfull_name%5D=&SubjectSearch%5Bcode%5D=35081565&SubjectSearch%5Blocation%5D=&SubjectSearch%5Bstatus%5D=&regulatorId=262");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement menuSGBtn;

    @FindBy(xpath = ".//*[@id='w3']/table/tbody/tr/td[3]/a")
    private WebElement viewCardSGLink;

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
        Assert.assertEquals(webDriver.getTitle(), "Перелік суб'єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/index?SubjectSearch%5Bfull_name%5D=&SubjectSearch%5Bcode%5D=35081565&SubjectSearch%5Blocation%5D=&SubjectSearch%5Bstatus%5D=&regulatorId=205");
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
    public void clickOnMenuSGBtn() {
        actionsWithOurElements.clickOnElement(menuSGBtn);
    }

    @Step
    public void clickOnViewCardSGLink() {
        actionsWithOurElements.clickOnElement(viewCardSGLink);
    }

}
