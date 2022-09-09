package spivrobitnykyOrganuTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class SpivrobitnykyOrganuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
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
        approvedEmployeesOrgPage.enterPIBInToSearchField("Василець Ірина Григорівна" + "\n");
        searchResultApprovedSOPage.checkIsEmployeePIBPresent();
    }
}