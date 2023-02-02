package richniPlanTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class ViewZminyDoRichnogoPlanTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPlanyPerevirok();
        mainPage.mainMenu.clickOnRichniPlany();
        richniPlansMainPage.checkIsPageURLPresent();
    }

    @Test
    public void richniPlanCOrgMainPageTest() {
        richniPlansMainPage.checkIsPageTitlePresent();
        richniPlansMainPage.checkIsGoToNakazListAboutChangesLinkPresent();
        richniPlansMainPage.clickOnGoToNakazListAboutChangesLink();
        richniPlanChangesPage.checkIsPageURLPresent();
        richniPlanChangesPage.checkIsPageTitlePresent();
        richniPlanChangesPage.checkIsPageURLPresent();
        richniPlanChangesPage.checkIsGridListNumberElementPresent();
        richniPlanChangesPage.checkIsSaveNakaz_1_lineBtnPresent();
        richniPlanChangesPage.checkIsSaveNakaz_2_lineBtnPresent();
    }
}
