package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

// ТО 1 меняет степень риска на 21 и дату последней плановой проверки 01.04.2015
// ЦА - проверить, изменились ли дата и степень риска

public class CheckDateAndRiskChanges2Test extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
    }

    @Test
    public void changeDateOfLastInspANDriskSt_TRO_2_Test() throws InterruptedException {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021Page.clickOnSGMenu();
        vybirkaAutTransp2021Page.clickOnEditSGLink();
        editSGAutTrPage.inputDateInToInputField("2015-04-01");
        editSGAutTrPage.inputBalInToInputField("21");
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.waiting();
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.clickOnDownloadSGBtn();
    }

    @Test
    public void checkDateOfLastInspANDriskSt_CA_2_Test() {
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
        vybirkaAutTransp2021CAPage.checkIsDateOfLastInspection_20150401_2_Present();
        vybirkaAutTransp2021CAPage.checkIsRiskStpn_Seredniy_Present();
        vybirkaAutTransp2021CAPage.checkIsZagBal_21_2_Present();
    }
}
