package pages.pageElements;

import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(xpath = ".//div[@class='container main-container']")


public class MainMenu extends CommonActionWithElements {

    Logger logger = Logger.getLogger(getClass());
    //Неавторизовані користувачі

    @FindBy(xpath = ".//span[contains(text(),'Загальна інформація')]")
    private Link zagalnaInformacia;

    @FindBy(xpath = ".//span[contains(text(),'Плани перевірок')]")
    private Link planyPerevirok;

    @FindBy(xpath = ".//span[contains(text(),'Результати перевірок')]")
    private Link rezultatyPerevirok;

    @FindBy(xpath = ".//span[contains(text(),'Звітність органів')]")
    private Link zvitnistOrganiv;

    @FindBy(xpath = ".//span[contains(text(),'Увійти')]")
    private Link uviyty;

    //SubMenu

    @FindBy(xpath = ".//span[contains(text(),'Довідка')]")
    private Link dovidka;

    @FindBy(xpath = ".//span[contains(text(),'Перелік контролюючих органів')]")
    private Link perelikKO;

    @FindBy(xpath = ".//span[contains(text(),'Законодавство')]")
    private Link zakonodavsnvo;

    @FindBy(xpath = ".//span[contains(text(),'Критерії ризику')]")
    private Link kryteriiRyzyku;

    @FindBy(xpath = ".//span[contains(text(),'Навчальні і консультаційні матеріали')]")
    private Link navchalniConsultMaterial;

    @FindBy(xpath = ".//span[contains(text(),'Форми актів')]")
    private Link formyAktiv;

    @FindBy(xpath = ".//span[contains(text(),'Перелік сфер контролю')]")
    private Link perelikSferKontrolyu;

    @FindBy(xpath = ".//span[contains(text(),'Суб')]")
    private Link subyektyGosp;

    @FindBy(xpath = ".//span[contains(text(),'Рейтинг')]")
    private Link ratingSG;

    @FindBy(xpath = ".//span[contains(text(),'Навчальні')]")
    private Link trainingMaterials;

    @FindBy(xpath = ".//span[contains(text(),'API')]")
    private Link api;

    @FindBy(xpath = ".//span[contains(text(),'Комплексні')]")
    private Link kompleksniPlany;

    @FindBy(xpath = ".//span[contains(text(),'Річні плани')]")
    private Link richniPlany;

    @FindBy(xpath = ".//span[contains(text(),'Результати планових перевірок')]")
    private Link rezultatyPlanovyhPerevirok;

    @FindBy(xpath = ".//span[contains(text(),'Результати позапланових перевірок')]")
    private Link rezultatyPozaplanovyhPerevirok;

    @FindBy(xpath = ".//span[contains(text(),'Результати перевірок за зверненнями')]")
    private Link rezultatyPerevirokZaZvernennyam;

    @FindBy(xpath = "//span[contains(text(),'Результати превентивних заходів')]")
    private Link rezultatyPreventyvnyhZahodiv;

    @FindBy(xpath = ".//span[contains(text(),'Результати інформаційних відвідувань')]")
    private Link rezultatyInformVidviduvania;

    @FindBy(xpath = ".//span[contains(text(),'Статистика наповнення порталу')]")
    private Link statystykaNapovnennyaPortalu;

    @FindBy(xpath = ".//span[contains(text(),'Аналітичний модуль')]")
    private Link analitychnyModul;

    @FindBy(xpath = ".//span[contains(text(),'Оцінювання інспекторів')]")
    private Link ocinyuvannyaInspectoriv;

    @FindBy(xpath = ".//span[contains(text(),'Річні звіти контролюючих органів')]")
    private Link richniZvityKO;


    //Авторизовані користувачі

    @FindBy(xpath = ".//span[contains(text(),'Аудит')]")
    private Link audyt;

    @FindBy(xpath = ".//span[contains(text(),'Довідники')]")
    private Link dovidnyky;

    @FindBy(xpath = ".//span[contains(text(),'Перевірки')]")
    private Link perevirky;

    @FindBy(xpath = ".//span[contains(text(),'Звітність')]")
    private Link zvitnist;

    @FindBy(xpath = ".//button[@class='icon-ring note_btn']")
    private Link povidomlenniaIcon;

    @FindBy(xpath = ".//div[@class='user_box_name']")
    private Link menuKorystuvacha;

    //SubMenu

    @FindBy(xpath = ".//span[contains(text(),'Акредитовані організації')]")
    private Link akredytovaniOrg;

    @FindBy(xpath = ".//a[@href='/audit/audit']")
    private Link audytSub;

    @FindBy(xpath = ".//span[contains(text(),'Планові перевірки')]")
    private Link planoviPerevirky;

    @FindBy(xpath = ".//span[contains(text(),'Позапланові перевірки')]")
    private Link pozaplanoviPerevirky;

