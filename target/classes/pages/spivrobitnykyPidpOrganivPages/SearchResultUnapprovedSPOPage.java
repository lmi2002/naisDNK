package pages.spivrobitnykyPidpOrganivPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultUnapprovedSPOPage extends ParentPage {

    public SearchResultUnapprovedSPOPage(WebDriver webDriver) {
        super(webDriver, "/user/index?UserSearch%5Bpib%5D=Синельник+Ірина+Анатоліївна&UserSearch%5Bemail%5D=&UserSearch%5Bsphere_id%5D=&UserSearch%5Bcreated_at%5D=&UserSearch%5BregulatorName%5D=&UserSearch%5BedsRegulatorName%5D=&tab=declined&sub=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='pib' and contains(text(),'ПІБ')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-md-6']")
    private WebElement statisticBlock;

    @FindBy(xpath = ".//a[@class='nav-link active ' and contains(text(),'Підтверджені співробітники')]")
    private WebElement approvedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Відхилені співробітники')]")
    private WebElement unapprovedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Актуальні заявки')]")
    private WebElement actualRequestsLink;

    @FindBy(xpath = ".//button[@value='load_users']")
    private WebElement saveFileBtn;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr/td[8]/div[1]/button")
    private WebElement unapprovedZayavkaBtn;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[8]/div[3]/a")
    private WebElement editZayavkaBtn;

    @FindBy(xpath = ".//input[@name='UserSearch[pib]']")
    private WebElement searchPIBField;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmModalBtn;

    @FindBy(xpath = ".//a[@href='/user/view?id=7409' and contains(text(),'Ірина Ана')]")
    private WebElement employeePIB;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[8]/div/button")
    private WebElement approvedEmployeeBtn;

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
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Співробітники підпорядкованих органів");
    }

    @Step
    public boolean approvedEmployeeBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approvedEmployeeBtn);
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/user/index?UserSearch%5Bpib%5D=Синельник+Ірина+Анатоліївна&UserSearch%5Bemail%5D=&UserSearch%5Bsphere_id%5D=&UserSearch%5Bcreated_at%5D=&UserSearch%5BregulatorName%5D=&UserSearch%5BedsRegulatorName%5D=&tab=declined&sub=1");
    }

    @Step
    public boolean isEmployeePIBDisplayed() {
        return actionsWithOurElements.isElementDisplayed(employeePIB);
    }

    @Step
    public void checkIsEmployeePIBPresent() {
        Assert.assertTrue("Employee`s PIB is not displayed", isEmployeePIBDisplayed());
    }

}
