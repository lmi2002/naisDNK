package updateUserTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class UpdateUserTest extends AbstractParentTest {

    @Before
    public void preconditions() {

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
    }

    @Test
    public void updateUserTest() {
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnMiyProfil();
        viewUserPage.checkCurrentUrl();
        viewUserPage.isInspectorAvatarDisplayed();
        viewUserPage.clickOnBtnInspectorMenu();
        viewUserPage.clickOnIconUpdate();
        updateUserPage.checkCurrentUrl();
        updateUserPage.isUpdateUserPageTitleDisplayed();
        updateUserPage.enterPIBInToInputField("Ходос Денис");
        updateUserPage.enterEmailInToInputField("d.beztuzhev12@brdo.com.ua");
        updateUserPage.enterPhoneInToInputField("(095) 222-2222");
        updateUserPage.clickOnBtnUpdate();
        viewUserPage.clickOnBtnCloseModal();
        viewUserPage.updatedUserNameIsTrue();
        viewUserPage.updatedEmailIsTrue();
        viewUserPage.updatedPhoneIsTrue();
        viewUserPage.clickOnBtnInspectorMenu();
        viewUserPage.clickOnIconViewInspCard();
        viewUserPage.updatedEmailInCardIsTrue();
        viewUserPage.updatedPhoneInCardIsTrue();
        viewUserPage.clickOnBtnUpdateFromUserCard();
        updateUserPage.enterPIBInToInputField("Безтужев Денис");
        updateUserPage.enterEmailInToInputField("d.beztuzhev@brdo.com.ua");
        updateUserPage.enterPhoneInToInputField("(095) 222-5555");
        updateUserPage.clickOnBtnUpdate();
        viewUserPage.clickOnBtnCloseModal();
    }

    @Test
    public void viewUserCardTest() {
        mainPage.mainMenu.clickOnMenuKorystuvacha();
        mainPage.mainMenu.clickOnMiyProfil();
        viewUserPage.checkCurrentUrl();
        viewUserPage.isInspectorAvatarDisplayed();
        viewUserPage.clickOnBtnInspectorMenu();
        viewUserPage.clickOnIconViewInspCard();
        viewUserPage.checkEmailInCard();
        viewUserPage.checkPhoneInCard();
        viewUserPage.clickOnIconClose();
    }
}




