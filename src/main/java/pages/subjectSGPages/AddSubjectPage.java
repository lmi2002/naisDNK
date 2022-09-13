package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AddSubjectPage extends ParentPage {

    public AddSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/subject/add?tab=main&sphereId=136&regulatorId=262&planningPeriodId=6");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//h2[@class='add_sub_title']")
    private WebElement subTitle;

    @FindBy(xpath = ".//input[@id='edrpou-input']")
    private WebElement inputEdrpouCode;

    @FindBy(xpath = ".//button[@data-search-btn='edrpou']")
    private WebElement edrpouSearchBtn;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-block' and contains(text(),'Зберегти дані про суб’єкт господарювання')]")
    private WebElement saveSubjectBtn;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-subject-sphere_id-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[4]")
    private WebElement sphereItem_autoTransp;

    @FindBy(xpath = ".//*[@id='w0']/div[4]/span/span[1]/span")
    private WebElement riskField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[3]")
    private WebElement riskItem;

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
        Assert.assertEquals(webDriver.getTitle(), "Додавання суб'єкта господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/subject/add?tab=main&sphereId=93&regulatorId=205&planningPeriodId=6");
    }

    @Step
    public boolean subTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subTitle);
    }

    @Step
    public void checkIsSubTitlePresent() {
        Assert.assertTrue("Sub Title is not displayed", subTitleIsDisplayed());
    }

    @Step
    public void inputEdrpouCodeInToInputField(String edrpouCode) {
        actionsWithOurElements.enterTextInInput(inputEdrpouCode, edrpouCode);
    }

    @Step
    public void clickOnEdrpouSearchBtn() {
        actionsWithOurElements.clickOnElement(edrpouSearchBtn);
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
    public void clickOnSphereItem_AutoTransp() {
        actionsWithOurElements.clickOnElement(sphereItem_autoTransp);
    }

    @Step
    public void clickOnSaveSubjectBtn() {
        actionsWithOurElements.clickOnElement(saveSubjectBtn);
    }

    @Step
    public void clickOnRiskField() {
        actionsWithOurElements.clickOnElement(riskField);
    }

    @Step
    public void clickOnRiskItem() {
        actionsWithOurElements.clickOnElement(riskItem);
    }

}
