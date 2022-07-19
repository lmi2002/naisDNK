package povidomlenniaTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class PovidomlenniaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("test125@gmail.com", "123456789");
        mainPage.mainMenu.clickOnPovidomlenniaIcon();
    }

    /* Нужно добавить данные
    @Test
    public void viewPovidomlenniaPageTest() {
        mainPage.mainMenu.checkIsPovidomlenniaBlockTitlePresent();
        mainPage.mainMenu.clickOnSeeAllNotificationsBtn();
        povidomlenniaPage.checkIsPageURLPresent();
        povidomlenniaPage.checkIsPageTitlePresent();
        povidomlenniaPage.checkIsPageLogoPresent();
        povidomlenniaPage.dateFieldIsDisplayed();
        povidomlenniaPage.listInTableIsDisplayed();
    }
    */
}