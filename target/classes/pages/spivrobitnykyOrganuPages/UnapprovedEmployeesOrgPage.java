package pages.spivrobitnykyOrganuPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class UnapprovedEmployeesOrgPage extends ParentPage {

    public UnapprovedEmployeesOrgPage (WebDriver webDriver) {
        super(webDriver, "/user/index?tab=declined&sub=0");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[@width='13%' and contains(text(),'ПІБ з перевірки')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-md-6']")
    private WebElement statisticBlock;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'Підтверджені співробітники')]")
    private WebElement approvedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link active' and contains(text(),'Відхилені співробітники')]")
    private WebElement unapprovedEmployeesLink;

    @FindBy(xpath = ".//a[@class='nav-link 'and contains(text(),'Актуальні заявки')]")
    private WebElement actualZayavkiLink;

    @FindBy(xpath = ".//button[@value='load_users']")
    private WebElement saveFileBtn;

    @FindBy(xpath = ".//*[@id='w1']/table/tbody/tr[1]/td[8]/div/button")
    private WebElement approvedEmployeeBtn;

    @FindBy(xpath = ".//button[@class='close_modal icon-cancel']")
    private WebElement closeModalWindBtn;

    @FindBy(xpath = ".//a[@href='/user/view?id=7966' and contains(text(),'ко Оль')]")
    private WebElement employeePIB;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement successModalBtn;

    @FindBy(xpath = ".//input[@name='UserSearch[pib]']")
    private WebElement searchPIBField;

    @FindBy(xpath = ".//a[contains(text(),'kadastr_petrenko@ukr.net')]")
    private WebElement employee_Petrenko_PIB;


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
    public boolean approvedEmployeeBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(approvedEmployeeBtn);
    }

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void clickOnCloseModalWindBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindBtn);
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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/user/index?tab=declined&sub=0");
    }

    @Step
    public boolean isEmployeePIBDisplayed() {
        return actionsWithOurElements.isElementDisplayed(employeePIB);
    }

    @Step
    public void checkIsEmployeePIBPresent() {
        Assert.assertTrue("Employee`s PIB is not displayed", isEmployeePIBDisplayed());
    }

    @Step
    public void clickOnApprovedEmployeeBtn() {
        actionsWithOurElements.clickOnElement(approvedEmployeeBtn);
    }

    @Step
    public void clickOnSuccessModalBtn() {
        actionsWithOurElements.clickOnElement(successModalBtn);
    }

    @Step
    public void clickOnActualZayavkiLink() {
        actionsWithOurElements.clickOnElement(actualZayavkiLink);
    }

    @Step
    public void enterPIBInToSearchField(String pib) {
        actionsWithOurElements.enterTextInInput(searchPIBField, pib);
    }


    @Step
    public boolean isEmployeePIB_Petrenko_Displayed() {
        return actionsWithOurElements.isElementDisplayed(employee_Petrenko_PIB);
    }

    @Step
    public void checkIsEmployeePIB_Petrenko_Present() {
        Assert.assertTrue("Employee`s PIB is not displayed", isEmployeePIB_Petrenko_Displayed());
    }
}
