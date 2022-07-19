package pages.ratingInspectorsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class RatingInspectors2018Page extends ParentPage {

    public RatingInspectors2018Page (WebDriver webDriver) {
        super(webDriver, "/regulator/rating-all?tab=tab_regulator_rating_all_2018");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Результати оцінювання органів державного нагляду (контролю)')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//th[@style='width: 45%' and contains(text(),'Органи')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-20')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//a[@href='/regulator/view?id=5' and @class='table_action_btn icon-details']")
    private WebElement viewRegulatorCardBtn;

    @FindBy(xpath = ".//div[@class='page_use_block without_close' and contains(text(),'Згідно з')]")
    private WebElement infoBlock;

    @FindBy(xpath = ".//a[@href='/regulator/rating-all?tab=tab_regulator_rating_all_2018' and contains(text(),'У 2018 році')]")
    private WebElement u2018YearLink;

    @FindBy(xpath = ".//a[@href='/regulator/rating-all?tab=tab_regulator_rating_all_2019' and contains(text(),'У 2019 році')]")
    private WebElement u2019YearLink;

    @FindBy(xpath = ".//a[@href='/regulator/rating-all?tab=tab_regulator_rating_all_2020' and contains(text(),'У 2020 році')]")
    private WebElement u2020YearLink;

    @FindBy(xpath = ".//a[@href='/regulator/rating-all?tab=tab_regulator_rating_all_2022' and contains(text(),'У 2022 році')]")
    private WebElement u2022YearLink;

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridElementIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridElement);
    }

    @Step
    public boolean gridListElementsIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridListElements);
    }

    @Step
    public void clickOnViewRegulatorCardBtn() {
        actionsWithOurElements.clickOnElement(viewRegulatorCardBtn);
    }

    @Step
    public boolean infoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(infoBlock);
    }

    @Step
    public boolean u2018YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(u2018YearLink);
    }

    @Step
    public boolean u2019YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(u2019YearLink);
    }

    @Step
    public boolean u2020YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(u2020YearLink);
    }

    @Step
    public boolean u2022YearLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(u2022YearLink);
    }

    @Step
    public void clickOnU2018YearLink() {
        actionsWithOurElements.clickOnElement(u2018YearLink);
    }

    @Step
    public void clickOnU2019YearLink() {
        actionsWithOurElements.clickOnElement(u2019YearLink);
    }

    @Step
    public void clickOnU2020YearLink() {
        actionsWithOurElements.clickOnElement(u2020YearLink);
    }

}

