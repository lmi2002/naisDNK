package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class ImportFileWithSGTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();

    }

    @Test
    public void importFileWith_SGTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
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
        subjectImport_sphere_year_selectedPage.fileUpload("C:/Users/Administrator/Desktop/IAS/src/main/java/data/ImportFileNew.xlsx");
        importErrors_in_filePage.allInfoBlockIsDisplayed();
    }

    @Test
    public void checkErrorInfo_in_ImportSGFileTest() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnImportBtn();
        subjectImportPage.clickOnSphereField();
        subjectImportPage.clickOnSphereItem();
        subjectImport_sphere_selectedPage.clickOnYearField();
        subjectImport_sphere_selectedPage.clickOnYearItem();
        subjectImport_sphere_year_selectedPage.fileUpload("C:/Users/Administrator/Desktop/IAS/src/main/java/data/ImportFileNew.xlsx");
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
