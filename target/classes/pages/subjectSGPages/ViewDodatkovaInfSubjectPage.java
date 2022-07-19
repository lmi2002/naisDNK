package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewDodatkovaInfSubjectPage extends ParentPage {

    public ViewDodatkovaInfSubjectPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/additional?subject_id=15076");
    }

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'ПРУЖИННИЙ ЦЕНТР УКРАЇНА')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//h3[contains(text(),'Додаткова інформація')]")
    private WebElement dodatkovaInfTitle;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-sm']")
    private WebElement editBtn;

    @FindBy(xpath = ".//h5[contains(text(),'Вид діяльності:')]")
    private WebElement vydDiyalnostiTitle;

    @FindBy(xpath = ".//h5[contains(text(),'Нещасні випадки, що настали')]")
    private WebElement accidentTitle;

    @FindBy(xpath = ".//*[@id='pjax-accident']")
    private WebElement accidentTab;

    @FindBy(xpath = ".//h5[contains(text(),'Проведені спеціальні розслідування')]")
    private WebElement rozsliduvannyaTitle;

    @FindBy(xpath = ".//*[@id='branch-container']/div[2]")
    private WebElement rozsliduvannyaTab;

    @FindBy(xpath = ".//h5[contains(text(),'Видані акти (приписи) за формою Н-9')]")
    private WebElement vydaniActTitle;

    @FindBy(xpath = ".//*[@id='branch-container']/div[3]")
    private WebElement vydaniActTab;

    @FindBy(xpath = ".//h5[contains(text(),'Підпорядкованість:')]")
    private WebElement pidporyadkovannistTitle;

    @FindBy(xpath = ".//h5[contains(text(),'Форма власності:')]")
    private WebElement formaVlasnostiTitle;


    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean dodatkovaInfTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dodatkovaInfTitle);
    }

    @Step
    public boolean editBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(editBtn);
    }

    @Step
    public boolean accidentTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(accidentTitle);
    }

    @Step
    public boolean accidentTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(accidentTab);
    }

    @Step
    public boolean rozsliduvannyaTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(rozsliduvannyaTitle);
    }

    @Step
    public boolean rozsliduvannyaTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(rozsliduvannyaTab);
    }

    @Step
    public boolean vydaniActTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(vydaniActTitle);
    }

    @Step
    public boolean vydaniActTabIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(vydaniActTab);
    }

    @Step
    public boolean pidporyadkovannistTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pidporyadkovannistTitle);
    }

    @Step
    public boolean formaVlasnostiTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(formaVlasnostiTitle);
    }

}
