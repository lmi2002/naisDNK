package richniPlanTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class ViewZminyDoRichnogoPlanTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
        mainPage.mainMenu.clickOnPlanyPerevirok();
        mainPage.mainMenu.clickOnRichniPlany();
        richniPlansMainPage.checkIsPageURLPresent();
    }

    @Test
    public void richniPlanCOrgMainPageTest() {
        richniPlansMainPage.checkIsPageTitlePresent();
        richniPlansMainPage.checkIsGoToNakazListAboutChangesLinkPresent();
        richniPlansMainPage.clickOnGoToNakazListAboutChangesLink();
        richniPlanChangesPage.checkIsPageURLPresent();
        richniPlanChangesPage.checkIsPageTitlePresent();
        richniPlanChangesPage.checkIsPageURLPresent();
        richniPlanChangesPage.checkIsGridListNumberElementPresent();
        richniPlanChangesPage.checkIsSaveNakaz_1_lineBtnPresent();
        richniPlanChangesPage.checkIsSaveNakaz_2_lineBtnPresent();
    }
}