    @FindBy(xpath = ".//span[contains(text(),'Превентивні заходи')]")
    private Link preventyvniZahody;

    @FindBy(xpath = ".//span[contains(text(),'Інформаційні відвідування')]")
    private Link informaciyniVidviduvannia;

    @FindBy(xpath = ".//span[contains(text(),'Планування (перелік періодів)')]")
    private Link planuvannyaPerelikPeriodiv;

    @FindBy(xpath = ".//span[contains(text(),'Узгодження дат')]")
    private Link uzgodzhenniaDate;

    @FindBy(xpath = ".//span[contains(text(),'Скарги')]")
    private Link skargy;

    @FindBy(xpath = ".//span[contains(text(),'Річні звіти')]")
    private Link richniZvity;

    @FindBy(xpath = ".//span[contains(text(),'Статистика')]")
    private Link statystyka;

    @FindBy(xpath = ".//span[contains(text(),'Аналітика')]")
    private Link analityka;

    @FindBy(xpath = ".//span[contains(text(),'Мій профіль')]")
    private Link miyProfil;

    @FindBy(xpath = ".//span[contains(text(),'Сторінка органу')]")
    private Link storinkaOrganu;

    @FindBy(xpath = ".//ul[@class='dropdown-menu']//span[contains(text(),'Співробітники органу')]")
    private Link spivrobitnykyOrganu;

    @FindBy(xpath = ".//ul[@class='dropdown-menu']//span[contains(text(),'Співробітники підпорядкованих органів')]")
    private Link spivrobitnykyPidporydkovanyhOrganiv;

    @FindBy(xpath = ".//span[contains(text(),'Вихід')]")
    private Link vyhid;

    @FindBy(xpath = ".//div[@class='note_header' and contains(text(),'Повідомлення')]")
    private Link povidomlenniaBlockTitle;

    @FindBy(xpath = ".//a[@class='btn-block btn btn-primary' and contains(text(),'Дивитись усі повідомлення')]")
    private Link seeAllNotificationsBtn;

    @FindBy(xpath = ".//ul/li[2]/a//span[contains(text(),'Скарги до ДРС')]")
    private Link skargyDoDRS;

    @FindBy(xpath = ".//span[contains(text(),'Звіт по заходах')]")
    private Link zvitPoZahodah;

    @FindBy(xpath = ".//span[contains(text(),'Звіт про порушення вимог')]")
    private Link zvitProPorusheniaVymog;

    @FindBy(xpath = ".//span[contains(text(),'Річна звітність по органу')]")
    private Link richnaZvitPoOrganu;


    @Step
    public void clickOnZagalnaInformacia() {
        actionsWithOurElements.clickOnElement(zagalnaInformacia);
        logger.info("Element -ZagalnaInformacia- was clicked");
    }

    @Step
    public void clickOnPlanyPerevirok() {
        actionsWithOurElements.clickOnElement(planyPerevirok);
        logger.info("Element -PlanyPerevirok- was clicked");
    }

    @Step
    public void clickOnRezultatyPerevirok() {
        actionsWithOurElements.clickOnElement(rezultatyPerevirok);
        logger.info("Element -RezultatyPerevirok- was clicked");
    }

    @Step
    public void clickOnZvitnistOrganiv() {
        actionsWithOurElements.clickOnElement(zvitnistOrganiv);
        logger.info("Element -ZvitnistOrganiv- was clicked");
    }

    @Step
    public void clickOnUviyty() {
        actionsWithOurElements.clickOnElement(uviyty);
        logger.info("Element -Uviyty- was clicked");
    }

    @Step
    public void clickOnDovidka() {
        actionsWithOurElements.clickOnElement(dovidka);
        logger.info("Element -Dovidka- was clicked");
    }

    @Step
    public void clickOnPerelikKO() {
        actionsWithOurElements.clickOnElement(perelikKO);
        logger.info("Element -PerelikKO- was clicked");
    }

    @Step
    public void clickOnZakonodavsnvo() {
        actionsWithOurElements.clickOnElement(zakonodavsnvo);
        logger.info("Element -Zakonodavsnvo- was clicked");
    }

    @Step
    public void clickOnKryteriiRyzyku() {
        actionsWithOurElements.clickOnElement(kryteriiRyzyku);
        logger.info("Element -KryteriiRyzyku- was clicked");
    }

    @Step
    public void clickOnFormyAktiv() {
        actionsWithOurElements.clickOnElement(formyAktiv);
        logger.info("Element -FormyAktiv- was clicked");
    }

    @Step
    public void clickOnPerelikSferKontrolyu() {
        actionsWithOurElements.clickOnElement(perelikSferKontrolyu);
        logger.info("Element -PerelikSferKontrolyu- was clicked");
    }

