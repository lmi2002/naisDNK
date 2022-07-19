package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SubjectImport_Sphere_SelectedPage extends ParentPage {

    public SubjectImport_Sphere_SelectedPage(WebDriver webDriver) {
        super(webDriver, "/subject-import/import?type=1&regulator_id=262&sphere_id=136");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//span[@id='select2-w0-container']")
    private WebElement sphereField;

    @FindBy(xpath = ".//span[@id='select2-w1-container']")
    private WebElement regulatorField;

    @FindBy(xpath = ".//*[@id='select2-w2-container']")
    private WebElement yearField;

    @FindBy(xpath = ".//span/span/span[2]/ul/li[6]")
    private WebElement yearItem;

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

    @FindBy(xpath = ".//*[@id='upload-form']/div[2]/div/a")
    private WebElement downloadShablonLink;

    @FindBy(xpath = ".//label[@class='btn btn-primary btn-sm']")
    private WebElement addFileBtn;

    @FindBy(xpath = ".//input[@type='file']")
    private WebElement fileInput;


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
    public boolean uploadFormIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(uploadForm);
    }

    @Step
    public void checkIsUploadFormPresent() {
        Assert.assertTrue("Upload Form is not displayed", uploadFormIsDisplayed());
    }

    @Step
    public boolean downloadShablonLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadShablonLink);
    }

    @Step
    public void checkIsDownloadShablonLinkPresent() {
        Assert.assertTrue("Download Shablon Link is not displayed", downloadShablonLinkIsDisplayed());
    }

    @Step
    public void clickOnYearField() {
        actionsWithOurElements.clickOnElement(yearField);
    }

    @Step
    public void clickOnYearItem() {
        actionsWithOurElements.clickOnElement(yearItem);
    }

    @Step
    public boolean addFileBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addFileBtn);
    }

    @Step
    public void checkIsAddFileBtnPresent() {
        Assert.assertTrue("Add File Btn is not displayed", addFileBtnIsDisplayed());
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
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/subject-import/import?type=1&regulator_id=262&sphere_id=136");
    }

}

