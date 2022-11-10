package suits;


import complexPlanTest.ComplexPlanTest;
import dovidkaTest.DovidkaTest;
import formyActInspTest.FormyActInspTest;
import infoVisitsTest.InfoVisitsTest;
import openPagesFromMenuNotAuthTest.OpenPagesFromMenuNotAuthTest;
import openPagesFromMenuPRODTest.OpenPagesFromMenuPRODTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import perevirkyListNotAuthTest.PerevirkyListNotAuthTest;
import perevirkyTest.PerevirkyTest;
import planuvanniaTest.PlanuvanniaTest;
import povidomlenniaTest.PovidomlenniaTest;
import preventiveZahodyTest.PreventiveZahodyTest;
import ratingInspectorsTest.RatingInspectorsTest;
import ratingSGTest.RatingSGTest;
import regulatorTest.RegulatorTest;
import requestPasswordReset.RequestPasswordReset;
import resultsInspZaZvernenniam.ResultsInspZaZvernenniam;
import richniPlanTest.RichniPlanTest;
import richniPlanTest.ViewZminyDoRichnogoPlanTest;
import riskCriteriaTest.RiskCriteriaTest;
import searchOnMainPageTest.SearchOnMainPageComplexInspTest;
import searchOnMainPageTest.SearchOnMainPageRichniInspTest;
import sphereTest.SphereTest;
import spivrobitnykyOrganuTest.SpivrobitnykyOrganuTest;
import storinkaOrganuSubMenuTest.StorinkaOrganuSubMenuTest;
import subjectsTest.*;
import trainingMaterialTest.TrainingMaterialTest;
import updateUserTest.UpdateUserTest;
import vyhidTest.VyhidTest;
import zakonodavstvoTest.ZakonodavstvoTest;
import zvitnistTest.RichnaZvitnistPoOrganuTest;
import zvitnistTest.RichniZvityTest;
import zvitnistTest.ZvitPoZahodahTest;
import zvitnistTest.ZvitProPorushenniaVymogTest;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                // LoginTest.class,
                // NegativeLoginTest.class,
                // AnalitykaTest.class,
                // AudytTest.class,
                ComplexPlanTest.class,
                DovidkaTest.class,
                FormyActInspTest.class,
                InfoVisitsTest.class,
                // InspCreateStepsTest.class,
                OpenPagesFromMenuNotAuthTest.class,
                OpenPagesFromMenuPRODTest.class,
                PerevirkyListNotAuthTest.class,
                PerevirkyTest.class,
                PlanuvanniaTest.class,
                PovidomlenniaTest.class,
                PreventiveZahodyTest.class,
                RatingInspectorsTest.class,
                RatingSGTest.class,
                RegulatorTest.class,
                RequestPasswordReset.class,
                ResultsInspZaZvernenniam.class,
                RichniPlanTest.class,
                ViewZminyDoRichnogoPlanTest.class,
                RiskCriteriaTest.class,
                SearchOnMainPageComplexInspTest.class,
                SearchOnMainPageRichniInspTest.class,
                // SkargyDoDRSTest.class,
                SphereTest.class,
                SpivrobitnykyOrganuTest.class,
                // SpivrobitnykyPidprOrganivTest.class,
                StorinkaOrganuSubMenuTest.class,
                CheckCriteriaChangesTest.class,
                CheckDateAndRiskChanges1Test.class,
                CheckDateAndRiskChanges2Test.class,
                CheckDateAndRiskChanges3Test.class,
                CheckDateAndRiskChanges4Test.class,
                CheckDateAndRiskChanges5Test.class,
                // ImportFileWithSGTest.class,
                SubjectsTest.class,
                VybirkaTest.class,
                TrainingMaterialTest.class,
                UpdateUserTest.class,
                // UzgodzhenniaDatePageTest.class,
                VyhidTest.class,
                ZakonodavstvoTest.class,
                RichnaZvitnistPoOrganuTest.class,
                RichniZvityTest.class,
                ZvitPoZahodahTest.class,
                ZvitProPorushenniaVymogTest.class

        }
)

public class RegressionSuite {

}
