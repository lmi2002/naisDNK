package resultsInspZaZvernenniam;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ResultsInspZaZvernenniam extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "officialPersonPO_MR";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        // mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnPerevirky();
        mainPage.mainMenu.clickOnRezultatyPerevirokZaZvernennyam();
    }

    @Test
    public void viewResultsInspZaZvernenniamPageTest() {
        resultsInspZaZvernenniamPage.checkIsPageURLPresent();
        resultsInspZaZvernenniamPage.checkIsPageTitlePresent();
        resultsInspZaZvernenniamPage.u2018YearLinkIsDisplayed();
        resultsInspZaZvernenniamPage.u2019YearLinkIsDisplayed();
        resultsInspZaZvernenniamPage.u2020YearLinkIsDisplayed();
        resultsInspZaZvernenniamPage.checkIsPageLogoPresent();
    }

    @Ignore("Нужно добавить данные")
    @Test
    public void viewResultsInspZaZvernenniam2018PageTest() {
        resultsInspZaZvernenniamPage.clickOnU2018YearLink();
        resultsInspZaZvernenniam2018Page.checkIsPageTitlePresent();
        resultsInspZaZvernenniam2018Page.u2018YearLinkIsDisplayed();
        resultsInspZaZvernenniam2018Page.u2019YearLinkIsDisplayed();
        resultsInspZaZvernenniam2018Page.u2020YearLinkIsDisplayed();
        resultsInspZaZvernenniam2018Page.checkIsPageLogoPresent();
    }

    @Ignore("Нужно добавить данные")
    @Test
    public void viewResultsInspZaZvernenniam2019PageTest() {
        resultsInspZaZvernenniamPage.clickOnU2019YearLink();
        resultsInspZaZvernenniam2019Page.checkIsPageTitlePresent();
        resultsInspZaZvernenniam2019Page.u2018YearLinkIsDisplayed();
        resultsInspZaZvernenniam2019Page.u2019YearLinkIsDisplayed();
        resultsInspZaZvernenniam2019Page.u2020YearLinkIsDisplayed();
        resultsInspZaZvernenniam2019Page.checkIsPageLogoPresent();
    }

    @Ignore("Нужно добавить данные")
    @Test
    public void viewResultsInspZaZvernenniam2020PageTest() {
        resultsInspZaZvernenniam2018Page.clickOnU2020YearLink();
        resultsInspZaZvernenniam2020Page.checkIsPageTitlePresent();
        resultsInspZaZvernenniam2020Page.u2018YearLinkIsDisplayed();
        resultsInspZaZvernenniam2020Page.u2019YearLinkIsDisplayed();
        resultsInspZaZvernenniam2020Page.u2020YearLinkIsDisplayed();
        resultsInspZaZvernenniam2020Page.checkIsPageLogoPresent();
    }
}
