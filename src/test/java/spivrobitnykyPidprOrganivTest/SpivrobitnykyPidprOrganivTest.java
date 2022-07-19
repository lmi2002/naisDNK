package spivrobitnykyPidprOrganivTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SpivrobitnykyPidprOrganivTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnSpivrobitnyPidporydkovanyhOrganiv();
    }

    @Test
    public void viewSpivrobPidpOrganivPageTest() {
        spivrobitnykyPidpOrganivPage.checkIsPageURLPresent();
        spivrobitnykyPidpOrganivPage.checkIsPageTitlePresent();
        spivrobitnykyPidpOrganivPage.checkIsPageLogoPresent();
        spivrobitnykyPidpOrganivPage.gridElementIsDisplayed();
        spivrobitnykyPidpOrganivPage.gridListElementsIsDisplayed();
        spivrobitnykyPidpOrganivPage.statisticBlockIsDisplayed();
        spivrobitnykyPidpOrganivPage.approvedEmployeesLinkIsDisplayed();
        spivrobitnykyPidpOrganivPage.unapprovedEmployeesLinkIsDisplayed();
        spivrobitnykyPidpOrganivPage.saveFileBtnIsDisplayed();
        spivrobitnykyPidpOrganivPage.approvedEmployeeBtnIsDisplayed();
        spivrobitnykyPidpOrganivPage.unapprovedEmployeeBtnIsDisplayed();
        spivrobitnykyPidpOrganivPage.editEmployeeBtnIsDisplayed();
        spivrobitnykyPidpOrganivPage.actualRequestsLinkIsDisplayed();
    }

    @Test
    public void viewApprovedEmployeesPidpOrgPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnApprovedEmployeesLink();
        approvedEmployeesPidpOrgPage.checkIsPageURLPresent();
        approvedEmployeesPidpOrgPage.checkIsPageLogoPresent();
        approvedEmployeesPidpOrgPage.statisticBlockIsDisplayed();
        approvedEmployeesPidpOrgPage.approvedEmployeesLinkIsDisplayed();
        approvedEmployeesPidpOrgPage.unapprovedEmployeesLinkIsDisplayed();
        approvedEmployeesPidpOrgPage.saveFileBtnIsDisplayed();
        approvedEmployeesPidpOrgPage.unapprovedZayavkaBtnIsDisplayed();
        approvedEmployeesPidpOrgPage.editZayavkaBtnIsDisplayed();
        approvedEmployeesPidpOrgPage.actualZayavkiLinkIsDisplayed();
    }

    @Test
    public void viewActualZayavkiSPOPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnApprovedEmployeesLink();
        unapprovedEmployeesPidpOrgPage.clickOnActualZayavkiLink();
        actualZayavkiSPOPage.checkIsPageLogoPresent();
        actualZayavkiSPOPage.gridElementIsDisplayed();
        actualZayavkiSPOPage.statisticBlockIsDisplayed();
        actualZayavkiSPOPage.approvedEmployeesLinkIsDisplayed();
        actualZayavkiSPOPage.unapprovedEmployeesLinkIsDisplayed();
        actualZayavkiSPOPage.saveFileBtnIsDisplayed();
        actualZayavkiSPOPage.actualRequestsLinkIsDisplayed();
    }

    @Test
    public void viewUnapprovedEmployeesPidpOrgPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnUnapprovedEmployeesLink();
        unapprovedEmployeesPidpOrgPage.checkIsPageURLPresent();
        unapprovedEmployeesPidpOrgPage.checkIsPageLogoPresent();
        unapprovedEmployeesPidpOrgPage.statisticBlockIsDisplayed();
        unapprovedEmployeesPidpOrgPage.approvedEmployeesLinkIsDisplayed();
        unapprovedEmployeesPidpOrgPage.unapprovedEmployeesLinkIsDisplayed();
        unapprovedEmployeesPidpOrgPage.saveFileBtnIsDisplayed();
        unapprovedEmployeesPidpOrgPage.actualZayavkiLinkIsDisplayed();
        unapprovedEmployeesPidpOrgPage.approvedEmployeeBtnIsDisplayed();
    }

    @Test
    public void searchResultUnapprovedEmployeesPidpOrgPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnUnapprovedEmployeesLink();
        unapprovedEmployeesPidpOrgPage.enterPIBInToSearchField("Синельник Ірина Анатоліївна" + "\n");
        searchResultUnapprovedSPOPage.checkIsEmployeePIBPresent();
        searchResultUnapprovedSPOPage.approvedEmployeeBtnIsDisplayed();
    }

    @Test
    public void unapproveEmployeesPidpOrgPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnApprovedEmployeesLink();
        approvedEmployeesPidpOrgPage.enterPIBInToSearchField("Савчук Інна Мелетіївна" + "\n");
        searchResultApprovedSPOPage.checkIsEmployeePIBPresent();
        searchResultApprovedSPOPage.clickOnUnapprovedZayavkaBtn();
        searchResultApprovedSPOPage.clickOnConfirmModalBtn();
        unapprovedEmployeesPidpOrgPage.clickOnCloseModalWindBtn();
        unapprovedEmployeesPidpOrgPage.checkIsEmployeePIBPresent();
    }

    @Test
    public void approveEmployeesPidpOrgPageTest() {
        spivrobitnykyPidpOrganivPage.clickOnUnapprovedEmployeesLink();
        unapprovedEmployeesPidpOrgPage.clickOnApprovedEmployeeBtn();
        unapprovedEmployeesPidpOrgPage.clickOnSuccessModalBtn();
        approvedEmployeesPidpOrgPage.clickOnCloseModalWindBtn();
        approvedEmployeesPidpOrgPage.checkIsEmployeePIBPresent();
    }
}
