package ratingSGTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;


public class RatingSGTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
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