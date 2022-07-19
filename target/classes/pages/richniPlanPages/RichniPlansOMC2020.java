package pages.richniPlanPages;

import org.openqa.selenium.WebDriver;
import parentPage.ParentPage;

public class RichniPlansOMC2020 extends ParentPage {

    public RichniPlansOMC2020 (WebDriver webDriver) {
        super(webDriver, "/regulators-plans/index?tab=tab_oms_regulators_plans_2020");
    }


}
