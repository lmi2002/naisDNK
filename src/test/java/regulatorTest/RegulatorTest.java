package regulatorTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class RegulatorTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonPO_MR";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnPerelikKO();
    }

    @Test
    public void regulatorsTest() {
        regulatorPage.checkIsPageURLPresent();
        regulatorPage.checkIsPageTitlePresent();
        regulatorPage.checkIsPageLogoPresent();
        regulatorPage.checkIsGridElementPresent();
        regulatorPage.checkIsGridListElementsPresent();
    }

    @Test
    public void searchRegulatorResultTest() {
        regulatorPage.enterRegulatorNameInToSearchField("Державна служба України з питань праці" + "\n");
        regulatorSearchResultPage.checkIsPageURLPresent();
        regulatorSearchResultPage.checkIsPageTitlePresent();
        regulatorSearchResultPage.checkIsPageLogoPresent();
        regulatorSearchResultPage.checkIsGridElementPresent();
        regulatorSearchResultPage.checkIsGridListElementsPresent();
        regulatorSearchResultPage.checkIsOMCLinkPresent();
    }

    @Test
    public void viewRegulatorCardTest() {
        regulatorPage.enterRegulatorNameInToSearchField("Державна служба України з питань праці" + "\n");
        regulatorSearchResultPage.clickOnViewRegulatorCardLink();
        viewRegulatorCardPage.checkIsPageTitlePresent();
        viewRegulatorCardPage.checkIsPageLogoPresent();
        viewRegulatorCardPage.checkIsGridElementPresent();
        viewRegulatorCardPage.checkIsGridListElementsPresent();
        viewRegulatorCardPage.checkIsInspectorInfoBlockPresent();
    }
}
