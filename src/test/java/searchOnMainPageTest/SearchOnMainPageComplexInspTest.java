package searchOnMainPageTest;
import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SearchOnMainPageComplexInspTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("oper@mns.gov.ua", "123456789");
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
