package preventiveZahodyTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class PreventiveZahodyTest extends AbstractParentTest {

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
        mainPage.mainMenu.clickOnPreventyvniZahody();
    }

    @Test
    public void viewPrevZahListTest() {
        preventiveZahodyPage.checkIsPageURLPresent();
        preventiveZahodyPage.checkIsPageTitlePresent();
        preventiveZahodyPage.checkIsPageLogoPresent();
        preventiveZahodyPage.checkIsGridElementPresent();
        preventiveZahodyPage.checkIsDownloadFileBtnPresent();
        preventiveZahodyPage.checkIsArchiveLinkPresent();
        preventiveZahodyPage.checkIsCreatePrevZahBtnPresent();
        preventiveZahodyPage.checkIsLink2018Present();
        preventiveZahodyPage.checkIsLink2019Present();
        preventiveZahodyPage.checkIsLink2020Present();
        preventiveZahodyPage.checkIsLink2022Present();
    }

    @Test
    public void searchResultPrevZahTest() {
        preventiveZahodyPage.clickOn2022Link();
        prevZah2020ListPage.enterSGCodeInToSearchField("19393752" + "\n");
        searchResultPrevZahPage.checkIsPageURLPresent();
        searchResultPrevZahPage.checkIsPageTitlePresent();
        searchResultPrevZahPage.checkIsPageLogoPresent();
        searchResultPrevZahPage.checkIsGridElementPresent();
        searchResultPrevZahPage.checkIsSearchResultPresent();
        searchResultPrevZahPage.checkIsViewPrevZahCardBtnPresent();
        searchResultPrevZahPage.checkIsUpdatePrevZahBtnPresent();
        searchResultPrevZahPage.checkIsSendPrevZahToArchiveBtnPresent();
        searchResultPrevZahPage.checkIsArchiveLinkPresent();
        searchResultPrevZahPage.checkIsLink2018Present();
        searchResultPrevZahPage.checkIsLink2019Present();
        searchResultPrevZahPage.checkIsLink2020Present();
        searchResultPrevZahPage.checkIsLink2022Present();
    }

    @Test
    public void za2018ListPrevZahTest() {
        preventiveZahodyPage.clickOn2018Link();
        prevZah2018ListPage.checkIsPageURLPresent();
        prevZah2018ListPage.checkIsPageTitlePresent();
        prevZah2018ListPage.checkIsPageLogoPresent();
        prevZah2018ListPage.checkIsGridElementPresent();
        // prevZah2018ListPage.checkIsGridListElementsPresent(); Добавить данные
        prevZah2018ListPage.checkIsDownloadFileBtnPresent();
        prevZah2018ListPage.checkIsArchiveLinkPresent();
        prevZah2018ListPage.checkIsCreatePrevZahBtnPresent();
        prevZah2018ListPage.checkIsLink2018Present();
        prevZah2018ListPage.checkIsLink2019Present();
        prevZah2018ListPage.checkIsLink2020Present();
        prevZah2018ListPage.checkIsLink2022Present();
    }

    @Test
    public void za2019ListPrevZahTest() {
        preventiveZahodyPage.clickOn2019Link();
        prevZah2019ListPage.checkIsPageURLPresent();
        prevZah2019ListPage.checkIsPageTitlePresent();
        prevZah2019ListPage.checkIsPageLogoPresent();
        prevZah2019ListPage.checkIsGridElementPresent();
        prevZah2019ListPage.checkIsDownloadFileBtnPresent();
        prevZah2019ListPage.checkIsArchiveLinkPresent();
        prevZah2019ListPage.checkIsCreatePrevZahBtnPresent();
        prevZah2019ListPage.checkIsLink2018Present();
        prevZah2019ListPage.checkIsLink2019Present();
        prevZah2019ListPage.checkIsLink2020Present();
        prevZah2019ListPage.checkIsLink2022Present();
    }

    @Test
    public void viewPrevZahCardTest() {
        preventiveZahodyPage.clickOn2022Link();
        prevZah2020ListPage.enterSGCodeInToSearchField("19393752" + "\n");
        searchResultPrevZahPage.clickOnViewPrevZahCardBtn();
        prevZahCardPage.checkIsPageTitlePresent();
        prevZahCardPage.checkIsPageURLPresent();
        prevZahCardPage.checkIsPageLogoPresent();
        prevZahCardPage.checkIsBackToPrevZahListLinkPresent();
        prevZahCardPage.checkIsPosadoviOsobyBlockPresent();
        prevZahCardPage.checkIsPrevZahBlockPresent();
        prevZahCardPage.checkIsResumePrevZahBlockPresent();
        prevZahCardPage.checkIsSGBlockPresent();
        prevZahCardPage.checkIsSphereBlockPresent();
        prevZahCardPage.checkIsUpdateInfoBtnPresent();
        prevZahCardPage.checkIsSaveBtnPresent();
    }

    @Test
    public void viewCreatePrevZahPageTest() {
        preventiveZahodyPage.clickOnCreatePrevZahBtn();
        createPrevZahPage.checkIsPageTitlePresent();
        createPrevZahPage.checkIsPageLogoPresent();
        createPrevZahPage.checkIsAllInfoBlockPresent();
        createPrevZahPage.checkIsAddSGBtnPresent();
        createPrevZahPage.checkIsResultsZahBlockIPresent();
        createPrevZahPage.checkIsAddInspectorBtnPresent();
        createPrevZahPage.checkIsSavePrevZahBtnPresent();
    }
}
