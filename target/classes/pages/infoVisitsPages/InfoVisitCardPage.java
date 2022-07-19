package pages.infoVisitsPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class InfoVisitCardPage extends ParentPage {

    public InfoVisitCardPage(WebDriver webDriver) {
        super(webDriver, "/inspection-info-visit/view?id=159109");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Завантажити')]")
    private WebElement downloadBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Оновити')]")
    private WebElement updateBtn;

    @FindBy(xpath = ".//a[@class='back_link']")
    private WebElement backToInfoVisitListLink;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Загальні дані')]")
    private WebElement allDataBlock;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Результати заходу')]")
    private WebElement resultsZahBlock;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Показники ефективності заходу')]")
    private WebElement pokaznykyEffectZahBlock;

    @FindBy(xpath = ".//article[@class='last_news side_news inspection_sidebar']//h3[@class='last_news_title' and contains(text(),'Резюме заходу')]")
    private WebElement resumeZahBlock;


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
        Assert.assertEquals(webDriver.getTitle(), "ПРИВАТНЕ ПІДПРИЄМСТВО \"ЕНЕРГОСЕРВІС\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection-info-visit/view?id=565792");
    }

    @Step
    public boolean downloadBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(downloadBtn);
    }

    @Step
    public void checkIsDownloadBtnPresent() {
        Assert.assertTrue("Download Btn is not displayed", downloadBtnIsDisplayed());
    }

    @Step
    public boolean updateBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateBtn);
    }

    @Step
    public void checkIsUpdateBtnPresent() {
        Assert.assertTrue("Update Btn is not displayed", updateBtnIsDisplayed());
    }

    @Step
    public boolean allDataBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allDataBlock);
    }

    @Step
    public void checkIsAllDataBlockPresent() {
        Assert.assertTrue("All Data Block is not displayed", allDataBlockIsDisplayed());
    }

    @Step
    public boolean backToInfoVisitListLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToInfoVisitListLink);
    }

    @Step
    public void checkIsBackToInfoVisitListLinkPresent() {
        Assert.assertTrue("Back To Info Visit List Link is not displayed", backToInfoVisitListLinkIsDisplayed());
    }

    @Step
    public boolean resultsZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resultsZahBlock);
    }

    @Step
    public void checkIsResultsZahBlockPresent() {
        Assert.assertTrue("Results Zah Block is not displayed", resultsZahBlockIsDisplayed());
    }

    @Step
    public boolean pokaznykyEffectZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pokaznykyEffectZahBlock);
    }

    @Step
    public void checkIsPokaznykyEffectZahBlockPresent() {
        Assert.assertTrue("Pokaznyky Effect Zah Block is not displayed", pokaznykyEffectZahBlockIsDisplayed());
    }

    @Step
    public boolean resumeZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resumeZahBlock);
    }

    @Step
    public void checkIsResumeZahBlockPresent() {
        Assert.assertTrue("Resume Zah Block is not displayed", resumeZahBlockIsDisplayed());
    }

}