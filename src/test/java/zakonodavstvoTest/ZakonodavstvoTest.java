package zakonodavstvoTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZakonodavstvoTest extends AbstractParentTest {

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
        mainPage.mainMenu.clickOnZakonodavsnvo();
    }

    @Test
    public void viewDocumentsListTest() {
        documentsPage.checkCurrentUrl();
        documentsPage.pageTitleIsDisplayed();
        documentsPage.gridElementIsDisplayed();
        documentsPage.gridListElementsIsDisplayed();
    }

    @Test
    public void createManualDocumentTest() {
        documentsPage.clickOnAddDocumentBtn();
        createDocumentPage.checkCurrentUrl();
        createDocumentPage.pageTitleIsDisplayed();
        createDocumentPage.clickOnNPALink();
        createDocumentPage.clickOnAddAnotherActLink();
        createManualDocumentPage.checkCurrentUrl();
        createManualDocumentPage.pageTitleIsDisplayed();
        createManualDocumentPage.infoBlockMenuIsDisplayed();
        createManualDocumentPage.enterDocumentNameInToField("Автоматизоване тестування");
        createManualDocumentPage.enterDocumentShortNameInToField("AT");
        createManualDocumentPage.clickOnActType();
        createManualDocumentPage.clickOnActTypeDSTU();
        createManualDocumentPage.enterActNumberInToField("555");
        createManualDocumentPage.clickOnStatusField();
        createManualDocumentPage.clickOnSelectStatus();
        createManualDocumentPage.enterLinkInToField("https://regulation.gov.ua/documents/id238573");
        createManualDocumentPage.clickOnNpaField();
        createManualDocumentPage.clickOnSelectNpa();
        createManualDocumentPage.clickOnDataField();
        createManualDocumentPage.enterDateInToField("2020-05-05");
        createManualDocumentPage.enterNpaNumber("25");
        createManualDocumentPage.clickOnNpaTypeField();
        createManualDocumentPage.clickOnSelectNpaType();
        createManualDocumentPage.clickOnSelectSphere();
        createManualDocumentPage.clickOnSelectAllSphere();
        createManualDocumentPage.clickOnCreateBtn();
    }
}