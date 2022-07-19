package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import parentPage.ParentPage;

public class HistoryOfChangesSGPage extends ParentPage {

    public HistoryOfChangesSGPage(WebDriver webDriver) {
        super(webDriver, "/subject/view/history?subject_id=15076&sphere_id=136");
    }


    @Step
    public void checkInfoAboutChanges_message_Present() {
        try {
            Assert.assertTrue("Бал за показниками критеріїв ризику_message_ is not displayed", webDriver.getPageSource().contains("Бал за показниками критеріїв ризику"));
            logger.info("Info About Changes_message is present");
        } catch (Exception e) {
            actionsWithOurElements.stopTestAndPrintMessage();
        }
    }

    @Step
    public void checkBalRiskCrit_number_Present() {
        try {
            Assert.assertTrue("Бал за показниками критеріїв ризику_32_ is not displayed", webDriver.getPageSource().contains("пис: 32"));
            logger.info("Bal Risk Crit_number_ is present");
        } catch (Exception e) {
            actionsWithOurElements.stopTestAndPrintMessage();
        }
    }
}
