package planuvanniaTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PlanuvanniaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonPO_MR";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPerevirky();
        mainPage.mainMenu.clickOnPlanuvannyaPerelikPeriodiv();

    }

    @Test
    public void viewPlanuvanniaPageTest() {
        planuvanniaPage.checkIsPageURLPresent();
        planuvanniaPage.checkIsPageTitlePresent();
        planuvanniaPage.checkIsPageLogoPresent();
        planuvanniaPage.gridElementIsDisplayed();
        planuvanniaPage.gridListElementsIsDisplayed();
        planuvanniaPage.checkIsGoToVybirka2018BtnPresent();
        planuvanniaPage.checkIsGoToYearPlan2019BtnPresent();
        planuvanniaPage.checkIsGoToYearPlan2020BtnPresent();
        planuvanniaPage.checkIsGoToYearPlan2021BtnPresent();
        planuvanniaPage.checkIsGoToYearPlan2022BtnPresent();
        planuvanniaPage.checkIsGoToVybirka2023BtnPresent();
        planuvanniaPage.checkIsAlgorytmPlanuvanniaBtnPresent();
        planuvanniaPage.clickOnAlgorytmPlanuvanniaBtn();
        planuvanniaPage.checkIsAlgorytmPlanInfoBlockPresent();
        planuvanniaPage.checkIsAlgorytmPlanInfoBlockLinkPresent();
    }

    @Test
    public void viewPlanuvanniaActualPeriodYESPageTest() {
        planuvanniaPage.clickOnActualPeriodSelectField();
        planuvanniaPage.clickOnActualPeriodYESItem();
        planuvanniaActualPeriodYESPage.checkIsPageLogoPresent();
        planuvanniaActualPeriodYESPage.gridElementIsDisplayed();
        planuvanniaActualPeriodYESPage.gridListElementsIsDisplayed();
        planuvanniaActualPeriodYESPage.checkIsAlgorytmPlanuvanniaBtnPresent();
            }

    @Test
    public void viewPlanuvanniaActualPeriodNOPageTest() {
        planuvanniaPage.clickOnActualPeriodSelectField();
        planuvanniaPage.clickOnActualPeriodNOItem();
        planuvanniaActualPeriodNOPage.checkIsPageLogoPresent();
        planuvanniaActualPeriodNOPage.gridElementIsDisplayed();
        planuvanniaActualPeriodNOPage.gridListElementsIsDisplayed();
        planuvanniaActualPeriodNOPage.checkIsAlgorytmPlanuvanniaBtnPresent();
        planuvanniaActualPeriodNOPage.checkIsGoToVybirka2018BtnPresent();
        planuvanniaActualPeriodNOPage.checkIsGoToYearPlan2019BtnPresent();
        planuvanniaActualPeriodNOPage.checkIsGoToVybirka2022BtnPresent();
    }

    @Test
    public void viewPlanPerevirok2018PageTest() {
        planuvanniaPage.clickOnGoToVybirka2018Btn();
        planPerevirok2018Page.checkIsPageURLPresent();
        planPerevirok2018Page.checkIsPageTitlePresent();
        planPerevirok2018Page.checkIsPageLogoPresent();
        planPerevirok2018Page.backToPlanuvanniaPageLinkIsDisplayed();
    }

    @Ignore("Нужно добавить данные")
    @Test
    public void viewRichnyPlanKO2019PageTest() {
        planuvanniaPage.clickOnGoToYearPlan2019Btn();
        richnyPlanKO2019Page.checkIsPageURLPresent();
        richnyPlanKO2019Page.checkIsPageTitlePresent();
        richnyPlanKO2019Page.checkIsPageLogoPresent();
        richnyPlanKO2019Page.gridElementIsDisplayed();
        richnyPlanKO2019Page.gridListElementsIsDisplayed();
        richnyPlanKO2019Page.checkIsBackToPlanuvanniaPageLinkPresent();
        richnyPlanKO2019Page.checkIsActualInspLinkPresent();
        richnyPlanKO2019Page.checkIsArchiveInspLinkPresent();
        richnyPlanKO2019Page.checkIsDownloadFileBtnPresent();
        richnyPlanKO2019Page.checkIsSphereSelectFieldPresent();
        richnyPlanKO2019Page.goToVybirkaSGBtnPresent();
    }

    @Ignore("Нужно добавить данные")
    @Test
    public void viewRichnyPlanKO2020PageTest() {
        planuvanniaPage.clickOnGoToYearPlan2020Btn();
        richnyPlanKO2020Page.checkIsPageURLPresent();
        richnyPlanKO2020Page.checkIsPageTitlePresent();
        richnyPlanKO2020Page.checkIsPageLogoPresent();
        richnyPlanKO2020Page.gridElementIsDisplayed();
        richnyPlanKO2020Page.gridListElementsIsDisplayed();
        richnyPlanKO2020Page.checkIsBackToPlanuvanniaPageLinkPresent();
        richnyPlanKO2020Page.checkIsActualInspLinkPresent();
        richnyPlanKO2020Page.checkIsArchiveInspLinkPresent();
        richnyPlanKO2020Page.checkIsDownloadFileBtnPresent();
        richnyPlanKO2020Page.checkIsSphereSelectFieldPresent();
        richnyPlanKO2020Page.goToVybirkaSGBtnPresent();
    }

}
