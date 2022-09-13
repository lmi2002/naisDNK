package skargyDoDRSTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SkargyDoDRSTest extends AbstractParentTest {

    @Ignore("Узнать роль которая создает скарги до ДРС")
    @Before
    public void preconditions() {
        String role = "officialPersonCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnSkargyDoDRS();
    }

    @Test
    public void createSkargaDoDRSTest() {
        skargyDoDRSPage.checkIsPageURLPresent();
        skargyDoDRSPage.checkIsPageLogoPresent();
        skargyDoDRSPage.checkIsPageTitlePresent();
        skargyDoDRSPage.clickOnCreateSkargaBtn();
        skargyDoDRSPage.clickOnInspSelectField();
        skargyDoDRSPage.clickOnInspItem();
        skargyDoDRSPage.enterSkargaTextInToInputField("Суть скарги на перевірку");
        skargyDoDRSPage.clickOnSaveSkargaBtn();
        skargyDoDRSPage.checkIsUspih_createSkarga_message_modalWinPresent();
        skargyDoDRSPage.clickOnCloseModalWinBtn();
    }
}
