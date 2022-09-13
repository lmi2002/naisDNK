package subjectsTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@Ignore("Узнать как работает импорт")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImportFileWithSGTest extends AbstractParentTest {

    @Rule
    public final TestName name = new TestName();
    @Before
    public void preconditions() {
        String role = "officialPersonTPO";
        String methodName = name.getMethodName();
        if (methodName.equals("to_1_importFileWith_SGTest")) {
            role = "officialPersonCA";
        }
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
    }
    @Test
    public void to_1_importFileWith_SGTest() {
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.checkIsPageURLPresent();
        subjectImportPage.checkIsPageTitlePresent();
        subjectImportPage.checkIsPageLogoPresent();
        subjectImportPage.clickOnSphereField();
        subjectImportPage.clickOnSphereItem();
        subjectImport_sphere_selectedPage.clickOnYearField();
        subjectImport_sphere_selectedPage.clickOnYearItem();
        subjectImport_sphere_year_selectedPage.fileUpload(Utils.getAbsolutePathToDataFiles("\\ImportFileNew.xlsx"));
        importErrors_in_filePage.allInfoBlockIsDisplayed();
    }

    @Test
    public void to_2_checkErrorInfo_in_ImportSGFileTest() {
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.clickOnSphereField();
        subjectImportPage.clickOnSphereItem();
        subjectImport_sphere_selectedPage.clickOnYearField();
        subjectImport_sphere_selectedPage.clickOnYearItem();
        subjectImport_sphere_year_selectedPage.fileUpload(Utils.getAbsolutePathToDataFiles("\\ImportFileNew.xlsx"));
        importErrors_in_filePage.checkIsPageLogoPresent();
        importErrors_in_filePage.allInfoBlockIsDisplayed();
        importErrors_in_filePage.summaryBlockIsDisplayed();
        importErrors_in_filePage.importRepeatBtnIsDisplayed();
        importErrors_in_filePage.saveBtnIsDisplayed();
        importErrors_in_filePage.gridElementIsDisplayed();
        importErrors_in_filePage.gridListElementsIsDisplayed();
        importErrors_in_filePage.checkIsErrorInfoText1Present();
        importErrors_in_filePage.checkIsErrorInfoText2Present();
        importErrors_in_filePage.checkIsErrorInfoText3Present();
        importErrors_in_filePage.checkIsErrorInfoText4Present();
        importErrors_in_filePage.checkIsErrorInfoText5Present();
        importErrors_in_filePage.checkIsErrorInfoText6Present();
        importErrors_in_filePage.checkIsErrorInfoText7_1Present();
        importErrors_in_filePage.checkIsErrorInfoText7_2Present();
        importErrors_in_filePage.checkIsErrorInfoText8_1Present();
        importErrors_in_filePage.checkIsErrorInfoText8_2Present();
        importErrors_in_filePage.checkIsErrorInfoText9_1Present();
        importErrors_in_filePage.checkIsErrorInfoText9_2Present();
    }
}
