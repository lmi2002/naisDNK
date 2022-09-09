package updateUserTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class UpdateUserTest extends AbstractParentTest {

    @Before
    public void preconditions() {

        String role = "officialPersonTPO";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
    }
    @Ignore("Нужен отдельный пользователь. Измененяются данные пользователя")
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
        updateUserPage.enterEmailInToInputField("d.beztuzhev@brdo.com.ua");
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
        updateUserPage.enterPIBInToInputField("Червань Віталій Іванович");
        updateUserPage.enterEmailInToInputField("chervan@vingudpss.gov.ua");
        updateUserPage.enterPhoneInToInputField("(043) 265-8811");
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




