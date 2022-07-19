package requestPasswordResetPROD;

import abstractParentTest.AbstractParentTest;
import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RequestPasswordResetPROD extends AbstractParentTest {
    protected Logger logger = Logger.getLogger(getClass());

    @Rule
    public TextReport report = new TextReport();
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();


    @Before
    public void preconditions() {
        open("https://inspections.gov.ua/site/request-password-reset");
    }

        @Test
        public void requestPasswordResetTest() {

            $("input#passwordresetrequestform-email").val("yakyjuventus@ukr.net");
            $("div:nth-child(3) > button").click(); // Відправити
            $("h1.page_title").shouldHave(text("Запит на відновлення паролю"));
            $("a.btn.btn-primary").shouldHave(text("Відправити пароль ще раз!"));
            logger.info("Email sent successfully");
        }
}
