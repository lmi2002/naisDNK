package pages.preventiveZahodyPages;

import io.qameta.allure.Step;
import libs.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PrevZahCardPage extends ParentPage {

    public PrevZahCardPage(WebDriver webDriver) {
        super(webDriver, "/preventive-measure/view?id=16763");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Оновити інформацію')]")
    private WebElement updateInfoBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;

    @FindBy(xpath = ".//a[@class='back_link']")
    private WebElement backToPrevZahListLink;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Суб')]")
    private WebElement sgBlock;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Посадові особи органу державного нагляду (контролю)')]")
    private WebElement posadoviOsobyBlock;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Сфери нагляду (контролю)')]")
    private WebElement sphereBlock;

    @FindBy(xpath = ".//div[@class='panel panel-primary upload_doc_panel']//h3[@class='inspection_title' and contains(text(),'Превентивний захід')]")
    private WebElement prevZahBlock;

    @FindBy(xpath = ".//article[@class='last_news side_news inspection_sidebar']//h3[@class='last_news_title' and contains(text(),'Резюме превентивного заходу')]")
    private WebElement resumePrevZahBlock;

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
        Assert.assertEquals(webDriver.getTitle(), "ПП \"ЕНЕРГОСЕРВІС\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        // Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/preventive-measure/view?id=220595");
        String regex = configProperties.base_url() + "/preventive-measure/view\\?id=[0-9]*";
        String str = webDriver.getCurrentUrl();
        Assert.assertTrue(Utils.checkRegex(regex, str));
    }

    @Step
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public void checkIsSaveBtnPresent() {
        Assert.assertTrue("Save Btn is not displayed", saveBtnIsDisplayed());
    }

    @Step
    public boolean updateInfoBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(updateInfoBtn);
    }

    @Step
    public void checkIsUpdateInfoBtnPresent() {
        Assert.assertTrue("UpdateInfo Btn is not displayed", updateInfoBtnIsDisplayed());
    }

    @Step
    public boolean backToPrevZahListLinkIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(backToPrevZahListLink);
    }

    @Step
    public void checkIsBackToPrevZahListLinkPresent() {
        Assert.assertTrue("Back To Prev Zah List Link is not displayed", backToPrevZahListLinkIsDisplayed());
    }

    @Step
    public boolean sgBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sgBlock);
    }

    @Step
    public void checkIsSGBlockPresent() {
        Assert.assertTrue("SG Block is not displayed", sgBlockIsDisplayed());
    }

    @Step
    public boolean posadoviOsobyBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(posadoviOsobyBlock);
    }

    @Step
    public void checkIsPosadoviOsobyBlockPresent() {
        Assert.assertTrue("Posadovi Osoby Block is not displayed", posadoviOsobyBlockIsDisplayed());
    }

    @Step
    public boolean sphereBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sphereBlock);
    }

    @Step
    public void checkIsSphereBlockPresent() {
        Assert.assertTrue("Sphere Block is not displayed", sphereBlockIsDisplayed());
    }

    @Step
    public boolean prevZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(prevZahBlock);
    }

    @Step
    public void checkIsPrevZahBlockPresent() {
        Assert.assertTrue("Prev Zah Block is not displayed", prevZahBlockIsDisplayed());
    }

    @Step
    public boolean resumePrevZahBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(resumePrevZahBlock);
    }

    @Step
    public void checkIsResumePrevZahBlockPresent() {
        Assert.assertTrue("Resume Prev Zah Block is not displayed", resumePrevZahBlockIsDisplayed());
    }

}