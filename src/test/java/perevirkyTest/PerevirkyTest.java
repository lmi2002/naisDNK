package perevirkyTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class PerevirkyTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonPO_MR";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPerevirky();
    }

    @Test
    public void planInsp2020Test() {
        mainPage.mainMenu.clickOnPlanoviPerevirky();
        planInspPage.checkCurrentUrl();
        planInspPage.pageTitleIsDisplayed();
        planInspPage.downloadFileLinkIsDisplayed();
        planInspPage.gridElementIsDisplayed();
        planInspPage.gridListElementsIsDisplayed();
        planInspPage.allInspDateLinkIsDisplayed();
        planInspPage.menuInspBtnIsDisplayed();
        planInspPage.clickOnMenuInspBtn();
        planInspPage.viewInspCardBtnIsDisplayed();
        planInspPage.updateInspBtnIsDisplayed();
        planInspPage.downloadInspBtnIsDisplayed();
        // planInspPage.goToArchiveInspBtnIsDisplayed(); Для планових перевірок такого функціоналу немає
    }

    @Test
    public void viewPlanInspCard2020Test() {
        mainPage.mainMenu.clickOnPlanoviPerevirky();
        planInspPage.checkCurrentUrl();
        planInspPage.clickOnMenuInspBtn();
        planInspPage.clickOnViewInspCardBtn();
        viewPlanInspCard2020Page.checkIsPageURLPresent();
        viewPlanInspCard2020Page.checkIsPageTitlePresent();
        viewPlanInspCard2020Page.checkIsPageLogoPresent();
        viewPlanInspCard2020Page.checkIsGridTitlePresent();
        viewPlanInspCard2020Page.checkIsSaveBtnPresent();
        viewPlanInspCard2020Page.checkIsUpdateBtnPresent();
        viewPlanInspCard2020Page.checkIsAllDataBlockPresent();
        viewPlanInspCard2020Page.checkIsSGBlockPresent();
        viewPlanInspCard2020Page.clickOnBackLink();
        planInsp2020Page.checkIsPageURLPresent();
        planInsp2020Page.checkIsPageTitlePresent();
    }

    @Test
    public void planInsp2018Test() {
        mainPage.mainMenu.clickOnPlanoviPerevirky();
        planInspPage.checkCurrentUrl();
        planInspPage.clickOnSelectYearField();
        planInspPage.clickOn2018YearItem();
        planInsp2018Page.checkIsPageURLPresent();
        planInsp2018Page.checkIsPageTitlePresent();
        planInsp2018Page.checkIsPageLogoPresent();
        planInsp2018Page.checkIsDownloadBtnPresent();
        planInsp2018Page.checkIsGridElementPresent();
        // planInsp2018Page.checkIsGridListElementsPresent();
    }

    @Test
    public void planInsp2021Test() {
        mainPage.mainMenu.clickOnPlanoviPerevirky();
        planInspPage.checkCurrentUrl();
        planInspPage.clickOnSelectYearField();
        planInspPage.clickOn2021YearItem();
        planInsp2021Page.checkIsPageURLPresent();
        planInsp2021Page.checkIsPageTitlePresent();
        planInsp2021Page.checkIsPageLogoPresent();
        planInsp2021Page.checkIsDownloadBtnPresent();
        planInsp2021Page.checkIsGridElementPresent();
        planInsp2021Page.checkIsGridListElementsPresent();
    }

    @Test
    public void planInsp2019Test() {
        mainPage.mainMenu.clickOnPlanoviPerevirky();
        planInspPage.checkCurrentUrl();
        planInspPage.clickOnSelectYearField();
        planInspPage.clickOn2019YearItem();
        planInsp2019Page.checkIsPageURLPresent();
        planInsp2019Page.checkIsPageTitlePresent();
        planInsp2019Page.checkIsPageLogoPresent();
        planInsp2019Page.checkIsDownloadBtnPresent();
        planInsp2019Page.checkIsGridElementPresent();
        // planInsp2019Page.checkIsGridListElementsPresent();
    }


    @Test
    public void pozplanInsp2020Test() {
        mainPage.mainMenu.clickOnPozaplanoviPerevirky();
        pozaplanInspPage.checkIsPageURLPresent();
        pozaplanInspPage.checkIsPageTitlePresent();
        pozaplanInspPage.checkIsPageLogoPresent();
        pozaplanInspPage.checkIsDownloadFileLinkPresent();
        pozaplanInspPage.checkIsGridElementPresent();
        pozaplanInspPage.checkIsGridListElementsPresent();
        pozaplanInspPage.checkIsCreateInspLinkPresent();
        pozaplanInspPage.checkIsGoToArchiveLinkPresent();
        pozaplanInspPage.checkIsMenuInspBtnPresent();
    }


    @Test
    public void viewPozaplanInspCard2020Test() {
        mainPage.mainMenu.clickOnPozaplanoviPerevirky();
        pozaplanInspPage.checkIsPageURLPresent();
        pozaplanInspPage.enterSGNameInToSearchField("ЕНЕРГОСЕРВІС" + "\n");
        pozaplanInspPage.checkIsSearchListElementsPresent();
        pozaplanInspPage.clickOnMenuInspBtn();
        pozaplanInspPage.clickOnViewInspCardBtn();
        viewPozaplanInspCard2020Page.checkIsPageURLPresent();
        viewPozaplanInspCard2020Page.checkIsPageTitlePresent();
        viewPozaplanInspCard2020Page.checkIsPageLogoPresent();
        viewPozaplanInspCard2020Page.checkIsGridTitlePresent();
        viewPozaplanInspCard2020Page.checkIsSaveBtnPresent();
        viewPozaplanInspCard2020Page.checkIsSaveBtnPresent();
        viewPozaplanInspCard2020Page.clickOnBackLink();
        pozaplanInsp2020Page.checkIsPageURLPresent();
        pozaplanInsp2020Page.checkIsPageTitlePresent();
        pozaplanInsp2020Page.checkIsCreateInspBtnPresent();
    }

    @Test
    public void pozaplanInsp2018Test() {
        mainPage.mainMenu.clickOnPozaplanoviPerevirky();
        pozaplanInspPage.checkIsPageURLPresent();
        pozaplanInspPage.clickOnSelectYearField();
        pozaplanInspPage.clickOn2018YearItem();
        pozaplanInsp2018Page.checkIsPageURLPresent();
        pozaplanInsp2018Page.checkIsPageTitlePresent();
        pozaplanInsp2018Page.checkIsDownloadBtnPresent();
        pozaplanInsp2018Page.checkIsGridElementPresent();
        // pozaplanInsp2018Page.checkIsGridListElementsPresent(); Добавить данные
        pozaplanInsp2018Page.checkIsCreateInspBtnPresent();
    }

    @Test
    public void pozaplanInsp2019Test() {
        mainPage.mainMenu.clickOnPozaplanoviPerevirky();
        pozaplanInspPage.checkCurrentUrl();
        pozaplanInspPage.clickOnSelectYearField();
        pozaplanInspPage.clickOn2019YearItem();
        pozaplanInsp2019Page.checkIsPageURLPresent();
        pozaplanInsp2019Page.checkIsPageTitlePresent();
        pozaplanInsp2019Page.checkIsPageLogoPresent();
        pozaplanInsp2019Page.checkIsDownloadBtnPresent();
        pozaplanInsp2019Page.checkIsGridElementPresent();
        // pozaplanInsp2019Page.checkIsGridListElementsPresent(); Добавить данные
        pozaplanInsp2019Page.checkIsCreateInspBtnPresent();
    }
}