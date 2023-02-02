package ratingSGTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;


public class RatingSGTest extends AbstractParentTest {

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
        mainPage.mainMenu.clickOnRatingSG();
    }

    @Test
    public void viewRatingSGPageTest() {
        ratingSGPage.checkIsPageURLPresent();
        ratingSGPage.checkIsPageTitlePresent();
        ratingSGPage.checkIsPageLogoPresent();
        ratingSGPage.checkIsRatingHistoryBtnPresent();
        ratingSGPage.checkIsApproveRatingBtnPresent();
        ratingSGPage.checkIsIconDownloadPresent();
        ratingSGPage.checkIsSphereFieldPresent();
        ratingSGPage.checkIsRegulatorFieldPresent();
        ratingSGPage.checkIsGridElementPresent();
        ratingSGPage.checkIsGridListElementsPresent();
        ratingSGPage.checkIsSGNameLinkPresent();
        ratingSGPage.checkIsAllMaxBalPresentOnFirstPosition();
    }

    @Test
    public void backToRatingSGFromHistoryRatingPageTest() {
        ratingSGPage.clickOnRatingHistoryBtn();
        historyOfRatingsSGPage.checkIsPageURLPresent();
        historyOfRatingsSGPage.checkIsPageTitlePresent();
        historyOfRatingsSGPage.clickOnBackToRatingPageLink();
        ratingSGWithSpherePage.checkIsPageURLPresent();
        ratingSGWithSpherePage.checkIsPageTitlePresent();
    }
}