package zvitnistTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class ZvitProPorushenniaVymogTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
        mainPage.mainMenu.clickOnZvitnist();
    }

    @Test
    public void zvitProPorushenniaVymogTest() {
        mainPage.mainMenu.clickOnZvitProPorusheniaVymog();
        zvitProPorushenniaVymogPage.checkIsPageURLPresent();
        zvitProPorushenniaVymogPage.checkIsPageTitlePresent();
        zvitProPorushenniaVymogPage.checkIsPageLogoPresent();
        zvitProPorushenniaVymogPage.checkIsKOFieldPresent();
        zvitProPorushenniaVymogPage.checkIsPlanPeriodFieldPresent();
        zvitProPorushenniaVymogPage.checkIsGridBlockViewPresent();
        zvitProPorushenniaVymogPage.checkIsGridBodyPresent();
    }

    @Test
    public void zvitProPorushenniaVymogKO2020Test() {
        mainPage.mainMenu.clickOnZvitProPorusheniaVymog();
        zvitProPorushenniaVymogPage.clickOnKOField();
        zvitProPorushenniaVymogPage.clickOnKOItem();
        zvitProPorushenniaVymogKO2021Page.clickOnPlanPeriodField();
        zvitProPorushenniaVymogKO2021Page.clickOnZa2020Item();
        zvitProPorushenniaVymogKO2020Page.checkIsPageURLPresent();
        zvitProPorushenniaVymogKO2020Page.checkIsPageTitlePresent();
        zvitProPorushenniaVymogKO2020Page.checkIsPageLogoPresent();
        zvitProPorushenniaVymogKO2020Page.checkIsKOFieldPresent();
        zvitProPorushenniaVymogKO2020Page.checkIsPlanPeriodFieldPresent();
        zvitProPorushenniaVymogKO2020Page.checkIsSphereFieldPresent();
        zvitProPorushenniaVymogKO2020Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitProPorushenniaVymogKO2018Test() {
        mainPage.mainMenu.clickOnZvitProPorusheniaVymog();
        zvitProPorushenniaVymogPage.clickOnKOField();
        zvitProPorushenniaVymogPage.clickOnKOItem();
        zvitProPorushenniaVymogKO2020Page.clickOnPlanPeriodField();
        zvitProPorushenniaVymogKO2020Page.clickOnZa2018Item();
        zvitProPorushenniaVymogKO2018Page.checkIsPageURLPresent();
        zvitProPorushenniaVymogKO2018Page.checkIsPageTitlePresent();
        zvitProPorushenniaVymogKO2018Page.checkIsPageLogoPresent();
        zvitProPorushenniaVymogKO2018Page.checkIsKOFieldPresent();
        zvitProPorushenniaVymogKO2018Page.checkIsPlanPeriodFieldPresent();
        zvitProPorushenniaVymogKO2018Page.checkIsSphereFieldPresent();
        zvitProPorushenniaVymogKO2018Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitProPorushenniaVymogKO2019Test() {
        mainPage.mainMenu.clickOnZvitProPorusheniaVymog();
        zvitProPorushenniaVymogPage.clickOnKOField();
        zvitProPorushenniaVymogPage.clickOnKOItem();
        zvitProPorushenniaVymogKO2020Page.clickOnPlanPeriodField();
        zvitProPorushenniaVymogKO2020Page.clickOnZa2019Item();
        zvitProPorushenniaVymogKO2019Page.checkIsPageURLPresent();
        zvitProPorushenniaVymogKO2019Page.checkIsPageTitlePresent();
        zvitProPorushenniaVymogKO2019Page.checkIsPageLogoPresent();
        zvitProPorushenniaVymogKO2019Page.checkIsKOFieldPresent();
        zvitProPorushenniaVymogKO2019Page.checkIsPlanPeriodFieldPresent();
        zvitProPorushenniaVymogKO2019Page.checkIsSphereFieldPresent();
        zvitProPorushenniaVymogKO2019Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitProPorushenniaVymogKO2021Test() {
        mainPage.mainMenu.clickOnZvitProPorusheniaVymog();
        zvitProPorushenniaVymogPage.clickOnKOField();
        zvitProPorushenniaVymogPage.clickOnKOItem();
        zvitProPorushenniaVymogKO2020Page.clickOnPlanPeriodField();
        zvitProPorushenniaVymogKO2020Page.clickOnZa2021Item();
        zvitProPorushenniaVymogKO2021Page.checkIsPageURLPresent();
        zvitProPorushenniaVymogKO2021Page.checkIsPageTitlePresent();
        zvitProPorushenniaVymogKO2021Page.checkIsPageLogoPresent();
        zvitProPorushenniaVymogKO2021Page.checkIsKOFieldPresent();
        zvitProPorushenniaVymogKO2021Page.checkIsPlanPeriodFieldPresent();
        zvitProPorushenniaVymogKO2021Page.checkIsSphereFieldPresent();
        zvitProPorushenniaVymogKO2021Page.checkIsGridBodyPresent();
    }
}
