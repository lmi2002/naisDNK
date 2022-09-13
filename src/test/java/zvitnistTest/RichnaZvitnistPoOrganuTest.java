package zvitnistTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class RichnaZvitnistPoOrganuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnZvitnist();
    }

    @Test
    public void richnaZvitnistPoOrganuPageTest() {
        mainPage.mainMenu.clickOnRichnaZvitPoOrganu();
        richnaZvitnistPoOrganuPage.checkIsPageURLPresent();
        richnaZvitnistPoOrganuPage.checkIsPageTitlePresent();
        richnaZvitnistPoOrganuPage.checkIsPageLogoPresent();
        richnaZvitnistPoOrganuPage.checkIsGridElementPresent();
        richnaZvitnistPoOrganuPage.checkIsGridListElementsPresent();
        richnaZvitnistPoOrganuPage.checkIsDownload2019IconPresent();
        richnaZvitnistPoOrganuPage.checkIsDownload2020IconPresent();
        richnaZvitnistPoOrganuPage.checkIsEdit2019IconPresent();
        richnaZvitnistPoOrganuPage.checkIsEdit2020IconPresent();
    }

    @Test
    public void richnaZvitnistPoOrganuEditPageTest() {
        mainPage.mainMenu.clickOnRichnaZvitPoOrganu();
        richnaZvitnistPoOrganuPage.clickOnEdit2019Icon();
        editZvit2019Page.checkIsPageURLPresent();
        editZvit2019Page.checkIsPageTitlePresent();
        editZvit2019Page.checkIsPageLogoPresent();
        editZvit2019Page.checkIsGridElementPresent();
        editZvit2019Page.checkIsGridListElementsPresent();
        editZvit2019Page.checkIsSaveBtnPresent();
        editZvit2019Page.checkIsBackToZvitListLinkPresent();
    }
}

