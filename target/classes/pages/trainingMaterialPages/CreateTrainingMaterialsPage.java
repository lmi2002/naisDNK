package pages.trainingMaterialPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateTrainingMaterialsPage extends ParentPage {

    public CreateTrainingMaterialsPage (WebDriver webDriver) {
        super(webDriver, "/training-material/create");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//input[@id='trainingmaterial-name']")
    private WebElement materialsNameField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement sphereField;

    @FindBy(xpath = ".//li[contains(text(),'Додержання законодавства про працю')]")
    private WebElement sphereItem;

    @FindBy(xpath = ".//textarea[@id='trainingmaterial-description']")
    private WebElement descriptionField;

    @FindBy(xpath = ".//a[@class='back-arrow']")
    private WebElement backToMaterialsListLink;

    @FindBy(xpath = ".//span[@id='add-multiplefile-btn']")
    private WebElement addFileBtn;

    @FindBy(xpath = ".//button[@class='btn btn-info']")
    private WebElement createBtn;

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
        Assert.assertEquals(webDriver.getTitle(), "Створення навчально-консультаційного матеріалу");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/training-material/create");
    }

    @Step
    public boolean isBackToMaterialsListLinkDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToMaterialsListLink);
    }

    @Step
    public void checkIsBackToMaterialsListLinkPresent() {
        Assert.assertTrue("Back To Materials List Link is not displayed", isBackToMaterialsListLinkDisplayed());
    }

    @Step
    public boolean isAddFileBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addFileBtn);
    }

    @Step
    public void checkIsAddFileBtnPresent() {
        Assert.assertTrue("Add File Btn is not displayed", isAddFileBtnDisplayed());
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
    public void inputNameOfMaterialsField(String nameOfMaterial) {
        actionsWithOurElements.enterTextInInput(materialsNameField, nameOfMaterial);
    }

    @Step
    public void inputDescriptionInToSearchField(String description) {
        actionsWithOurElements.enterTextInInput(descriptionField, description);
    }

    @Step
    public void clickOnCreateBtn() {
        actionsWithOurElements.clickOnElement(createBtn);
    }

}
