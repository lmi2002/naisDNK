package loginTest;

import abstractParentTest.AbstractParentTest;
import io.qameta.allure.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Epic("IAS Test Reports")
@Feature("LogOn negative tests")
@Ignore("Нужно переписывать автотесты")
public class NegativeLoginTest extends AbstractParentTest {

    // negative tests

    @Description("Some detailed test description")
    @Story("Authorization")
    @Link("https://inspections.test.nais.gov.ua" + "/")
    @Link(name = "allure", type = "mylink")
    @Issue("123")
    @Issue("432")
    @Severity(SeverityLevel.CRITICAL)

    @Before
    public void Preconditions() {
        loginPage.openPage();
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
    }

    @Test
    public void emptyData() {
        loginPage.fillingLoginFormAndSubmitIt("", "");
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.checkIsErrorMessageTextEmailPresent();
        loginPage.checkIsErrorMessageTextPasswordPresent();
    }

    @Test
    public void emptyDataWithoutEnterData() {
        loginPage.clickOnButtonLogIn();
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.checkIsErrorMessageTextEmailPresent();
        loginPage.checkIsErrorMessageTextPasswordPresent();
    }

    @Test
    public void invalidLoginValidPass() {
        loginPage.fillingLoginFormAndSubmitIt("Voper@mns.gov.ua", "123456789");
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.checkIsErrorMessageTextInvalidLoginOrPassword();
    }

    @Test
    public void invalidLoginInvalidPass() {
        loginPage.fillingLoginFormAndSubmitIt("admin@ua", "000000");
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.checkIsErrorMessageTextInvalidLoginOrPassword();
    }

    @Test
    public void validLoginInvalidPass() {
        loginPage.fillingLoginFormAndSubmitIt("oper@mns.gov.ua", "a22222");
        loginPage.checkIsPageURLPresent();
        loginPage.checkIsPageTitlePresent();
        loginPage.checkIsErrorMessageTextInvalidLoginOrPassword();
    }
}
