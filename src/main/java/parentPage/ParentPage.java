package parentPage;

import io.qameta.allure.Step;
import libs.ActionsWithOurElements;
import libs.ConfigProperties;
import libs.Utils;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.pageElements.WebDriverAwareDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class ParentPage {
    protected WebDriver webDriver;
    protected Actions actions;
    protected Logger logger = Logger.getLogger(getClass());
    protected ActionsWithOurElements actionsWithOurElements;
    public ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);

    String baseUrl;
    String expectedUrl;
    String adminUrl;
    String expectedAdminUrl;
    String prodUrl;
    String expectedProdUrl;


    public ParentPage(WebDriver webDriver, String partUrl) {
        this.webDriver = webDriver;

        baseUrl = configProperties.base_url();
        adminUrl = configProperties.admin_url();
        prodUrl = configProperties.prod_url();
        PageFactory.initElements(new WebDriverAwareDecorator(new HtmlElementLocatorFactory(webDriver), webDriver), this);

        actionsWithOurElements = new ActionsWithOurElements(webDriver);
        expectedUrl = baseUrl + partUrl;
        expectedAdminUrl = adminUrl + partUrl;
        expectedProdUrl = prodUrl + partUrl;
    }

    @Step
    public void checkCurrentUrl() {
        try {
            Assert.assertEquals("URL is not expected", expectedUrl,
                    webDriver.getCurrentUrl());

        } catch (Exception e) {
            logger.error("Can not get url" + e);
            Assert.fail("Can not get url" + e);
        }
    }

    @Step
    public void checkCurrentUrlRegex(String pattern) {
        try {
            String regex =  expectedUrl + pattern;
            // Assert.assertEquals("URL is not expected", expectedUrl, webDriver.getCurrentUrl());
            Assert.assertTrue("URL is not expected", Utils.checkRegex(expectedUrl, webDriver.getCurrentUrl()));

        } catch (Exception e) {
            logger.error("Can not get url" + e);
            Assert.fail("Can not get url" + e);
        }
    }

    @Step
    public void checkCurrentProdUrl() {
        try {
            Assert.assertEquals("URL is not expected", expectedProdUrl,
                    webDriver.getCurrentUrl());

        } catch (Exception e) {
            logger.error("Can not get url" + e);
            Assert.fail("Can not get url" + e);
        }
    }

    @Step
    public void checkCurrentAdminUrl() {
        try {
            Assert.assertEquals("URL is not expected", expectedAdminUrl,
                    webDriver.getCurrentUrl());

        } catch (Exception e) {
            logger.error("Can not get url" + e);
            Assert.fail("Can not get url" + e);
        }
    }


    public String getTitle() {
        return webDriver.getTitle();
    }

}
