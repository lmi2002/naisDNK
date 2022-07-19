package skargyDoDRSTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SkargyDoDRSTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("iastester_sg", "123007");
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnSkargyDoDRS();
    }

    @Test
    public void createSkargaDoDRSTest() {
        skargyDoDRSPage.checkIsPageURLPresent();
        skargyDoDRSPage.checkIsPageLogoPresent();
        skargyDoDRSPage.checkIsPageTitlePresent();
        skargyDoDRSPage.clickOnCreateSkargaBtn();
        skargyDoDRSPage.clickOnInspSelectField();
        skargyDoDRSPage.clickOnInspItem();
        skargyDoDRSPage.enterSkargaTextInToInputField("Суть скарги на перевірку");
        skargyDoDRSPage.clickOnSaveSkargaBtn();
        skargyDoDRSPage.checkIsUspih_createSkarga_message_modalWinPresent();
        skargyDoDRSPage.clickOnCloseModalWinBtn();
    }
}
