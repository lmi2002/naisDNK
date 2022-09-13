package storinkaOrganuSubMenuTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class StorinkaOrganuSubMenuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
    }

    @Test
    public void viewSubjectsPageElementsTest() {
        subjectsListPage.checkCurrentUrl();
        subjectsListPage.pageTitleIsDisplayed();
        subjectsListPage.gridElementIsDisplayed();
        subjectsListPage.gridListElementsIsDisplayed();
    }
}