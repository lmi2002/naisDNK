package formyActInspTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class FormyActInspTest extends AbstractParentTest {


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
        mainPage.mainMenu.clickOnFormyAktiv();
    }

    @Test
    public void viewDocumentsListTest() {
        typeActInspPage.checkCurrentUrl();
        typeActInspPage.pageTitleIsDisplayed();
        typeActInspPage.gridElementIsDisplayed();
        typeActInspPage.gridListElementsIsDisplayed();
        typeActInspPage.searchBtnIsDisplayed();
        typeActInspPage.cleanFiltersBtnIsDisplayed();
    }

    @Test
    public void viewTypeActInspSearchResultTest() throws InterruptedException {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження уніфікованої форми акта,");
        typeActInspPage.searchBtnIsDisplayed();
        typeActInspPage.clickOnSearchBtn();
        typeActInspSearchResult.waiting();
        typeActInspSearchResult.pageTitleIsDisplayed();
        typeActInspSearchResult.gridSearchListElementsIsDisplayed();
        typeActInspSearchResult.gridElementIsDisplayed();
    }

    @Test
    public void viewTypeActInspCardTest() throws InterruptedException {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження уніфікованої форми акта");
        typeActInspPage.clickOnSearchBtn();
        typeActInspSearchResult.waiting();
        typeActInspSearchResult.clickOnViewCardBtn();
        viewTypeActInspCardPage.checkIsPageURLPresent();
        viewTypeActInspCardPage.checkIsPageTitlePresent();
        viewTypeActInspCardPage.checkIsBlockPart1Present();
        viewTypeActInspCardPage.checkIsBlockPart2Present();
        viewTypeActInspCardPage.part1TitleIsDisplayed();
        viewTypeActInspCardPage.part2TitleIsDisplayed();
        viewTypeActInspCardPage.part3TitleIsDisplayed();
    }

    @Test
    public void viewTypeActInspListNPATest() throws InterruptedException {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження Положення про організацію та здійснення державного гірничого нагляду,");
        typeActInspSearchResult.clickOnViewCardBtn();
        typeActInspSearchResult.waiting();
        viewTypeActInspCardPage.clickOnPerelikNPALink();
        viewTypeActInspListNPAPage.checkIsPageURLPresent();
        viewTypeActInspListNPAPage.checkIsPageTitlePresent();
        viewTypeActInspListNPAPage.checkIsPageLogoPresent();
        viewTypeActInspListNPAPage.checkIsBlockPart1Present();
        viewTypeActInspListNPAPage.checkIsBlockPart2Present();
        viewTypeActInspListNPAPage.checkIsBlockPart3Present();
        viewTypeActInspListNPAPage.checkIsPart1TitlePresent();
        viewTypeActInspListNPAPage.checkIsPart2TitlePresent();
        viewTypeActInspListNPAPage.checkIsPart3TitlePresent();
        viewTypeActInspListNPAPage.checkIsBlockAllInfoPresent();
    }

    @Test
    public void viewTypeActInspListQuestionsTest() throws InterruptedException {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження Положення про організацію та здійснення державного гірничого нагляду,");
        typeActInspSearchResult.clickOnViewCardBtn();
        typeActInspSearchResult.waiting();
        viewTypeActInspCardPage.clickOnPerelikNPALink();
        viewTypeActInspListNPAPage.clickOnPerelikQuestionsLink();
        viewTypeActInspQuestionsPage.checkIsPageURLPresent();
        viewTypeActInspQuestionsPage.checkIsPageLogoPresent();
        viewTypeActInspQuestionsPage.checkIsPageTitlePresent();
        viewTypeActInspQuestionsPage.checkIsPart1TitlePresent();
        viewTypeActInspQuestionsPage.checkIsPart2TitlePresent();
        viewTypeActInspQuestionsPage.checkIsPart3TitlePresent();
        viewTypeActInspQuestionsPage.checkIsBlockPart1Present();
        viewTypeActInspQuestionsPage.checkIsBlockPart2Present();
        viewTypeActInspQuestionsPage.checkIsBlockPart3Present();
    }
}
