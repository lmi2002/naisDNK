package pages.regulatorPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RegulatorSearchResultPage extends ParentPage {

    public RegulatorSearchResultPage(WebDriver webDriver) {
        super(webDriver, "/regulator/index?Regulator%5Bname%5D=%D0%94%D0%B5%D1%80%D0%B6%D0%B0%D0%B2%D0%BD%D0%B0%20%D1%81%D0%BB%D1%83%D0%B6%D0%B1%D0%B0%20%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B8%20%D0%B7%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D1%8C%20%D0%BF%D1%80%D0%B0%D1%86%D1%96&Regulator%5Btype%5D=&Regulator%5Bcontacts%5D=&Regulator%5Bparent_name%5D=&Regulator%5Binspector_pib%5D=");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//th[contains(text(),'Контакти')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/regulator/view?id=61' and contains(text(),'Дер')]")
    private WebElement viewRegulatorCardLink;

    @FindBy(xpath = ".//a[@class='nav-link ' and contains(text(),'ОМС')]")
    private WebElement omcLink;

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
        Assert.assertEquals(webDriver.getTitle(), "Контролюючі органи");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/regulator/index?Regulator%5Bname%5D=%D0%94%D0%B5%D1%80%D0%B6%D0%B0%D0%B2%D0%BD%D0%B0%20%D1%81%D0%BB%D1%83%D0%B6%D0%B1%D0%B0%20%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B8%20%D0%B7%20%D0%BF%D0%B8%D1%82%D0%B0%D0%BD%D1%8C%20%D0%BF%D1%80%D0%B0%D1%86%D1%96&Regulator%5Btype%5D=&Regulator%5Bcontacts%5D=&Regulator%5Bparent_name%5D=");
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
        Assert.assertTrue("Grid ListElements is not displayed", gridListElementsIsDisplayed());
    }

    @Step
    public boolean omcLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void checkIsOMCLinkPresent() {
        Assert.assertTrue("OMC Link is not displayed", omcLinkIsDisplayed());
    }

    @Step
    public void clickOnViewRegulatorCardLink() {
        actionsWithOurElements.clickOnElement(viewRegulatorCardLink);
    }

}

