package dovidkaTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class DovidkaTest extends AbstractParentTest {

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
        mainPage.mainMenu.clickOnDovidka();
    }

    @Test
    public void viewDovidkaContentTest() {
        dovidkaPage.checkCurrentUrl();
        dovidkaPage.checkIsPageTitlePresent();
        dovidkaPage.textInBlockElements_1IsDisplayed();
        dovidkaPage.textInBlockElements_2IsDisplayed();
        dovidkaPage.textInBlockElements_3IsDisplayed();
        dovidkaPage.textInBlockElements_4IsDisplayed();
    }
}