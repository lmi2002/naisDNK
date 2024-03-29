package abstractParentTest;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import libs.ConfigProperties;
import libs.Utils;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.analitykaPages.AnalitykaPage;
import pages.audytPages.AccreditedOrganizationsPage;
import pages.audytPages.AudytPage;
import pages.audytPages.CreateAudytPage;
import pages.audytPages.OrganizationCreatePage;
import pages.complexPlanPages.*;
import pages.dovidkaPage.DovidkaPage;
import pages.formyActivPerevirkyPages.*;
import pages.infoVisitsPages.*;
import pages.inspCreateStepsPages.*;
import pages.loginPages.*;
import pages.perevirkyListNotAuthPages.*;
import pages.perevirkyPages.*;
import pages.planuvanniaPages.*;
import pages.povidomlenniaPages.PovidomlenniaPage;
import pages.preventiveZahodyPages.*;
import pages.ratingInspectorsPages.*;
import pages.ratingSGPages.HistoryOfRatingsSGPage;
import pages.ratingSGPages.RatingSGPage;
import pages.ratingSGPages.RatingSGWithSpherePage;
import pages.regulatorPages.RegulatorPage;
import pages.regulatorPages.RegulatorSearchResultPage;
import pages.regulatorPages.ViewRegulatorCardPage;
import pages.resultsInspZaZvernenniamPage.ResultsInspZaZvernenniam2018Page;
import pages.resultsInspZaZvernenniamPage.ResultsInspZaZvernenniam2019Page;
import pages.resultsInspZaZvernenniamPage.ResultsInspZaZvernenniam2020Page;
import pages.resultsInspZaZvernenniamPage.ResultsInspZaZvernenniamPage;
import pages.richniPlanPages.*;
import pages.riskCriteriaPages.*;
import pages.searchRichniMainPages.*;
import pages.skargyDoDRSPages.SkargyDoDRSPage;
import pages.spherePages.*;
import pages.spivrobitnykyOrganuPages.*;
import pages.spivrobitnykyPidpOrganivPages.*;
import pages.statisticPage.StatisticPage;
import pages.subjectSGPages.*;
import pages.trainingMaterialPages.*;
import pages.uzgodzhenniaDate.UzgodzhenniaDatePage;
import pages.zakonodavstvoPages.*;
import pages.zvitnistPages.*;

import java.util.concurrent.TimeUnit;

public class AbstractParentTest {

