package audytTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Найти роль которая отвечает за аудит")
public class AudytTest extends AbstractParentTest {

    public String role = "adminCA";
    public JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
    public String pathToKey = (String) personData.get("pathToKey");
    public String absolute = Utils.getAbsolutePathToKey(pathToKey);



    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnAudyt();
    }

    @Test
    public void viewAkredytovaniOrgPageTest() {
        mainPage.mainMenu.clickOnAkredytovaniOrg();
        accreditedOrganizationsPage.checkIsPageTitlePresent();
        accreditedOrganizationsPage.checkIsPageLogoPresent();
        accreditedOrganizationsPage.checkIsPageURLPresent();
        accreditedOrganizationsPage.checkIsGridElementPresent();
        accreditedOrganizationsPage.checkAreGridListElementsPresent();
        accreditedOrganizationsPage.checkIsAddOrganizationBtnPresent();
    }

    @Test
    public void viewAudytPageTest() {
        mainPage.mainMenu.clickOnAudytSub();
        audytPage.checkIsPageTitlePresent();
        audytPage.checkIsPageLogoPresent();
        audytPage.checkIsPageURLPresent();
        audytPage.checkIsGridElementPresent();
        audytPage.checkAreGridListElementsPresent();
        audytPage.checkIsAddAudytBtnPresent();
    }

    @Test
    public void OrganizationCreateTest() {
        mainPage.mainMenu.clickOnAkredytovaniOrg();
        accreditedOrganizationsPage.clickOnAddOrganizationBtn();
    }
}