package suits;


import audytTest.AudytTest;
import complexPlanTest.ComplexPlanTest;
import dovidkaTest.DovidkaTest;
import formyActInspTest.FormyActInspTest;
import infoVisitsTest.InfoVisitsTest;
import loginTest.LoginTest;
import loginTest.NegativeLoginTest;
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
import requestPasswordResetPROD.RequestPasswordResetPROD;
//import resultsInspZaZvernenniam.ResultsInspZaZvernenniam;
import richniPlanTest.RichniPlanTest;
import riskCriteriaTest.RiskCriteriaTest;
import searchOnMainPageTest.SearchOnMainPageRichniInspTest;
import sphereTest.SphereTest;
import spivrobitnykyOrganuTest.SpivrobitnykyOrganuTest;
import storinkaOrganuSubMenuTest.StorinkaOrganuSubMenuTest;
import subjectsTest.*;
import trainingMaterialTest.TrainingMaterialTest;
import updateUserTest.UpdateUserTest;
import uzgodzhenniaDatePageTest.UzgodzhenniaDatePageTest;
import vyhidTest.VyhidTest;
import zakonodavstvoTest.ZakonodavstvoTest;
import zvitnistTest.RichnaZvitnistPoOrganuTest;
import zvitnistTest.RichniZvityTest;
import zvitnistTest.ZvitPoZahodahTest;
import zvitnistTest.ZvitProPorushenniaVymogTest;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                //AnalitykaTest.class,
                ComplexPlanTest.class,
                DovidkaTest.class,
                FormyActInspTest.class,
                InfoVisitsTest.class,
                //InspCreateStepsTest.class,
                LoginTest.class,
                NegativeLoginTest.class,
                PerevirkyListNotAuthTest.class,
                PerevirkyTest.class,
                PreventiveZahodyTest.class,
                RatingInspectorsTest.class,
                RegulatorTest.class,
                RichniPlanTest.class,
                RiskCriteriaTest.class,
                SearchOnMainPageRichniInspTest.class,
                SphereTest.class,
                SubjectsTest.class,
                //UpdateUserTest.class,
                VyhidTest.class,
                ZakonodavstvoTest.class,
                OpenPagesFromMenuNotAuthTest.class,
                OpenPagesFromMenuPRODTest.class,
                SpivrobitnykyOrganuTest.class,
                StorinkaOrganuSubMenuTest.class,
                //ResultsInspZaZvernenniam.class,
                PlanuvanniaTest.class,
                PovidomlenniaTest.class,
                RatingSGTest.class,
                CheckDateAndRiskChanges1Test.class,
                CheckDateAndRiskChanges2Test.class,
                CheckDateAndRiskChanges3Test.class,
                CheckDateAndRiskChanges4Test.class,
                CheckDateAndRiskChanges5Test.class,
                CheckCriteriaChangesTest.class,
                TrainingMaterialTest.class,
                //AudytTest.class,
                RichniZvityTest.class,
                RichnaZvitnistPoOrganuTest.class,
                ZvitPoZahodahTest.class,
                ZvitProPorushenniaVymogTest.class,
                RequestPasswordResetPROD.class
        }
)

public class RegressionSuite {

}
