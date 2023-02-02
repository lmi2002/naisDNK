package analitykaTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AnalitykaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        analitykaPage.openPage();
        analitykaPage.checkCurrentAdminUrl();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("lifecomru53@gmail.com", "123456789");
    }
    @Ignore("Авторизация проходит через лигин и пароль через ссылку админа")
    @Test
    public void analitykaVisibleTest() throws InterruptedException {
        analitykaPage.pageTitleIsDisplayed();
        analitykaPage.tabTitleIsDisplayed();
        analitykaPage.checkIsBlock_ТипПеревірки_Present();
        analitykaPage.checkIsBlock_НаявністьПорушень_Present();
        analitykaPage.checkIsBlock_НаявністьСанкцій_Present();
        analitykaPage.checkIsBlock_СтупіньРизику_Present();
        analitykaPage.checkIsBlock_СтанПеревірки_Present();
        analitykaPage.checkIsBlock_Вимір_Present();
        analitykaPage.checkIsBlock_Період_Present();
    }
}
