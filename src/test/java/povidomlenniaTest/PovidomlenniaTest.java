package povidomlenniaTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class PovidomlenniaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPovidomlenniaIcon();
    }


    @Test
    public void viewPovidomlenniaPageTest() {
        mainPage.mainMenu.checkIsPovidomlenniaBlockTitlePresent();
        mainPage.mainMenu.clickOnSeeAllNotificationsBtn();
        povidomlenniaPage.checkIsPageURLPresent();
        povidomlenniaPage.checkIsPageTitlePresent();
        povidomlenniaPage.checkIsPageLogoPresent();
        povidomlenniaPage.dateFieldIsDisplayed();
        povidomlenniaPage.listInTableIsDisplayed();
    }
}