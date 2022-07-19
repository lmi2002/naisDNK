package zvitnistTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class RichnaZvitnistPoOrganuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
        mainPage.mainMenu.clickOnZvitnist();
    }

    @Test
    public void richnaZvitnistPoOrganuPageTest() {
        mainPage.mainMenu.clickOnRichnaZvitPoOrganu();
        richnaZvitnistPoOrganuPage.checkIsPageURLPresent();
        richnaZvitnistPoOrganuPage.checkIsPageTitlePresent();
        richnaZvitnistPoOrganuPage.checkIsPageLogoPresent();
        richnaZvitnistPoOrganuPage.checkIsGridElementPresent();
        richnaZvitnistPoOrganuPage.checkIsGridListElementsPresent();
        richnaZvitnistPoOrganuPage.checkIsDownload2019IconPresent();
        richnaZvitnistPoOrganuPage.checkIsDownload2020IconPresent();
        richnaZvitnistPoOrganuPage.checkIsEdit2019IconPresent();
        richnaZvitnistPoOrganuPage.checkIsEdit2020IconPresent();
    }

    @Test
    public void richnaZvitnistPoOrganuEditPageTest() {
        mainPage.mainMenu.clickOnRichnaZvitPoOrganu();
        richnaZvitnistPoOrganuPage.clickOnEdit2019Icon();
        editZvit2019Page.checkIsPageURLPresent();
        editZvit2019Page.checkIsPageTitlePresent();
        editZvit2019Page.checkIsPageLogoPresent();
        editZvit2019Page.checkIsGridElementPresent();
        editZvit2019Page.checkIsGridListElementsPresent();
        editZvit2019Page.checkIsSaveBtnPresent();
        editZvit2019Page.checkIsBackToZvitListLinkPresent();
    }
}

