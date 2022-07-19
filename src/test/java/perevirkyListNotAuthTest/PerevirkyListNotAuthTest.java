package perevirkyListNotAuthTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PerevirkyListNotAuthTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        mainNotAuthPage.openPage();
        mainNotAuthPage.checkCurrentUrl();
        Assert.assertEquals(mainNotAuthPage.getTitle(), "Головна");
        mainNotAuthPage.mainMenu.clickOnRezultatyPerevirok();
    }

    @Test
    public void inspAllPlan2020NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPlanovyhPerevirok();
        inspAllPlanNotAuthPage.checkCurrentUrl();
        inspAllPlanNotAuthPage.pageTitleIsDisplayed();
        inspAllPlanNotAuthPage.gridElementIsDisplayed();
        inspAllPlanNotAuthPage.gridListElementsIsDisplayed();
    }

    @Test
    public void inspAllPlan2018NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPlanovyhPerevirok();
        inspAllPlanNotAuthPage.checkCurrentUrl();
        inspAllPlanNotAuthPage.clickOnLink2018();
        inspAllPlanNotAuth2018Page.pageTitleIsDisplayed();
        inspAllPlanNotAuth2018Page.gridElementIsDisplayed();
        inspAllPlanNotAuth2018Page.gridListElementsIsDisplayed();
    }

    @Test
    public void inspAllPlan2019NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPlanovyhPerevirok();
        inspAllPlanNotAuthPage.checkCurrentUrl();
        inspAllPlanNotAuthPage.clickOnLink2019();
        inspAllPlanNotAuth2019Page.pageTitleIsDisplayed();
        inspAllPlanNotAuth2019Page.gridElementIsDisplayed();
        inspAllPlanNotAuth2019Page.gridListElementsIsDisplayed();
    }

    @Test
    public void inspAllPozaplan2020NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPozaplanovyhPerevirok();
        inspAllPozaplanNotAuthPage.checkCurrentUrl();
        inspAllPozaplanNotAuthPage.pageTitleIsDisplayed();
        inspAllPozaplanNotAuthPage.gridElementIsDisplayed();
        inspAllPozaplanNotAuthPage.gridListElementsIsDisplayed();
    }

    @Test
    public void inspAllPozaplan2018NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPozaplanovyhPerevirok();
        inspAllPozaplanNotAuthPage.checkCurrentUrl();
        inspAllPozaplanNotAuthPage.clickOnLink2018();
        inspAllPozaplanNotAuth2018Page.pageTitleIsDisplayed();
        inspAllPozaplanNotAuth2018Page.gridElementIsDisplayed();
        inspAllPozaplanNotAuth2018Page.gridListElementsIsDisplayed();
    }

    @Test
    public void inspAllPozaplan2019NotAuthTest() {
        mainNotAuthPage.mainMenu.clickOnRezultatyPozaplanovyhPerevirok();
        inspAllPozaplanNotAuthPage.checkCurrentUrl();
        inspAllPozaplanNotAuthPage.clickOnLink2019();
        inspAllPozaplanNotAuth2019Page.pageTitleIsDisplayed();
        inspAllPozaplanNotAuth2019Page.gridElementIsDisplayed();
        inspAllPozaplanNotAuth2019Page.gridListElementsIsDisplayed();
    }
}