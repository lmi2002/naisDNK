package pages.trainingMaterialPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class TrainingMaterialPage extends ParentPage {

    public TrainingMaterialPage (WebDriver webDriver) {
        super(webDriver, "/training-material/index");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//img[@src='/img/law_icon.svg']")
    private WebElement trainingPageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Сфера')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@id='trainingmaterialsearch-name']")
    private WebElement searchField;

    @FindBy(xpath = ".//*[@id='filter-material-form']/div[3]/div/div[1]/button")
    private WebElement searchBtn;

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm']")
    private WebElement cleanFiltersBtn;

    @FindBy(xpath = ".//div[@class='full-search-block']//a[@role='button']")
    private WebElement fullSearchLink;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement addMaterialBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement viewMaterialBtn;




    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public boolean isTrainingPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(trainingPageLogo);
    }

    @Step
    public void checkIsTrainingPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isTrainingPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Навчальні і консультаційні матеріали");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "http://inspections.staging.brdo.com.ua/training-material/index");
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }


    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean addMaterialBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(addMaterialBtn);
    }

    @Step
    public void checkIsAddMaterialBtnPresent() {
        Assert.assertTrue("Add Material Btn is not displayed", addMaterialBtnIsDisplayed());
    }

    @Step
    public boolean cleanFiltersBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(cleanFiltersBtn);
    }

    @Step
    public void checkIsCleanFiltersBtnPresent() {
        Assert.assertTrue("Clean Filters Btn is not displayed", cleanFiltersBtnIsDisplayed());
    }

    @Step
    public void clickOnAddMaterialBtn() {
        actionsWithOurElements.clickOnElement(addMaterialBtn);
    }

    @Step
    public void clickOnSearchBtn() {
        actionsWithOurElements.clickOnElement(searchBtn);
    }

    @Step
    public void clickOnViewMaterialBtn() {
        actionsWithOurElements.clickOnElement(viewMaterialBtn);
    }

    @Step
    public void inputNameOfMaterialInToSearchField(String nameOfMaterial) {
        actionsWithOurElements.enterTextInInput(searchField, nameOfMaterial);
    }

    @Step
    public void checkAddedMaterialItemPresent() {
        Assert.assertTrue("Added Material Item is not displayed", webDriver.getPageSource().contains("НКМ тест"));
    }

    @Step
    public void waiting() throws InterruptedException {
        actionsWithOurElements.pause();
    }
}