    @Step
    public void clickOnSubyektyGosp() {
        actionsWithOurElements.clickOnElement(subyektyGosp);
        logger.info("Element -SubyektyGosp- was clicked");
    }

    @Step
    public void clickOnApi() {
        actionsWithOurElements.clickOnElement(api);
        logger.info("Element -Api- was clicked");
    }

    @Step
    public void clickOnKompleksniPlany() {
        actionsWithOurElements.clickOnElement(kompleksniPlany);
        logger.info("Element -KompleksniPlany- was clicked");
    }

    @Step
    public void clickOnRichniPlany() {
        actionsWithOurElements.clickOnElement(richniPlany);
        logger.info("Element -RichniPlany- was clicked");
    }

    @Step
    public void clickOnRezultatyPlanovyhPerevirok() {
        actionsWithOurElements.clickOnElement(rezultatyPlanovyhPerevirok);
        logger.info("Element -RezultatyPlanovyhPerevirok- was clicked");
    }

    @Step
    public void clickOnRezultatyPozaplanovyhPerevirok() {
        actionsWithOurElements.clickOnElement(rezultatyPozaplanovyhPerevirok);
        logger.info("Element -RezultatyPozaplanovyhPerevirok- was clicked");
    }

    @Step
    public void clickOnRezultatyPerevirokZaZvernennyam() {
        actionsWithOurElements.clickOnElement(rezultatyPerevirokZaZvernennyam);
        logger.info("Element -RezultatyPerevirokZaZvernennyam- was clicked");
    }

    @Step
    public void clickOnResultsPrevZah() {
        actionsWithOurElements.clickOnElement(rezultatyPreventyvnyhZahodiv);
        logger.info("Element -ResultsPrevZahy- was clicked");
    }

    @Step
    public void clickOnRezultatyInformVidviduvannia() {
        actionsWithOurElements.clickOnElement(rezultatyInformVidviduvania);
        logger.info("Element -RezultatyInformVidviduvannia- was clicked");
    }

    @Step
    public void clickOnStatystykaNapovnennyaPortalu() {
        actionsWithOurElements.clickOnElement(statystykaNapovnennyaPortalu);
        logger.info("Element -StatystykaNapovnennyaPortalu- was clicked");
    }

    @Step
    public void clickOnPerevirky() {
        actionsWithOurElements.clickOnElement(perevirky);
        logger.info("Element -Perevirky- was clicked");
    }

    @Step
    public void clickOnAnalitychnyModul() {
        actionsWithOurElements.clickOnElement(analitychnyModul);
        logger.info("Element -AnalitychnyModul- was clicked");
    }

    @Step
    public void clickOnOcinyuvannyaInspectoriv() {
        actionsWithOurElements.clickOnElement(ocinyuvannyaInspectoriv);
        logger.info("Element -OcinyuvannyaInspectoriv- was clicked");
    }

    @Step
    public void clickOnRichniZvityKO() {
        actionsWithOurElements.clickOnElement(richniZvityKO);
        logger.info("Element -RichniZvityKO- was clicked");
    }

    @Step
    public void clickOnDovidnyky() {
        actionsWithOurElements.clickOnElement(dovidnyky);
        logger.info("Element -Dovidnyky- was clicked");
    }

    @Step
    public void clickOnZvitnist() {
        actionsWithOurElements.clickOnElement(zvitnist);
        logger.info("Element -Zvitnist- was clicked");
    }

    @Step
    public void clickOnMenuKorystuvacha() {
        actionsWithOurElements.clickOnElement(menuKorystuvacha);
        logger.info("Element -MenuKorystuvacha- was clicked");
    }

    @Step
    public void clickOnPlanoviPerevirky() {
        actionsWithOurElements.clickOnElement(planoviPerevirky);
        logger.info("Element -PlanoviPerevirky- was clicked");
    }

    @Step
    public void clickOnPozaplanoviPerevirky() {
        actionsWithOurElements.clickOnElement(pozaplanoviPerevirky);
        logger.info("Element -PozaplanoviPerevirky- was clicked");
    }

    @Step
    public void clickOnPreventyvniZahody() {
        actionsWithOurElements.clickOnElement(preventyvniZahody);
        logger.info("Element -PreventyvniZahody- was clicked");
    }

    @Step
    public void clickOnInformaciyniVidviduvannia() {
        actionsWithOurElements.clickOnElement(informaciyniVidviduvannia);
        logger.info("Element -InformaciyniVidviduvannia- was clicked");
    }

    @Step
    public void clickOnPlanuvannyaPerelikPeriodiv() {
        actionsWithOurElements.clickOnElement(planuvannyaPerelikPeriodiv);
        logger.info("Element -PlanuvannyaPerelikPeriodiv- was clicked");
    }

