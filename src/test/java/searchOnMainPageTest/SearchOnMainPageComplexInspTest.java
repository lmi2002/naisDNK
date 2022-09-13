package searchOnMainPageTest;
import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SearchOnMainPageComplexInspTest extends AbstractParentTest {


    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
    }

    @Test
    public void SearchByYearTest() {
        mainPage.clickOnYearField();
        mainPage.clickOnYearItem();
        mainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", mainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", mainPage.gridListElementsIsDisplayed());
    }

    @Test
    public void SearchByEDRPOUTest() {
        mainPage.enterCompanyNameInToInputField("33609289");
        mainPage.clickOnYearField();
        mainPage.clickOnYearItem();
        mainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", mainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", mainPage.gridListElementsIsDisplayed());
        mainPage.checkIsCompanyNamePresent();
    }

    @Test
    public void SearchByCompanyNameTest() {
        mainPage.enterCompanyNameInToInputField("ПРИВАТНЕ ПІДПРИЄМСТВО \"ПУЛЬС-ТЕРА\"");
        mainPage.clickOnYearField();
        mainPage.clickOnYearItem();
        mainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", mainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", mainPage.gridListElementsIsDisplayed());
        mainPage.checkIsCompanyNamePresent();
    }

    @Test
    public void SearchBySGNameTest() {
        mainPage.clickOnRegulatorNameField();
        mainPage.enterRegulatorNameInToSearchField("Міністерство охорони здоров'я України" + "\n");
        mainPage.clickOnYearField();
        mainPage.clickOnYearItem();
        mainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", mainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", mainPage.gridListElementsIsDisplayed());
        checkExpectedResult("SearchResultBySG (3 180) is not present", mainPage.searchResultBySGIsDisplayed());
    }

    @Test
    public void SearchBySGAllTest() {
        mainPage.enterCompanyNameInToInputField("ПРИВАТНЕ ПІДПРИЄМСТВО \"ПУЛЬС-ТЕРА\"");
        mainPage.clickOnRegulatorNameField();
        mainPage.enterRegulatorNameInToSearchField("Міністерство охорони здоров'я України" + "\n");
        mainPage.clickOnYearField();
        mainPage.clickOnYearItem();
        mainPage.clickOnSearchEventsBtn();
        checkExpectedResult("GridElement is not present", mainPage.gridElementIsDisplayed());
        checkExpectedResult("GridListElements is not present", mainPage.gridListElementsIsDisplayed());
        checkExpectedResult("SearchResultByAll (1) is not present", mainPage.searchResultByAllIsDisplayed());
    }
}
