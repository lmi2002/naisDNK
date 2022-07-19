package pages.riskCriteriaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class ViewRiskCriteriaCriteriasPage extends ParentPage  {


    public ViewRiskCriteriaCriteriasPage (WebDriver webDriver) {
        super(webDriver, "/document/view?id=1259427&documentType=risk_criteria_document&tab=criterias");
    }

    @FindBy(xpath = ".//meta[@property='og:title' and @content='ІАС ДНК']")
    private WebElement pageTitle;

    @FindBy(xpath = ".//a[@href='/document/view?id=917&documentType=risk_criteria_document&tab=criterias']  ")
    private WebElement riskCriterias;

    @FindBy(xpath = ".//h3[contains(text(),'Перелік критеріїв ризику')]")
    private WebElement perelikRiskCriteriasTitleOfBlock;

    @FindBy(xpath = ".//div[contains(text(),'Загальна інформація')]")
    private WebElement zagalnaInfoTitleOfBlock;

    @FindBy(xpath = ".//a[@href = '/document/view?id=1259427&documentType=risk_criteria_document&tab=risks']")
    private WebElement risksLink;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean perelikRiskCriteriasTitleOfBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(perelikRiskCriteriasTitleOfBlock);
    }

    @Step
    public boolean zagalnaInfoTitleOfBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(zagalnaInfoTitleOfBlock);
    }

    @Step
    public boolean risksLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(risksLink);
    }

    @Step
    public void clickOnRisksLink() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnElement(risksLink);
    }

}
