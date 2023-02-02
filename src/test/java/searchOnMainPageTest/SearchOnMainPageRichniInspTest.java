package searchOnMainPageTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class SearchOnMainPageRichniInspTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
    }

    @Test
    public void searchByYearTest() {
        richniPerevirkyMainPage.clickOnYearField();
        richniPerevirkyMainPage.clickOnYear2021Item();
        richniPerevirkyMainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", searchResultByYearRichniMainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", searchResultByYearRichniMainPage.gridListElementsIsDisplayed());
        checkExpectedResult("Search Result by Year (4 532) is not present", searchResultByYearRichniMainPage.searchResultByYearIsDisplayed());
    }

    @Test
    public void searchByEDRPOUTest() {
        richniPerevirkyMainPage.clickOnYearField();
        richniPerevirkyMainPage.clickOnYear2021Item();
        richniPerevirkyMainPage.enterCompanyNameInToInputField("32285225");
        richniPerevirkyMainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", searchResultByEDRPOURichniMainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", searchResultByEDRPOURichniMainPage.gridListElementsIsDisplayed());
    }

    @Test
    public void searchByCompanyNameTest() {
        richniPerevirkyMainPage.clickOnYearField();
        richniPerevirkyMainPage.clickOnYear2021Item();
        richniPerevirkyMainPage.enterCompanyNameInToInputField("СІЛЬСЬКОГОСПОДАРСЬКИЙ ВИРОБНИЧИЙ КООПЕРАТИВ \" ЗОРЯ \""+"\n");
        richniPerevirkyMainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", searchResultByCompanyNameRichniMainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", searchResultByCompanyNameRichniMainPage.gridListElementsIsDisplayed());
    }

    @Test
    public void searchByRegulatorNameTest() {
        richniPerevirkyMainPage.clickOnYearField();
        richniPerevirkyMainPage.clickOnYear2021Item();
        richniPerevirkyMainPage.clickOnRegulatorNameField();
        richniPerevirkyMainPage.enterRegulatorNameInToSearchField("Міністерство охорони здоров'я України" + "\n");
        richniPerevirkyMainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", searchResultBySGNameRichniMainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", searchResultBySGNameRichniMainPage.gridListElementsIsDisplayed());
        checkExpectedResult("SearchResultBySG is not present", searchResultBySGNameRichniMainPage.searchResultBySGIsDisplayed());
    }

    @Test
    public void searchBySGAllTest() {
        richniPerevirkyMainPage.clickOnRegulatorNameField();
        richniPerevirkyMainPage.enterRegulatorNameInToSearchField("Міністерство охорони здоров'я України" + "\n");
        richniPerevirkyMainPage.clickOnYearField();
        richniPerevirkyMainPage.clickOnYear2021Item();
        richniPerevirkyMainPage.enterCompanyNameInToInputField("\"ГЕМАФОНД\""+"\n");
        richniPerevirkyMainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", searchResultBySGAllRichniMainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", searchResultBySGAllRichniMainPage.gridListElementsIsDisplayed());
        checkExpectedResult("SearchResultByAll (1-) is not present", searchResultBySGAllRichniMainPage.searchResultByAllIsDisplayed());
    }
}
