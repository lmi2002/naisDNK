package pages.subjectSGPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class ViewDosyeSubjectWithSphereSelectedPage extends ParentPage {

    public ViewDosyeSubjectWithSphereSelectedPage (WebDriver webDriver) {
        super(webDriver, "/subject/view/about?subject_id=15076&sphere_id=136");
    }


    @FindBy(xpath = ".//a[@class='nav-link' and contains(text(),'Історія змін')]")
    private WebElement istoriyaZminLink;




    @Step
    public void clickOnIstoriyaZminLink() {
        actionsWithOurElements.clickOnElement(istoriyaZminLink);
    }


}
