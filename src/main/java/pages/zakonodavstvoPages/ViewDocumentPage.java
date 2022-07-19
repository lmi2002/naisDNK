package pages.zakonodavstvoPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewDocumentPage extends ParentPage {

    public ViewDocumentPage (WebDriver webDriver) {
        super(webDriver, "/document/view?id=1792");
    }

    @FindBy(xpath = ".//button[@class = 'close_modal icon-cancel']")
    private WebElement closeModalWindowBtn;

    @FindBy(xpath = ".//h1[@class='page_title' and contains(text(),'Про заходи щодо стимулювання зовнішньоекономічної діяльності')]")
    private WebElement pageTitle;

    @FindBy(xpath = ".//table[@class='vertical_table table table-bordered table-striped']")
    private WebElement grid;


    @Step
    public void clickOnCloseModalWindowBtn() {
        actionsWithOurElements.clickOnElement(closeModalWindowBtn);
    }

    @Step
    public boolean pageTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(pageTitle);
    }

    @Step
    public boolean gridIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(grid);
    }



}
