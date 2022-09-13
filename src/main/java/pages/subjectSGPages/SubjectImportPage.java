package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SubjectImportPage extends ParentPage {

    public SubjectImportPage(WebDriver webDriver) {
        super(webDriver, "/subject-import/import?type=1");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span[2]/ul/li[1]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//span[@id='select2-w1-container']")
    private WebElement regulatorField;

    @FindBy(xpath = ".//li[@class='user_nav_box']//h3[@class='user_nav_title' and contains(text(),'Планування')]")
    private WebElement planuvanniaBlock;

    @FindBy(xpath = ".//li[@class='user_nav_box']//h3[@class='user_nav_title' and contains(text(),'Позапланові заходи')]")
    private WebElement pozaplanZahodyBlock;

    @FindBy(xpath = ".//li[@class='user_nav_box']//h3[@class='user_nav_title' and contains(text(),'Суб')]")
    private WebElement subjectBlock;

    @FindBy(xpath = ".//li[@class='user_nav_box']//h3[@class='user_nav_title' and contains(text(),'Адміністрування')]")
    private WebElement administruvanniaBlock;

    @FindBy(xpath = ".//form[@id='upload-form']")
    private WebElement uploadForm;

    @Step
    public boolean sphereFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereField);
    }

    @Step
    public void checkIsSphereFieldPresent() {
        Assert.assertTrue("Sphere Field is not displayed", sphereFieldIsDisplayed());
    }

    @Step
    public boolean regulatorFieldIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(regulatorField);
    }

    @Step
    public void checkIsRegulatorFieldPresent() {
        Assert.assertTrue("Regulator Field is not displayed", regulatorFieldIsDisplayed());
    }

    @Step
    public boolean planuvanniaBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(planuvanniaBlock);
    }

    @Step
    public void checkIsPlanuvanniaBlockPresent() {
        Assert.assertTrue("Planuvannia Block is not displayed", planuvanniaBlockIsDisplayed());
    }

    @Step
    public boolean pozaplanZahodyBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pozaplanZahodyBlock);
    }

    @Step
    public void checkIsPozaplanZahodyBlockPresent() {
        Assert.assertTrue("Pozaplan Zahody Block is not displayed", pozaplanZahodyBlockIsDisplayed());
    }

    @Step
    public boolean subjectBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(subjectBlock);
    }

    @Step
    public void checkIsSubjectBlockPresent() {
        Assert.assertTrue("Subject Block is not displayed", subjectBlockIsDisplayed());
    }

    @Step
    public boolean administruvanniaBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(administruvanniaBlock);
    }

    @Step
    public void checkIsAdministruvanniaBlockPresent() {
        Assert.assertTrue("Administruvannia Block is not displayed", administruvanniaBlockIsDisplayed());
    }

    @Step
    public boolean uploadFormIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(uploadForm);
    }

    @Step
    public void checkIsUploadFormPresent() {
        Assert.assertTrue("Upload Form is not displayed", uploadFormIsDisplayed());
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
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Імпортування суб'єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject-import/import?type=1");
    }

}