package sphereTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SphereTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
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