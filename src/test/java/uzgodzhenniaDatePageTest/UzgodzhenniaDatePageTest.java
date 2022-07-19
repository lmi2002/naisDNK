package uzgodzhenniaDatePageTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class UzgodzhenniaDatePageTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
        mainPage.mainMenu.clickOnPerevirky();
    }

    @Test
    public void uzgodzhenniaDatePageTest() {
        mainPage.mainMenu.clickOnUzgodzhenniaDate();
        uzgodzhenniaDatePage.checkIsPageURLPresent();
        uzgodzhenniaDatePage.checkIsPageTitlePresent();
        uzgodzhenniaDatePage.checkIsPageLogoPresent();
        uzgodzhenniaDatePage.checkIsGridElementPresent();
        uzgodzhenniaDatePage.checkIsGridListElementsPresent();
        uzgodzhenniaDatePage.checkIsPageInspTitle_Present("Перелік пропозицій на зміну дати перевірки");
    }
}
