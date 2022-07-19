package regulatorTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class RegulatorTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnPerelikKO();
    }

    @Test
    public void regulatorsTest() {
        regulatorPage.checkIsPageURLPresent();
        regulatorPage.checkIsPageTitlePresent();
        regulatorPage.checkIsPageLogoPresent();
        regulatorPage.checkIsGridElementPresent();
        regulatorPage.checkIsGridListElementsPresent();
    }

    @Test
    public void searchRegulatorResultTest() {
        regulatorPage.enterRegulatorNameInToSearchField("Державна служба України з питань праці" + "\n");
        regulatorSearchResultPage.checkIsPageURLPresent();
        regulatorSearchResultPage.checkIsPageTitlePresent();
        regulatorSearchResultPage.checkIsPageLogoPresent();
        regulatorSearchResultPage.checkIsGridElementPresent();
        regulatorSearchResultPage.checkIsGridListElementsPresent();
        regulatorSearchResultPage.checkIsOMCLinkPresent();
    }

    @Test
    public void viewRegulatorCardTest() {
        regulatorPage.enterRegulatorNameInToSearchField("Державна служба України з питань праці" + "\n");
        regulatorSearchResultPage.clickOnViewRegulatorCardLink();
        viewRegulatorCardPage.checkIsPageTitlePresent();
        viewRegulatorCardPage.checkIsPageLogoPresent();
        viewRegulatorCardPage.checkIsGridElementPresent();
        viewRegulatorCardPage.checkIsGridListElementsPresent();
        viewRegulatorCardPage.checkIsInspectorInfoBlockPresent();
    }
}
