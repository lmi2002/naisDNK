package pages.infoVisitsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateInfoVisitPage extends ParentPage {

    public CreateInfoVisitPage(WebDriver webDriver) {
        super(webDriver, "/inspection-info-visit/create?temp_key=b7e554db-2813-4eb4-b5b9-ec5e20fd56da&planning_period_id=4");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@class='btn btn-blue' and contains(text(),'Додати інспектора')]")
    private WebElement addInspectorBtn;

    @FindBy(xpath = ".//button[@type='submit' and contains(text(),'Створити')]")
    private WebElement createPrevZahBtn;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(),'Загальна інформація про суб')]")
    private WebElement allInfoBlockTitle;

    @FindBy(xpath = ".//*[@id='common_info']/div")
    private WebElement allInfoBlock;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(),'Показники ефективності заходу')]")
    private WebElement indicatorsInfoTitle;

    @FindBy(xpath = ".//*[@id='visit-form']/div[3]")
    private WebElement indicatorsInfoBlock;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(),'Результати заходу')]")
    private WebElement resultsZahTitle;

    @FindBy(xpath = ".//*[@id='results_info']/div")
    private WebElement resultsZahBlock;

    @FindBy(xpath = ".//span[@aria-labelledby='select2-inspectioninfovisit-sphere_id-container']")
    private WebElement selectSphereField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted' and contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//span[@id='select2-inspectioninfovisit-subject_id-container']")
    private WebElement selectSGField;

    @FindBy(xpath = ".//input[@aria-controls='select2-inspectioninfovisit-subject_id-results']")
    private WebElement inputSGField;

    @FindBy(xpath = ".//*[@id='select2-inspectioninfovisit-sls_activity_type_id-container']")
    private WebElement selectVidDiyalnostiField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement vidDiyalnostiItem;

    @FindBy(xpath = ".//span[@id='select2-inspector-id-container']")
    private WebElement selectInspectorModalField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(), 'Базильський Василь Петрович')]")
    private WebElement inspectorModalItem;

    @FindBy(xpath = ".//button[@type='submit' and contains(text(),'Додати')]")
    private WebElement addInspectorModalBtn;

    @FindBy(xpath = ".//input[@id='inspectioninfovisit-date']")
    private WebElement dateInfoVisitField;

    @FindBy(xpath = ".//td[@class='day' and contains(text(),'30')]")
    private WebElement dateInfoVisitItem;

    @FindBy(xpath = ".//*[@id='select2-inspectioninfovisit-status-container']")
    private WebElement stanInfoVisitField;

    @FindBy(xpath = ".//li[@class='select2-results__option']")  //не проведено
    private WebElement stanInfoVisitItem;

    @FindBy(xpath = ".//input[@name='InspectionInfoVisit[count_covered_workers]']")
    private WebElement ohoplenoWorkersField;

    @FindBy(xpath = ".//input[@name='InspectionInfoVisit[count_all_workers]']")
    private WebElement allWorkersField;

    @FindBy(xpath = ".//input[@name='InspectionInfoVisit[count_insured_workers]']")
    private WebElement zastrahovanoWorkersField;


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
        Assert.assertEquals(webDriver.getTitle(), "Створити інформаційне відвідування");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/inspection-info-visit/create?temp_key=b7e554db-2813-4eb4-b5b9-ec5e20fd56da&planning_period_id=4");
    }

    @Step
    public boolean addInspectorBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addInspectorBtn);
    }

    @Step
    public void checkIsAddInspectorBtnPresent() {
        Assert.assertTrue("Add Inspector Btn is not displayed", addInspectorBtnIsDisplayed());
    }

    @Step
    public boolean createPrevZahBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createPrevZahBtn);
    }

    @Step
    public void checkIsCreatePrevZahBtnPresent() {
        Assert.assertTrue("Create Prev Zah Btn is not displayed", createPrevZahBtnIsDisplayed());
    }

    @Step
    public boolean allInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInfoBlock);
    }

    @Step
    public void checkIsAllInfoBlockPresent() {
        Assert.assertTrue("All Info Block is not displayed", allInfoBlockIsDisplayed());
    }

    @Step
    public boolean allInfoBlockTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInfoBlockTitle);
    }

    @Step
    public void checkIsAllInfoBlockTitlePresent() {
        Assert.assertTrue("All Info Block Title is not displayed", allInfoBlockTitleIsDisplayed());
    }

    @Step
    public boolean resultsZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resultsZahBlock);
    }

    @Step
    public void checkIsResultsZahBlockPresent() {
        Assert.assertTrue("Results Zah Block is not displayed", resultsZahBlockIsDisplayed());
    }

    @Step
    public boolean resultsZahTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resultsZahTitle);
    }

    @Step
    public void checkIsResultsZahTitlePresent() {
        Assert.assertTrue("Results Zah Title is not displayed", resultsZahTitleIsDisplayed());
    }

    @Step
    public void clickOnSavePrevZahBtn() {
        actionsWithOurElements.clickOnElement(createPrevZahBtn);
    }

    @Step
    public boolean indicatorsInfoTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(indicatorsInfoTitle);
    }

    @Step
    public void checkIsIndicatorsInfoTitlePresent() {
        Assert.assertTrue("IndicatorsInfo Title is not displayed", indicatorsInfoTitleIsDisplayed());
    }

    @Step
    public boolean indicatorsInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(indicatorsInfoBlock);
    }

    @Step
    public void checkIsIndicatorsInfoBlockPresent() {
        Assert.assertTrue("IndicatorsInfo Block is not displayed", indicatorsInfoBlockIsDisplayed());
    }

   }
