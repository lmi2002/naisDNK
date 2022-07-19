package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class VybirkaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
    }

    @Test
    public void viewSubjectsPageElementsTest() {

        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.checkCurrentUrl();
        subjectsListPage.pageTitleIsDisplayed();
        subjectsListPage.gridElementIsDisplayed();
        subjectsListPage.gridListElementsIsDisplayed();
        subjectsListPage.addSGLinkIsDisplayed();
        subjectsListPage.clickOnMainDropdownMenu();
        subjectsListPage.addInToArchiveLinkIsDisplayed();
        subjectsListPage.saveFileLinkIsDisplayed();
        subjectsListPage.importBtnIsDisplayed();
        subjectsListPage.addInToSphereLinkIsDisplayed();
        subjectsListPage.addInToPlanPeriodLink();
        subjectsListPage.objectLinkIsDisplayed();
    }

    @Test
    public void viewVybirkaSG_SphereSelectedPageTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        subject_vybirka_sphereSelectedPage.checkIsPageURLPresent();
        subject_vybirka_sphereSelectedPage.checkIsPageLogoPresent();
        subject_vybirka_sphereSelectedPage.checkIsPageTitlePresent();
        subject_vybirka_sphereSelectedPage.addSGBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.importSGBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.addSGinVybirkaBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.dropdownMenuBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.sphereFieldIsDisplayed();
        subject_vybirka_sphereSelectedPage.regulatorFieldIsDisplayed();
        subject_vybirka_sphereSelectedPage.yearFieldIsDisplayed();
        subject_vybirka_sphereSelectedPage.goToObjectsLinkIsDisplayed();
        subject_vybirka_sphereSelectedPage.addSGinSphereBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.addSGinPlanPeriodBtnIsDisplayed();
        subject_vybirka_sphereSelectedPage.checkboxInGridIsDisplayed();
        subject_vybirka_sphereSelectedPage.gridElementIsDisplayed();
        subject_vybirka_sphereSelectedPage.gridListElementsIsDisplayed();
    }

    @Test
    public void viewVybirkaSG_Sphere_Year_SelectedPageTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        subject_vybirka_sphereSelectedPage.clickOnYearField();
        subject_vybirka_sphereSelectedPage.clickOnYearItem();
        subject_vybirka_sphere_year_selectedPage.checkIsPageURLPresent();
        subject_vybirka_sphere_year_selectedPage.checkIsPageLogoPresent();
        subject_vybirka_sphere_year_selectedPage.checkIsPageTitlePresent();
        subject_vybirka_sphere_year_selectedPage.addSGBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.importSGBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.addSGinVybirkaBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.dropdownMenuBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.sphereFieldIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.regulatorFieldIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.yearFieldIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.goToObjectsLinkIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.addSGinSphereBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.addSGinPlanPeriodBtnIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.checkboxInGridIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.gridElementIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.gridListElementsIsDisplayed();
        subject_vybirka_sphere_year_selectedPage.isMoveToVybirkaBtnDisplayed();
    }

    @Test
    public void moveSubjectInVybirkaTest() {

        // Перенесення Суб'єкта в вибірку

        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        subject_vybirka_sphereSelectedPage.clickOnYearField();
        subject_vybirka_sphereSelectedPage.clickOnYearItem();
        subject_vybirka_sphere_year_selectedPage.clickOnAddSGinVybirkaBtn();
        subject_vybirka_sphere_year_selectedPage.pause(2);
        subject_vybirka_sphere_year_selectedPage.checkIsMoveToVybirka_ModalWin_titlePresent();
        subject_vybirka_sphere_year_selectedPage.checkIsTotalNumberSG_ModalWinPresent();
        subject_vybirka_sphere_year_selectedPage.checkIsTotalNumberSG_ForPlan_ModalWinPresent();
        subject_vybirka_sphere_year_selectedPage.clickOnMoveToVybirka_ModalWin_Btn();
        subject_vybirka_sphere_year_selectedPage.isUspih_ModalWin_titleDisplayed();
        subject_vybirka_sphere_year_selectedPage.clickOnGoToVybirka_ModalWin_Btn();
    }

    @Test
    public void viewVybirka2021PageTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.mainMenu.clickOnPerevirky();
        subjectsListPage.mainMenu.clickOnPlanuvannyaPerelikPeriodiv();
        // planuvanniaPage.clickOnGoToVybirka2021Btn();
        vybirkaSG2021Page.checkIsPageURLPresent();
        vybirkaSG2021Page.checkIsPageTitlePresent();
        vybirkaSG2021Page.checkIsPageLogoPresent();
        vybirkaSG2021Page.goToToProjectPlanBtnIsDisplayed();
        vybirkaSG2021Page.goToToPerelikSphereBtnIsDisplayed();
        vybirkaSG2021Page.goToToArchiveBtnIsDisplayed();
        vybirkaSG2021Page.synhronInspBtnIsDisplayed();
        vybirkaSG2021Page.sendToCABtnIsDisplayed();
        vybirkaSG2021Page.dowmloadVybirkaSGBtnIsDisplayed();
        vybirkaSG2021Page.algorytmPlanBtnIsDisplayed();
    }

    @Test
    public void sendVybirkaToCATest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.mainMenu.clickOnPerevirky();
        subjectsListPage.mainMenu.clickOnPlanuvannyaPerelikPeriodiv();
        // planuvanniaPage.clickOnGoToVybirka2021Btn();
        vybirkaSG2021Page.clickOnSynhronInspBtn();
        vybirkaSG2021Page.clickOnSphereField();
        vybirkaSG2021Page.clickOnSphereItem();
        vybirka_for_PlanPage.clickOnCheckbox_SelectAll_InGrid("check");
        vybirka_for_PlanPage.clickOnSetInspDateBtn();
        vybirka_for_PlanPage.clickOnInspDate_ModalWind_Field();
        vybirka_for_PlanPage.enterDateInToInputField("2021-01-01");
        vybirka_for_PlanPage.clickOnSaveDate_ModalWind_Btn();
        vybirka_for_PlanPage.clickOnCheckbox_SelectAll_InGrid("check");
        vybirka_for_PlanPage.clickOnSetInspTerminBtn();
        vybirka_for_PlanPage.clickOnTermin_ModalWind_Field();
        vybirka_for_PlanPage.clickOnTermin_ModalWind_Item();
        vybirka_for_PlanPage.clickOnSaveTermin_ModalWind_Btn();
        vybirka_for_PlanPage.mainMenu.clickOnPerevirky();
        vybirka_for_PlanPage.mainMenu.clickOnPlanuvannyaPerelikPeriodiv();
        // planuvanniaPage.clickOnGoToVybirka2021Btn();
        vybirkaSGPage.clickOnErrorsByPeriodBtn();
        vybirkaSGPage.clickOnCheckbox_SelectAll_InGrid("check");
        vybirkaSGPage.clickOnMoveToArchiveBtn();
        archiveVybirka2021Page.clickOnSendToArchive_ModalWind_Close_CA_Btn();
        vybirkaSGPage.clickOnSendToCABtn();
        vybirka2021AfterSendingToCAPage.checkIsUspih_ProjectPlanSentToCA_message_modalWinPresent();
        vybirka2021AfterSendingToCAPage.clickOnCloseModalWinBtn();
        vybirka2021AfterSendingToCAPage.checkIsPageURLPresent();
        vybirka2021AfterSendingToCAPage.seePartOfProjectPlanBtnIsDisplayed();
        vybirka2021AfterSendingToCAPage.algorytmPlanBtnIsDisplayed();
        vybirka2021AfterSendingToCAPage.goToToPerelikSphereBtnIsDisplayed();
        vybirka2021AfterSendingToCAPage.goToToArchiveBtnIsDisplayed();
        vybirka2021AfterSendingToCAPage.mainMenu.clickOnMenuKorystuvacha();
        vybirka2021AfterSendingToCAPage.mainMenu.clickOnVyhid();
        mainNotAuthPage.clickOnUviyty();

        //Відхилення затвердження плану перевірок (Админ ЦА)

        loginPage.fillingLoginFormAndSubmitIt("iastestuser2_ca", "123007");
        mainPage.mainMenu.clickOnPerevirky();
        mainPage.mainMenu.clickOnPlanuvannyaPerelikPeriodiv();
        // planuvanniaPage.clickOnGoToVybirka2021Btn();
        vybirkaSG2021Page.clickOnGoToPerelikTerOrg_CA_Btn();
        terOrgWhichSentPlanPage.checkIsDisapprovePlanBtnPresent();
        terOrgWhichSentPlanPage.clickOnSphereField();
        terOrgWhichSentPlanPage.clickOnSphereItem();
        terOrgWhichSentPlanPage.checkIsDisapprovePlanBtnPresent();
        terOrgWhichSentPlanPage.clickOnDisapprovePlanBtn();
        terOrgWhichSentPlanPage.checkIsUspih_disapprove_message_modalWinPresent();
        terOrgWhichSentPlanPage.clickOnCloseModalWinBtn();
        terOrgWhichSentPlanPage.checkIsDisapprovePlanBtnNOTPresent();
        terOrgWhichSentPlanPage.checkIsPlanSendStatus_vProcesi_Present();
        terOrgWhichSentPlanPage.clickOnBackToVybirkaLink();
        vybirkaSG2021Page.clickOnGoToArchiveBtn();
        archiveVybirka2021Page.clickOnBackFromArchiveBtn();
        archiveVybirka2021Page.clickOnConfirmBackFromArchive_ModalWin_Btn();
        vybirkaSG2021Page.clickOnCloseModalWinBtn();
        vybirkaSG2021Page.clickOnGoToArchiveBtn();
        archiveVybirka2021Page.clickOnBackFromArchiveBtn();
        archiveVybirka2021Page.clickOnConfirmBackFromArchive_ModalWin_Btn();
        vybirkaSG2021Page.checkIsUspih_BackFromArchive_message_modalWinPresent();
        vybirkaSG2021Page.clickOnCloseModalWinBtn();
    }
}
