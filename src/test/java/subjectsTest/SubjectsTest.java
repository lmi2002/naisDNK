package subjectsTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SubjectsTest extends AbstractParentTest {
    private final String objectName = "Цех" + Utils.getDateAndTimeFormated();

    @Before
    public void preconditions() {
        String role = "officialPersonTPO";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);
        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
    }


    @Test
    public void addSubjectTest() {

        // Додавання (Юрособи через код)

        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        subject_vybirka_sphereSelectedPage.clickOnYearField();
        subject_vybirka_sphereSelectedPage.clickOnYearItem();
        subject_vybirka_sphere_year_selectedPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageURLPresent();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.subTitleIsDisplayed();
        addSubjectPage.inputEdrpouCodeInToInputField("35081565");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem();
        addSubjectPage.clickOnSaveSubjectBtn();
    }

    @Test
    public void updateObjectTest() throws InterruptedException {
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("35081565");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem();
        addSubjectPage.clickOnSaveSubjectBtn();

        //Редагування (блок "Об'єкти") add/delete

        subjectCardPage.clickOnAddObjectBtn();
        subjectCardPage.inputObjectNameInToInputField(objectName);
        subjectCardPage.inputObjectLocationInToInputField("Київ");
        subjectCardPage.clickOnCalendarObjectDateField();
        subjectCardPage.inputCalendarObjectDateFieldInToInputField("2020-05-05");
        subjectCardPage.clickOnAddObjectModalBtn();
        subjectCardPage.clickOnSaveObjectBtn();
        subjectCardPage.clickOnDeleteObjectBtn();
        subjectCardPage.clickOnConfirmDeleteObjectBtn();
    }

    //Редагування (блок "Загальні дані про планування")

    @Test
    public void update_ZagalniDaniPlanuvannia_Test() {
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("35081565");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem();
        addSubjectPage.clickOnSaveSubjectBtn();
        subjectCardPage.clickOnDateOfLastPlanInspField();
        subjectCardPage.inputDateOfLastPlanInspInToInputField("2015-01-01");
        subjectCardPage.clickOnBalField();
        subjectCardPage.inputBalInToInputField("5");
        subjectCardPage.clickOnPlanPeriodField();
        subjectCardPage.clickOnPlanPeriodItem();
        subjectCardPage.clickOnSavePlanPeriodBtn();
        subjectCardPage.clickOnDownloadSGBtn();
    }

    // Видалення "Загальні дані для планування"

    @Test
    public void deletePlanPeriodTest() {
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.inputEdrpouCodeInToInputField("35081565");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem();
        addSubjectPage.clickOnSaveSubjectBtn();
        subjectCardPage.deletePlanPeriodItem();
        subjectCardPage.clickOnSavePlanPeriodBtn();
    }

    @Test
    public void searchSGResultTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.checkIsPageURLPresent();
        searchResultSubjectPage.checkIsPageTitlePresent();
        searchResultSubjectPage.checkIsPageLogoPresent();
        searchResultSubjectPage.checkIsGridListElementsPresent();
    }

    @Test
    public void viewDosyeSGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnMenuSGBtn();
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.checkIsPageTitlePresent();
        viewDosyeSubjectPage.checkIsPageLogoPresent();
        viewDosyeSubjectPage.checkIsStupeniRyzykuTitlePresent();
        viewDosyeSubjectPage.checkIsStupeniRyzykuTabPresent();
        viewDosyeSubjectPage.checkIsPlanningDataTitlePresent();
        viewDosyeSubjectPage.checkIsPlanningDataTablePresent();
        viewDosyeSubjectPage.checkIsZagalnaInfoTitlePresent();
        viewDosyeSubjectPage.checkIsZagalnaInfoTabPresent();
        viewDosyeSubjectPage.checkIsKvedTitlePresent();
        viewDosyeSubjectPage.checkIsKvedTabPresent();
    }

    @Test
    public void viewPidrozdilySGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnMenuSGBtn();
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.clickOnPidrozdilyLink();
        viewPidrozdilySubjectPage.checkIsPageURLPresent();
        viewPidrozdilySubjectPage.checkIsVidokremleniPidroxdilyTitlePresent();
        viewPidrozdilySubjectPage.checkIsVidokremleniPidroxdilyTabPresent();
    }

    @Test
    public void viewObjectsSGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnMenuSGBtn();
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.clickOnObjectsLink();
        viewObjectsSubjectPage.checkIsPageURLPresent();
        viewObjectsSubjectPage.checkIsPageTitlePresent();
        viewObjectsSubjectPage.checkIsObjectsTitlePresent();
        viewObjectsSubjectPage.checkIsObjectsTabPresent();
    }

    @Test
    public void viewPerevirkySGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnMenuSGBtn();
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.clickOnPerevirkyLink();
        viewPerevirkySubjectPage.checkIsPageURLPresent();
        viewPerevirkySubjectPage.checkIsPageTitlePresent();
        viewPerevirkySubjectPage.checkIsPageTitlePresent();
        viewPerevirkySubjectPage.checkIsPerevirkyTabPresent();
    }

    @Test
    public void viewIstoriyaZminSGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.clickOnIstoriyaZminLink();
        viewIstoriyaZminSubjectPage.checkIsPageURLPresent();
        viewIstoriyaZminSubjectPage.checkIsPageTitlePresent();
        viewIstoriyaZminSubjectPage.checkIsIstoriyaZminTitlePresent();
        viewIstoriyaZminSubjectPage.checkIsIstoriyaZminTabPresent();
    }

    @Test
    public void viewLicenseSGTabTest() {
        subjectsListPage.inputEdrpouCodeInToInputField("35081565" + "\n");
        searchResultSubjectPage.clickOnMenuSGBtn();
        searchResultSubjectPage.clickOnViewCardSGLink();
        viewDosyeSubjectPage.checkIsPageURLPresent();
        viewDosyeSubjectPage.clickOnLicenseLink();
        viewLicenseSubjectPage.checkIsPageURLPresent();
        viewLicenseSubjectPage.checkIsPageTitlePresent();
        viewLicenseSubjectPage.checkIsLicenseTitlePresent();
    }

    @Ignore("Функционал отсутствуе")
    @Test
    public void viewImportSGPageTest() {
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.checkIsPageURLPresent();
        subjectImportPage.checkIsPageTitlePresent();
        subjectImportPage.checkIsPageLogoPresent();
        subjectImportPage.checkIsSphereFieldPresent();
        subjectImportPage.checkIsRegulatorFieldPresent();
        subjectImportPage.checkIsUploadFormPresent();
        subjectImportPage.checkIsPlanuvanniaBlockPresent();
        subjectImportPage.checkIsPozaplanZahodyBlockPresent();
        subjectImportPage.checkIsSubjectBlockPresent();
        subjectImportPage.checkIsAdministruvanniaBlockPresent();
    }

    @Ignore("Функционал отсутствуе")
    @Test
    public void viewImportSGPageWith_Sphere_Test() {
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.clickOnSphereField();
        subjectImportPage.clickOnSphereItem();
        subjectImport_sphere_selectedPage.checkIsPageURLPresent();
        subjectImport_sphere_selectedPage.checkIsPageLogoPresent();
        subjectImport_sphere_selectedPage.checkIsPageTitlePresent();
        subjectImport_sphere_selectedPage.checkIsSphereFieldPresent();
        subjectImport_sphere_selectedPage.checkIsRegulatorFieldPresent();
        subjectImport_sphere_selectedPage.checkIsUploadFormPresent();
        subjectImport_sphere_selectedPage.checkIsDownloadShablonLinkPresent();
        subjectImport_sphere_selectedPage.checkIsAddFileBtnPresent();
    }

    @Ignore("Функционал отсутствуе")
    @Test
    public void viewImportSGPageWith_Sphere_Year_Test() {
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.clickOnSphereField();
        subjectImportPage.clickOnSphereItem();
        subjectImport_sphere_selectedPage.clickOnYearField();
        subjectImport_sphere_selectedPage.clickOnYearItem();
        subjectImport_sphere_year_selectedPage.checkIsPageURLPresent();
        subjectImport_sphere_year_selectedPage.checkIsPageTitlePresent();
        subjectImport_sphere_year_selectedPage.checkIsPageLogoPresent();
        subjectImport_sphere_year_selectedPage.checkIsSphereFieldPresent();
        subjectImport_sphere_year_selectedPage.checkIsRegulatorFieldPresent();
        subjectImport_sphere_year_selectedPage.checkIsUploadFormPresent();
        subjectImport_sphere_year_selectedPage.checkIsDownloadShablonLinkPresent();
        subjectImport_sphere_year_selectedPage.checkIsAddFileBtnPresent();
    }

    @Test
    public void sphereSelectForVyborkaTest() {
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        sphereSelectForVyborkaPage.checkIsPageURLPresent();
        sphereSelectForVyborkaPage.checkIsPageTitlePresent();
        sphereSelectForVyborkaPage.addSGLinkIsDisplayed();
        sphereSelectForVyborkaPage.importBtnIsDisplayed();
        sphereSelectForVyborkaPage.sendToVybirkaBtnIsDisplayed();
        sphereSelectForVyborkaPage.gridElementIsDisplayed();
        sphereSelectForVyborkaPage.gridListElementsIsDisplayed();
        sphereSelectForVyborkaPage.addInToSphereLinkIsDisplayed();
        sphereSelectForVyborkaPage.addInToPlanPeriodLinkIsDisplayed();
        sphereSelectForVyborkaPage.objectLinkIsDisplayed();
        sphereSelectForVyborkaPage.clickOnMainDropdownMenu();
        sphereSelectForVyborkaPage.saveFileLinkIsDisplayed();
        sphereSelectForVyborkaPage.addInToArchiveLinkIsDisplayed();
    }

    @Test
    public void yearSelectForVyborkaTest() {
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        sphereSelectForVyborkaPage.clickOnSelectYearField();
        sphereSelectForVyborkaPage.clickOn2021YearItem();
        yearSelectForVyborkaPage.checkCurrentUrl();
        yearSelectForVyborkaPage.addSGLinkIsDisplayed();
        yearSelectForVyborkaPage.importBtnIsDisplayed();
        yearSelectForVyborkaPage.sendToVybirkaBtnIsDisplayed();
        yearSelectForVyborkaPage.gridElementIsDisplayed();
        yearSelectForVyborkaPage.gridListElementsIsDisplayed();
        yearSelectForVyborkaPage.addInToSphereLinkIsDisplayed();
        yearSelectForVyborkaPage.addInToPlanPeriodLinkIsDisplayed();
        yearSelectForVyborkaPage.objectLinkIsDisplayed();
        yearSelectForVyborkaPage.clickOnMainDropdownMenu();
    }

    @Test
    public void seeChangeHistoryStRiskTest() throws InterruptedException {
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereItem();
        sphereSelectForVyborkaPage.clickOnMenuSGBtn();
        sphereSelectForVyborkaPage.clickOnEditCardSGLink();
        editSGPage.inputBalInToInputField();
        editSGPage.clickOnSaveDataBtn();
        editSGPage.waiting();
        editSGPage.clickOnDownloadSGBtn();
        viewDosyeSubjectWithSphereSelectedPage.clickOnIstoriyaZminLink();
        historyOfChangesSGPage.checkInfoAboutChanges_message_Present();
    }
}