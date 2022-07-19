package spivrobitnykyOrganuTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SpivrobitnykyOrganuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnSpivrobitnykyOrganu();
    }

    @Test
    public void viewSpivrobOrganivPageTest() {
        spivrobitnykyOrganivPage.checkIsPageURLPresent();
        spivrobitnykyOrganivPage.checkIsPageTitlePresent();
        spivrobitnykyOrganivPage.checkIsPageLogoPresent();
        spivrobitnykyOrganivPage.gridElementIsDisplayed();
        spivrobitnykyOrganivPage.statisticBlockIsDisplayed();
        spivrobitnykyOrganivPage.approvedEmployeesLinkIsDisplayed();
        spivrobitnykyOrganivPage.unapprovedEmployeesLinkIsDisplayed();
        spivrobitnykyOrganivPage.actualRequestsLinkIsDisplayed();
    }

    @Test
    public void viewApprovedEmployeesOrgPageTest() {
        spivrobitnykyOrganivPage.clickOnApprovedEmployeesLink();
        approvedEmployeesOrgPage.checkIsPageURLPresent();
        approvedEmployeesOrgPage.checkIsPageLogoPresent();
        approvedEmployeesOrgPage.statisticBlockIsDisplayed();
        approvedEmployeesOrgPage.approvedEmployeesLinkIsDisplayed();
        approvedEmployeesOrgPage.unapprovedEmployeesLinkIsDisplayed();
        approvedEmployeesOrgPage.saveFileBtnIsDisplayed();
        approvedEmployeesOrgPage.unapprovedZayavkaBtnIsDisplayed();
        approvedEmployeesOrgPage.editZayavkaBtnIsDisplayed();
        approvedEmployeesOrgPage.actualZayavkiLinkIsDisplayed();
    }

    @Test
    public void viewActualZayavkiSOPageTest() {
        spivrobitnykyOrganivPage.clickOnApprovedEmployeesLink();
        unapprovedEmployeesOrgPage.clickOnActualZayavkiLink();
        actualZayavkiSOPage.checkIsPageLogoPresent();
        actualZayavkiSOPage.gridElementIsDisplayed();
        actualZayavkiSOPage.statisticBlockIsDisplayed();
        actualZayavkiSOPage.approvedEmployeesLinkIsDisplayed();
        actualZayavkiSOPage.unapprovedEmployeesLinkIsDisplayed();
        actualZayavkiSOPage.saveFileBtnIsDisplayed();
        actualZayavkiSOPage.unapprovedEmployeeBtnIsDisplayed();
        actualZayavkiSOPage.editEmployeeBtnIsDisplayed();
        actualZayavkiSOPage.actualRequestsLinkIsDisplayed();
    }

    @Test
    public void viewUnapprovedEmployeesOrgPageTest() {
        spivrobitnykyOrganivPage.clickOnUnapprovedEmployeesLink();
        unapprovedEmployeesOrgPage.checkIsPageURLPresent();
        unapprovedEmployeesOrgPage.checkIsPageLogoPresent();
        unapprovedEmployeesOrgPage.statisticBlockIsDisplayed();
        unapprovedEmployeesOrgPage.approvedEmployeesLinkIsDisplayed();
        unapprovedEmployeesOrgPage.unapprovedEmployeesLinkIsDisplayed();
        unapprovedEmployeesOrgPage.saveFileBtnIsDisplayed();
        unapprovedEmployeesOrgPage.actualZayavkiLinkIsDisplayed();
        unapprovedEmployeesOrgPage.approvedEmployeeBtnIsDisplayed();
    }

    @Test
    public void searchResultApproveEmployeesOrgPageTest() {
        spivrobitnykyOrganivPage.clickOnApprovedEmployeesLink();
        approvedEmployeesOrgPage.enterPIBInToSearchField("Test Auto" + "\n");
        searchResultApprovedSOPage.checkIsEmployeePIBPresent();
    }
}