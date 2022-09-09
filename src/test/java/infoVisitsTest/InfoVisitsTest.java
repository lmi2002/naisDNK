package infoVisitsTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class InfoVisitsTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonPO_MR";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPerevirky();
        mainPage.mainMenu.clickOnInformaciyniVidviduvannia();
    }

    @Test
    public void viewInfoVisitListTest() {
        infoVisitPage.checkCurrentUrl();
        infoVisitPage.checkIsPageURLPresent();
        infoVisitPage.checkIsPageTitlePresent();
        infoVisitPage.checkIsPageLogoPresent();
        infoVisitPage.checkIsGridElementPresent();
        // infoVisitPage.checkIsGridListElementsPresent();
        infoVisitPage.checkIsArchiveLinkPresent();
        infoVisitPage.checkIsCreateInfoVisitBtnPresent();
        infoVisitPage.checkIsLink2018Present();
        infoVisitPage.checkIsLink2019Present();
        infoVisitPage.checkIsLink2020Present();
        infoVisitPage.checkIsLink2021Present();
        infoVisitPage.checkIsLink2022Present();
    }

    @Test
    public void searchResultInfoVisitTest() {
        infoVisitPage.clickOn2022Link();
        infoVisitPage.enterSGCodeInToSearchField("30356126" + "\n");
        searchResultInfoVisitPage.checkIsPageURLPresent();
        searchResultInfoVisitPage.checkIsPageTitlePresent();
        searchResultInfoVisitPage.checkIsPageLogoPresent();
        searchResultInfoVisitPage.checkIsGridElementPresent();
        searchResultInfoVisitPage.checkIsGridListElementsPresent();
        searchResultInfoVisitPage.checkIsSearchResultPresent();
        searchResultInfoVisitPage.checkIsViewInfoVisitCardBtnPresent();
        searchResultInfoVisitPage.checkIsUpdateInfoVisitBtnPresent();
        searchResultInfoVisitPage.checkIsSendInfoVisitToArchiveBtnPresent();
        searchResultInfoVisitPage.checkIsArchiveLinkPresent();
        searchResultInfoVisitPage.checkIsLink2018Present();
        searchResultInfoVisitPage.checkIsLink2019Present();
        searchResultInfoVisitPage.checkIsLink2020Present();
    }

    @Test
    public void za2018ListInfoVisitTest() {
        infoVisitPage.clickOn2018Link();
        infoVisit2018ListPage.checkIsPageURLPresent();
        infoVisit2018ListPage.checkIsPageTitlePresent();
        infoVisit2018ListPage.checkIsPageLogoPresent();
        infoVisit2018ListPage.checkIsGridElementPresent();
        // infoVisit2018ListPage.checkIsGridListElementsPresent();
        infoVisit2018ListPage.checkIsLink2018Present();
        infoVisit2018ListPage.checkIsLink2019Present();
        infoVisit2018ListPage.checkIsLink2020Present();
        infoVisit2018ListPage.checkIsCreateInfoVisitBtnPresent();
    }

    @Test
    public void za2019ListInfoVisitTest() {
        infoVisitPage.clickOn2019Link();
        infoVisit2019ListPage.checkIsPageURLPresent();
        infoVisit2019ListPage.checkIsPageTitlePresent();
        infoVisit2019ListPage.checkIsPageLogoPresent();
        infoVisit2019ListPage.checkIsGridElementPresent();
        // infoVisit2019ListPage.checkIsGridListElementsPresent();
        infoVisit2019ListPage.checkIsArchiveLinkPresent();
        infoVisit2019ListPage.checkIsLink2018Present();
        infoVisit2019ListPage.checkIsLink2019Present();
        infoVisit2019ListPage.checkIsLink2020Present();
        infoVisit2019ListPage.checkIsCreateInfoVisitBtnPresent();
    }

    @Test
    public void viewInfoVisitCardTest() {
        infoVisitPage.clickOn2022Link();
        infoVisitPage.enterSGCodeInToSearchField("30356126" + "\n");
        searchResultInfoVisitPage.clickOnViewInfoVisitCardBtn();
        infoVisitCardPage.checkIsPageURLPresent();
        infoVisitCardPage.checkIsPageTitlePresent();
        infoVisitCardPage.checkIsPageLogoPresent();
        infoVisitCardPage.checkIsBackToInfoVisitListLinkPresent();
        infoVisitCardPage.checkIsAllDataBlockPresent();
        infoVisitCardPage.checkIsDownloadBtnPresent();
        infoVisitCardPage.checkIsUpdateBtnPresent();
        infoVisitCardPage.checkIsPokaznykyEffectZahBlockPresent();
        infoVisitCardPage.checkIsResumeZahBlockPresent();
    }

    @Test
    public void viewCreateInfoVisitPageTest() {
        infoVisitPage.clickOn2022Link();
        infoVisitPage.clickOnCreateInfoVisitBtn();
        createInfoVisitPage.checkIsPageTitlePresent();
        createInfoVisitPage.checkIsPageLogoPresent();
        createInfoVisitPage.checkIsAddInspectorBtnPresent();
        createInfoVisitPage.checkIsCreatePrevZahBtnPresent();
        createInfoVisitPage.checkIsIndicatorsInfoBlockPresent();
        createInfoVisitPage.checkIsIndicatorsInfoTitlePresent();
        createInfoVisitPage.checkIsResultsZahBlockPresent();
        createInfoVisitPage.checkIsResultsZahTitlePresent();
        createInfoVisitPage.checkIsAllInfoBlockPresent();
        createInfoVisitPage.checkIsAllInfoBlockTitlePresent();
    }
}
