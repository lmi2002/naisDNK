package pages.richniPlanPages;

import org.openqa.selenium.WebDriver;
import parentPage.ParentPage;

public class RichniPlansOMC2019 extends ParentPage {
    public RichniPlansOMC2019 (WebDriver webDriver) {
        super(webDriver, "/regulators-plans/index?tab=tab_oms_regulators_plans_2020");
    }
}
