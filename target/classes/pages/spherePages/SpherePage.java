package pages.spherePages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SpherePage extends ParentPage {

    public SpherePage(WebDriver webDriver) {
        super(webDriver, "/sphere/search");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='name' and contains(text(),'Сфе')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//input[@class='form-control']")
    private WebElement sphereSearchField;

    @FindBy(xpath = ".//span[@class='select2-selection__placeholder']")
    private WebElement organField;

    @FindBy(xpath = ".//input[@class='select2-search__field']")
    private WebElement organSearchField;

    @FindBy(xpath = ".//a[@href='/sphere/view?id=124']")
    private WebElement sphereName;

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void checkIsGridElementPresent() {
        Assert.assertTrue("Grid Element is not displayed", gridElementIsDisplayed());
    }

    @Step
    public boolean isGridListElementsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsGridListElementsPresent() {
        Assert.assertTrue("Grid List Elements is not displayed", isGridListElementsDisplayed());
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
        Assert.assertEquals(webDriver.getTitle(), "Перелік сфер контролю");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/sphere/search");
    }

    @Step
    public void checkIsPagePROD_URLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.gov.ua/sphere/search");
    }

    @Step
    public void clickOnSphereNameLink() {
        actionsWithOurElements.clickOnElement(sphereName);
    }

}
