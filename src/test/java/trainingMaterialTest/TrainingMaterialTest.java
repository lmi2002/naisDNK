package trainingMaterialTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class TrainingMaterialTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.fillingLoginFormAndSubmitIt("d.beztuzhev", "123007");
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