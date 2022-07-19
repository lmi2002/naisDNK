package openPagesFromMenuNotAuthTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpenPagesFromMenuNotAuthTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.checkCurrentUrl();
        Assert.assertEquals(mainNotAuthPage.getTitle(), "Головна");
    }

    @Test
    public void dovidka_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnDovidka();
        dovidkaPage.checkIsPageLogoPresent();
        dovidkaPage.checkIsPageURLPresent();
        dovidkaPage.checkIsPageTitlePresent();
    }

    @Test
    public void perelikKO_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnPerelikKO();
        regulatorPage.checkIsPageURLPresent();
        regulatorPage.checkIsPageTitlePresent();
    }

    @Test
    public void zakonodavstvo_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnZakonodavsnvo();
        documentsPage.checkIsPageLogoPresent();
        documentsPage.checkIsPageTitlePresent();
        documentsPage.checkIsPageURLPresent();
    }

    @Test
    public void riskCriterias_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnKryteriiRyzyku();
        riskCriteriaPage.checkIsPageLogoPresent();
        riskCriteriaPage.checkIsPageTitlePresent();
        riskCriteriaPage.checkIsPageURLPresent();
    }

    @Test
    public void inspActForm_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnFormyAktiv();
        typeActInspPage.checkIsPageLogoPresent();
        typeActInspPage.checkIsPageURLPresent();
        typeActInspPage.checkIsPageTitlePresent();
    }

    @Test
    public void perelikSphereControl_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnPerelikSferKontrolyu();
        spherePage.checkIsPageURLPresent();
        spherePage.checkIsPageTitlePresent();
    }

    @Test
    public void subjectsGosp_zagInfoLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnSubyektyGosp();
        subjectPageNotAuth.checkIsPageLogoPresent();
        subjectPageNotAuth.checkIsPageURLPresent();
        subjectPageNotAuth.checkIsPageTitlePresent();
    }

    @Test
    public void complexPlan_PlansPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnPlanyPerevirok();
        mainNotAuthPage.mainMenu.clickOnKompleksniPlany();
        complexPlanPage.checkIsPageURLPresent();
        complexPlanPage.checkIsPageTitlePresent();
    }

    @Test
    public void richniPlan_PlansPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnPlanyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRichniPlany();
        richniPlansMainPage.checkCurrentUrl();
    }

    @Test
    public void resultsPlanPerevirok_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPlanovyhPerevirok();
        planInspPageNotAuthPage.checkCurrentUrl();
        planInspPageNotAuthPage.pageTitleNotAuthIsDisplayed();
    }

    @Test
    public void resultsPozaplanPerevirok_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPozaplanovyhPerevirok();
        pozaplanInspNotAuthPage.checkIsPageURLPresent();
        pozaplanInspNotAuthPage.checkIsPageTitlePresent();
        pozaplanInspNotAuthPage.checkIsPageLogoPresent();
        pozaplanInspNotAuthPage.checkIsGridElementPresent();
    }

    /*
    Нет данных за ярлыком Результати перевірок за зверненнями
    @Test
    public void resultsPerevirokZaZvernenniam_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirokZaZvernennyam();
        resultsInspZaZvernenniamPage.checkIsPageLogoPresent();
        resultsInspZaZvernenniamPage.checkIsPageTitlePresent();
        resultsInspZaZvernenniamPage.checkIsPageURLPresent();
    }
    */

    @Test
    public void resultsPrevZah_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnResultsPrevZah();
        preventiveZahodyNotAuthPage.checkCurrentUrl();
        preventiveZahodyNotAuthPage.pageTitleNotAuthIsDisplayed();
    }

    @Test
    public void resultsInfoVisit_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyInformVidviduvannia();
        infoVisitNotAuthPage.checkCurrentUrl();
        infoVisitNotAuthPage.checkIsPageTitlePresent();
    }

    @Test
    public void statystykaNapovnPortalu_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnStatystykaNapovnennyaPortalu();
        statisticPage.checkCurrentUrl();
        statisticPage.pageTitleIsDisplayed();
    }

    @Test
    public void ocinyuvannyaInspectors_ResultsPerevirokLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnOcinyuvannyaInspectoriv();
        ratingInspectorsAllPage.checkCurrentUrl();
        ratingInspectorsAllPage.pageTitleIsDisplayed();
    }

    @Test
    public void richniZvity_ZvitnistOrganivLink_NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnZvitnistOrganiv();
        mainNotAuthPage.mainMenu.clickOnRichniZvity();
        reportPlanPerevirkyAll2019Page.checkIsPageLogoPresent();
        reportPlanPerevirkyAll2019Page.checkIsPageTitlePresent();
        reportPlanPerevirkyAll2019Page.checkIsPageURLPresent();
        reportPlanPerevirkyAll2019Page.pageTitleIsDisplayed();
    }
}