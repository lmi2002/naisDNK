/*
package inspCreateStepsTest;

import abstractParentTest.AbstractParentTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.TextReport;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.junit.*;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.junit.ScreenShooter;

@Epic("IAS Test Reports")
@Feature("InspCreateStepsTest")


public class InspCreateStepsTest extends AbstractParentTest {

    protected Logger logger = Logger.getLogger(getClass());

    @Rule
    public TextReport report = new TextReport();
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests();


    @Before
    public void preconditions() {
        open("/");
        $("a[href='/site/login'] span").click(); //увійти
        $("input#loginform-username").val("d.beztuzhev");
        $("input#loginform-password").val("123007").pressEnter();
        $("div.user_box_name").shouldHave(text("Безтужев Денис"));
        logger.info("User is successfully logged into the system");
        $("#w2 > li:nth-child(3) > a > span").click(); // Перевірки
        $("#w5 > li:nth-child(2) > a > span").click(); // Позапланові перевірки
    }

    @Test
    public void
    viewDocumentsListTest() {
        checkIsPage_UnplanInsp_Title();
        checkIs_CreateUnplanInspBtn_visibleAndCorrect();
        checkIs_ArchiveBtn_visibleAndCorrect();
        checkIs_LoadUnplanInspBtn_visibleAndCorrect();
        checkIs_GridElement_visibleAndCorrect();
        checkIs_GridListElements_visibleAndCorrect();
        checkIs_MenuInspBtn_visible();
    }

    @Step("Page Title shouldHave text -Позапланові перевірки-")
    private void checkIsPage_UnplanInsp_Title() {
        $("h1.page_title").shouldHave(text("Позапланові перевірки"));
        logger.info("Page title -Позапланові перевірки- is present");
    }

    @Step
    private void checkIs_CreateUnplanInspBtn_visibleAndCorrect() {
        $("a.btn.btn_link:nth-child(1)").shouldBe(visible).shouldHave(text("Створити позапланову перевірку 2021"));
        logger.info("Створити позапланову перевірку 2021- btn is present and correct");
    }

    @Step
    private void checkIs_ArchiveBtn_visibleAndCorrect() {
        $("a.btn.btn_link:nth-child(2)").shouldBe(visible).shouldHave(text("Архів"));
        logger.info("Архів- btn is present and correct");
    }

    @Step
    private void checkIs_LoadUnplanInspBtn_visibleAndCorrect() {
        $("#w0 > button").shouldBe(visible).shouldHave(text("Зберегти в .xlsx"));
        logger.info("Зберегти в .xlsx- btn is present and correct");
    }

    @Step
    private void checkIs_GridElement_visibleAndCorrect() {
        $("table > thead > tr:nth-child(1) > th:nth-child(8)").shouldBe(visible).shouldHave(text("Стан перевірки"));
        logger.info("GridElement -Стан перевірки- is present and correct");
    }

    @Step
    private void checkIs_GridListElements_visibleAndCorrect() {
        $("div > div > div > div > b:nth-child(1)").shouldBe(visible).shouldHave(text("1-"));
        logger.info("GridListElements 1- is visible and correct");
    }

    @Step
    private void checkIs_MenuInspBtn_visible() {
        $("table > tbody > tr:nth-child(1) > td:nth-child(9) > div > a").shouldBe(visible);
        logger.info("MenuInspBtn is present");
    }

    @Test
    public void inspCreateTest() {

        // Step 1
        clickOnCreateUnplanInspBtn();
        checkIsPage_CreateUnPlanInsp_TitlePresent();
        clickOnSphereSelectField();
        clickOnSphereItem();
        clickOnSelectSGField();
        enterSGNameIntoSGField();
        clickOnSGItem();
        enterEmailIntoSGField();
        enterSubjectNameIntoSGField();
        enterPhoneNumberIntoSGField();
        clickOnRozmirSGField();
        clickOnRozmirSGItem();
        clickOnRiskStField();
        clickOnRiskStItem();
        clickOnReasonInspField();
        clickOnReasonInspItem();
        enterOpysIntoInputField();
        clickOnSave1StepBtn();
        clickOnCloseModalWindowBtn();

        // Step 2
        //Add Наказ
        checkIs_Step2_1Page_AddNakaz_TitlePresent();
        clickOnAddNakazBtn();
        checkIs_Step2_2Page_AddNakaz_TitlePresent();
        enterDateOfNakazIntoInputField();
        enterNumberOfNakazIntoInputField();
        clickOnTypeOfNakazField();
        clickOnTypeOfNakazItem();
        clickOnRegulatorField();
        clickOnRegulatorItem();
        addFile_Nakaz();
        clickOnSaveNakazBtn();
        clickOnCloseModalWindowBtn();
        //add Направлення
        checkIs_Step3_2Page_AddNapravlennia_TitlePresent();
        enterNumberOfNapravlenniaIntoInputField();
        enterDateOfNapravlenniaIntoInputField();
        clickOnEventFormField();
        clickOnEventFormItem();
        enterDateOfInsp_Start_IntoInputField();
        enterDateOfInsp_Finish_IntoInputField();
        clickOnSaveStep2Btn();
        clickOnCloseModalWindowBtn();

        // Step 3 Результати
        checkIsAllInfoBlockTitlePresentAndCorrect();
        checkIsAddInspectorBtnPresentAndCorrect();
        checkIsAddFileBtnPresentAndCorrect();
        enterDateOfAct_IntoInputField();
        enterNumberOfAct_IntoInputField();
        clickOnInspTimingField();
        clickOnInspTimingItem();
        clickOnInspPublicBtn();
        clickOnConfirmPublicBtn();
        enterDateOfAct_IntoInputField();
        enterNumberOfAct_IntoInputField();
        clickOnInspTimingField();
        clickOnInspTimingItem();
        clickOnSaveStep3Btn();
        clickOnCloseModalWindowBtn();

        // Step 4 Усунення порушень
        clickOnPrypysField();
        clickOnPrypysItem_Yes();
        checkIsCreateDoc_Step4_PageTitlePresentAndCorrect();
        clickOnAddDocumentBtn();
        clickOnDocumentTypeField();
        clickOnDocumentTypeItem();
        enterDateOfDocumentIntoInputField();
        enterNumberOfDocumentIntoInputField();
        clickOnDeliveryDocumentInfoField();
        clickOnDeliveryDocumentInfoItem();
        clickOnAdminDocumentField();
        clickOnAdminDocumentItem();
        clickOnSudDocumentField();
        clickOnSudDocumentItem();
        clickOnImplementationField();
        clickOnImplementationItem();
        clickOnSaveCreateDocument_Step4_Btn();
        clickOnCloseModalWindowBtn();
        checkIsGridViewResultPresentAndCorrect();
        clickOnSaveCreateDocument_Step4_Btn();
        clickOnCloseModalWindowBtn();

        // Step 5 Заходи впливу та санкції
        checkIsSanctions_Step5_PageTitlePresentAndCorrect();
        clickOnSanctionsStatusField();
        clickOnSanctionsStatusItem();
        clickOnCreateSanctionBtn();
        clickOnNPAField();
        enterNPAIntoInputField();
        clickOnNPAItem();
        enterDocPartIntoInputField();
        clickOnSanctionsTypeField();
        clickOnSanctionTypeItem();
        clickOnNegativeEffectsField();
        clickOnNegativeEffectsItem();
        clickOnControlOrganField();
        clickOnOrgan_KO_Item();
        clickOnTypeDocKOField();
        clickOnTypeDocKOItem();
        enterDateOfDocKOIntoInputField();
        enterNumberOfDocKOIntoInputField();
        clickOnInfoStatusSanction_KO_Field();
        clickOnInfoStatusSanction_KO_Item();
        clickOnInfoStatusSanction_Sud_Field();
        clickOnInfoStatusSanction_Sud_Item();
        clickOnCreateBtn();
        clickOnCloseModalWindowBtn();
        checkIsGridViewResult_Step5_PresentAndCorrect();
        clickOnSave_Step5_Btn();
        clickOnCloseModalWindowBtn();

        // UnplanInspPage
        checkIsUpdateInspInfoBtn_PresentAndCorrect();
        checkIsSaveUpdatedInspInfoBtn_PresentAndCorrect();

    }

    @Step
    private void clickOnCreateUnplanInspBtn() {
        $("a.btn.btn_link:nth-child(1)").click();
    }

    @Step("Page Title shouldHave text -Позапланові перевірки-")
    private void checkIsPage_CreateUnPlanInsp_TitlePresent() {
        $("h1.page_title").shouldHave(text("Створити перевірку"));
        logger.info("Page title -Позапланові перевірки- is present");
    }

    @Step
    private void clickOnSelectSGField() {
        $("#select2-annualinspectioncommon-subject_id-container").click();
    }

    @Step
    private void clickOnReasonInspField() {
        $("div:nth-child(1) > div > div:nth-child(2) > div > div > div > div > span > span.selection > span > span.select2-selection__arrow").click();
    }

    @Step
    private void clickOnReasonInspItem() {
        $("[id^=select2-unplannedreason-0-id_unplanned_reason_group-result-]:nth-child(8)").click();
    }

    @Step
    private void enterSGNameIntoSGField() {
        $("span.select2-search.select2-search--dropdown > input").val("ПРИВАТНЕ ПІДПРИЄМСТВО \"ПРУЖИННИЙ ЦЕНТР УКРАЇНА\"");
    }

    @Step
    private void clickOnSGItem() {
        $("#select2-annualinspectioncommon-subject_id-results > li").waitUntil(Condition.visible, 30000).click();
    }

    @Step
    private void enterOpysIntoInputField() {
        $("#unplannedreason-1-description").val("Опис").pressEnter();
    }

    @Step
    private void clickOnSphereSelectField() {
        $(":nth-child(2) > div:nth-child(1) > div > span > span.selection > span > span.select2-selection__arrow").click();
    }

    @Step
    private void clickOnSphereItem() {
        $("[id^='select2-annualinspectioncommon-sphere_id-result-']:nth-child(2)").click();
    }

    @Step
    private void enterSubjectNameIntoSGField() {
        $("input#annualinspectioncommon-activity_type").val("auto test");
    }

    @Step
    private void enterPhoneNumberIntoSGField() {
        $("input#annualinspectioncommon-phone").val("0958758525");
    }

    @Step
    private void enterEmailIntoSGField() {
        Configuration.timeout = 30000;
        $("input#annualinspectioncommon-email").val("iastest@gmail.com");
    }

    @Step
    private void clickOnKVEDField() {
        $("span.selection > span > ul > li > input").click();
    }

    @Step
    private void clickOnKVEDItem() {
        $("[id^='select2-annualinspectioncommon-subjectactivitymultiple-result-']:nth-child(3)").click();
    }

    @Step
    private void clickOnRozmirSGField() {
        $("#select2-annualinspectioncommon-subject_size-container").click();
    }

    @Step
    private void clickOnRozmirSGItem() {
        $("[id^='select2-annualinspectioncommon-subject_size-result-']:nth-child(3)").click();
    }

    @Step
    private void clickOnRiskStField() {
        $("#select2-annualinspectioncommon-risk-container").click();
    }

    @Step
    private void clickOnRiskStItem() {
        $("[id^='select2-annualinspectioncommon-risk-result-']:nth-child(2)").click();
    }

    @Step
    private void enterNumberIntoRegNumberField() {
        $("input#unplannedreason-0-first_number").val("12");
    }

    @Step
    private void enterDateIntoInputField() {
        $("input#unplannedreason-0-first_date").val("2021-11-25");
    }

    @Step
    private void clickOnSave1StepBtn() {
        $("div.create_doc_content > div.ei-footer > div > button").click();
    }

    @Step("Success Modal Window Title shouldHave text -Успіх-")
    private void checkIsSuccessModalWindowTitlePresent() {
        $("h4.modal_title").shouldBe(text("Успіх").because("Текст кнопки отличен от ‘Успіх’"));
        logger.info("Success Modal Window Title -Успіх- is present");
    }

    @Step
    private void clickOnCloseModalWindowBtn() {
        Configuration.timeout = 30000;
        $("button.close_modal.icon-cancel").waitUntil(Condition.visible, 30000).click();
    }

    @Step("Step2_1Page Title shouldHave text -Оновити дані про перевірку-")
    private void checkIs_Step2_1Page_AddNakaz_TitlePresent() {
        $("h1.page_title").shouldHave(text("Оновити дані про перевірку"));
        logger.info("Step2_1Page title -Оновити дані про перевірку- is present");
    }

    @Step
    private void clickOnAddNakazBtn() {
        $("div:nth-child(2) > div > div.form-group > a").click();
    }

    @Step("Step2_2Page Title shouldHave text -Створення наказу і направлення-")
    private void checkIs_Step2_2Page_AddNakaz_TitlePresent() {
        $("div:nth-child(1) > div > h3").shouldHave(text("Створення наказу і направлення"));
        logger.info("Step2_2Page title -Створення наказу і направлення- is present");
    }

    @Step
    private void enterDateOfNakazIntoInputField() {
        $("input#inspectionreason-date").val("2021-02-10");
    }

    @Step
    private void enterNumberOfNakazIntoInputField() {
        $("input#inspectionreason-number").val("25");
    }

    @Step
    private void clickOnTypeOfNakazField() {
        $("#select2-inspectionreason-type-container").click();
    }

    @Step
    private void clickOnTypeOfNakazItem() {
        $("[id^='select2-inspectionreason-type-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnRegulatorField() {
        $("#select2-inspectionreason-regulator_id-container").click();
    }

    @Step
    private void clickOnRegulatorItem() {
        $("[id^='select2-inspectionreason-regulator_id-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnSaveNakazBtn() {
        $("div:nth-child(2) > button").click();
    }

    @Step
    private void addFile_Nakaz() {
        $("input[id=inspectionreason-file]").uploadFile(new File("src/main/java/data/testData.xls"));
    }

    @Step("Step2_3Page Title shouldHave text -Оновлення наказу і направлення-")
    private void checkIs_Step3_2Page_AddNapravlennia_TitlePresent() {
        $("div:nth-child(1) > div > h3").shouldHave(text("Оновлення наказу і направлення"));
        logger.info("Step2_3Page title -Створення наказу і направлення- is present");
    }

    @Step
    private void enterNumberOfNapravlenniaIntoInputField() {
        $("input#inspectionreason-direction_number").val("144");
    }

    @Step
    private void enterDateOfNapravlenniaIntoInputField() {
        $("input#inspectionreason-direction_date").val("2021-02-10");
    }

    @Step
    private void clickOnEventFormField() {
        $("#select2-inspectionreason-event_form-container").click();
    }

    @Step
    private void clickOnEventFormItem() {
        $("[id^='select2-inspectionreason-event_form-result-']:nth-child(1)").click();
    }

    @Step
    private void enterDateOfInsp_Start_IntoInputField() {
        $("input#inspectionreason-date_start").val("2021-02-10");
    }

    @Step
    private void enterDateOfInsp_Finish_IntoInputField() {
        $("input#inspectionreason-date_finish").val("2021-02-11");
    }

    @Step
    private void clickOnSaveStep2Btn() {
        $("#update-inspection-reason > div.ei-footer > div > button").click();
    }

    @Step
    private void enterDateOfAct_IntoInputField() {
        $("input#annualinspectionresults-result_act_date,form_control").val("2021-02-11").pressEnter();
    }

    @Step
    private void enterNumberOfAct_IntoInputField() {
        $("input#annualinspectionresults-result_act_number,form_control").val("124").pressEnter();
    }

    @Step
    private void clickOnInspTimingField() {
        $("span#select2-annualinspectionresults-timing-container.select2-selection__rendered").click();
    }

    @Step
    private void clickOnInspTimingItem() {
        $("[id^='select2-annualinspectionresults-timing-result-']:nth-child(1)").click();
    }

    @Step("All Info Block Title shouldHave text -Загальна інформація-")
    private void checkIsAllInfoBlockTitlePresentAndCorrect() {
        $("#update-inspection-results > div:nth-child(2) > div.ei-body-title > h3").shouldHave(text("Загальна інформація"));
        logger.info("All Info Block Title -Загальна інформація- is present");
    }

    @Step("AddInspectorBtn shouldHave text -Додати інспектора-")
    private void checkIsAddInspectorBtnPresentAndCorrect() {
        $("#inspector-container > div.form-group > span").shouldHave(text("Додати інспектора"));
        logger.info("AddInspectorBtn -Додати інспектора- is present");
    }

    @Step("AddFileBtn shouldHave text -Додайте файл-")
    private void checkIsAddFileBtnPresentAndCorrect() {
        $("#add-multiplefile-btn").shouldHave(text("Додайте файл"));
        logger.info("ddFileBtn -Додати файл- is present");
    }

    @Step
    private void clickOnUsunenniaPorushenLink() {
        $("div.create_doc_content > div.ei-head > ul > li:nth-child(4) > a").click();
    }

    @Step
    private void clickOnSaveStep3Btn() {
        $("button#save-result-step").scrollTo().click();
    }

    @Step
    private void clickOnInspPublicBtn() {
        $("body > section.page_section > div > div > div > div.section-head > div > div:nth-child(1) > div > label > span.off").scrollIntoView(false).click();
    }

    @Step
    private void clickOnConfirmPublicBtn() {
        $("button.btn.btn-success").click();
    }

    @Step
    private void clickOnPrypysField() {
        $("#select2-annualinspection-has_documents-container").click();
    }

    @Step
    private void clickOnPrypysItem_Yes() {
        $("[id^='select2-annualinspection-has_documents-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnAddDocumentBtn() {
        $("div.documents_block > div.form-group > a").click();
    }

    @Step("Create Doc_Step4_Page Title shouldHave text -Усунення порушень-")
    private void checkIsCreateDoc_Step4_PageTitlePresentAndCorrect() {
        $("div:nth-child(1) > div > h3").shouldHave(text("Усунення порушень"));
        logger.info("Create Doc_Step4_Page Title -Усунення порушень- is present");
    }

    @Step
    private void clickOnDocumentTypeField() {
        $("#select2-inspectiondocument-type-container").click();
    }

    @Step
    private void clickOnDocumentTypeItem() {
        $("[id^='select2-inspectiondocument-type-result-']:nth-child(1)").click();
    }

    @Step
    private void enterDateOfDocumentIntoInputField() {
        $("input#inspectiondocument-date").val("2021-02-12");
    }

    @Step
    private void enterNumberOfDocumentIntoInputField() {
        $("input#inspectiondocument-number").val("1215");
    }


    @Step
    private void clickOnDeliveryDocumentInfoField() {
        $("#select2-inspectiondocument-delivery-container").click();
    }

    @Step
    private void clickOnDeliveryDocumentInfoItem() {
        $("[id^='select2-inspectiondocument-delivery-result-']:nth-child(4)").click();
    }

    @Step
    private void clickOnAdminDocumentField() {
        $("#select2-inspectiondocument-appeal_status-container").click();
    }

    @Step
    private void clickOnAdminDocumentItem() {
        $("[id^='select2-inspectiondocument-appeal_status-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnSudDocumentField() {
        $("#select2-inspectiondocument-appeal_court-container").click();
    }

    @Step
    private void clickOnSudDocumentItem() {
        $("[id^='select2-inspectiondocument-appeal_court-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnImplementationField() {
        $("#select2-inspectiondocument-implementation-container").click();
    }

    @Step
    private void clickOnImplementationItem() {
        $("[id^='select2-inspectiondocument-implementation-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnSaveCreateDocument_Step4_Btn() {
        $("div.ei-footer > div > button").click();
    }

    @Step("Grid View Result shouldHave text '1-'")
    private void checkIsGridViewResultPresentAndCorrect() {
        $("div > b:nth-child(1)").shouldHave(text("1-"));
        logger.info("Grid View Result '1-' is present");
    }

    @Step("Sanctions_Step5_Page Title shouldHave text -Заходи впливу (реагування) та санкції-")
    private void checkIsSanctions_Step5_PageTitlePresentAndCorrect() {
        $("div:nth-child(1) > div > h3").shouldHave(text("Заходи впливу (реагування) та санкції"));
        logger.info("Create Doc_Step4_Page Title -Заходи впливу (реагування) та санкції");
    }

    @Step
    private void clickOnSanctionsStatusField() {
        $("#select2-annualinspection-has_sanctions-container").click();
    }

    @Step
    private void clickOnSanctionsStatusItem() {
        $("[id^='select2-annualinspection-has_sanctions-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnCreateSanctionBtn() {
        $("#sanction-block > div.form-group > a").click();
    }

    @Step
    private void enterOpysPorushennisIntoInputField() {
        $("#additionalattribute-ins_sanction_attribute_25").val("Опис порушення");
    }

    @Step
    private void clickOnNPAField() {
        $("#select2-inspectionsanction-document_id-container").click();
    }

    @Step
    private void enterNPAIntoInputField() {
        $("span.select2-search.select2-search--dropdown > input").val("Про");
    }

    @Step
    private void clickOnNPAItem() {
        $("[class='select2-results__option']:nth-child(2)").click();
    }

    @Step
    private void enterDocPartIntoInputField() {
        $("input#inspectionsanction-document_part").val("2");
    }

    @Step
    private void clickOnSanctionsTypeField() {
        $("#select2-inspectionsanction-type-container").click();
    }

    @Step
    private void clickOnSanctionTypeItem() {
        $("[id^='select2-inspectionsanction-type-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnNegativeEffectsField() {
        $("#select2-inspectionsanction-has_effect-container").click();
    }

    @Step
    private void clickOnNegativeEffectsItem() {
        $("[id^='select2-inspectionsanction-has_effect-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnTypeNegativeEffectsField() {
        $("#select2-inspectionsanction-effect_type-container").click();
    }

    @Step
    private void clickOnTypeNegativeEffectsItem() {
        $("[id^='select2-inspectionsanction-effect_type-result-']:nth-child(7)").click();
    }

    @Step
    private void enterOpysNegativeEffectIntoInputField() {
        $("#additionalattribute-ins_sanction_attribute_60").val("Опис негативних наслідків");
    }

    @Step
    private void clickOnControlOrganField() {
        $("#select2-inspectionsanction-unit-container").click();
    }

    @Step
    private void clickOnOrgan_KO_Item() {
        $("[id^='select2-inspectionsanction-unit-result-']:nth-child(1)").click();
    }

    @Step
    private void clickOnTypeDocKOField() {
        $("#select2-inspectionsanction-regulator_document_type_id-container").click();
    }

    @Step
    private void clickOnTypeDocKOItem() {
        $("[id^='select2-inspectionsanction-regulator_document_type_id-result-']:nth-child(1)").click();
    }

    @Step
    private void enterDateOfDocKOIntoInputField() {
        $("input#inspectionsanction-regulator_document_date").val("2021-02-11");
    }

    @Step
    private void enterNumberOfDocKOIntoInputField() {
        $("input#inspectionsanction-regulator_document_number").val("151515");
    }

    @Step
    private void enterSizeOfSanctionIntoInputField() {
        $("input#inspectionsanction-regulator_sanction_other").val("1550");
    }

    @Step
    private void clickOnInfoStatusSanction_KO_Field() {
        $("#select2-inspectionsanction-regulator_appeal_status-container").click();
    }

    @Step
    private void clickOnInfoStatusSanction_KO_Item() {
        $("[id^='select2-inspectionsanction-regulator_appeal_status-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnInfoStatusSanction_Sud_Field() {
        $("#select2-inspectionsanction-court_appeal-container").click();
    }

    @Step
    private void clickOnInfoStatusSanction_Sud_Item() {
        $("[id^='select2-inspectionsanction-court_appeal-result-']:nth-child(2)").click();
    }

    @Step
    private void clickOnCreateBtn() {
        $("button.btn.btn-success").click();
    }

    @Step("Grid View Result_Step5 shouldHave text '1-'")
    private void checkIsGridViewResult_Step5_PresentAndCorrect() {
        $("div > b:nth-child(1)").shouldHave(text("1-"));
        logger.info("Grid View Result_Step5 '1-' is present");
    }

    @Step
    private void clickOnSave_Step5_Btn() {
        $("div.ei-footer > div > button").click();
    }

    @Step
    private void checkIsUpdateInspInfoBtn_PresentAndCorrect() {
        $("div.col-xs-12.col-md-3.hidden-xs > a:nth-child(1)").shouldHave(text("Оновити інформацію"));
        logger.info("Update Insp Info Btn is present");
    }

    @Step
    private void checkIsSaveUpdatedInspInfoBtn_PresentAndCorrect() {
        $("div.col-xs-12.col-md-3.hidden-xs > a:nth-child(2)").shouldHave(text("Зберегти"));
        logger.info("Save Updated Insp Info Btn is present");
    }

    @After
    public void testShutDown() {
        WebDriverRunner.clearBrowserCache();
    }

    public void tearDown() {
    }
}






*/
