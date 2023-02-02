package uzgodzhenniaDatePageTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Функционал отсутствует")
public class UzgodzhenniaDatePageTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPerevirky();
    }

    @Test
    public void uzgodzhenniaDatePageTest() {
        mainPage.mainMenu.clickOnUzgodzhenniaDate();
        uzgodzhenniaDatePage.checkIsPageURLPresent();
        uzgodzhenniaDatePage.checkIsPageTitlePresent();
        uzgodzhenniaDatePage.checkIsPageLogoPresent();
        uzgodzhenniaDatePage.checkIsGridElementPresent();
        uzgodzhenniaDatePage.checkIsGridListElementsPresent();
        uzgodzhenniaDatePage.checkIsPageInspTitle_Present("Перелік пропозицій на зміну дати перевірки");
    }
}
