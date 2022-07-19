package vyhidTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class VyhidTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
    }

    @Test
    public void LogOutTest() {
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnVyhid();
        mainNotAuthPage.checkCurrentUrl();
    }
}