package pages.spivrobitnykyOrganuPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ActualZayavkiSOPage extends ParentPage {

    public ActualZayavkiSOPage(WebDriver webDriver) {
        super(webDriver, "/user/index?tab=actual&sub=0");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='pib' and contains(text(),'ПІБ')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-md-6']")
    private WebElement statisticBlock;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Підтверджені співробітники')]")
    private WebElement approvedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Відхилені співробітники')]")
    private WebElement unapprovedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link active' and contains(text(),'Актуальні заявки')]")
    private WebElement actualRequestsLink;

    @FindBy(xpath = ".//button[@value='load_users']")
    private WebElement saveFileBtn;

    @FindBy(xpath = ".//button[@type='button' and contains(text(),'Підтвердити')]")
    private WebElement approvedEmployeeBtn;

    @FindBy(xpath = ".//button[@type='button' and contains(text(),'Відхилити')]")
    private WebElement unapprovedEmployeeBtn;

    @FindBy(xpath = ".//a[@class='btn btn_link' and contains(text(),'Ре')]")
    private WebElement editEmployeeBtn;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public boolean statisticBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(statisticBlock);
    }

    @Step
    public boolean approvedEmployeesLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approvedEmployeesLink);
    }

    @Step
    public boolean unapprovedEmployeesLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(unapprovedEmployeesLink);
    }

    @Step
    public boolean actualRequestsLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(actualRequestsLink);
    }

    @Step
    public boolean saveFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveFileBtn);
    }

    @Step
    public boolean approvedEmployeeBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approvedEmployeeBtn);
    }

    @Step
    public boolean unapprovedEmployeeBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(unapprovedEmployeeBtn);
    }

    @Step
    public boolean editEmployeeBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(editEmployeeBtn);
    }

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
        Assert.assertEquals(webDriver.getTitle(), "Співробітники органів");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/user/index?tab=actual&sub=0");
    }

}



