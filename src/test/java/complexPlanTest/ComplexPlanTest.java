package complexPlanTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class ComplexPlanTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("oper@mns.gov.ua", "123456789");
        mainPage.mainMenu.clickOnPlanyPerevirok();
        mainPage.mainMenu.clickOnKompleksniPlany();
        complexPlanPage.checkCurrentUrl();
    }

    @Test
    public void complexPlanGridTest() {
        complexPlanPage.checkIsPageURLPresent();
        complexPlanPage.checkIsPageTitlePresent();
        complexPlanPage.checkIsPageLogoPresent();
        complexPlanPage.checkIsGridListNumberElementPresent();
        complexPlanPage.gridElementIsDisplayed();
        complexPlanPage.checkIsDownloadComplexPlan2018linkPresent();
        complexPlanPage.checkIsDownloadComplexPlan2019linkPresent();
        complexPlanPage.checkIsDownloadComplexPlan2020linkPresent();
        complexPlanPage.checkIsDownloadComplexPlan2021linkPresent();
        complexPlanPage.checkIsGoToComplexPlan2018LinkPresent();
        complexPlanPage.checkIsGoToComplexPlan2019LinkPresent();
        complexPlanPage.checkIsGoToComplexPlan2020LinkPresent();
        complexPlanPage.checkIsGoToComplexPlan2021LinkPresent();
        complexPlanPage.checkIsSaveNakaz2018BtnPresent();
        complexPlanPage.checkIsSaveNakaz2019BtnPresent();
        complexPlanPage.checkIsSaveNakaz2020BtnPresent();
        complexPlanPage.checkIsSaveNakaz2021BtnPresent();
        complexPlanPage.checkIsGoToNakazListAboutChanges2018LinkPresent();
        complexPlanPage.checkIsGoToNakazListAboutChanges2019LinkPresent();
        complexPlanPage.checkIsGoToNakazListAboutChanges2020LinkPresent();
        complexPlanPage.checkIsGoToNakazListAboutChanges2021LinkPresent();

    }

    @Test
    public void complexPlanningPeriod2018Test() {
        complexPlanPage.clickOnGoToComplexPlan2018Link();
        complexPlanningPeriod2018Page.checkIsPageURLPresent();
        complexPlanningPeriod2018Page.checkIsPageTitlePresent();
        complexPlanningPeriod2018Page.checkIsPageLogoPresent();
        complexPlanningPeriod2018Page.checkThatGridBlockIsDisplayed();
        complexPlanningPeriod2018Page.gridElementIsDisplayed();
    }

    @Test
    public void complexPlanningPeriod2019Test() {
        complexPlanPage.clickOnGoToComplexPlan2019Link();
        complexPlanningPeriod2019Page.checkIsPageURLPresent();
        complexPlanningPeriod2019Page.checkIsPageTitlePresent();
        complexPlanningPeriod2019Page.checkIsPageLogoPresent();
        complexPlanningPeriod2019Page.checkThatGridBlockIsDisplayed();
        complexPlanningPeriod2019Page.gridElementIsDisplayed();
    }

    @Test
    public void complexPlanningPeriod2020Test() {
        complexPlanPage.clickOnGoToComplexPlan2020Link();
        complexPlanningPeriod2020Page.checkIsPageURLPresent();
        complexPlanningPeriod2020Page.checkIsPageTitlePresent();
        complexPlanningPeriod2020Page.checkIsPageLogoPresent();
        complexPlanningPeriod2020Page.checkThatGridBlockIsDisplayed();
        complexPlanningPeriod2020Page.gridElementIsDisplayed();
    }

    @Test
    public void complexPlanningPeriod2021Test() {
        complexPlanPage.clickOnGoToComplexPlan2021Link();
        complexPlanningPeriod2021Page.checkIsPageURLPresent();
        complexPlanningPeriod2021Page.checkIsPageTitlePresent();
        complexPlanningPeriod2021Page.checkIsPageLogoPresent();
        complexPlanningPeriod2021Page.checkThatGridBlockIsDisplayed();
        complexPlanningPeriod2021Page.gridElementIsDisplayed();
    }

    @Test
    public void viewNakazListAboutChanges2018Test() {
        complexPlanPage.clickOnGoToNakazListAboutChanges2018Link();
        complexPlanChanges2018Page.checkIsPageURLPresent();
        complexPlanChanges2018Page.checkIsPageTitlePresent();
        complexPlanChanges2018Page.checkIsPageLogoPresent();
        complexPlanChanges2018Page.checkIsSaveNakazBtnPresent();
        complexPlanChanges2018Page.gridElementIsDisplayed();
    }

    @Test
    public void viewNakazListAboutChanges2019Test() {
        complexPlanPage.clickOnGoToNakazListAboutChanges2019Link();
        complexPlanChanges2019Page.checkIsPageURLPresent();
        complexPlanChanges2019Page.checkIsPageTitlePresent();
        complexPlanChanges2019Page.checkIsPageLogoPresent();
        complexPlanChanges2019Page.checkIsSaveNakazBtnPresent();
        complexPlanChanges2019Page.gridElementIsDisplayed();
    }

    @Test
    public void viewNakazListAboutChanges2020Test() {
        complexPlanPage.clickOnGoToNakazListAboutChanges2020Link();
        complexPlanChanges2020Page.checkIsPageURLPresent();
        complexPlanChanges2020Page.checkIsPageTitlePresent();
        complexPlanChanges2020Page.checkIsPageLogoPresent();
        complexPlanChanges2020Page.checkIsSaveNakazBtnPresent();
        complexPlanChanges2020Page.checkIsGridElementPresent();
    }

    @Test
    public void viewNakazListAboutChanges2021Test() {
        complexPlanPage.clickOnGoToNakazListAboutChanges2021Link();
        complexPlanChanges2021Page.checkIsPageURLPresent();
        complexPlanChanges2021Page.checkIsPageTitlePresent();
        complexPlanChanges2021Page.checkIsPageLogoPresent();
        complexPlanChanges2021Page.checkIsSaveNakazBtnPresent();
        complexPlanChanges2021Page.gridElementIsDisplayed();
    }
}
