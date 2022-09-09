package pages.dovidkaPage;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DovidkaPage extends ParentPage {

    public DovidkaPage(WebDriver webDriver) {
        super(webDriver, "/static/help");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//div[@class='blocked-embed__overlay']")
    private WebElement blockWithContent;

    @FindBy(xpath = ".//*[contains(text(),'Що таке річний план перевірок і чому він важливий для мене?')]")
    private WebElement textInBlockElements_1;

    @FindBy(xpath = ".//*[contains(text(),'Що я можу довідатися з річного плану перевірок, крім найменувань суб’єктів господарювання, яких перевірятимуть?')]")
    private WebElement textInBlockElements_2;

    @FindBy(xpath = ".//*[contains(text(),'Чому для різних підприємств встановлений різний строк проведення перевірок?')]")
    private WebElement textInBlockElements_3;

    @FindBy(xpath = ".//*[contains(text(),'Чи можна відмовитися від комплексної перевірки?')]")
    private WebElement textInBlockElements_4;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/p[39]/a")
    private WebElement actFormLink;

    @FindBy(xpath = ".//section[1]/div/div[2]/div/p[60]/a")
    private WebElement riskCriteriaLink;

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
        Assert.assertEquals(webDriver.getTitle(), "Річні плани та комплексний план Q&A");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(),configProperties.base_url() + "/static/help");
    }

    @Step
    public void checkIsPageURLProdPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(),configProperties.base_url() + "/static/help");
    }

    @Step
    public boolean blockWithContentIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(blockWithContent);
    }

    @Step
    public boolean textInBlockElements_1IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(textInBlockElements_1);
    }

    @Step
    public boolean textInBlockElements_2IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(textInBlockElements_2);
    }

    @Step
    public boolean textInBlockElements_3IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(textInBlockElements_3);
    }

    @Step
    public boolean textInBlockElements_4IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(textInBlockElements_4);
    }

    @Step
    public void clickOnActFormLink() {
        actionsWithOurElements.clickOnElement(actFormLink);
    }

    @Step
    public void clickOnRiskCriteriaLink() {
        actionsWithOurElements.clickOnElement(riskCriteriaLink);
    }

}


