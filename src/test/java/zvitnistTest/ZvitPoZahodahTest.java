package zvitnistTest;

import abstractParentTest.AbstractParentTest;
import libs.Utils;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class ZvitPoZahodahTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        String role = "adminCA";
        JSONObject personData = Utils.getUserPersonData(configProperties.USERS_FILE_PATH(), role);
        String pathToKey = (String) personData.get("pathToKey");
        String absolute = Utils.getAbsolutePathToKey(pathToKey);

        mainNotAuthPage.openPage();
        mainNotAuthPage.clickOnUviyty();
        loginPage.extFillingLoginFormAndSubmit((String) personData.get("login"), (String) personData.get("passwd"), (String) personData.get("rnokpp"), absolute, (String) personData.get("passwdKey"));
        mainPage.mainMenu.clickOnZvitnist();
    }

    @Test
    public void zvitPoZahodah2020AllTest() {
        mainPage.mainMenu.clickOnZvitPoZahodah();
        zvitPoZahodahPage.checkIsPageURLPresent();
        zvitPoZahodahPage.checkIsPageTitlePresent();
        zvitPoZahodahPage.checkIsPageLogoPresent();
        zvitPoZahodahPage.checkIsKOFieldPresent();
        zvitPoZahodahPage.checkIsPlanPeriodFieldPresent();
        zvitPoZahodahPage.checkIsGridBodyPresent();
    }

    @Test
    public void zvitPoZahodahKO2020Test() {
        mainPage.mainMenu.clickOnZvitPoZahodah();
        zvitPoZahodahPage.clickOnKOField();
        zvitPoZahodahPage.clickOnKOItem();
        zvitPoZahodahKOza2020Page.checkIsPageTitlePresent();
        zvitPoZahodahKOza2020Page.checkIsPageLogoPresent();
        zvitPoZahodahKOza2020Page.checkIsKOFieldPresent();
        zvitPoZahodahKOza2020Page.checkIsPlanPeriodFieldPresent();
        zvitPoZahodahKOza2020Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitPoZahodahKO2018Test() {
        mainPage.mainMenu.clickOnZvitPoZahodah();
        zvitPoZahodahPage.clickOnKOField();
        zvitPoZahodahPage.clickOnKOItem();
        zvitPoZahodahKOza2020Page.clickOnPlanPeriodField();
        zvitPoZahodahKOza2020Page.clickOnZa2018Item();
        zvitPoZahodahKOza2018Page.checkIsPageTitlePresent();
        zvitPoZahodahKOza2018Page.checkIsPageLogoPresent();
        zvitPoZahodahKOza2018Page.checkIsKOFieldPresent();
        zvitPoZahodahKOza2018Page.checkIsPlanPeriodFieldPresent();
        zvitPoZahodahKOza2018Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitPoZahodahKO2019Test() {
        mainPage.mainMenu.clickOnZvitPoZahodah();
        zvitPoZahodahPage.clickOnKOField();
        zvitPoZahodahPage.clickOnKOItem();
        zvitPoZahodahKOza2020Page.clickOnPlanPeriodField();
        zvitPoZahodahKOza2020Page.clickOnZa2019Item();
        zvitPoZahodahKOza2019Page.checkIsPageTitlePresent();
        zvitPoZahodahKOza2019Page.checkIsPageLogoPresent();
        zvitPoZahodahKOza2019Page.checkIsKOFieldPresent();
        zvitPoZahodahKOza2019Page.checkIsPlanPeriodFieldPresent();
        zvitPoZahodahKOza2019Page.checkIsGridBodyPresent();
    }

    @Test
    public void zvitPoZahodahKO2021Test() {
        mainPage.mainMenu.clickOnZvitPoZahodah();
        zvitPoZahodahPage.clickOnKOField();
        zvitPoZahodahPage.clickOnKOItem();
        zvitPoZahodahKOza2020Page.clickOnPlanPeriodField();
        zvitPoZahodahKOza2020Page.clickOnZa2021Item();
        zvitPoZahodahKOza2021Page.checkIsPageTitlePresent();
        zvitPoZahodahKOza2021Page.checkIsPageLogoPresent();
        zvitPoZahodahKOza2021Page.checkIsKOFieldPresent();
        zvitPoZahodahKOza2018Page.checkIsPlanPeriodFieldPresent();
        zvitPoZahodahKOza2021Page.checkIsGridBodyPresent();
    }
}