    WebDriver webDriver;
    protected LoginPage loginPage;
    protected MainNotAuthPage mainNotAuthPage;
    protected MainPage mainPage;
    protected ViewUserPage viewUserPage;
    protected UpdateUserPage updateUserPage;
    protected ComplexPlanPage complexPlanPage;
    protected ComplexPlanningPeriod2018Page complexPlanningPeriod2018Page;
    protected ComplexPlanningPeriod2019Page complexPlanningPeriod2019Page;
    protected ComplexPlanChanges2018Page complexPlanChanges2018Page;
    protected ComplexPlanChanges2019Page complexPlanChanges2019Page;
    protected ComplexPlanningPeriod2021Page complexPlanningPeriod2021Page;
    protected RichniPlansCO2018Page richniPlansCO2018Page;
    protected RichniPlansCO2019Page richniPlansCO2019Page;
    protected RichniPlansCO2020Page richniPlansCO2020Page;
    protected RichniPlanChangesPage richniPlanChangesPage;
    protected InspectionCardViewPage inspectionCardViewPage;
    protected PlanInspByRegulator2018Page planInspByRegulator2018Page;
    protected PlanInspByRegulator2019Page planInspByRegulator2019Page;
    protected PlanInspByRegulator2020Page planInspByRegulator2020Page;
    protected PlanPerevirkyAll2015Page planPerevirkyAll2015Page;
    protected PlanPerevirkyAll2016Page planPerevirkyAll2016Page;
    protected PlanPerevirkyAll2017Page planPerevirkyAll2017Page;
    protected PlanPerevirkyAll2018Page planPerevirkyAll2018Page;
    protected PlanPerevirkyAll2019Page planPerevirkyAll2019Page;
    protected PlanPerevirkyAll2020Page planPerevirkyAll2020Page;
    protected PlanPerevirkyPorushennia2015Page planPerevirkyPorushennia2015Page;
    protected PlanPerevirkyPorushennia2016Page planPerevirkyPorushennia2016Page;
    protected PlanPerevirkyPorushennia2017Page planPerevirkyPorushennia2017Page;
    protected PlanPerevirkyPorushennia2018Page planPerevirkyPorushennia2018Page;
    protected PlanPerevirkyPorushennia2019Page planPerevirkyPorushennia2019Page;
    protected PlanPerevirkyPorushennia2020Page planPerevirkyPorushennia2020Page;
    protected PozaplanPerevirkyAll2015Page pozaplanPerevirkyAll2015Page;
    protected PozaplanPerevirkyAll2016Page pozaplanPerevirkyAll2016Page;
    protected PozaplanPerevirkyAll2017Page pozaplanPerevirkyAll2017Page;
    protected PozaplanPerevirkyAll2018Page pozaplanPerevirkyAll2018Page;
    protected PozaplanPerevirkyAll2019Page pozaplanPerevirkyAll2019Page;
    protected PozaplanPerevirkyAll2020Page pozaplanPerevirkyAll2020Page;
    protected PozaplanPerevirkyPorushennia2015Page pozaplanPerevirkyPorushennia2015Page;
    protected PozaplanPerevirkyPorushennia2016Page pozaplanPerevirkyPorushennia2016Page;
    protected PozaplanPerevirkyPorushennia2017Page pozaplanPerevirkyPorushennia2017Page;
    protected PozaplanPerevirkyPorushennia2018Page pozaplanPerevirkyPorushennia2018Page;
    protected PozaplanPerevirkyPorushennia2019Page pozaplanPerevirkyPorushennia2019Page;
    protected PozaplanPerevirkyPorushennia2020Page pozaplanPerevirkyPorushennia2020Page;
    protected ReportPlanningPeriodsPagePage reportPlanningPeriodsPage;
    protected ReportPlanPerevirkyAll2015Page reportPlanPerevirkyAll2015Page;
    protected ReportPlanPerevirkyAll2016Page reportPlanPerevirkyAll2016Page;
    protected ReportPlanPerevirkyAll2017Page reportPlanPerevirkyAll2017Page;
    protected ReportPlanPerevirkyAll2018Page reportPlanPerevirkyAll2018Page;
    protected ReportPlanPerevirkyAll2019Page reportPlanPerevirkyAll2019Page;
    protected ReportPlanPerevirkyAll2020Page reportPlanPerevirkyAll2020Page;
    protected ReportStatistics2016Page reportStatistics2016Page;
    protected ReportStatistics2017Page reportStatistics2017Page;
    protected ReportStatistics2018Page reportStatistics2018Page;
    protected ReportStatistics2019Page reportStatistics2019Page;
    protected ReportStatistics2020Page reportStatistics2020Page;
    protected SpherePage spherePage;
    protected SphereCriteriaPage sphereCriteriaPage;
    protected SphereCardPage sphereCardPage;
    protected SpherePerelikNPAPage spherePerelikNPAPage;
    protected SphereQuestionListPage sphereQuestionPage;
    protected SphereVymogyPage sphereVymogyPage;
    protected RegulatorPage regulatorPage;
    protected ViewRegulatorCardPage viewRegulatorCardPage;
    protected CreateDocumentPage createDocumentPage;
    protected DocumentsPage documentsPage;
    protected UpdateDocumentPage updateDocumentPage;
    protected ViewDocumentPage viewDocumentPage;
    protected CreateDocFromBasePage createDocFromBasePage;
    protected SearchResultPage searchResultPage;
    protected CreateManualDocumentPage createManualDocumentPage;
    protected PlanInsp2018Page planInsp2018Page;
    protected PlanInsp2019Page planInsp2019Page;
    protected PlanInsp2020Page planInsp2020Page;
    protected PlanInsp2021Page planInsp2021Page;
    protected PlanInspPage planInspPage;
    protected PozaplanInsp2018Page pozaplanInsp2018Page;
    protected PozaplanInsp2019Page pozaplanInsp2019Page;
    protected PozaplanInsp2020Page pozaplanInsp2020Page;
    protected PozaplanInspPage pozaplanInspPage;
    protected ViewPlanInspCard2020Page viewPlanInspCard2020Page;
    protected ViewPozaplanInspCard2020Page viewPozaplanInspCard2020Page;
    protected TypeActInspPage typeActInspPage;
    protected TypeActInspSearchResultPage typeActInspSearchResult;
    protected ViewTypeActInspCardPage viewTypeActInspCardPage;
    protected ViewTypeActInspListNPAPage viewTypeActInspListNPAPage;
    protected ViewTypeActInspQuestionsPage viewTypeActInspQuestionsPage;
    protected RiskCriteriaPage riskCriteriaPage;
    protected RiskCriteriasSearchResultPage riskCriteriasSearchResultPage;
    protected ViewRiskCriteriaCriteriasPage viewRiskCriteriaCriteriasPage;
    protected ViewRiskCriteriaDocPage viewRiskCriteriaDocPage;
    protected ViewRiskCriteriaRisksPage viewRiskCriteriaRisksPage;
    protected SubjectsListPage subjectsListPage;
    protected AddSubjectPage addSubjectPage;
    protected SubjectCardPage subjectCardPage;
    protected SearchResultSubjectPage searchResultSubjectPage;
    protected InspCreateStep1Page inspCreateStep1Page;
    protected AddPidrozdilAndObjectPage addPidrozdilAndObjectPage;
    protected InspCreateStep2Page inspCreateStep2Page;
    protected InspCreateStep2_1Page inspCreateStep2_1Page;
    protected InspCreateStep3ResultsPage inspCreateStep3ResultsPage;
    protected UpdateNakazPage updateNakazPage;
    protected InspCreateStep4Page inspCreateStep4Page;
    protected InspCreateStep5SanctionsPage inspCreateStep5SanctionsPage;
    protected InspViewPage inspViewPage;
    protected InspAllPozaplanNotAuth2017Page inspAllPozaplanNotAuth2017Page;
    protected InspAllPozaplanNotAuth2016Page inspAllPozaplanNotAuth2016Page;
    protected InspAllPozaplanNotAuth2018Page inspAllPozaplanNotAuth2018Page;
    protected InspAllPozaplanNotAuth2019Page inspAllPozaplanNotAuth2019Page;
    protected InspAllPlanNotAuthPage inspAllPlanNotAuthPage;
    protected InspAllPozaplanNotAuthPage inspAllPozaplanNotAuthPage;
    protected InspAllPlanNotAuth2016Page inspAllPlanNotAuth2016Page;
    protected InspAllPlanNotAuth2017Page inspAllPlanNotAuth2017Page;
    protected InspAllPlanNotAuth2018Page inspAllPlanNotAuth2018Page;
    protected InspAllPlanNotAuth2019Page inspAllPlanNotAuth2019Page;
    protected RichniPlansMainPage richniPlansMainPage;
    protected AnalitykaPage analitykaPage;
    protected ViewDosyeSubjectPage viewDosyeSubjectPage;
    protected ViewDodatkovaInfSubjectPage viewDodatkovaInfSubjectPage;
    protected ViewIstoriyaZminSubjectPage viewIstoriyaZminSubjectPage;
    protected ViewLicenseSubjectPage viewLicenseSubjectPage;
    protected ViewObjectsSubjectPage viewObjectsSubjectPage;
    protected ViewPerevirkySubjectPage viewPerevirkySubjectPage;
    protected ViewPidrozdilySubjectPage viewPidrozdilySubjectPage;
    protected ViewZvernennyaSubjectPage viewZvernennyaSubjectPage;
    protected PrevZah2018ListPage prevZah2018ListPage;
    protected PrevZah2019ListPage prevZah2019ListPage;
    protected PreventiveZahodyPage preventiveZahodyPage;
    protected SearchResultPrevZahPage searchResultPrevZahPage;
    protected PrevZahCardPage prevZahCardPage;
    protected CreatePrevZahPage createPrevZahPage;
    protected CreateInfoVisitPage createInfoVisitPage;
    protected InfoVisit2018ListPage infoVisit2018ListPage;
    protected InfoVisit2019ListPage infoVisit2019ListPage;
    protected InfoVisitCardPage infoVisitCardPage;
    protected InfoVisitPage infoVisitPage;
    protected SearchResultInfoVisitPage searchResultInfoVisitPage;
    protected RatingInspectorsAllPage ratingInspectorsAllPage;
    protected RatingInspectors2018Page ratingInspectors2018Page;
    protected RatingInspectors2019Page ratingInspectors2019Page;
    protected RatingInspectors2020Page ratingInspectors2020Page;
    protected RatingInspectors2022Page ratingInspectors2022Page;
    protected DovidkaPage dovidkaPage;
    protected RegulatorSearchResultPage regulatorSearchResultPage;
    protected SubjectImportPage subjectImportPage;
    protected SphereSelectForVyborkaPage sphereSelectForVyborkaPage;
    protected VybirkaSGPage vybirkaSGPage;
    protected YearSelectForVyborkaPage yearSelectForVyborkaPage;
    protected StatisticPage statisticPage;
    protected ResultsInspZaZvernenniamPage resultsInspZaZvernenniamPage;
    protected SubjectsPageNotAuth subjectPageNotAuth;
    protected PlanInspPageNotAuthPage planInspPageNotAuthPage;
    protected PozaplanInspNotAuthPage pozaplanInspNotAuthPage;
    protected PreventiveZahodyNotAuthPage preventiveZahodyNotAuthPage;
    protected InfoVisitNotAuthPage infoVisitNotAuthPage;
    protected ActualZayavkiSOPage actualZayavkiSOPage;
    protected ApprovedEmployeesOrgPage approvedEmployeesOrgPage;
    protected SearchResultApprovedSOPage searchResultApprovedSOPage;
    protected SpivrobitnykyOrganivPage spivrobitnykyOrganivPage;
    protected UnapprovedEmployeesOrgPage unapprovedEmployeesOrgPage;
    protected ActualZayavkiSPOPage actualZayavkiSPOPage;
    protected ApprovedEmployeesPidpOrgPage approvedEmployeesPidpOrgPage;
    protected SearchResultApprovedSPOPage searchResultApprovedSPOPage;
    protected SpivrobitnykyPidpOrganivPage spivrobitnykyPidpOrganivPage;
    protected UnapprovedEmployeesPidpOrgPage unapprovedEmployeesPidpOrgPage;
    protected SearchResultUnapprovedSOPage searchResultUnapprovedSOPage;
    protected SearchResultUnapprovedSPOPage searchResultUnapprovedSPOPage;
    protected ResultsInspZaZvernenniam2018Page resultsInspZaZvernenniam2018Page;
    protected ResultsInspZaZvernenniam2019Page resultsInspZaZvernenniam2019Page;
    protected ResultsInspZaZvernenniam2020Page resultsInspZaZvernenniam2020Page;
    protected PlanPerevirok2018Page planPerevirok2018Page;
    protected PlanuvanniaActualPeriodNOPage planuvanniaActualPeriodNOPage;
    protected PlanuvanniaActualPeriodYESPage planuvanniaActualPeriodYESPage;
    protected PlanuvanniaPage planuvanniaPage;
    protected RichnyPlanKO2020Page richnyPlanKO2020Page;
    protected RichnyPlanKO2019Page richnyPlanKO2019Page;
    protected PovidomlenniaPage povidomlenniaPage;
    protected AccreditedOrganizationsPage accreditedOrganizationsPage;
    protected OrganizationCreatePage organizationCreatePage;
    protected AudytPage audytPage;
    protected CreateAudytPage createAudytPage;
    protected RichniPerevirkyMainPage richniPerevirkyMainPage;
    protected PlanInspByRegulator2021Page planInspByRegulator2021Page;
    protected RichniPlansOMC2020 richniPlansOMC2020;
    protected RichniPlansOMC2019 richniPlansOMC2019;
    protected RichniPlansOMC2018 richniPlansOMC2018;
    protected SubjectImport_Sphere_SelectedPage subjectImport_sphere_selectedPage;
    protected SubjectImport_Sphere_Year_SelectedPage subjectImport_sphere_year_selectedPage;
    protected ImportErrors_In_FilePage importErrors_in_filePage;
    protected Subject_Vybirka_SphereSelectedPage subject_vybirka_sphereSelectedPage;
    protected Subject_Vybirka_Sphere_Year_SelectedPage subject_vybirka_sphere_year_selectedPage;
    protected Vybirka_for_PlanPage vybirka_for_PlanPage;
    protected VybirkaSG2021Page vybirkaSG2021Page;
    protected ErrorsByPeriod_Vybirka2021Page errorsByPeriod_vybirka2021Page;
    protected ArchiveVybirka2021Page archiveVybirka2021Page;
    protected PlanProjectKO2021Page planProjectKO2021Page;
    protected TerOrgWhichSentPlanPage terOrgWhichSentPlanPage;
    protected Vybirka2021AfterSendingToCAPage vybirka2021AfterSendingToCAPage;
    protected EditSGPage editSGPage;
    protected ViewDosyeSubjectWithSphereSelectedPage viewDosyeSubjectWithSphereSelectedPage;
    protected HistoryOfChangesSGPage historyOfChangesSGPage;
    protected ComplexPlanningPeriod2020Page complexPlanningPeriod2020Page;
    protected ComplexPlanChanges2020Page complexPlanChanges2020Page;
    protected ComplexPlanChanges2021Page complexPlanChanges2021Page;
    protected ProjectRichnogoPlanuPage projectRichnogoPlanuPage;
    protected RichniPlansCO2021Page richniPlansCO2021Page;
    protected RatingSGPage ratingSGPage;
    protected HistoryOfRatingsSGPage historyOfRatingsSGPage;
    protected RatingSGWithSpherePage ratingSGWithSpherePage;
    protected SkargyDoDRSPage skargyDoDRSPage;
    protected VybirkaAutTransp2021Page vybirkaAutTransp2021Page;
    protected Subject_Vybirka_SphereAutTrSelectedPage subject_vybirka_sphereAutTrSelectedPage;
    protected EditSGAutTrPage editSGAutTrPage;
    protected VybirkaAutTransp2021CAPage vybirkaAutTransp2021CAPage;
    protected ViewDosyeSubject_Bukaevycia_Page viewDosyeSubject_bukaevycia_page;
    protected YearPlanKOPage yearPlanKOPage;
    protected TrainingMaterialPage trainingMaterialPage;
    protected CreateTrainingMaterialsPage createTrainingMaterialsPage;
    protected SearchResultTrainingMaterialsPage searchResultTrainingMaterialsPage;
    protected ViewTrainingMaterialPage viewTrainingMaterialPage;
    protected SearchResultTrainingMaterials_msap_Page searchResultTrainingMaterials_msap_Page;
    protected ZvitPoZahodahKOza2018Page zvitPoZahodahKOza2018Page;
    protected ZvitPoZahodahKOza2019Page zvitPoZahodahKOza2019Page;
    protected ZvitPoZahodahKOza2020Page zvitPoZahodahKOza2020Page;
    protected ZvitPoZahodahKOza2021Page zvitPoZahodahKOza2021Page;
    protected ZvitPoZahodahPage zvitPoZahodahPage;
    protected ZvitProPorushenniaVymogKO2018Page zvitProPorushenniaVymogKO2018Page;
    protected ZvitProPorushenniaVymogKO2019Page zvitProPorushenniaVymogKO2019Page;
    protected ZvitProPorushenniaVymogKO2020Page zvitProPorushenniaVymogKO2020Page;
    protected ZvitProPorushenniaVymogKO2021Page zvitProPorushenniaVymogKO2021Page;
    protected ZvitProPorushenniaVymogPage zvitProPorushenniaVymogPage;
    protected RichnaZvitnistPoOrganuPage richnaZvitnistPoOrganuPage;
    protected EditZvit2019Page editZvit2019Page;
    protected PrevZah2020ListPage prevZah2020ListPage;
    protected UzgodzhenniaDatePage uzgodzhenniaDatePage;
    protected SearchResultByCompanyNameRichniMainPage searchResultByCompanyNameRichniMainPage;
    protected SearchResultByEDRPOURichniMainPage searchResultByEDRPOURichniMainPage;
    protected SearchResultBySGAllRichniMainPage searchResultBySGAllRichniMainPage;
    protected SearchResultBySGNameRichniMainPage searchResultBySGNameRichniMainPage;
    protected SearchResultByYearRichniMainPage searchResultByYearRichniMainPage;

