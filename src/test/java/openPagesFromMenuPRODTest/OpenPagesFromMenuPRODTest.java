package openPagesFromMenuPRODTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpenPagesFromMenuPRODTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPageProd();
        mainNotAuthPage.checkCurrentProdUrl();
        Assert.assertEquals(mainNotAuthPage.getTitle(), "Головна");
    }

    @Test
    public void dovidka_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnDovidka();
        dovidkaPage.checkIsPageLogoPresent();
        dovidkaPage.checkIsPageURLProdPresent();
        dovidkaPage.checkIsPageTitlePresent();
    }

    @Test
    public void perelikKO_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnPerelikKO();
        regulatorPage.checkIsPagePROD_URLPresent();
        regulatorPage.checkIsPageTitlePresent();
    }

    @Test
    public void zakonodavstvo_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnZakonodavsnvo();
        documentsPage.checkIsPageLogoPresent();
        documentsPage.checkIsPageTitlePresent();
        documentsPage.checkIsPageURLProdPresent();
    }

    @Test
    public void riskCriterias_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnKryteriiRyzyku();
        riskCriteriaPage.checkIsPageLogoPresent();
        riskCriteriaPage.checkIsPageTitlePresent();
        riskCriteriaPage.checkIsPageURLProdPresent();
    }

    @Test
    public void inspActForm_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnFormyAktiv();
        typeActInspPage.checkIsPageLogoPresent();
        typeActInspPage.checkIsPageURLProdPresent();
        typeActInspPage.checkIsPageTitlePresent();
    }

    @Test
    public void perelikSphereControl_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnPerelikSferKontrolyu();
        spherePage.checkIsPagePROD_URLPresent();
        spherePage.checkIsPageTitlePresent();
    }

    @Test
    public void subjectsGosp_zagInfoLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZagalnaInformacia();
        mainNotAuthPage.mainMenu.clickOnSubyektyGosp();
        subjectPageNotAuth.checkIsPageLogoPresent();
        subjectPageNotAuth.checkIsPageURLProdPresent();
        subjectPageNotAuth.checkIsPageTitlePresent();
    }

    @Test
    public void complexPlan_PlansPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnPlanyPerevirok();
        mainNotAuthPage.mainMenu.clickOnKompleksniPlany();
        complexPlanPage.checkCurrentProdUrl();
        complexPlanPage.checkIsPageTitlePresent();
    }

    @Test
    public void richniPlan_PlansPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnPlanyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRichniPlany();
        richniPlansMainPage.checkCurrentProdUrl();
    }

    @Test
    public void resultsPlanPerevirok_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPlanovyhPerevirok();
        planInspPageNotAuthPage.checkCurrentProdUrl();
        planInspPageNotAuthPage.pageTitleNotAuthIsDisplayed();
    }

    @Test
    public void resultsPozaplanPerevirok_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPozaplanovyhPerevirok();
        pozaplanInspNotAuthPage.checkIsPagePROD_URLPresent();
        pozaplanInspNotAuthPage.checkIsPageTitlePresent();

    }

    @Test
    public void resultsPerevirokZaZvernenniam_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirokZaZvernennyam();
        resultsInspZaZvernenniamPage.checkCurrentProdUrl();
        resultsInspZaZvernenniamPage.checkIsPageLogoPresent();
    }

    @Test
    public void resultsPrevZah_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnResultsPrevZah();
        preventiveZahodyNotAuthPage.checkCurrentProdUrl();
        preventiveZahodyNotAuthPage.pageTitleNotAuthIsDisplayed();
    }

    @Test
    public void resultsInfoVisit_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnRezultatyInformVidviduvannia();
        infoVisitNotAuthPage.checkCurrentProdUrl();
        infoVisitNotAuthPage.checkIsPageTitlePresent();
        infoVisitNotAuthPage.checkIsPageLogoPresent();
        infoVisitNotAuthPage.checkIsGridElementPresent();
        infoVisitNotAuthPage.checkIsGridListElementsPresent();
        infoVisitNotAuthPage.checkIsLink2018Present();
        infoVisitNotAuthPage.checkIsLink2019Present();
        infoVisitNotAuthPage.checkIsLink2020Present();
    }

    @Test
    public void statystykaNapovnPortalu_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnStatystykaNapovnennyaPortalu();
        statisticPage.checkCurrentProdUrl();
        statisticPage.pageTitleIsDisplayed();
    }

    @Test
    public void ocinyuvannyaInspectors_ResultsPerevirokLinkTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
        mainNotAuthPage.mainMenu.clickOnOcinyuvannyaInspectoriv();
        ratingInspectorsAllPage.checkCurrentProdUrl();
        ratingInspectorsAllPage.pageTitleIsDisplayed();
    }

    @Test
    public void richniZvity_ZvitnistOrganivLinkTest() {
        mainNotAuthPage.mainMenu.clickOnZvitnistOrganiv();
        mainNotAuthPage.mainMenu.clickOnRichniZvity();
        reportPlanPerevirkyAll2019Page.checkIsPageLogoPresent();
        reportPlanPerevirkyAll2019Page.checkIsPageTitlePresent();
        reportPlanPerevirkyAll2019Page.checkIsPageURLProdPresent();
        reportPlanPerevirkyAll2019Page.pageTitleIsDisplayed();
    }
}