package storinkaOrganuSubMenuTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class StorinkaOrganuSubMenuTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("iastestuser1_tro", "123007");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnSubyektyGosp();
    }

    @Test
    public void viewSubjectsPageElementsTest() {
        subjectsListPage.checkCurrentUrl();
        subjectsListPage.pageTitleIsDisplayed();
        subjectsListPage.gridElementIsDisplayed();
        subjectsListPage.gridListElementsIsDisplayed();
    }
}