    protected static ConfigProperties configProperties =
            ConfigFactory.create(ConfigProperties.class);
    protected Logger logger = Logger.getLogger(getClass());

    //installation of configuration settings
    @BeforeClass
    public static void configuration() {
        Configuration.baseUrl = configProperties.base_url();
        Configuration.browser = "chrome";
    }

    @Before
    public void setUp() throws Exception {
        webDriver = driverInit();
        if(!configProperties.JENKINS_HOST().equalsIgnoreCase(Utils.getIPAdress())) {
            webDriver.manage().window().maximize();
            logger.info("Local " + Utils.getIPAdress());
        }
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info(webDriver.manage().window().getSize());

        loginPage = new LoginPage(webDriver);
        mainNotAuthPage = new MainNotAuthPage(webDriver);
        mainPage = new MainPage(webDriver);
        viewUserPage = new ViewUserPage(webDriver);
        updateUserPage = new UpdateUserPage(webDriver);
        complexPlanPage = new ComplexPlanPage(webDriver);
        complexPlanningPeriod2018Page = new ComplexPlanningPeriod2018Page(webDriver);
        complexPlanChanges2019Page = new ComplexPlanChanges2019Page(webDriver);
        complexPlanningPeriod2021Page = new ComplexPlanningPeriod2021Page(webDriver);
        complexPlanChanges2018Page = new ComplexPlanChanges2018Page(webDriver);
        complexPlanningPeriod2019Page = new ComplexPlanningPeriod2019Page(webDriver);
        richniPlansCO2018Page = new RichniPlansCO2018Page(webDriver);
        richniPlansCO2019Page = new RichniPlansCO2019Page(webDriver);
        richniPlansCO2020Page = new RichniPlansCO2020Page(webDriver);
        richniPlanChangesPage = new RichniPlanChangesPage(webDriver);
        inspectionCardViewPage = new InspectionCardViewPage(webDriver);
        planInspByRegulator2018Page = new PlanInspByRegulator2018Page(webDriver);
        planInspByRegulator2019Page = new PlanInspByRegulator2019Page(webDriver);
        planInspByRegulator2020Page = new PlanInspByRegulator2020Page(webDriver);
        planPerevirkyAll2015Page = new PlanPerevirkyAll2015Page(webDriver);
        planPerevirkyAll2016Page = new PlanPerevirkyAll2016Page(webDriver);
        planPerevirkyAll2017Page = new PlanPerevirkyAll2017Page(webDriver);
        planPerevirkyAll2018Page = new PlanPerevirkyAll2018Page(webDriver);
        planPerevirkyAll2019Page = new PlanPerevirkyAll2019Page(webDriver);
        planPerevirkyAll2020Page = new PlanPerevirkyAll2020Page(webDriver);
        planPerevirkyPorushennia2015Page = new PlanPerevirkyPorushennia2015Page(webDriver);
        planPerevirkyPorushennia2016Page = new PlanPerevirkyPorushennia2016Page(webDriver);
        planPerevirkyPorushennia2017Page = new PlanPerevirkyPorushennia2017Page(webDriver);
        planPerevirkyPorushennia2018Page = new PlanPerevirkyPorushennia2018Page(webDriver);
        planPerevirkyPorushennia2019Page = new PlanPerevirkyPorushennia2019Page(webDriver);
        planPerevirkyPorushennia2020Page = new PlanPerevirkyPorushennia2020Page(webDriver);
        pozaplanPerevirkyAll2015Page = new PozaplanPerevirkyAll2015Page(webDriver);
        pozaplanPerevirkyAll2016Page = new PozaplanPerevirkyAll2016Page(webDriver);
        pozaplanPerevirkyAll2017Page = new PozaplanPerevirkyAll2017Page(webDriver);
        pozaplanPerevirkyAll2018Page = new PozaplanPerevirkyAll2018Page(webDriver);
        pozaplanPerevirkyAll2019Page = new PozaplanPerevirkyAll2019Page(webDriver);
        pozaplanPerevirkyAll2020Page = new PozaplanPerevirkyAll2020Page(webDriver);
        pozaplanPerevirkyPorushennia2015Page = new PozaplanPerevirkyPorushennia2015Page(webDriver);
        pozaplanPerevirkyPorushennia2016Page = new PozaplanPerevirkyPorushennia2016Page(webDriver);
        pozaplanPerevirkyPorushennia2017Page = new PozaplanPerevirkyPorushennia2017Page(webDriver);
        pozaplanPerevirkyPorushennia2018Page = new PozaplanPerevirkyPorushennia2018Page(webDriver);
        pozaplanPerevirkyPorushennia2019Page = new PozaplanPerevirkyPorushennia2019Page(webDriver);
        pozaplanPerevirkyPorushennia2020Page = new PozaplanPerevirkyPorushennia2020Page(webDriver);
        reportPlanningPeriodsPage = new ReportPlanningPeriodsPagePage(webDriver);
        reportPlanPerevirkyAll2015Page = new ReportPlanPerevirkyAll2015Page(webDriver);
        reportPlanPerevirkyAll2016Page = new ReportPlanPerevirkyAll2016Page(webDriver);
        reportPlanPerevirkyAll2017Page = new ReportPlanPerevirkyAll2017Page(webDriver);
        reportPlanPerevirkyAll2018Page = new ReportPlanPerevirkyAll2018Page(webDriver);
        reportPlanPerevirkyAll2019Page = new ReportPlanPerevirkyAll2019Page(webDriver);
        reportPlanPerevirkyAll2020Page = new ReportPlanPerevirkyAll2020Page(webDriver);
        reportStatistics2016Page = new ReportStatistics2016Page(webDriver);
        reportStatistics2017Page = new ReportStatistics2017Page(webDriver);
        reportStatistics2018Page = new ReportStatistics2018Page(webDriver);
        reportStatistics2019Page = new ReportStatistics2019Page(webDriver);
        reportStatistics2020Page = new ReportStatistics2020Page(webDriver);
        spherePage = new SpherePage(webDriver);
        sphereCardPage = new SphereCardPage(webDriver);
        sphereCriteriaPage = new SphereCriteriaPage(webDriver);
        spherePerelikNPAPage = new SpherePerelikNPAPage(webDriver);
        sphereQuestionPage = new SphereQuestionListPage(webDriver);
        sphereVymogyPage = new SphereVymogyPage(webDriver);
        regulatorPage = new RegulatorPage(webDriver);
        viewRegulatorCardPage = new ViewRegulatorCardPage(webDriver);
        createDocumentPage = new CreateDocumentPage(webDriver);
        documentsPage = new DocumentsPage(webDriver);
        updateDocumentPage = new UpdateDocumentPage(webDriver);
        viewDocumentPage = new ViewDocumentPage(webDriver);
        createDocFromBasePage = new CreateDocFromBasePage(webDriver);
        searchResultPage = new SearchResultPage(webDriver);
        createManualDocumentPage = new CreateManualDocumentPage(webDriver);
        planInsp2018Page = new PlanInsp2018Page(webDriver);
        planInsp2019Page = new PlanInsp2019Page(webDriver);
        planInsp2020Page = new PlanInsp2020Page(webDriver);
        planInsp2021Page = new PlanInsp2021Page(webDriver);
        pozaplanInsp2018Page = new PozaplanInsp2018Page(webDriver);
        pozaplanInsp2019Page = new PozaplanInsp2019Page(webDriver);
        pozaplanInsp2020Page = new PozaplanInsp2020Page(webDriver);
        planInspPage = new PlanInspPage(webDriver);
        pozaplanInspPage = new PozaplanInspPage(webDriver);
        viewPlanInspCard2020Page = new ViewPlanInspCard2020Page(webDriver);
        viewPozaplanInspCard2020Page = new ViewPozaplanInspCard2020Page(webDriver);
        typeActInspPage = new TypeActInspPage(webDriver);
        typeActInspSearchResult = new TypeActInspSearchResultPage(webDriver);
        viewTypeActInspCardPage = new ViewTypeActInspCardPage(webDriver);
        viewTypeActInspListNPAPage = new ViewTypeActInspListNPAPage(webDriver);
        viewTypeActInspQuestionsPage = new ViewTypeActInspQuestionsPage(webDriver);
        riskCriteriaPage = new RiskCriteriaPage(webDriver);
        riskCriteriasSearchResultPage = new RiskCriteriasSearchResultPage(webDriver);
        viewRiskCriteriaCriteriasPage = new ViewRiskCriteriaCriteriasPage(webDriver);
        viewRiskCriteriaDocPage = new ViewRiskCriteriaDocPage(webDriver);
        viewRiskCriteriaRisksPage = new ViewRiskCriteriaRisksPage(webDriver);
        subjectsListPage = new SubjectsListPage(webDriver);
        addSubjectPage = new AddSubjectPage(webDriver);
        subjectCardPage = new SubjectCardPage(webDriver);
        searchResultSubjectPage = new SearchResultSubjectPage(webDriver);
        inspCreateStep1Page = new InspCreateStep1Page(webDriver);
        addPidrozdilAndObjectPage = new AddPidrozdilAndObjectPage(webDriver);
        inspCreateStep2Page = new InspCreateStep2Page(webDriver);
        inspCreateStep2_1Page = new InspCreateStep2_1Page(webDriver);
        inspCreateStep3ResultsPage = new InspCreateStep3ResultsPage(webDriver);
        updateNakazPage = new UpdateNakazPage(webDriver);
        inspCreateStep4Page = new InspCreateStep4Page(webDriver);
        inspCreateStep5SanctionsPage = new InspCreateStep5SanctionsPage(webDriver);
        inspViewPage = new InspViewPage(webDriver);
        inspAllPozaplanNotAuth2017Page = new InspAllPozaplanNotAuth2017Page(webDriver);
        inspAllPozaplanNotAuth2016Page = new InspAllPozaplanNotAuth2016Page(webDriver);
        inspAllPozaplanNotAuth2018Page = new InspAllPozaplanNotAuth2018Page(webDriver);
        inspAllPozaplanNotAuth2019Page = new InspAllPozaplanNotAuth2019Page(webDriver);
        inspAllPlanNotAuthPage = new InspAllPlanNotAuthPage(webDriver);
        inspAllPozaplanNotAuthPage = new InspAllPozaplanNotAuthPage(webDriver);
        inspAllPlanNotAuth2016Page = new InspAllPlanNotAuth2016Page(webDriver);
        inspAllPlanNotAuth2017Page = new InspAllPlanNotAuth2017Page(webDriver);
        inspAllPlanNotAuth2018Page = new InspAllPlanNotAuth2018Page(webDriver);
        inspAllPlanNotAuth2019Page = new InspAllPlanNotAuth2019Page(webDriver);
        richniPlansMainPage = new RichniPlansMainPage(webDriver);
        analitykaPage = new AnalitykaPage(webDriver);
        viewDosyeSubjectPage = new ViewDosyeSubjectPage(webDriver);
        viewDodatkovaInfSubjectPage = new ViewDodatkovaInfSubjectPage(webDriver);
        viewIstoriyaZminSubjectPage = new ViewIstoriyaZminSubjectPage(webDriver);
        viewLicenseSubjectPage = new ViewLicenseSubjectPage(webDriver);
        viewObjectsSubjectPage = new ViewObjectsSubjectPage(webDriver);
        viewPerevirkySubjectPage = new ViewPerevirkySubjectPage(webDriver);
        viewPidrozdilySubjectPage = new ViewPidrozdilySubjectPage(webDriver);
        viewZvernennyaSubjectPage = new ViewZvernennyaSubjectPage(webDriver);
        preventiveZahodyPage = new PreventiveZahodyPage(webDriver);
        searchResultPrevZahPage = new SearchResultPrevZahPage(webDriver);
        prevZah2018ListPage = new PrevZah2018ListPage(webDriver);
        prevZah2019ListPage = new PrevZah2019ListPage(webDriver);
        prevZahCardPage = new PrevZahCardPage(webDriver);
        createPrevZahPage = new CreatePrevZahPage(webDriver);
        createInfoVisitPage = new CreateInfoVisitPage(webDriver);
        infoVisit2018ListPage = new InfoVisit2018ListPage(webDriver);
        infoVisit2019ListPage = new InfoVisit2019ListPage(webDriver);
        infoVisitCardPage = new InfoVisitCardPage(webDriver);
        infoVisitPage = new InfoVisitPage(webDriver);
        searchResultInfoVisitPage = new SearchResultInfoVisitPage(webDriver);
        ratingInspectorsAllPage = new RatingInspectorsAllPage(webDriver);
        ratingInspectors2018Page = new RatingInspectors2018Page(webDriver);
        ratingInspectors2019Page = new RatingInspectors2019Page(webDriver);
        ratingInspectors2020Page = new RatingInspectors2020Page(webDriver);
        ratingInspectors2022Page = new RatingInspectors2022Page(webDriver);
        dovidkaPage = new DovidkaPage(webDriver);
        regulatorSearchResultPage = new RegulatorSearchResultPage(webDriver);
        subjectImportPage = new SubjectImportPage(webDriver);
        sphereSelectForVyborkaPage = new SphereSelectForVyborkaPage(webDriver);
        vybirkaSGPage = new VybirkaSGPage(webDriver);
        yearSelectForVyborkaPage = new YearSelectForVyborkaPage(webDriver);
        statisticPage = new StatisticPage(webDriver);
        resultsInspZaZvernenniamPage = new ResultsInspZaZvernenniamPage(webDriver);
        subjectPageNotAuth = new SubjectsPageNotAuth(webDriver);
        pozaplanInspNotAuthPage = new PozaplanInspNotAuthPage(webDriver);
        planInspPageNotAuthPage = new PlanInspPageNotAuthPage(webDriver);
        preventiveZahodyNotAuthPage = new PreventiveZahodyNotAuthPage(webDriver);
        infoVisitNotAuthPage = new InfoVisitNotAuthPage(webDriver);
        actualZayavkiSOPage = new ActualZayavkiSOPage(webDriver);
        approvedEmployeesOrgPage = new ApprovedEmployeesOrgPage(webDriver);
        searchResultApprovedSOPage = new SearchResultApprovedSOPage(webDriver);
        spivrobitnykyOrganivPage = new SpivrobitnykyOrganivPage(webDriver);
        unapprovedEmployeesOrgPage = new UnapprovedEmployeesOrgPage(webDriver);
        actualZayavkiSPOPage = new ActualZayavkiSPOPage(webDriver);
        approvedEmployeesPidpOrgPage = new ApprovedEmployeesPidpOrgPage(webDriver);
        searchResultApprovedSPOPage = new SearchResultApprovedSPOPage(webDriver);
        spivrobitnykyPidpOrganivPage = new SpivrobitnykyPidpOrganivPage(webDriver);
        unapprovedEmployeesPidpOrgPage = new UnapprovedEmployeesPidpOrgPage(webDriver);
        searchResultUnapprovedSOPage = new SearchResultUnapprovedSOPage(webDriver);
        searchResultUnapprovedSPOPage = new SearchResultUnapprovedSPOPage(webDriver);
        resultsInspZaZvernenniam2018Page = new ResultsInspZaZvernenniam2018Page(webDriver);
        resultsInspZaZvernenniam2019Page = new ResultsInspZaZvernenniam2019Page(webDriver);
        resultsInspZaZvernenniam2020Page = new ResultsInspZaZvernenniam2020Page(webDriver);
        planPerevirok2018Page = new PlanPerevirok2018Page(webDriver);
        planuvanniaActualPeriodNOPage = new PlanuvanniaActualPeriodNOPage(webDriver);
        planuvanniaActualPeriodYESPage = new PlanuvanniaActualPeriodYESPage(webDriver);
        planuvanniaPage = new PlanuvanniaPage(webDriver);
        richnyPlanKO2020Page = new RichnyPlanKO2020Page(webDriver);
        richnyPlanKO2019Page = new RichnyPlanKO2019Page(webDriver);
        povidomlenniaPage = new PovidomlenniaPage(webDriver);
        accreditedOrganizationsPage = new AccreditedOrganizationsPage(webDriver);
        organizationCreatePage = new OrganizationCreatePage(webDriver);
        audytPage = new AudytPage(webDriver);
        createAudytPage = new CreateAudytPage(webDriver);
        richniPerevirkyMainPage = new RichniPerevirkyMainPage(webDriver);
        planInspByRegulator2021Page = new PlanInspByRegulator2021Page(webDriver);
        richniPlansOMC2020 = new RichniPlansOMC2020(webDriver);
        richniPlansOMC2019 = new RichniPlansOMC2019(webDriver);
        richniPlansOMC2018 = new RichniPlansOMC2018(webDriver);
        subjectImport_sphere_selectedPage = new SubjectImport_Sphere_SelectedPage(webDriver);
        subjectImport_sphere_year_selectedPage = new SubjectImport_Sphere_Year_SelectedPage(webDriver);
        importErrors_in_filePage = new ImportErrors_In_FilePage(webDriver);
        subject_vybirka_sphereSelectedPage = new Subject_Vybirka_SphereSelectedPage(webDriver);
        subject_vybirka_sphere_year_selectedPage = new Subject_Vybirka_Sphere_Year_SelectedPage(webDriver);
        vybirka_for_PlanPage = new Vybirka_for_PlanPage(webDriver);
        vybirkaSG2021Page = new VybirkaSG2021Page(webDriver);
        errorsByPeriod_vybirka2021Page = new ErrorsByPeriod_Vybirka2021Page(webDriver);
        archiveVybirka2021Page = new ArchiveVybirka2021Page(webDriver);
        planProjectKO2021Page = new PlanProjectKO2021Page(webDriver);
        terOrgWhichSentPlanPage = new TerOrgWhichSentPlanPage(webDriver);
        vybirka2021AfterSendingToCAPage = new Vybirka2021AfterSendingToCAPage(webDriver);
        editSGPage = new EditSGPage(webDriver);
        viewDosyeSubjectWithSphereSelectedPage = new ViewDosyeSubjectWithSphereSelectedPage(webDriver);
        historyOfChangesSGPage = new HistoryOfChangesSGPage(webDriver);
        complexPlanningPeriod2020Page = new ComplexPlanningPeriod2020Page(webDriver);
        complexPlanChanges2020Page = new ComplexPlanChanges2020Page(webDriver);
        complexPlanChanges2021Page = new ComplexPlanChanges2021Page(webDriver);
        projectRichnogoPlanuPage = new ProjectRichnogoPlanuPage(webDriver);
        richniPlansCO2021Page = new RichniPlansCO2021Page(webDriver);
        ratingSGPage = new RatingSGPage(webDriver);
        historyOfRatingsSGPage = new HistoryOfRatingsSGPage(webDriver);
        ratingSGWithSpherePage = new RatingSGWithSpherePage(webDriver);
        skargyDoDRSPage = new SkargyDoDRSPage(webDriver);
        vybirkaAutTransp2021Page = new VybirkaAutTransp2021Page(webDriver);
        subject_vybirka_sphereAutTrSelectedPage = new Subject_Vybirka_SphereAutTrSelectedPage(webDriver);
        editSGAutTrPage = new EditSGAutTrPage(webDriver);
        vybirkaAutTransp2021CAPage = new VybirkaAutTransp2021CAPage(webDriver);
        viewDosyeSubject_bukaevycia_page = new ViewDosyeSubject_Bukaevycia_Page(webDriver);
        yearPlanKOPage = new YearPlanKOPage(webDriver);
        trainingMaterialPage = new TrainingMaterialPage(webDriver);
        createTrainingMaterialsPage = new CreateTrainingMaterialsPage(webDriver);
        searchResultTrainingMaterialsPage = new SearchResultTrainingMaterialsPage(webDriver);
        viewTrainingMaterialPage = new ViewTrainingMaterialPage(webDriver);
        searchResultTrainingMaterials_msap_Page = new SearchResultTrainingMaterials_msap_Page(webDriver);
        zvitPoZahodahKOza2018Page = new ZvitPoZahodahKOza2018Page(webDriver);
        zvitPoZahodahKOza2019Page = new ZvitPoZahodahKOza2019Page(webDriver);
        zvitPoZahodahKOza2020Page = new ZvitPoZahodahKOza2020Page(webDriver);
        zvitPoZahodahKOza2021Page = new ZvitPoZahodahKOza2021Page(webDriver);
        zvitPoZahodahPage = new ZvitPoZahodahPage(webDriver);
        zvitProPorushenniaVymogKO2018Page = new ZvitProPorushenniaVymogKO2018Page(webDriver);
        zvitProPorushenniaVymogKO2019Page = new ZvitProPorushenniaVymogKO2019Page(webDriver);
        zvitProPorushenniaVymogKO2020Page = new ZvitProPorushenniaVymogKO2020Page(webDriver);
        zvitProPorushenniaVymogKO2021Page = new ZvitProPorushenniaVymogKO2021Page(webDriver);
        zvitProPorushenniaVymogPage = new ZvitProPorushenniaVymogPage(webDriver);
        richnaZvitnistPoOrganuPage = new RichnaZvitnistPoOrganuPage(webDriver);
        editZvit2019Page = new EditZvit2019Page(webDriver);
        prevZah2020ListPage = new PrevZah2020ListPage(webDriver);
        uzgodzhenniaDatePage = new UzgodzhenniaDatePage(webDriver);
        searchResultByCompanyNameRichniMainPage = new SearchResultByCompanyNameRichniMainPage(webDriver);
        searchResultByEDRPOURichniMainPage = new SearchResultByEDRPOURichniMainPage(webDriver);
        searchResultBySGNameRichniMainPage = new SearchResultBySGNameRichniMainPage(webDriver);
        searchResultByYearRichniMainPage = new SearchResultByYearRichniMainPage (webDriver);
        searchResultBySGAllRichniMainPage = new SearchResultBySGAllRichniMainPage(webDriver);

    }


