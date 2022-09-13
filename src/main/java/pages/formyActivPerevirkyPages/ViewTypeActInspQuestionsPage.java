package pages.formyActivPerevirkyPages;

import io.qameta.allure.Step;
import libs.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

import java.util.List;

public class ViewTypeActInspQuestionsPage extends ParentPage {

    public ViewTypeActInspQuestionsPage(WebDriver webDriver) {
        super(webDriver, "/document/view?id=2&documentType=act_inspection_document&tab=questions");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//div[@class='part-info-label' and contains(text(),'Питання для перевірки дотримання вимог законодавства, які поширюються на всіх')]")
    private WebElement part1Title;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div/div/div/div[1]/div[1]")
    private WebElement blockPart1;

    @FindBy(xpath = ".//div[@class='part-info-label' and contains(text(),'Питання для перевірки дотримання вимог законодавства, які поширюються на всіх')]")
    private List<WebElement> part2Title;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div/div/div/div[1]/div[2]")
    private WebElement blockPart2;

    @FindBy(xpath = ".//div[@class='part-info-label' and contains(text(),'Питання для перевірки дотримання вимог законодавства, які поширюються на всіх')]")
    private List<WebElement> part3Title;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div/div/div/div[1]/div[3]")
    private WebElement blockPart3;

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
        // Assert.assertEquals(webDriver.getTitle(), "Про затвердження уніфікованої форми акта, складеного за результатами проведення планового (позапланового) заходу державного нагляду (контролю) щодо дотримання суб'єктом господарювання вимог законодавства у сфері техногенної та пожежної безпеки, та інших форм розпорядчих документів");
        Assert.assertTrue(webDriver.getTitle().contains("Про затвердження уніфікованих форм актів"));
    }

    @Step
    public void checkIsPageURLPresent() {
        // Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/document/view?id=866104&documentType=act_inspection_document&tab=questions");
        String regex = configProperties.base_url() + "/document/view\\?id=[0-9]*&documentType=act_inspection_document&tab=questions";
        String str = webDriver.getCurrentUrl();
        Assert.assertTrue(Utils.checkRegex(regex, str));
    }

    @Step
    public boolean part1TitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(part1Title);
    }

    @Step
    public void checkIsPart1TitlePresent() {
        Assert.assertTrue("Part1 Title is not displayed", part1TitleIsDisplayed());
    }

    @Step
    public boolean blockPart1IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(blockPart1);
    }

    @Step
    public void checkIsBlockPart1Present() {
        Assert.assertTrue("BlockPart1 is not displayed", blockPart1IsDisplayed());
    }

    @Step
    public boolean part2TitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(part2Title.get(1));
    }

    @Step
    public void checkIsPart2TitlePresent() {
        Assert.assertTrue("Part2 Title is not displayed", part2TitleIsDisplayed());
    }

    @Step
    public boolean part3TitleIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(part3Title.get(2));
    }

    @Step
    public void checkIsPart3TitlePresent() {
        Assert.assertTrue("Part3 Title is not displayed", part3TitleIsDisplayed());
    }

    @Step
    public boolean blockPart2IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(blockPart2);
    }

    @Step
    public void checkIsBlockPart2Present() {
        Assert.assertTrue("BlockPart2 is not displayed", blockPart2IsDisplayed());
    }

    @Step
    public boolean blockPart3IsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(blockPart3);
    }

    @Step
    public void checkIsBlockPart3Present() {
        Assert.assertTrue("BlockPart3 is not displayed", blockPart3IsDisplayed());
    }

}
