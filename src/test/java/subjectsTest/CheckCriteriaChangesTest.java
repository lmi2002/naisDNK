package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class CheckCriteriaChangesTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
    }

    @Test
    public void to_1_addSG_addStRiskTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("24211753");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem_AutoTransp();
        addSubjectPage.clickOnSaveSubjectBtn();
        subjectCardPage.clickOnBalField();
        subjectCardPage.inputBalInToInputField("12");
        subjectCardPage.clickOnSavePlanPeriodBtn();
        subjectCardPage.clickOnDownloadSGBtn();
        viewDosyeSubject_bukaevycia_page.checkIs_ball_12_Present();
    }

    @Test
    public void to_2_addSG_addStRiskTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser2_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("24211753");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem_AutoTransp();
        addSubjectPage.clickOnSaveSubjectBtn();
        subjectCardPage.clickOnBalField();
        subjectCardPage.inputBalInToInputField("22");
        subjectCardPage.clickOnSavePlanPeriodBtn();
        subjectCardPage.clickOnDownloadSGBtn();
        viewDosyeSubject_bukaevycia_page.checkIs_ball_22_Present();
    }

    @Test
    public void to_3_addSG_addStRiskTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser3_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("24211753");
        addSubjectPage.clickOnEdrpouSearchBtn();
        addSubjectPage.clickOnSphereField();
        addSubjectPage.clickOnSphereItem_AutoTransp();
        addSubjectPage.clickOnSaveSubjectBtn();
        subjectCardPage.clickOnBalField();
        subjectCardPage.inputBalInToInputField("80");
        subjectCardPage.clickOnSavePlanPeriodBtn();
        subjectCardPage.clickOnDownloadSGBtn();
        viewDosyeSubject_bukaevycia_page.checkIs_ball_80_Present();
    }
}

