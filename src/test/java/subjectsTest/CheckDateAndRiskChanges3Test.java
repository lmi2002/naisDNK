package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

// ТО 1 стирает степень риска и дату последней плановой проверки
// ЦА - проверить, стерлись ли данные

public class CheckDateAndRiskChanges3Test extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
    }

    @Test
    public void changeDateOfLastInspANDriskSt_TRO_3_Test() throws InterruptedException {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021Page.clickOnSGMenu();
        vybirkaAutTransp2021Page.clickOnEditSGLink();
        editSGAutTrPage.clearTextInInputDateField();
        editSGAutTrPage.clearTextInInputBalField();
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.waiting();
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.clickOnDownloadSGBtn();
    }

    @Test
    public void checkDateOfLastInspANDriskSt_CA_3_Test() {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser2_ca", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021CAPage.checkIsPageLogoPresent();
        vybirkaAutTransp2021CAPage.checkIsPageTitlePresent();
        vybirkaAutTransp2021CAPage.checkIsPageURLPresent();
        vybirkaAutTransp2021CAPage.checkIsDateOfLastInspection_empty_3_Present();
        vybirkaAutTransp2021CAPage.checkIsRiskSt_empty_3_Present();
        vybirkaAutTransp2021CAPage.checkIsZagBal_empty_3_Present();
    }
}
