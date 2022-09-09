package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class VybirkaAutTransp2021CAPage extends ParentPage {

    public VybirkaAutTransp2021CAPage(WebDriver webDriver) {
        super(webDriver, "/subject/index?regulatorId=262&planningPeriodId=6&sphereId=162&tab=main");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@data-sort='risk' and contains(text(),'Ступінь ризику')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-1')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//td[contains(text(),'01-04-2020')]")
    private WebElement dateOfLastInspection_1;

    @FindBy(xpath = ".//td[contains(text(),'01-04-2015')]")
    private WebElement dateOfLastInspection_2;

    @FindBy(xpath = ".//*[@id='w3']/table/tbody/tr/td[9]")
    private WebElement dateOfLastInspection_3;

    @FindBy(xpath = ".//td[contains(text(),'Ви')]")
    private WebElement riskStpn;

    @FindBy(xpath = ".//td[contains(text(),'Се')]")
    private WebElement riskStpn_Sered;

    @FindBy(xpath = ".//td[contains(text(),'21.00')]")
    private WebElement zagBal2;

    @FindBy(xpath = ".//*[@id='w3']/table/tbody/tr/td[8]")
    private WebElement zagBal3;

    @FindBy(xpath = ".//a[@class='btn-open-inspector-cart']")
    private WebElement sgMenu;

    @FindBy(xpath = ".//*[@id=\"w3\"]/table/tbody/tr[1]/td[11]/div/ul/li[3]/a")
    private WebElement editSGLink;



    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
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
        Assert.assertEquals(webDriver.getTitle(), "Вибірка суб'єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject/index?regulatorId=205&planningPeriodId=6&sphereId=94&tab=main");
    }

    @Step
    public boolean checkIsDateOfLastInspection_20200401_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(dateOfLastInspection_1);

        if (dateOfLastInspection.equals("01-04-2020")) {
            return true;
        } else {
            return false;
        }
    }

    @Step
    public void checkIsRiskStpn_Seredniy_Present() {
        Assert.assertTrue("Risk Stepen (Середній) is not displayed", riskStpn_Sered.getText().contains("Се"));
    }

    @Step
    public void checkIsRiskStpn_Vysoky_Present() {
        Assert.assertTrue("Risk Stepen (Високий) is not displayed", riskStpn.getText().contains("Ви"));
    }

    @Step
    public void checkIsZagBal_21_2_Present() {
        Assert.assertTrue("Zagalny bal (21.00) is not displayed", zagBal2.getText().contains("21.00"));
    }

    @Step
    public void checkIsDateOfLastInspection_20150401_2_Present() {
        Assert.assertTrue("Date of last inspection (01-04-2015) is not displayed", dateOfLastInspection_2.getText().contains("01-04-2015"));
    }

    @Step
    public boolean checkIsDateOfLastInspection_empty_3_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(dateOfLastInspection_3);

        if (dateOfLastInspection.equals("01-04-2015")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public boolean checkIsZagBal_empty_3_Present() {
        String employeesNumber;

        employeesNumber = actionsWithOurElements.getElementValue(zagBal3);

        if (employeesNumber.equals("21.00")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public boolean checkIsRiskSt_empty_3_Present() {
        String dateOfLastInspection;

        dateOfLastInspection = actionsWithOurElements.getElementValue(dateOfLastInspection_3);

        if (dateOfLastInspection.equals("Високий")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public void clickOnSGMenu() {
        actionsWithOurElements.clickOnElement(sgMenu);
        logger.info("Element -SGMenu- was clicked");
    }

    @Step
    public void clickOnEditSGLink() {
        actionsWithOurElements.clickOnElement(editSGLink);
        logger.info("Element -SGLink- was clicked");
    }


}
