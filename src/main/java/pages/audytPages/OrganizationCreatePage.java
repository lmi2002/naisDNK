package pages.audytPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class OrganizationCreatePage extends ParentPage {

    public OrganizationCreatePage (WebDriver webDriver) {
        super(webDriver, "/audit/accredited-organizations/create?id=17");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@href='/audit/accredited-organizations' and contains(text(),'повернутися до списку організацій')]")
    private WebElement backToPrevPageList;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(), 'Загальна інформація про організацію')]")
    private WebElement allInfoBlock;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(), 'Документи акредитації організації')]")
    private WebElement accreditedOrgDocBlock;

    @FindBy(xpath = ".//input[@id='accreditedorganizationform-name']")
    private WebElement nameOfOrgField;

    @FindBy(xpath = ".//span[@class='select2-selection__placeholder']")
    private WebElement oblastField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement oblastItem;

    @FindBy(xpath = ".//input[@id='accreditedorganizationform-address']")
    private WebElement addressField;

    @FindBy(xpath = ".//input[@id='accreditedorganizationform-phone']")
    private WebElement telNumberField;

    @FindBy(xpath = ".//span[@class='btn btn-blue' and contains(text(),'Додати документ акредитації')]")
    private WebElement addAccreditDocBtn;

    @FindBy(xpath = ".//input[@id='accreditedorganizationcontractform-number']")
    private WebElement docNumberField;

    @FindBy(xpath = ".//input[@id='accreditedorganizationcontractform-date_start']")
    private WebElement dateStartField;

    @FindBy(xpath = ".//input[@id='accreditedorganizationcontractform-date_end']")
    private WebElement dateEndField;

    @FindBy(xpath = ".//span[@id='select2-accreditedorganizationcontractform-status-container']")
    private WebElement docStatusField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'Діє')]")
    private WebElement docStatusItem;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement sphereField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//button[@id='contract-submit-btn' and contains(text(),'Додати документ акредитації')]")
    private WebElement addAccreditDocModalBtn;

    @FindBy(xpath = ".//*[@id='accredited-organization-contract-gridview']/table/tbody/tr[2]/td[6]/a[2]")
    private WebElement deleteAccreditDocIcon;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement confirmDeleteActionModalBtn;

    @FindBy(xpath = ".//button[@type='submit' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;




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
        Assert.assertEquals(webDriver.getTitle(), "Додати організацію, акредитовану на проведення аудиту");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/audit/accredited-organizations/create?id=17");
    }

    @Step
    public boolean backToPrevPageListIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToPrevPageList);
    }

    @Step
    public boolean allInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInfoBlock);
    }

    @Step
    public void checkIsAllInfoBlockPresent() {
        Assert.assertTrue("AllInfoBlock is not displayed", isPageLogoDisplayed());
    }

    @Step
    public boolean accreditedOrgDocBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(accreditedOrgDocBlock);
    }

    @Step
    public void checkIsAccreditedOrgDocBlockPresent() {
        Assert.assertTrue("AccreditedOrgDocBlock is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void enterNameOfOrgInToInputField(String nameOfOrg) {
        actionsWithOurElements.enterTextInInput(nameOfOrgField, nameOfOrg);
    }

    @Step
    public void clickOnOblastField() {
        actionsWithOurElements.clickOnElement(oblastField);
    }

    @Step
    public void clickOnOblastItem() {
        actionsWithOurElements.clickOnElement(oblastItem);
    }

    @Step
    public void enterAddressOfOrgInToInputField(String addressOfOrg) {
        actionsWithOurElements.enterTextInInput(addressField, addressOfOrg);
    }

    @Step
    public void enterTelNumberOfOrgInToInputField(String TelNumberOfOrg) {
        actionsWithOurElements.enterTextInInput(telNumberField, TelNumberOfOrg);
    }

    @Step
    public void clickOnAddAccreditDocBtn() {
        actionsWithOurElements.clickOnElement(addAccreditDocBtn);
    }

    @Step
    public void enterDocNumberInToInputField(String docNumber) {
        actionsWithOurElements.enterTextInInput(docNumberField, docNumber);
    }

    @Step
    public void enterDateStartInToInputField(String dateStart) {
        actionsWithOurElements.enterTextInInput(dateStartField, dateStart);
    }

    @Step
    public void clickOnDocStatusField() {
        actionsWithOurElements.clickOnElement(docStatusField);
    }


    @Step
    public void clickOnDocStatusItem() {
        actionsWithOurElements.clickOnElement(docStatusItem);
    }

    @Step
    public void clickOnSphereField() {
        actionsWithOurElements.clickOnElement(sphereField);
    }


    @Step
    public void clickOnSphereItem() {
        actionsWithOurElements.clickOnElement(sphereItem);
    }

    @Step
    public void clickOnAddAccreditDocModalBtn() {
        actionsWithOurElements.clickOnElement(addAccreditDocModalBtn);
    }

    @Step
    public void clickOnDeleteAccreditDocIcon() {
        actionsWithOurElements.clickOnElement(deleteAccreditDocIcon);
    }

    @Step
    public void clickOnConfirmDeleteActionModalBtn() {
        actionsWithOurElements.clickOnElement(confirmDeleteActionModalBtn);
    }

    @Step
    public void clickOnSaveBtn() {
        actionsWithOurElements.clickOnElement(saveBtn);
    }

}



