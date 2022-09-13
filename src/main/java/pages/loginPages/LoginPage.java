package pages.loginPages;

import libs.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;
import io.qameta.allure.Step;

import java.util.concurrent.TimeUnit;


public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/site/login");
    }

    public String url = configProperties.base_url() + "/site/login";
    public String prodUrl = "https://inspections.gov.ua";

    // @FindBy(xpath = ".//input[@id='loginform-username']")
    @FindBy(xpath = ".//input[@id='edsform-email']")
    private static WebElement inputLogin;

    // @FindBy(xpath = ".//input[@id='loginform-password']")
    @FindBy(xpath = ".//input[@id='edsform-password']")
    private static WebElement inputPassword;

    @FindBy(xpath = ".//input[@id='edsform-code']")
    private static WebElement inputRNOKPP;

    @FindBy(xpath = ".//span[@id='select2-edsform-key_certification_center-container']")
    private static WebElement fieldCertificationCenter;

    @FindBy(xpath = ".//li[contains(@id,'select2-edsform-key_certification_center-result') and text()='Тестовий надавач електронних довірчих послуг']")
    private static WebElement resultCertificationCenter;

    @FindBy(xpath = ".//input[@id='edsform-file_key']")
    private static WebElement inputFile;

    @FindBy(xpath = ".//input[@id='edsform-password_to_file_key']")
    private static WebElement inputPasswordKey;

    // @FindBy(xpath = ".//button[@name='login-button']")
    @FindBy(xpath = ".//button[text()='Увійти']")
    private static WebElement loginButton;

    @FindBy(xpath = ".//section/div/div/div/div/div/div/div/div[1]/form/div[4]/div[1]")
    private static WebElement checkboxCaptcha;

    @FindBy(xpath = ".//div[contains(text(),'Необхідно заповнити \"Логін/E-mail\".')]")
    private WebElement errorMessageEmail;

    @FindBy(xpath = ".//div[contains(text(),'Необхідно заповнити \"Пароль\".')]")
    private WebElement errorMessagePassword;

    @FindBy(xpath = ".//div[contains(text(),'Логін або пароль невірні')]")
    private WebElement errorMessageInvalidLoginOrPassword;

    @Step
    public void openPage() {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public void openProdPage() {
        try {
            webDriver.get(prodUrl);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public void checkIsPageTitlePresent() {
        Assert.assertEquals(webDriver.getTitle(), "Увійти");
    }

    @Step
    public void checkIsPageURLPresent() {
        Assert.assertEquals(webDriver.getCurrentUrl(), configProperties.base_url() + "/site/login");
    }

    @Step
    public void enterLoginInToInputLogin(String login) {
        actionsWithOurElements.enterTextInInput(inputLogin, login);
    }

    @Step
    public void enterPassInToInputPassword(String password) {
        actionsWithOurElements.enterTextInInput(inputPassword, password);
    }

    @Step
    public void enterPassInToInputRNOKPP(String code) {
        actionsWithOurElements.enterTextInInput(inputRNOKPP, code);
    }

    @Step
    public void enterPassInToInputFile(String path) {
        actionsWithOurElements.enterTextInInput(inputFile, path);
    }

    @Step
    public void clickOnButtonLogIn() {
        actionsWithOurElements.clickOnElement(loginButton);
    }

    @Step
    public void clickOnfieldCertificationCenter() {
        actionsWithOurElements.clickOnElement(fieldCertificationCenter);
    }

    @Step

    public void scrollToResultCertificationCenter() {
        actionsWithOurElements.getElementByScroll(resultCertificationCenter);
    }
    public void clickOnResultCertificationCenter() {
        actionsWithOurElements.clickOnElement(resultCertificationCenter);
    }

    @Step
    public void enterPassInToInputPasswordKey(String passwdKey) {
        actionsWithOurElements.enterTextInInput(inputPasswordKey, passwdKey); }


    @Step
    public boolean isPageLoaded() {
        return loginButton.isDisplayed();
    }

    @Step
    public boolean getErrorMessageTextEmail() {
        return actionsWithOurElements.isElementDisplayed(errorMessageEmail);
    }

    @Step
    public void checkIsErrorMessageTextEmailPresent() {
        Assert.assertTrue("Error Message Text Email is not displayed", getErrorMessageTextEmail());
    }

    @Step
    public boolean getErrorMessageTextPassword() {
        return actionsWithOurElements.isElementDisplayed(errorMessagePassword);
    }

    @Step
    public void checkIsErrorMessageTextPasswordPresent() {
        Assert.assertTrue("Error Message Text Password is not displayed", getErrorMessageTextPassword());
    }

    @Step
    public boolean getErrorMessageTextInvalidLoginOrPassword() {
        return actionsWithOurElements.isElementDisplayed(errorMessageInvalidLoginOrPassword);
    }

    @Step
    public void checkIsErrorMessageTextInvalidLoginOrPassword() {
        Assert.assertTrue("Invalid Login Or Password is not displayed", getErrorMessageTextInvalidLoginOrPassword());
    }

    @Step
    public void clickOnCaptchaCheckbox() {
        actionsWithOurElements.clickOnElement(checkboxCaptcha);
    }

    @Step
    public void waiting () {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @Step
    public void fillingLoginFormAndSubmitIt(String login, String pass) {
        //openPage();
        enterLoginInToInputLogin(login);
        enterPassInToInputPassword(pass);
        clickOnButtonLogIn();
    }

    @Step
    // Заполнение полей новой формы с РНОКПП
    public void extFillingLoginFormAndSubmit(String login, String passwd, String code, String path, String passwdKey) {
        enterLoginInToInputLogin(login);
        enterPassInToInputPassword(passwd);
        enterPassInToInputRNOKPP(code);
        clickOnfieldCertificationCenter();
        scrollToResultCertificationCenter();
        clickOnResultCertificationCenter();
        enterPassInToInputFile(path);
        enterPassInToInputPasswordKey(passwdKey);
        Utils.waitABit(5);
        clickOnButtonLogIn();
   }

}