    // !!! Смена браузера для запуска  - Edit Configurations... / VM Options: вписываем параметр -Dbrowser=firefox

    private WebDriver driverInit() throws Exception {
        String browser = System.getProperty("browser");
        if ((browser == null) || ("chrome".equalsIgnoreCase(browser))) {
            WebDriverManager.chromedriver().setup();
            if (configProperties.JENKINS_HOST().equalsIgnoreCase(Utils.getIPAdress())) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("window-size=1920,1080");
                options.addArguments("headless");
                logger.info("Jenkins " + Utils.getIPAdress());
                return new ChromeDriver(options);
            }
            else {
                return new ChromeDriver();
            }
        } else if ("firefox".equalsIgnoreCase(browser)) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if ("explorer".equalsIgnoreCase(browser)) {
            WebDriverManager.iedriver().arch32().setup();
            return new InternetExplorerDriver();
        } else {
            throw new Exception("Check browser var");
        }
    }

    @After
    public void tearDown() {
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            screenshot();
        }

        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshot(byte[] screenShot) {
            return screenShot;
        }

        public void screenshot() {
            if (webDriver == null) {
                logger.info("Driver for screenshot not found");
                return;
            }
            saveScreenshot(((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES));
        }

        @Override
        protected void finished(Description description) {
            logger.info(String.format("Finished test: %s::%s", description.getClassName(), description.getMethodName()));
            try {
                webDriver.quit();
            } catch (Exception e) {
                logger.error(e);
            }
        }
    };

    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }

}
