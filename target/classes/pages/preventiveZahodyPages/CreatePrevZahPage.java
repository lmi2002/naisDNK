package pages.preventiveZahodyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreatePrevZahPage extends ParentPage {

    public CreatePrevZahPage(WebDriver webDriver) {
        super(webDriver, "/preventive-measure/create?id=34570");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@class='btn btn-blue' and contains(text(),'Додати суб')]")
    private WebElement addSGBtn;

    @FindBy(xpath = ".//span[@class='btn btn-blue' and contains(text(),'Додати інспектора')]")
    private WebElement addInspectorBtn;

    @FindBy(xpath = ".//button[@type='submit' and contains(text(),'Зберегти')]")
    private WebElement savePrevZahBtn;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(),'Загальна інформація про суб')]")
    private WebElement allInfoBlock;

    @FindBy(xpath = ".//div[@class='ei-body-block']//h3[@class='inspection_title' and contains(text(),'Результати заходу')]")
    private WebElement resultsZahBlock;

    @FindBy(xpath = ".//span[@id='select2-preventivemeasuresubject-original_subject_id-container']")
    private WebElement selectSGModalField;

    @FindBy(xpath = ".//input[@aria-controls='select2-preventivemeasuresubject-original_subject_id-results']")
    private WebElement inputSGModalField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement sgModalItem;

    @FindBy(xpath = ".//button[@id='subject-submit-btn']")
    private WebElement addSGModalBtn;

    @FindBy(xpath = ".//input[@class='select2-search__field' and @placeholder='Виберіть сфери ...']")
    private WebElement selectSphereField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//input[@class='select2-search__field' and @placeholder='Виберіть види діяльності ...']")
    private WebElement selectVidDiyalnostiField;

    @FindBy(xpath = ".//li[@id='select2-preventivemeasureform-activitytypesmultiple-result-yet7-31']")
    private WebElement vidDiyalnostiItem;

    @FindBy(xpath = ".//span[@id='select2-inspector-id-container']")
    private WebElement selectInspectorModalField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(), 'Базильський Василь Петрович')]")
    private WebElement inspectorModalItem;

    @FindBy(xpath = ".//button[@type='submit' and contains(text(),'Додати')]")
    private WebElement addInspectorModalBtn;

    @FindBy(xpath = ".//input[@id='preventivemeasureform-measure_time']")
    private WebElement datePrevZahField;

    @FindBy(xpath = ".//td[@class='day' and contains(text(),'30')]")
    private WebElement datePrevZahItem;

    @FindBy(xpath = ".//*[@id='results_info']/div/div[2]/div[3]/div/span/span[1]/span/span[2]")
    private WebElement typePrevZahField;

    @FindBy(xpath = ".//li[@class='select2-results__option' and contains(text(),'Cемінар')]")
    private WebElement typePrevZahItem;

    @FindBy(xpath = ".//input[@id='preventivemeasuretopreventivemeasuresubject-32774-employees_involved']")
    private WebElement ohoplenoField;

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
        Assert.assertEquals(webDriver.getTitle(), "Створити превентивний захід");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/preventive-measure/create?id=34570");
    }

    @Step
    public boolean addSGBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addSGBtn);
    }

    @Step
    public void checkIsAddSGBtnPresent() {
        Assert.assertTrue("Add SG Btn is not displayed", addSGBtnIsDisplayed());
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
    public boolean savePrevZahBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(savePrevZahBtn);
    }

    @Step
    public void checkIsSavePrevZahBtnPresent() {
        Assert.assertTrue("Save Prev Zah Btn is not displayed", savePrevZahBtnIsDisplayed());
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
    public boolean resultsZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resultsZahBlock);
    }

    @Step
    public void checkIsResultsZahBlockIPresent() {
        Assert.assertTrue("Results Zah BlockI is not displayed", resultsZahBlockIsDisplayed());
    }

    @Step
    public void clickOnSavePrevZahBtn() {
        actionsWithOurElements.clickOnElement(savePrevZahBtn);
    }

}
