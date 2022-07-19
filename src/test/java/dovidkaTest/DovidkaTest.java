package dovidkaTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class DovidkaTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("oper@mns.gov.ua", "123456789");
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnDovidka();
    }

    @Test
    public void viewDovidkaContentTest() {
        dovidkaPage.checkCurrentUrl();
        dovidkaPage.checkIsPageTitlePresent();
        dovidkaPage.textInBlockElements_1IsDisplayed();
        dovidkaPage.textInBlockElements_2IsDisplayed();
        dovidkaPage.textInBlockElements_3IsDisplayed();
        dovidkaPage.textInBlockElements_4IsDisplayed();
    }
}