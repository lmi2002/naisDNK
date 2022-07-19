package formyActInspTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class FormyActInspTest extends AbstractParentTest {


    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("oper@mns.gov.ua", "123456789");
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
    public void viewTypeActInspSearchResultTest() {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження уніфікованої форми акта,");
        typeActInspPage.searchBtnIsDisplayed();
        typeActInspPage.clickOnSearchBtn();
        typeActInspSearchResult.pageTitleIsDisplayed();
        typeActInspSearchResult.gridSearchListElementsIsDisplayed();
        typeActInspSearchResult.gridElementIsDisplayed();
    }

    @Test
    public void viewTypeActInspCardTest() {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження уніфікованої форми акта,");
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
    public void viewTypeActInspListNPATest() {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження Положення про організацію та здійснення державного гірничого нагляду,");
        typeActInspSearchResult.clickOnViewCardBtn();
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
    public void viewTypeActInspListQuestionsTest() {
        typeActInspPage.enterNPANameInToSearchField("Про затвердження Положення про організацію та здійснення державного гірничого нагляду,");
        typeActInspSearchResult.clickOnViewCardBtn();
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
