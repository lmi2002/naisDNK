package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class CreateDocFromBasePage extends ParentPage {

    public CreateDocFromBasePage (WebDriver webDriver) {
        super(webDriver, "/document/create?documentType=npa");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'НПА: Додавання')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//div[@class='col-xs-12 col-sm-4 col-md-3']")
    private WebElement infoBlockMenu;

    @FindBy(xpath = ".//span[@class='select2-selection__placeholder' and contains(text(),'Пошук в базі ВРУ')]")
    private WebElement searchInBase;

    @FindBy(xpath = ".//span[@class='select2-search select2-search--dropdown']//input[@type='search']")
    private WebElement enterDataInToSearchField;

    @FindBy(xpath = ".//li[@class='select2-results__option select2-results__option--highlighted']")
    private WebElement npaLink;

    @FindBy(xpath = ".//button[@class='btn btn-info btn-xs add-item']")
    private WebElement addPartBtn;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement createBtn;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement selectSphere;

    @FindBy(xpath = ".//li[@class='glyphicon glyphicon-unchecked']")
    private WebElement selectAllSphere;

    @FindBy(xpath = ".//span[@class='select2-selection__placeholder']")
    private WebElement selectActType;

    @FindBy(xpath = ".//li[@class='select2-results__option']")
    private WebElement actTypeDSTU;

    @FindBy(xpath = ".//input[@id='npa-additional_number']")
    private WebElement enterActNumber;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean infoBlockMenuIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlockMenu);
    }

    @Step
    public void clickOnSearchInBase() {
        actionsWithOurElements.clickOnElement(searchInBase);
    }

    @Step
    public void enterDataInToSearchField(String nameAct) {
        actionsWithOurElements.enterTextInInput(enterDataInToSearchField, nameAct);
    }

    @Step
    public boolean addPartBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addPartBtn);
    }

    @Step
    public void enterActNumberInToField(String actNumber) {
        actionsWithOurElements.enterTextInInput(enterActNumber, actNumber);
    }

    @Step
    public void clickOnNPALink() {
        actionsWithOurElements.clickOnElement(npaLink);
    }

    @Step
    public void clickOnSelectSphere() {
        actionsWithOurElements.clickOnElement(selectSphere);
    }

    @Step
    public void clickOnSelectAllSphere() {
        actionsWithOurElements.clickOnElement(selectAllSphere);
    }

    @Step
    public void clickOnActType() {
        actionsWithOurElements.clickOnElement(selectActType);
    }

    @Step
    public void clickOnActTypeDSTU() {
        actionsWithOurElements.clickOnElement(actTypeDSTU);
    }

    @Step
    public void clickOnCreateBtn() {
        actionsWithOurElements.clickOnElement(createBtn);
    }

}