    @Step
    public void clickOnRichniZvity() {
        actionsWithOurElements.clickOnElement(richniZvity);
        logger.info("Element -RichniZvity- was clicked");
    }

    @Step
    public void clickOnStatystyka() {
        actionsWithOurElements.clickOnElement(statystyka);
        logger.info("Element -Statystyka- was clicked");
    }

    @Step
    public void clickOnAnalityka() {
        actionsWithOurElements.clickOnElement(analityka);
        logger.info("Element -Analityka- was clicked");
    }

    @Step
    public void clickOnMiyProfil() {
        actionsWithOurElements.clickOnElement(miyProfil);
        logger.info("Element -MiyProfil- was clicked");
    }

    @Step
    public void clickOnStorinkaOrganu() {
        actionsWithOurElements.clickOnElement(storinkaOrganu);
        logger.info("Element -StorinkaOrganu- was clicked");
    }

    @Step
    public void clickOnSpivrobitnykyOrganu() {
        actionsWithOurElements.clickOnElement(spivrobitnykyOrganu);
        logger.info("Element -SpivrobitnykyOrganu- was clicked");
    }

    @Step
    public void clickOnSpivrobitnyPidporydkovanyhOrganiv() {
        actionsWithOurElements.clickOnElement(spivrobitnykyPidporydkovanyhOrganiv);
        logger.info("Element -SpivrobitnyPidporydkovanyhOrganiv- was clicked");
    }

    @Step
    public void clickOnRatingSG() {
        actionsWithOurElements.clickOnElement(ratingSG);
        logger.info("Element -RatingSG- was clicked");
    }

    @Step
    public void clickOnTrainingMaterials() {
        actionsWithOurElements.clickOnElement(trainingMaterials);
        logger.info("Element -TrainingMaterials- was clicked");
    }

    @Step
    public void clickOnVyhid() {
        actionsWithOurElements.clickOnElement(vyhid);
        logger.info("Element -Vyhid- was clicked");
    }

    @Step
    public void clickOnPovidomlenniaIcon() {
        actionsWithOurElements.clickOnElement(povidomlenniaIcon);
        logger.info("Element -PovidomlenniaIcon- was clicked");
    }

    @Step
    public boolean isPovidomlenniaBlockTitleDisplayed() {
        return actionsWithOurElements.isElementDisplayed(povidomlenniaBlockTitle);
            }

    @Step
    public void checkIsPovidomlenniaBlockTitlePresent() {
        Assert.assertTrue("PovidomlenniaBlockTitle is not displayed", isPovidomlenniaBlockTitleDisplayed());
    }

    @Step
    public void clickOnSeeAllNotificationsBtn() {
        actionsWithOurElements.clickOnElement(seeAllNotificationsBtn);
        logger.info("Element -SeeAllNotificationsBtn- was clicked");
    }

    @Step
    public void clickOnAudyt() {
        actionsWithOurElements.clickOnElement(audyt);
        logger.info("Element -Audyt- was clicked");
    }

    @Step
    public void clickOnAudytSub() {
        actionsWithOurElements.clickOnElement(audytSub);
        logger.info("Element -AudytSub- was clicked");
    }

    @Step
    public void clickOnAkredytovaniOrg() {
        actionsWithOurElements.clickOnElement(akredytovaniOrg);
        logger.info("Element -AkredytovaniOrg- was clicked");
    }

    @Step
    public void clickOnNavchalniConsultMaterial() {
        actionsWithOurElements.clickOnElement(navchalniConsultMaterial);
        logger.info("Element -NavchalniConsultMaterial- was clicked");
    }

    @Step
    public void clickOnSkargyDoDRS() {
        actionsWithOurElements.clickOnElement(skargyDoDRS);
        logger.info("Element -SkargyDoDRS- was clicked");
    }

    @Step
    public void clickOnZvitPoZahodah() {
        actionsWithOurElements.clickOnElement(zvitPoZahodah);
        logger.info("Element -ZvitPoZahodah- was clicked");
    }

    @Step
    public void clickOnZvitProPorusheniaVymog() {
        actionsWithOurElements.clickOnElement(zvitProPorusheniaVymog);
        logger.info("Element -ZvitProPorusheniaVymog- was clicked");
    }

    @Step
    public void clickOnRichnaZvitPoOrganu() {
        actionsWithOurElements.clickOnElement(richnaZvitPoOrganu);
        logger.info("Element -RichnaZvitPoOrganu- was clicked");
    }

    @Step
    public void clickOnSkargy() {
        actionsWithOurElements.clickOnElement(skargy);
        logger.info("Element -Skargy- was clicked");
    }

    @Step
    public void clickOnUzgodzhenniaDate() {
        actionsWithOurElements.clickOnElement(uzgodzhenniaDate);
        logger.info("Element -UzgodzhenniaDate- was clicked");
    }

}
