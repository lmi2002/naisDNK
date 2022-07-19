package riskCriteriaTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class RiskCriteriaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
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
