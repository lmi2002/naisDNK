package richniPlanTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class RichniPlanTest extends AbstractParentTest {



    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPlanyPerevirok();
        mainPage.mainMenu.clickOnRichniPlany();
        richniPlansMainPage.checkIsPageURLPresent();
    }

    @Test
    public void richniPlanCOrgMainPageTest() {
        richniPlansMainPage.checkIsPageTitlePresent();
        richniPlansMainPage.checkIsPageLogoPresent();
        richniPlansMainPage.checkIsOrganNamePresent();
        richniPlansMainPage.checkIsOrganTypeItemPresent();
        richniPlansMainPage.checkIsYearItemPresent();
        richniPlansMainPage.checkIsDownloadBtnPresent();
        richniPlansMainPage.checkIsGoToNakazListAboutChangesLinkPresent();
    }

    @Test
    public void richniPlansCOrg2018Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2018Item();
        richniPlansCO2018Page.checkIsPageURLPresent();
        richniPlansCO2018Page.checkIsPageTitlePresent();
        richniPlansCO2018Page.checkIsPageLogoPresent();
        richniPlansCO2018Page.checkIsOrganNamePresent();
        richniPlansCO2018Page.checkIsOrganTypeItemPresent();
        richniPlansCO2018Page.checkIsYear2018ItemPresent();
    }

    @Test
    public void richniPlansCOrg2019Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2019Item();
        richniPlansCO2019Page.checkIsPageURLPresent();
        richniPlansCO2019Page.checkIsPageTitlePresent();
        richniPlansCO2019Page.checkIsPageLogoPresent();
        richniPlansCO2019Page.checkIsOrganNamePresent();
        richniPlansCO2019Page.checkIsOrganTypeItemPresent();
        richniPlansCO2019Page.checkIsYearItemPresent();
    }

    @Test
    public void richniPlansCOrg2020Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2018Item();
        richniPlansCO2018Page.clickOnYear2018Field();
        richniPlansCO2018Page.clickOnYear2020Item();
        richniPlansCO2020Page.checkIsPageURLPresent();
        richniPlansCO2020Page.checkIsPageTitlePresent();
        richniPlansCO2020Page.checkIsPageLogoPresent();
        richniPlansCO2020Page.checkIsOrganNamePresent();
        richniPlansCO2020Page.checkIsOrganTypeItemPresent();
        richniPlansCO2020Page.checkIsYearItemPresent();
        richniPlansCO2020Page.checkIsDownloadBtnPresent();
        richniPlansCO2020Page.checkIsGoToLinkPresent();
    }

    @Test
    public void richniPlanChangesTest() {
        richniPlansMainPage.clickOnGoToNakazListAboutChangesLink();
        richniPlanChangesPage.checkIsPageTitlePresent();
        richniPlanChangesPage.checkIsGridElementPresent();
        richniPlanChangesPage.checkIsSaveNakaz_1_lineBtnPresent();
    }

    @Test
    public void planInspByRegulator2018Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2020Item();
        richniPlansCO2020Page.clickOnRegulatorsNameLink();
        planInspByRegulator2020Page.clickOnPlanInspListLink2018();
        planInspByRegulator2018Page.checkIsPageTitlePresent();
        planInspByRegulator2018Page.checkIsPageLogoPresent();
        planInspByRegulator2018Page.checkIsGridElementPresent();
        planInspByRegulator2018Page.checkIsGridListElementsPresent();
    }

    @Test
    public void planInspByRegulator2019Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2020Item();
        richniPlansCO2020Page.clickOnRegulatorsNameLink();
        planInspByRegulator2020Page.clickOnPlanInspListLink2018();
        planInspByRegulator2020Page.clickOnPlanInspListLink2019();
        planInspByRegulator2019Page.checkIsPageTitlePresent();
        planInspByRegulator2019Page.checkIsPageLogoPresent();
        planInspByRegulator2019Page.checkIsGridElementPresent();
        planInspByRegulator2019Page.checkIsGridListElementsPresent();
    }

    @Test
    public void planInspByRegulator2020Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2020Item();
        richniPlansCO2020Page.clickOnRegulatorsNameLink();
        planInspByRegulator2020Page.checkIsPageTitlePresent();
        planInspByRegulator2020Page.checkIsPageLogoPresent();
        planInspByRegulator2020Page.checkIsGridElementPresent();
        planInspByRegulator2020Page.checkIsGridListElementsPresent();
    }

    @Test
    public void planInspByRegulator2021Test() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2020Item();
        richniPlansCO2020Page.clickOnRegulatorsNameLink();
        planInspByRegulator2020Page.clickOnPlanInspListLink2021();
        planInspByRegulator2021Page.checkIsPageTitlePresent();
        planInspByRegulator2021Page.checkIsPageLogoPresent();
        planInspByRegulator2021Page.checkIsGridElementPresent();
    }

    @Test
    public void inspectionCardViewTest() {
        richniPlansMainPage.clickOnYearField();
        richniPlansMainPage.clickOnYear2020Item();
        richniPlansCO2020Page.clickOnRegulatorsNameLink();
        planInspByRegulator2020Page.clickOnPlanInspListLink2019();
        planInspByRegulator2019Page.clickOnCardBtn();
        inspectionCardViewPage.checkIsPageTitlePresent();
        inspectionCardViewPage.checkIsPageLogoPresent();
        inspectionCardViewPage.checkIsInspectionTitlePresent();
        inspectionCardViewPage.checkIsSaveBtnPresent();
    }
}
