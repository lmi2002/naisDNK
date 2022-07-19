package pages.statisticPage;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class StatisticPage extends ParentPage {

    public StatisticPage (WebDriver webDriver) {
        super(webDriver, "/regulator/statistics");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Статистика')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@style='width: 7.86%;' and contains(text(),'Проведено / Не проведено / Відомості не внесено')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//button[@data-original-title='Зберегти в xlsx']")
    private WebElement saveBtn;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=1' and contains(text(),'За 2018 рік')]")
    private WebElement za2018YearLink;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=2' and contains(text(),'За 2019 рік')]]")
    private WebElement za2019YearLink;

    @FindBy(xpath = ".//a[@href='/regulator/statistics?planning_period_id=4' and contains(text(),'За 2020 рік')]]")
    private WebElement za2020YearLink;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public void clickOnViewRegulatorCardBtn() {
        actionsWithOurElements.clickOnElement(saveBtn);
    }

    @Step
    public boolean u2018YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2018YearLink);
    }

    @Step
    public boolean u2019YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2019YearLink);
    }

    @Step
    public boolean u2020YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(za2020YearLink);
    }

    @Step
    public void clickOnU2018YearLink() {
        actionsWithOurElements.clickOnElement(za2018YearLink);
    }

    @Step
    public void clickOnU2019YearLink() {
        actionsWithOurElements.clickOnElement(za2019YearLink);
    }

    @Step
    public void clickOnU2020YearLink() {
        actionsWithOurElements.clickOnElement(za2020YearLink);
    }

}


