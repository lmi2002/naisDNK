package riskCriteriaTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class RiskCriteriaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnKryteriiRyzyku();
    }

    @Test
    public void viewRiskCriteriaListTest() {
        riskCriteriaPage.pageTitleIsDisplayed();
        riskCriteriaPage.gridElementIsDisplayed();
        riskCriteriaPage.gridListElementsIsDisplayed();
        riskCriteriaPage.searchBtnIsDisplayed();
        riskCriteriaPage.cleanFiltersBtnIsDisplayed();
        riskCriteriaPage.addDocumentBtnIsDisplayed();
    }

    @Test
    public void riskCriteriasSearchResultTest() {
        riskCriteriaPage.enterNPANameInToSearchField("Про затвердження критеріїв, за якими оцінюється ступінь ризику від провадження ");
        riskCriteriaPage.clickOnSearchBtn();
        riskCriteriasSearchResultPage.pageTitleIsDisplayed();
        riskCriteriasSearchResultPage.gridElementIsDisplayed();
        riskCriteriasSearchResultPage.gridListElementsIsDisplayed();
         }

    @Test
    public void viewRiskCriteriaDocTest() {
        riskCriteriaPage.clickOnViewCardBtn();
        viewRiskCriteriaDocPage.riskCriteriasIsDisplayed();
        viewRiskCriteriaDocPage.zagalnaInfoTitleOfBlockIsDisplayed();
        viewRiskCriteriaDocPage.risksLinkIsDisplayed();
    }
}
