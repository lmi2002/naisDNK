package pages.trainingMaterialPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SearchResultTrainingMaterials_msap_Page extends ParentPage {

    public SearchResultTrainingMaterials_msap_Page(WebDriver webDriver) {
        super(webDriver, "/training-material/index?TrainingMaterialSearch%5Bname%5D=&TrainingMaterialSearch%5Bregulator_id%5D=&TrainingMaterialSearch%5Bsphere_id%5D=&TrainingMaterialSearch%5Bupdated_at%5D=&TrainingMaterialSearch%5Bname%5D=&TrainingMaterialSearch%5Bregulator_id%5D=&TrainingMaterialSearch%5Bsphere_id%5D=&TrainingMaterialSearch%5Bupdated_at%5D=&TrainingMaterialSearch%5Bname%5D=&TrainingMaterialSearch%5Bregulator_id%5D=&TrainingMaterialSearch%5Bsphere_id%5D=&TrainingMaterialSearch%5Bupdated_at%5D=&TrainingMaterialSearch%5Bname%5D=мсап&TrainingMaterialSearch%5Bregulator_id%5D=&TrainingMaterialSearch%5Bsphere_id%5D=&TrainingMaterialSearch%5Bupdated_at%5D=");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//img[@src='/img/law_icon.svg']")
    private WebElement trainingPageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Сфера')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@id='trainingmaterialsearch-name']")
    private WebElement searchField;

    @FindBy(xpath = ".//button[@class='btn btn-primary btn-sm']")
    private WebElement searchBtn;

    @FindBy(xpath = ".//a[@class='btn btn-info btn-sm']")
    private WebElement cleanFiltersBtn;

    @FindBy(xpath = ".//div[@class='full-search-block']//a[@role='button']")
    private WebElement fullSearchLink;

    @FindBy(xpath = ".//a[@class='btn btn-primary']")
    private WebElement addMaterialBtn;

    @FindBy(xpath = ".//span[@class='table_action_btn icon-garbage remove-item']")
    private WebElement deleteMaterialBtn;

    @FindBy(xpath = ".//*[@id='w0']/table/tbody/tr/td[6]/a")
    private WebElement viewMaterialBtn;

    @FindBy(xpath = ".//button[@class='btn btn-success']")
    private WebElement modalWindowSuccessBtn;

    @FindBy(xpath = ".//button[@class='close_modal icon-cancel']")
    private WebElement closeModalWindowSuccessBtn;

    @FindBy(xpath = ".//div[@class='empty' and contains(text(),'го не зна')]")
    private WebElement deleteSuccessMessage;

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
        Assert.assertTrue("TrainingPage Logo is not displayed", isTrainingPageLogoDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Навчальні і консультаційні матеріали");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "//training-material/index?TrainingMaterialSearch%5Bname%5D=мсап&TrainingMaterialSearch%5Bregulator_id%5D=&TrainingMaterialSearch%5Bsphere_id%5D=&TrainingMaterialSearch%5Bupdated_at%5D=");
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
    public void clickOnDeleteMaterialBtn() {
        actionsWithOurElements.clickOnElement(deleteMaterialBtn);
    }

    @Step
    public void clickOnViewMaterialBtn() {
        actionsWithOurElements.getElementByScroll(viewMaterialBtn);
        actionsWithOurElements.clickOnElement(viewMaterialBtn);
    }

    @Step
    public void checkAddedMaterialItemPresent() {
        Assert.assertTrue("Added Material Item is not displayed", webDriver.getPageSource().contains("НКМ тест"));
    }

    @Step
    public void clickOnModalWindowSuccessBtn() {
        actionsWithOurElements.clickOnElement(modalWindowSuccessBtn);
    }

    @Step
    public void clickOnCloseModalWindowSuccessBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindowSuccessBtn);
    }

    @Step
    public void checkDeleteSuccessMessagePresent() {
        Assert.assertTrue("Нічого не знайдено message is not displayed", webDriver.getPageSource().contains("го не зна"));
    }

    @Step
    public void checkIsSearchResultPresent() {
        Assert.assertTrue("мсап is not displayed", webDriver.getPageSource().contains("мсап"));
    }

    @Step
    public void inputNameOfMaterialInToSearchField(String nameOfMaterial) {
        actionsWithOurElements.enterTextInInput(searchField, nameOfMaterial);
    }


}
