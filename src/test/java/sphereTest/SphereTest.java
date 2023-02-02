package sphereTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SphereTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnPerelikSferKontrolyu();
    }

    @Test
    public void sphereViewListTest() {
        spherePage.checkIsPageURLPresent();
        spherePage.checkIsPageTitlePresent();
        spherePage.checkIsPageLogoPresent();
        spherePage.checkIsGridElementPresent();
        spherePage.checkIsGridListElementsPresent();
    }


    @Ignore ("Не раб. Добавить данные")
    @Test
    public void sphereViewCardTest() {
        spherePage.clickOnSphereNameLink();
        sphereCardPage.checkIsPageURLPresent();
        sphereCardPage.checkIsPageTitlePresent();
        sphereCardPage.checkIsPageLogoPresent();
        sphereCardPage.checkIsGridElementPresent();
        sphereCardPage.checkIsGridTitlePresent();
        sphereCardPage.checkIsGridInfoBlockPresent();
    }


    @Ignore ("Не раб. Добавить данные")
    @Test
    public void sphereViewSphereCriteriaTest() {
        spherePage.clickOnSphereNameLink();
        sphereCardPage.clickOnCriteriaItem();
        sphereCriteriaPage.checkIsPageURLPresent();
        sphereCriteriaPage.checkIsPageTitlePresent();
        sphereCriteriaPage.checkIsGridTitlePresent();
        sphereCriteriaPage.checkIsGridElementPresent();
        sphereCriteriaPage.checkIsGridInfoBlockPresent();
    }

    @Ignore ("Не раб. Добавить данные")
    @Test
    public void sphereViewSphereQuestionListTest() {
        spherePage.clickOnSphereNameLink();
        sphereCardPage.clickOnQuestionListItem();
        sphereQuestionPage.checkIsPageURLPresent();
        sphereQuestionPage.checkIsPageTitlePresent();
        sphereQuestionPage.checkIsPageLogoPresent();
        sphereQuestionPage.checkIsGridElementPresent();
        sphereQuestionPage.checkIsGridTitlePresent();
        sphereQuestionPage.checkIsGridInfoBlockPresent();
    }

    @Ignore ("Не раб. Добавить данные")
    @Test
    public void sphereViewSpherePerelikNPATest() {
        spherePage.clickOnSphereNameLink();
        sphereCardPage.clickOnPerelikNPAItem();
        spherePerelikNPAPage.checkIsPageURLPresent();
        spherePerelikNPAPage.checkIsPageTitlePresent();
        spherePerelikNPAPage.checkIsPageLogoPresent();
        spherePerelikNPAPage.checkIsGridElementPresent();
        spherePerelikNPAPage.checkIsGridTitlePresent();
        spherePerelikNPAPage.checkIsGridInfoBlockPresent();
    }

    @Test
    public void sphereViewSphereVymogyTest() {
        spherePage.clickOnSphereNameLink();
        sphereCardPage.clickOnVymogyItem();
        sphereVymogyPage.checkIsPageURLPresent();
        sphereVymogyPage.checkIsPageLogoPresent();
        sphereVymogyPage.gridTitleIsDisplayed();
        sphereVymogyPage.gridInfoBlockIsDisplayed();
        sphereVymogyPage.clickOnBackToSphereListLink();
        spherePage.checkIsPageURLPresent();
        spherePage.checkIsPageTitlePresent();
    }
}