package subjectsTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;

// ТО 1 меняет степень риска на 21 и дату последней плановой проверки 01.04.2015
// ЦА - проверить, изменились ли дата и степень риска

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckDateAndRiskChanges2Test extends AbstractParentTest {

    @Rule
    public final TestName name = new TestName();
    @Before
    public void preconditions() {
        String role = "officialPersonTPO";
        String methodName = name.getMethodName();
        if (methodName.equals("to_2_checkDateOfLastInspANDriskSt_CA_2_Test")) {
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
    public void to_1_changeDateOfLastInspANDriskSt_TRO_2_Test() throws InterruptedException {
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subjectsListPage.clickOnSelectRegulatorField();
        subjectsListPage.clickOnRegulatorItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021Page.enterSGCodeInToSearchField("31599101" + "\n");
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
    public void to_2_checkDateOfLastInspANDriskSt_CA_2_Test() {
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
        subjectsListPage.clickOnSphereField();
        subjectsListPage.clickOnSphereAutoTranspItem();
        subjectsListPage.clickOnSelectRegulatorField();
        subjectsListPage.clickOnRegulatorItem();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearField();
        subject_vybirka_sphereAutTrSelectedPage.clickOnYearItem();
        vybirkaAutTransp2021CAPage.checkIsPageLogoPresent();
        vybirkaAutTransp2021CAPage.checkIsPageTitlePresent();
        vybirkaAutTransp2021CAPage.checkIsPageURLPresent();
        vybirkaAutTransp2021Page.enterSGCodeInToSearchField("31599101" + "\n");
        vybirkaAutTransp2021CAPage.checkIsDateOfLastInspection_20150401_2_Present();
        vybirkaAutTransp2021CAPage.checkIsRiskStpn_Seredniy_Present();
        vybirkaAutTransp2021CAPage.checkIsZagBal_21_2_Present();
    }
}
