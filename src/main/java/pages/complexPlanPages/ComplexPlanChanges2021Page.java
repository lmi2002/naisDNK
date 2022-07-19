package pages.complexPlanPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ComplexPlanChanges2021Page extends ParentPage {

    public ComplexPlanChanges2021Page (WebDriver webDriver) {
        super(webDriver, "/complex-plan-change/index?complex_plan_id=76");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Комплексний план (.xls, .xlsx)')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//tr[1]//td[3]//a[@class='btn btn-primary' and contains(text(),'Зберегти')] ")
    private WebElement saveNakazBtn;

    @Step
    public boolean isPageLogoDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsPageLogoPresent() {
        Assert.assertTrue("Page Logo is not displayed", isPageLogoDisplayed());
    }

    @Step
    public boolean isSaveNakazBtnDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageLogo);
    }

    @Step
    public void checkIsSaveNakazBtnPresent() {
        Assert.assertTrue("Save Nakaz Btn is not displayed", isSaveNakazBtnDisplayed());
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Зміни комплексного плану");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/complex-plan-change/index?complex_plan_id=70");
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }
}

