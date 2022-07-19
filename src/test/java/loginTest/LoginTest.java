package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.*;

import java.util.Arrays;
import java.util.Collection;

@Epic("IAS Test Reports")
@Feature("Login success Test")

@RunWith(Parameterized.class)

public class LoginTest extends AbstractParentTest {
    String login, pass;

    public LoginTest(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters(name = "Parameters are *{0} and {1}")
    public static Collection PositiveTestData() {
        return Arrays.asList(new Object[][]{
                        {"Oper@mns.Gov.Ua", "123456789"},
                        {"OPER@MNS.GOV.UA", "123456789"},  //LoginUppercase
                        {"oper@mns.gov.ua", "123456789"},  //LoginLowercase
                }
        );
    }

    @Description("Some detailed test description")
    @Story("Authorization")
    @Link("https://inspections.test.nais.gov.ua/")
    @Link(name = "allure", type = "oper@mns.gov.ua")
    @Issue("DEV-")
    @Issue("DEV-")
    @Severity(SeverityLevel.CRITICAL)

    @Test
    public void validTest() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.checkCurrentUrl();
        mainNotAuthPage.clickOnUviyty();
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.enterLoginInToInputLogin(login);
        loginPage.enterPassInToInputPassword(pass);
        loginPage.clickOnButtonLogIn();
        mainPage.checkIsPageURLPresent();
        mainPage.checkIsUserNamePresent();
        mainPage.checkIsPageTitlePresent();
    }
}
