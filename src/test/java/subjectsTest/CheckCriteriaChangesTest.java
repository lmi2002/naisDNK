package subjectsTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CheckCriteriaChangesTest extends AbstractParentTest {

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
    public void to_1_addSG_addStRiskTest() {
        subjectsListPage.clickOnAddSGBtn();
        addSubjectPage.checkIsPageTitlePresent();
        addSubjectPage.inputEdrpouCodeInToInputField("37236628");
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

    @Ignore ("Проверка для др. ролей")
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

    @Ignore ("Проверка для др. ролей")
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

