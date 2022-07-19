package ratingInspectorsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class RatingInspectorsTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
        mainPage.mainMenu.clickOnPerevirky();
        mainPage.mainMenu.clickOnOcinyuvannyaInspectoriv();
    }

    @Test
    public void ratingInspectorsAllTest() {
        ratingInspectorsAllPage.checkCurrentUrl();
        ratingInspectorsAllPage.pageTitleIsDisplayed();
        ratingInspectorsAllPage.gridElementIsDisplayed();
        ratingInspectorsAllPage.infoBlockIsDisplayed();
        ratingInspectorsAllPage.u2018YearLinkIsDisplayed();
        ratingInspectorsAllPage.u2019YearLinkIsDisplayed();
        ratingInspectorsAllPage.u2020YearLinkIsDisplayed();
        ratingInspectorsAllPage.u2022YearLinkIsDisplayed();
    }

    @Test
    public void ratingInspectors2018Test() {
        ratingInspectorsAllPage.clickOnU2018YearLink();
        ratingInspectors2018Page.checkCurrentUrl();
        ratingInspectors2018Page.pageTitleIsDisplayed();
        ratingInspectors2018Page.gridElementIsDisplayed();
        ratingInspectors2018Page.gridListElementsIsDisplayed();
        ratingInspectors2018Page.infoBlockIsDisplayed();
        ratingInspectors2018Page.u2018YearLinkIsDisplayed();
        ratingInspectors2018Page.u2019YearLinkIsDisplayed();
        ratingInspectors2018Page.u2020YearLinkIsDisplayed();
        ratingInspectors2018Page.u2022YearLinkIsDisplayed();
    }

    @Test
    public void ratingInspectors2019Test() {
        ratingInspectorsAllPage.clickOnU2019YearLink();
        ratingInspectors2019Page.checkCurrentUrl();
        ratingInspectors2019Page.pageTitleIsDisplayed();
        ratingInspectors2019Page.gridElementIsDisplayed();
        ratingInspectors2019Page.gridListElementsIsDisplayed();
        ratingInspectors2019Page.infoBlockIsDisplayed();
        ratingInspectors2019Page.u2018YearLinkIsDisplayed();
        ratingInspectors2019Page.u2019YearLinkIsDisplayed();
        ratingInspectors2019Page.u2020YearLinkIsDisplayed();
        ratingInspectors2019Page.u2022YearLinkIsDisplayed();
    }

    @Test
    public void ratingInspectors2020Test() {
        ratingInspectorsAllPage.clickOnU2020YearLink();
        ratingInspectors2020Page.checkCurrentUrl();
        ratingInspectors2020Page.pageTitleIsDisplayed();
        ratingInspectors2020Page.gridElementIsDisplayed();
        ratingInspectors2020Page.gridListElementsIsDisplayed();
        ratingInspectors2020Page.infoBlockIsDisplayed();
        ratingInspectors2020Page.u2018YearLinkIsDisplayed();
        ratingInspectors2020Page.u2019YearLinkIsDisplayed();
        ratingInspectors2020Page.u2020YearLinkIsDisplayed();
        ratingInspectors2020Page.u2022YearLinkIsDisplayed();
    }

    @Test
    public void ratingInspectors2022Test() {
        ratingInspectorsAllPage.clickOnU2022YearLink();
        ratingInspectors2022Page.checkCurrentUrl();
        ratingInspectors2022Page.pageTitleIsDisplayed();
        ratingInspectors2022Page.gridElementIsDisplayed();
        ratingInspectors2022Page.gridListElementsIsDisplayed();
        ratingInspectors2022Page.infoBlockIsDisplayed();
        ratingInspectors2022Page.u2018YearLinkIsDisplayed();
        ratingInspectors2022Page.u2019YearLinkIsDisplayed();
        ratingInspectors2022Page.u2020YearLinkIsDisplayed();
        ratingInspectors2022Page.u2022YearLinkIsDisplayed();
    }

    @Test
    public void viewRegulatorsCardTest() {
        ratingInspectorsAllPage.clickOnU2020YearLink();
        ratingInspectors2020Page.clickOnViewRegulatorCardBtn();
        viewRegulatorCardPage.checkIsPageURLPresent();
        viewRegulatorCardPage.checkIsGridElementPresent();
        viewRegulatorCardPage.checkIsGridListElementsPresent();
        viewRegulatorCardPage.checkIsInspectorInfoBlockPresent();
    }
}
