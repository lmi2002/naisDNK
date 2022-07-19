package pages.spivrobitnykyPidpOrganivPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ApprovedEmployeesPidpOrgPage extends ParentPage {

    public ApprovedEmployeesPidpOrgPage (WebDriver webDriver) {
        super(webDriver, "/user/index?tab=approved&sub=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='pib' and contains(text(),'ПІБ')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-md-6']")
    private WebElement statisticBlock;

    @FindBy(xpath = ".//a[contains(text(),'Підтверджені співробітники')]")
    private WebElement approvedEmployeesLink;

    @FindBy(xpath = ".//a[contains(text(),'Відхилені співробітники')]")
    private WebElement unapprovedEmployeesLink;

    @FindBy(xpath = ".//a[contains(text(),'Актуальні заявки')]")
    private WebElement actualZayavkiLink;

    @FindBy(xpath = ".//button[@value='load_users']")
    private WebElement saveFileBtn;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[8]/div[2]/button")
    private WebElement unapprovedZayavkaBtn;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[8]/div[3]/a")
    private WebElement editZayavkaBtn;

    @FindBy(xpath = ".//input[@name='UserSearch[pib]']")
    private WebElement searchPIBField;

    @FindBy(xpath = ".//button[@class='close_modal icon-cancel']")
    private WebElement closeModalWindBtn;

    @FindBy(xpath = ".//a[@href='/user/view?id=7947' and contains(text(),'чук Інна')]")
    private WebElement employeePIB;


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
    public boolean actualZayavkiLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(actualZayavkiLink);
    }

    @Step
    public boolean saveFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveFileBtn);
    }

    @Step
    public boolean unapprovedZayavkaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(unapprovedZayavkaBtn);
    }

    @Step
    public void clickOnUnapprovedZayavkaBtn() {
        actionsWithOurElements.clickOnElement(unapprovedZayavkaBtn);
    }


    @Step
    public boolean editZayavkaBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(editZayavkaBtn);
    }

    @Step
    public void enterPIBInToSearchField(String pib) {
        actionsWithOurElements.enterTextInInput(searchPIBField, pib);
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
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/user/index?tab=approved&sub=1");
    }

    @Step
    public void clickOnCloseModalWindBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindBtn);
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
