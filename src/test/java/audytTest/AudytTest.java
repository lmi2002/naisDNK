package audytTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class AudytTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
        mainPage.mainMenu.clickOnAudyt();
    }

    @Test
    public void viewAkredytovaniOrgPageTest() {
        mainPage.mainMenu.clickOnAkredytovaniOrg();
        accreditedOrganizationsPage.checkIsPageTitlePresent();
        accreditedOrganizationsPage.checkIsPageLogoPresent();
        accreditedOrganizationsPage.checkIsPageURLPresent();
        accreditedOrganizationsPage.checkIsGridElementPresent();
        accreditedOrganizationsPage.checkAreGridListElementsPresent();
        accreditedOrganizationsPage.checkIsAddOrganizationBtnPresent();
    }

    @Test
    public void viewAudytPageTest() {
        mainPage.mainMenu.clickOnAudytSub();
        audytPage.checkIsPageTitlePresent();
        audytPage.checkIsPageLogoPresent();
        audytPage.checkIsPageURLPresent();
        audytPage.checkIsGridElementPresent();
        audytPage.checkAreGridListElementsPresent();
        audytPage.checkIsAddAudytBtnPresent();
    }

    @Test
    public void OrganizationCreateTest() {
        mainPage.mainMenu.clickOnAkredytovaniOrg();
        accreditedOrganizationsPage.clickOnAddOrganizationBtn();
    }
}