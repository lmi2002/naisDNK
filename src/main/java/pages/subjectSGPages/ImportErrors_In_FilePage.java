package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ImportErrors_In_FilePage extends ParentPage {

    public ImportErrors_In_FilePage(WebDriver webDriver) {
        super(webDriver, "/subject-import/import-errors?regulator_id=50&sphere_id=136&planning_period_id=6&id=5441");
    }

    @FindBy(xpath = ".//nav/div/div/div[1]/div/a/img")
    private WebElement pageLogo;

    @FindBy(xpath = ".//div[@class='dataTables_scrollHeadInner']//a[@data-sort ='row_id' and contains(text(),'Рядок №')]")
    private WebElement gridElement;

    @FindBy(xpath = ".//b[(text()) and contains(text(),'1-8')]")
    private WebElement gridListElements;

    @FindBy(xpath = ".//button[@data-original-title='Зберегти в xlsx']")
    private WebElement saveBtn;

    @FindBy(xpath = ".//a[@class='btn btn-primary btn-block' and contains(text(),'Завантажити ще раз суб’єкти господарювання')]")
    private WebElement importRepeatBtn;

    @FindBy(xpath = ".//p[@class='summary']")
    private WebElement summaryBlock;

    @FindBy(xpath = ".//p[@style='color: #de3f32;']")
    private WebElement allInfoBlock;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[1]/td")
    private WebElement errorInfo1;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[2]/td")
    private WebElement errorInfo2;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[3]/td")
    private WebElement errorInfo3;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[4]/td")
    private WebElement errorInfo4;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[5]/td")
    private WebElement errorInfo5;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[6]/td")
    private WebElement errorInfo6;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr[7]/td/text()[1]")
    private WebElement errorInfo7_1;

    @FindBy(xpath = ".//section[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr[7]/td/text()[2]")
    private WebElement errorInfo7_2;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[8]/td")
    private WebElement errorInfo8_1;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[8]/td")
    private WebElement errorInfo8_2;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[9]/td")
    private WebElement errorInfo9_1;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[9]/td")
    private WebElement errorInfo9_2;

    @FindBy(xpath = ".//*[@id='DataTables_Table_0_wrapper']/div/div[3]/div[2]/div/table/tbody/tr[9]/td")
    private WebElement errorInfo9_3;

    @Step
    public String getErrorInfoText1() {
        return errorInfo1.getText();
    }

    @Step
    public String getErrorInfoText2() {
        return errorInfo2.getText();
    }

    @Step
    public String getErrorInfoText3() {
        return errorInfo3.getText();
    }

    @Step
    public String getErrorInfoText4() {
        return errorInfo4.getText();
    }

    @Step
    public String getErrorInfoText5() {
        return errorInfo5.getText();
    }

    @Step
    public String getErrorInfoText6() {
        return errorInfo6.getText();
    }

    @Step
    public String getErrorInfoText7_1() {
        return errorInfo7_1.getText();
    }

    @Step
    public String getErrorInfoText7_2() {
        return errorInfo7_2.getText();
    }

    @Step
    public String getErrorInfoText8_1() {
        return errorInfo8_1.getText();
    }

    @Step
    public String getErrorInfoText8_2() {
        return errorInfo8_2.getText();
    }

    @Step
    public String getErrorInfoText9_1() {
        return errorInfo9_1.getText();
    }

    @Step
    public String getErrorInfoText9_2() {
        return errorInfo9_2.getText();
    }

    @Step
    public String getErrorInfoText9_3() {
        return errorInfo9_3.getText();
    }

    @Step
    public void checkIsErrorInfoText1Present() {
        Assert.assertEquals(getErrorInfoText1(), "Будь ласка, вкажіть коректну дату останньої планової перевірки, інакше суб'єкт господарювання не зможе бути використаний для автоматичного планування;");
    }

    @Step
    public void checkIsErrorInfoText2Present() {
        Assert.assertEquals(getErrorInfoText2(), "Бал по критеріям ризику суб'єкта не відповідає ступеню ризику;");
    }

    @Step
    public void checkIsErrorInfoText3Present() {
        Assert.assertEquals(getErrorInfoText3(), "Будь ласка, вкажіть коректну дату останньої планової перевірки, інакше суб'єкт господарювання не зможе бути використаний для автоматичного планування;");
    }

    @Step
    public void checkIsErrorInfoText4Present() {
        Assert.assertEquals(getErrorInfoText4(), "Суб'єкт господарювання з відповідним кодом не знайдений у ЄДР. Будь ласка, перевірте правильність коду або те, що він не належить відокремленому підрозділу суб'єкта господарювання;");
    }

    @Step
    public void checkIsErrorInfoText5Present() {
        Assert.assertEquals(getErrorInfoText5(), "Некоректне значення ступіня ризику суб'єкту;");
    }

    @Step
    public void checkIsErrorInfoText6Present() {
        Assert.assertEquals(getErrorInfoText6(), "Суб'єкти дублюються, приберіть дублі;");
    }

    @Step
    public void checkIsErrorInfoText7_1Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Некоректне значення в колонці"));
    }

    @Step
    public void checkIsErrorInfoText7_2Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Некоректне значення в колонці \"Код відокремленого підрозділу юридичної особи\";"));
    }

    @Step
    public void checkIsErrorInfoText8_1Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Некоректне значення в колонці \"Найменування юридичної особи\";"));
    }

    @Step
    public void checkIsErrorInfoText8_2Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Некоректний код. Будь ласка, введіть коректний код ЄДРПОУ;"));
    }

    @Step
    public void checkIsErrorInfoText9_1Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("В даного суб'єкту господарювання згідно ЄДР не має відокремлених підрозділів;"));
    }

    @Step
    public void checkIsErrorInfoText9_2Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Некоректне значення ступіня ризику суб'єкту;"));
    }

    @Step
    public void checkIsErrorInfoText9_3Present() {
        Assert.assertTrue("Error message is not displayed", webDriver.getPageSource().contains("Бал по критеріям ризику суб'єкта не відповідає ступеню ризику;"));
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
    public boolean saveBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(saveBtn);
    }

    @Step
    public boolean importRepeatBtnIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(importRepeatBtn);
    }

    @Step
    public boolean summaryBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(summaryBlock);
    }

    @Step
    public boolean allInfoBlockIsDisplayed() {
        return actionsWithOurElements.isElementDisplayed(allInfoBlock);
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
        Assert.assertEquals(webDriver.getTitle(), "Помилки імпортування суб’єктів господарювання");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/subject-import/import-errors?regulator_id=50&sphere_id=136&planning_period_id=6&id=5441");
    }

}