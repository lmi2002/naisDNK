package subjectsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class CheckDateAndRiskChanges5Test extends AbstractParentTest {
    // ТО 2. Если он ставит выше/меньше степень риска, чем ТО 1, раньше/позже дату
    // ЦА - проверить, как ведут себя данные

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
    }

    @Test
    public void changeDateOfLastInspANDriskSt_TRO_5_Test() throws InterruptedException {
        loginPage.fillingLoginFormAndSubmitIt("iastestuser2_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021Page.checkIsPageLogoPresent();
        vybirkaAutTransp2021Page.checkIsPageTitlePresent();
        vybirkaAutTransp2021Page.checkIsPageURLPresent();
        vybirkaAutTransp2021Page.clickOnSGMenu();
        vybirkaAutTransp2021Page.clickOnEditSGLink();
        editSGAutTrPage.inputDateInToInputField("2020-04-01");
        editSGAutTrPage.inputBalInToInputField("41");
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.waiting();
        editSGAutTrPage.clickOnSaveDataBtn();
        editSGAutTrPage.clickOnDownloadSGBtn();
    }

    @Test
    public void checkDateOfLastInspANDriskSt_CA_5_Test() {
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
        vybirkaAutTransp2021CAPage.checkIsDateOfLastInspection_20200401_Present();
        vybirkaAutTransp2021CAPage.checkIsRiskStpn_Vysoky_Present();
    }
}
