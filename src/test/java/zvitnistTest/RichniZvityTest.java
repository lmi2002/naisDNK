package zvitnistTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RichniZvityTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnZvitnist();
    }

    @Test
    public void reportPlanningPeriodsTest() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.pageTitleIsDisplayed();
        reportPlanningPeriodsPage.checkIsGridElementPresent();
        reportPlanningPeriodsPage.gridListElementsIsDisplayed();
    }

    @Test
    public void reportPlanPerevirky2017Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReport2017link();
        reportPlanPerevirkyAll2017Page.checkCurrentUrl();
        reportPlanPerevirkyAll2017Page.pageTitleIsDisplayed();
        reportPlanPerevirkyAll2017Page.checkIsGridElementPresent();

    }

    @Test
    public void reportPlanPerevirky2018Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReport2018link();
        reportPlanPerevirkyAll2018Page.checkCurrentUrl();
        reportPlanPerevirkyAll2018Page.pageTitleIsDisplayed();
        reportPlanPerevirkyAll2018Page.checkIsGridElementPresent();
        reportPlanPerevirkyAll2018Page.gridListElementsIsDisplayed();
    }

    @Test
    public void reportPlanPerevirky2019Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReport2019link();
        reportPlanPerevirkyAll2019Page.checkCurrentUrl();
        reportPlanPerevirkyAll2019Page.pageTitleIsDisplayed();
        reportPlanPerevirkyAll2019Page.checkIsGridElementPresent();
        reportPlanPerevirkyAll2019Page.gridListElementsIsDisplayed();
    }

    @Test
    public void reportPlanPerevirky2020Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReport2020link();
        reportPlanPerevirkyAll2020Page.checkCurrentUrl();
        reportPlanPerevirkyAll2020Page.pageTitleIsDisplayed();
        reportPlanPerevirkyAll2020Page.checkIsGridElementPresent();
        reportPlanPerevirkyAll2020Page.gridListElementsIsDisplayed();
    }

    @Ignore("Розширена інформація відсутня / Файл відсутній")
    @Test
    public void planPerevirkyAll2017Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2017link();
        planPerevirkyAll2017Page.checkCurrentUrl();
        planPerevirkyAll2017Page.pageTitleIsDisplayed();
        planPerevirkyAll2017Page.checkIsGridElementPresent();
        planPerevirkyAll2017Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyAll2018Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2018link();
        planPerevirkyAll2018Page.checkCurrentUrl();
        planPerevirkyAll2018Page.pageTitleIsDisplayed();
        planPerevirkyAll2018Page.checkIsGridElementPresent();
        planPerevirkyAll2018Page.gridListElementsIsDisplayed();
        planPerevirkyAll2018Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyAll2019Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2019link();
        planPerevirkyAll2019Page.checkCurrentUrl();
        planPerevirkyAll2019Page.pageTitleIsDisplayed();
        planPerevirkyAll2019Page.checkIsGridElementPresent();
        planPerevirkyAll2019Page.gridListElementsIsDisplayed();
        planPerevirkyAll2019Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyAll2020Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2020link();
        planPerevirkyAll2020Page.checkCurrentUrl();
        planPerevirkyAll2020Page.pageTitleIsDisplayed();
        planPerevirkyAll2020Page.checkIsGridElementPresent();
        planPerevirkyAll2020Page.gridListElementsIsDisplayed();
        planPerevirkyAll2020Page.searchBtnIsDisplayed();
    }
    @Ignore("Розширена інформація відсутня / Файл відсутній")
    @Test
    public void planPerevirkyPorushenia2017Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2017link();
        planPerevirkyAll2017Page.checkCurrentUrl();
        planPerevirkyAll2017Page.clickOnPlanPerevirkyPorushenniaLink();
        planPerevirkyPorushennia2017Page.checkCurrentUrl();
        planPerevirkyPorushennia2017Page.pageTitleIsDisplayed();
        planPerevirkyPorushennia2017Page.checkIsGridElementPresent();
        planPerevirkyPorushennia2017Page.gridListElementsIsDisplayed();
        planPerevirkyPorushennia2017Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyPorushenia2018Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2018link();
        planPerevirkyAll2018Page.checkCurrentUrl();
        planPerevirkyAll2018Page.clickOnPlanPerevirkyPorushenniaLink();
        planPerevirkyPorushennia2018Page.checkCurrentUrl();
        planPerevirkyPorushennia2018Page.pageTitleIsDisplayed();
        planPerevirkyPorushennia2018Page.checkIsGridElementPresent();
        planPerevirkyPorushennia2018Page.gridListElementsIsDisplayed();
        planPerevirkyPorushennia2018Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyPorushenia2019Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2019link();
        planPerevirkyAll2019Page.checkCurrentUrl();
        planPerevirkyAll2019Page.clickOnPlanPerevirkyPorushenniaLink();
        planPerevirkyPorushennia2019Page.checkCurrentUrl();
        planPerevirkyPorushennia2019Page.pageTitleIsDisplayed();
        planPerevirkyPorushennia2019Page.checkIsGridElementPresent();
        planPerevirkyPorushennia2019Page.gridListElementsIsDisplayed();
        planPerevirkyPorushennia2019Page.searchBtnIsDisplayed();
    }

    @Test
    public void planPerevirkyPorushenia2020Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2020link();
        planPerevirkyAll2020Page.checkCurrentUrl();
        planPerevirkyAll2020Page.clickOnPlanPerevirkyPorushenniaLink();
        planPerevirkyPorushennia2020Page.checkCurrentUrl();
        planPerevirkyPorushennia2020Page.pageTitleIsDisplayed();
        planPerevirkyPorushennia2020Page.checkIsGridElementPresent();
        planPerevirkyPorushennia2020Page.searchBtnIsDisplayed();
    }
    @Ignore("Розширена інформація відсутня / Файл відсутній")
    @Test
    public void pozaplanPerevirkyAll2017Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2017link();
        planPerevirkyAll2017Page.checkCurrentUrl();
        planPerevirkyAll2017Page.clickOnPozaplanPerevirkyAllLink();
        pozaplanPerevirkyAll2017Page.checkCurrentUrl();
        pozaplanPerevirkyAll2017Page.pageTitleIsDisplayed();
        pozaplanPerevirkyAll2017Page.checkIsGridElementPresent();
        pozaplanPerevirkyAll2017Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyAll2017Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyAll2018Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2018link();
        planPerevirkyAll2018Page.checkCurrentUrl();
        planPerevirkyAll2018Page.clickOnPozaplanPerevirkyAllLink();
        pozaplanPerevirkyAll2018Page.checkCurrentUrl();
        pozaplanPerevirkyAll2018Page.pageTitleIsDisplayed();
        pozaplanPerevirkyAll2018Page.checkIsGridElementPresent();
        pozaplanPerevirkyAll2018Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyAll2018Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyAll2019Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2019link();
        planPerevirkyAll2019Page.checkCurrentUrl();
        planPerevirkyAll2019Page.clickOnPozaplanPerevirkyAllLink();
        pozaplanPerevirkyAll2019Page.checkCurrentUrl();
        pozaplanPerevirkyAll2019Page.pageTitleIsDisplayed();
        pozaplanPerevirkyAll2019Page.checkIsGridElementPresent();
        pozaplanPerevirkyAll2019Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyAll2019Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyAll2020Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2020link();
        planPerevirkyAll2020Page.checkCurrentUrl();
        planPerevirkyAll2020Page.clickOnPozaplanPerevirkyAllLink();
        pozaplanPerevirkyAll2020Page.checkCurrentUrl();
        pozaplanPerevirkyAll2020Page.pageTitleIsDisplayed();
        pozaplanPerevirkyAll2020Page.checkIsGridElementPresent();
        pozaplanPerevirkyAll2020Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyAll2020Page.searchBtnIsDisplayed();
    }
    @Ignore("Розширена інформація відсутня / Файл відсутній")
    @Test
    public void pozaplanPerevirkyPorushenia2017Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2017link();
        planPerevirkyAll2017Page.checkCurrentUrl();
        planPerevirkyAll2017Page.clickOnPozaplanPerevirkyPorushenniaLink();
        pozaplanPerevirkyPorushennia2017Page.checkCurrentUrl();
        pozaplanPerevirkyPorushennia2017Page.pageTitleIsDisplayed();
        pozaplanPerevirkyPorushennia2017Page.checkIsGridElementPresent();
        pozaplanPerevirkyPorushennia2017Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyPorushennia2017Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyPorushenia2018Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2018link();
        planPerevirkyAll2018Page.checkCurrentUrl();
        planPerevirkyAll2018Page.clickOnPozaplanPerevirkyPorushenniaLink();
        pozaplanPerevirkyPorushennia2018Page.checkCurrentUrl();
        pozaplanPerevirkyPorushennia2018Page.pageTitleIsDisplayed();
        pozaplanPerevirkyPorushennia2018Page.checkIsGridElementPresent();
        pozaplanPerevirkyPorushennia2018Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyPorushennia2018Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyPorushenia2019Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2019link();
        planPerevirkyAll2019Page.checkCurrentUrl();
        planPerevirkyAll2019Page.clickOnPozaplanPerevirkyPorushenniaLink();
        pozaplanPerevirkyPorushennia2019Page.checkCurrentUrl();
        pozaplanPerevirkyPorushennia2019Page.pageTitleIsDisplayed();
        pozaplanPerevirkyPorushennia2019Page.checkIsGridElementPresent();
        pozaplanPerevirkyPorushennia2019Page.gridListElementsIsDisplayed();
        pozaplanPerevirkyPorushennia2019Page.searchBtnIsDisplayed();
    }

    @Test
    public void pozaplanPerevirkyPorushenia2020Test() {
        mainPage.mainMenu.clickOnRichniZvity();
        reportPlanningPeriodsPage.checkCurrentUrl();
        reportPlanningPeriodsPage.clickOnReportInfo2020link();
        planPerevirkyAll2020Page.checkCurrentUrl();
        planPerevirkyAll2020Page.clickOnPozaplanPerevirkyPorushenniaLink();
        pozaplanPerevirkyPorushennia2020Page.checkCurrentUrl();
        pozaplanPerevirkyPorushennia2020Page.pageTitleIsDisplayed();
        pozaplanPerevirkyPorushennia2020Page.checkIsGridElementPresent();
        pozaplanPerevirkyPorushennia2020Page.searchBtnIsDisplayed();
    }
}
