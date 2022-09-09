package trainingMaterialTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class TrainingMaterialTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonTPO";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnDovidnyky();
        mainPage.mainMenu.clickOnNavchalniConsultMaterial();
    }

    @Test
    public void viewTrainingMaterialsPageTest() {
        trainingMaterialPage.checkIsPageURLPresent();
        trainingMaterialPage.checkIsPageLogoPresent();
        trainingMaterialPage.checkIsPageTitlePresent();
        trainingMaterialPage.checkIsTrainingPageLogoPresent();
        trainingMaterialPage.checkIsGridElementPresent();
        trainingMaterialPage.checkIsGridListElementsPresent();
        trainingMaterialPage.checkIsAddMaterialBtnPresent();
        trainingMaterialPage.checkIsCleanFiltersBtnPresent();
    }

    @Test
    public void viewSearchResultTrainingMaterialTest() throws InterruptedException {
        trainingMaterialPage.checkIsPageURLPresent();
        trainingMaterialPage.inputNameOfMaterialInToSearchField("мсап" + "\n");
        trainingMaterialPage.waiting();
        searchResultTrainingMaterialsPage.checkIsPageLogoPresent();
        searchResultTrainingMaterialsPage.checkIsPageTitlePresent();
        searchResultTrainingMaterialsPage.checkIsTrainingPageLogoPresent();
        searchResultTrainingMaterialsPage.checkIsCleanFiltersBtnPresent();
        searchResultTrainingMaterialsPage.checkIsGridElementPresent();
        searchResultTrainingMaterialsPage.checkIsGridListElementsPresent();
        searchResultTrainingMaterialsPage.checkIsTrainingPageLogoPresent();
        searchResultTrainingMaterialsPage.checkIsAddMaterialBtnPresent();
        searchResultTrainingMaterialsPage.checkIsSearchResultPresent();
    }

    @Test
    public void viewTrainingMaterialCardTest() throws InterruptedException {
        trainingMaterialPage.checkIsPageURLPresent();
        trainingMaterialPage.inputNameOfMaterialInToSearchField("мсап" + "\n");
        trainingMaterialPage.waiting();
        searchResultTrainingMaterials_msap_Page.clickOnViewMaterialBtn();
        viewTrainingMaterialPage.checkIsPageURLPresent();
        viewTrainingMaterialPage.checkIsPageTitlePresent();
        viewTrainingMaterialPage.checkIsPageLogoPresent();
        viewTrainingMaterialPage.checkIsBackToMaterialsListLinkPresent();
        viewTrainingMaterialPage.checkIsTableBlockPresent();
    }
}