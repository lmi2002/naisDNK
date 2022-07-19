package pages.perevirkyPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewPlanInspCard2020Page extends ParentPage {

    public ViewPlanInspCard2020Page(WebDriver webDriver) {
        super(webDriver, "/inspection/view?id=2132061");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Оновити інформацію')]")
    private WebElement updateBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block inspection_submit' and contains(text(),'Зберегти')]")
    private WebElement saveBtn;

    @FindBy(xpath = ".//h3[@class='inspection_title' and contains(text(),'Загальні дані з плану перевірок')]")
    private WebElement gridTitle;

    @FindBy(xpath = ".//a[@class='back_link']")
    private WebElement backLink;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div[1]")
    private WebElement allDataBlock;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div[2]")
    private WebElement sgBlock;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div[3]")
    private WebElement nakazBlock;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div[4]")
    private WebElement rezultsBlock;

    @FindBy(xpath = ".//section[1]/div/div[2]/div[1]/div[5]")
    private WebElement rozporyadDocBlock;



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
        Assert.assertEquals(webDriver.getTitle(), "ПУБЛІЧНЕ АКЦІОНЕРНЕ ТОВАРИСТВО \"АРСЕЛОРМІТТАЛ КРИВИЙ РІГ\"");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://inspections.test.nais.gov.ua/inspection/view?id=2956037");
    }

    @Step
    public boolean gridTitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(gridTitle);
    }

    @Step
    public void checkIsGridTitlePresent() {
        Assert.assertTrue("Grid Title is not displayed", gridTitleIsDisplayed());
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
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public void checkIsSaveBtnPresent() {
        Assert.assertTrue("Save Btn is not displayed", saveBtnIsDisplayed());
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
    public boolean sgBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(sgBlock);
    }

    @Step
    public void checkIsSGBlockPresent() {
        Assert.assertTrue("SG Block is not displayed", sgBlockIsDisplayed());
    }

    @Step
    public boolean nakazBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(nakazBlock);
    }

    @Step
    public void checkIsNakazBlockPresent() {
        Assert.assertTrue("Nakaz Block is not displayed", nakazBlockIsDisplayed());
    }

    @Step
    public boolean rezultsBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(rezultsBlock);
    }

    @Step
    public void checkIsRezultsBlockPresent() {
        Assert.assertTrue("Rezults Block is not displayed", rezultsBlockIsDisplayed());
    }

    @Step
    public boolean rozporyadDocBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(rozporyadDocBlock);
    }

    @Step
    public void checkIsRozporyadDocBlockPresent() {
        Assert.assertTrue("Rozporyad Doc Block is not displayed", rozporyadDocBlockIsDisplayed());
    }

    @Step
    public void clickOnBackLink() {
        actionsWithOurElements.clickOnElement(backLink);
    }


}
