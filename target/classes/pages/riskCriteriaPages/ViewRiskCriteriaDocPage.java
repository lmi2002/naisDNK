package pages.riskCriteriaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.concurrent.TimeUnit;

public class ViewRiskCriteriaDocPage extends ParentPage  {

    public ViewRiskCriteriaDocPage (WebDriver webDriver) {
        super(webDriver, "/document/view?id=917&documentType=risk_criteria_document");
    }

    @FindBy(xpath = ".//meta[@property='og:title' and @content='ІАС ДНК']")
    private WebElement pageTitle;

    @FindBy(css = ".col-lg-9 > div > ul > li:nth-child(2) > a")
    private WebElement riskCriterias;

    @FindBy(xpath = ".//h3[contains(text(),'Перелік критеріїв ризику')]")
    private WebElement perelikRiskCriteriasTitleOfBlock;

    @FindBy(xpath = ".//div[contains(text(),'Загальна інформація')]")
    private WebElement zagalnaInfoTitleOfBlock;

    @FindBy(css = "div.col-xs-12.col-md-9.col-lg-9 > div > ul > li.active > a")
    private WebElement risksLink;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean riskCriteriasIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(riskCriterias);
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
    public void clickOnRiskCriterias() {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actionsWithOurElements.clickOnElement(riskCriterias);
    }

}
