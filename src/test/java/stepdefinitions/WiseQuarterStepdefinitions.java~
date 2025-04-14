package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WiseQuarter;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class WiseQuarterStepdefinitions {

    WiseQuarter wiseQuarter = new WiseQuarter();

    @Given("kullanici header'da bulunan anasayfa,hakkımızda,etkinliklerimiz,kurslarimiz,blog,iletisim,kayitol, lms butonlarını görür")
    public void kullanici_header_da_bulunan_anasayfa_hakkımızda_etkinliklerimiz_kurslarimiz_blog_iletisim_kayitol_lms_butonlarını_görür() {
        Assertions.assertTrue(wiseQuarter.headerAnaSayfaButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerHakkimizdaButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerEtkinliklerimizButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerKurslarimizButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerBlogButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerIletisimButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerKayitOlButonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerLMSbutonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerWiseQuarterResmi.isDisplayed());
    }

    @Given("kullanici sayfayı kapatir")
    public void kullanici_sayfayı_kapatir() {
        Driver.quitDriver();
    }

    @Given("kullanici header bölümündeki WiseQuarterIkonuna tıklar")
    public void kullanici_header_bölümündeki_wise_quarter_ikonuna_tıklar() {

        wiseQuarter.headerWiseQuarterResmi.click();
    }

    @Given("kullanici WiseQuarter sayfasina erisebildigini test eder")
    public void kullanici_wise_quarter_sayfasina_erisebildigini_test_eder() {

        String expectedIcerik = "wise quarter";
        String actualUrlTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));


    }

    @Given("kullanici header bölümündeki LMS butonuna tıklar")
    public void kullanici_header_bölümündeki_lms_butonuna_tıklar() {

        wiseQuarter.headerLMSbutonu.click();

    }

    @Given("kullanici LMS sayfasına erisebildigini test eder")
    public void kullanici_lms_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "lms";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki kayitol butonuna tıklar")
    public void kullanici_header_bölümündeki_kayitol_butonuna_tıklar() {

        wiseQuarter.headerKayitOlButonu.click();
    }

    @Given("kullanici kayitol sayfasına erisebildigini test eder")
    public void kullanici_kayitol_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "kayıt";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));

    }

    @Given("kullanici header bölümündeki iletisim butonuna tıklar")
    public void kullanici_header_bölümündeki_iletisim_butonuna_tıklar() {

        wiseQuarter.headerIletisimButonu.click();

    }

    @Given("kullanici iletisim sayfasına erisebildigini test eder")
    public void kullanici_iletisim_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "iletişim";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki blog butonuna tıklar")
    public void kullanici_header_bölümündeki_blog_butonuna_tıklar() {

        wiseQuarter.headerBlogButonu.click();
    }

    @Given("kullanici blog sayfasına erisebildigini test eder")
    public void kullanici_blog_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "blog";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki kurslarimiz butonuna tıklar")
    public void kullanici_header_bölümündeki_kurslarimiz_butonuna_tıklar() {

        wiseQuarter.headerKurslarimizButonu.click();
    }

    @Given("kullanici kurslarimiz sayfasına erisebildigini test eder")
    public void kullanici_kurslarimiz_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "kurs";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki etkinliklerimiz butonuna tıklar")
    public void kullanici_header_bölümündeki_etkinliklerimiz_butonuna_tıklar() {

        wiseQuarter.headerEtkinliklerimizButonu.click();
    }

    @Given("kullanici etkinliklerimiz sayfasına erisebildigini test eder")
    public void kullanici_etkinliklerimiz_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "etkinlik";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki hakkımızda butonuna tıklar")
    public void kullanici_header_bölümündeki_hakkımızda_butonuna_tıklar() {

        wiseQuarter.headerHakkimizdaButonu.click();
    }

    @Given("kullanici hakkımızda sayfasına erisebildigini test eder")
    public void kullanici_hakkımızda_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik = "hakkımızda";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki anasayfa butonuna tıklar")
    public void kullanici_header_bölümündeki_anasayfa_butonuna_tıklar() {

        wiseQuarter.headerAnaSayfaButonu.click();
    }

    @Given("kullanici anasayfaya erisebildigini test eder")
    public void kullanici_anasayfaya_erisebildigini_test_eder() {

        String expectedIcerik = "wise quarter";
        String actualUrlIcerik = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }

    @Given("kullanici header'da bulunan sosyal medya ikonlarını görür")
    public void kullanici_header_da_bulunan_sosyal_medya_ikonlarını_görür() {

        Assertions.assertTrue(wiseQuarter.headerTwitterIkonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerFacebookIkonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerLinkedInIkonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerInstagramIkonu.isDisplayed());
        Assertions.assertTrue(wiseQuarter.headerYouTubeIkonu.isDisplayed());
    }

    @Given("kullanici header bölümündeki youtube ikonuna tiklar")
    public void kullanici_header_bölümündeki_youtube_ikonuna_tiklar() {
        wiseQuarter.headerYouTubeIkonu.click();
    }

    @Given("kullanici ilgili sayfanin youtube sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_youtube_sayfasinda_oldugunu_görür() {

        String expectedIcerik = "wise quarter";
        String actualUrlTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki instagram ikonuna tiklar")
    public void kullanici_header_bölümündeki_instagram_ikonuna_tiklar() {

        wiseQuarter.headerInstagramIkonu.click();

    }

    @Given("kullanici ilgili sayfanin instagram sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_instagram_sayfasinda_oldugunu_görür() {


        String expectedIcerik = "wise quarter";
        String actualUrlTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki linkedIn ikonuna tiklar")
    public void kullanici_header_bölümündeki_linked_in_ikonuna_tiklar() {

        wiseQuarter.headerLinkedInIkonu.click();
    }

    @Given("kullanici ilgili sayfanin linkedIn sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_linked_in_sayfasinda_oldugunu_görür() {

        String expectedIcerik = "wise quarter";
        String actualUrlTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }


    @Given("kullanici header bölümündeki facebook ikonuna tiklar")
    public void kullanici_header_bölümündeki_facebook_ikonuna_tiklar() {

        wiseQuarter.headerFacebookIkonu.click();
    }

    @Given("kullanici ilgili sayfanin facebook sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_facebook_sayfasinda_oldugunu_görür() {

        String expectedIcerik = "wise quarter";
        String actualUrlTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki twitter ikonuna tiklar")
    public void kullanici_header_bölümündeki_twitter_ikonuna_tiklar() {

        wiseQuarter.headerTwitterIkonu.click();
    }

    @Given("kullanici ilgili sayfanin twitter sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_twitter_sayfasinda_oldugunu_görür() {

        String expectedIcerik = "wisequarter";
        String actualUrl = Driver.getDriver().getCurrentUrl().toLowerCase();
        Assertions.assertTrue(actualUrl.contains(expectedIcerik));
    }

    @Given("kullanici body bölümündeki form doldur menüsünü görür")
    public void kullanici_body_bölümündeki_form_doldur_menüsünü_görür() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='form-home']")));
        Driver.getDriver().switchTo().frame(iframe);
        Assertions.assertTrue(wiseQuarter.bodyFormYazisi.isDisplayed());


    }

    @Given("kullanici gecerli bilgiler girer")
    public void kullanici_gecerli_bilgiler_girer() {

        wiseQuarter.formIsımButonu.sendKeys("John");
        wiseQuarter.formSoyadButonu.sendKeys("Doe");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.com");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");

    }

    @Given("kullanici gönder butonuna tıklar")
    public void kullanici_gönder_butonuna_tıklar() {
        wiseQuarter.formGönderButonu.click();

    }

    @Given("talebinin gönderildiğine dair bir geri bildirim görür")
    public void talebinin_gönderildiğine_dair_bir_geri_bildirim_görür() {

        Assertions.assertTrue(wiseQuarter.formSayfasiKayitOlusturulduMesaji.isDisplayed());

    }

    @Given("isim haric tüm bilgileri girer")
    public void isim_haric_tüm_bilgileri_girer() {


        wiseQuarter.formSoyadButonu.sendKeys("Doe");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.com");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");

    }

    @Given("isim ve soyisim bölümünü eksik yazdiniz uyarisini alır")
    public void isim_ve_soyisim_bölümünü_eksik_yazdiniz_uyarisini_alır() {

        Assertions.assertTrue(wiseQuarter.isimYazmamaHataYazisi.isDisplayed());
    }

    @Given("soyisim haric tüm bilgileri girer")
    public void soyisim_haric_tüm_bilgileri_girer() {

        wiseQuarter.formIsımButonu.sendKeys("John");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.com");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");

    }

    @Given("e-posta haric tüm bilgileri girer")
    public void e_posta_haric_tüm_bilgileri_girer() {

        wiseQuarter.formIsımButonu.sendKeys("John");
        wiseQuarter.formSoyadButonu.sendKeys("Doe");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");

    }

    @Given("e-posta girmelisiniz uyarisi alir")
    public void e_posta_girmelisiniz_uyarisi_alir() {
        Assertions.assertTrue(wiseQuarter.emailYazmamaHataYazisi.isDisplayed());
    }

    @Given("telefon haric tüm bilgileri girer")
    public void telefon_haric_tüm_bilgileri_girer() {

        wiseQuarter.formIsımButonu.sendKeys("John");
        wiseQuarter.formSoyadButonu.sendKeys("Doe");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.com");


    }

    @Given("telefon girmelisiniz uyarisi alir")
    public void telefon_girmelisiniz_uyarisi_alir() {
        Assertions.assertTrue(wiseQuarter.telefonYazmamaHataYazisi.isDisplayed());
    }

    @Given("isim ve soy isim bölümüne rakam girer diger bölümleri gecerli bilgi girer")
    public void isim_ve_soy_isim_bölümüne_rakam_girer_diger_bölümleri_gecerli_bilgi_girer() {

        wiseQuarter.formIsımButonu.sendKeys("1111");
        wiseQuarter.formSoyadButonu.sendKeys("1111");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.com");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");
    }

    @Given("kullanici hatali bir mail adresi girer ve diger bilgileri dogru girer")
    public void kullanici_hatali_bir_mail_adresi_girer_ve_diger_bilgileri_dogru_girer() {
        wiseQuarter.formIsımButonu.sendKeys("John");
        wiseQuarter.formSoyadButonu.sendKeys("Doe");
        wiseQuarter.formEmailButonu.sendKeys("dapay28294@perceint.co");
        wiseQuarter.formTelefonButonu.sendKeys("+902621212121255");
    }

    @Given("kullanici body bölümündeki yazilim kurslari ve bootcamp basliklarini ve iceriklerini görür")
    public void kullanici_body_bölümündeki_yazilim_kurslari_ve_bootcamp_basliklarini_ve_iceriklerini_görür() {

        Assertions.assertTrue(wiseQuarter.bodyBootCampNedirBasligi.isDisplayed());
        Assertions.assertTrue(wiseQuarter.bodyYazilimKurslariBasligi.isDisplayed());
        Assertions.assertTrue(wiseQuarter.bodyBootcampNedirIcerigi.isDisplayed());
        Assertions.assertTrue(wiseQuarter.bodyYazilimKurslariIcerigi.isDisplayed());
    }

    @Given("kullanici basliklarla iliskili resmi görür")
    public void kullanici_basliklarla_iliskili_resmi_görür() {

        Assertions.assertTrue(wiseQuarter.bootCampNedirResimleri.isDisplayed());

    }

    @Given("kullanici yazilim kurslari basligini incelerken altta bulunan daha fazla ogren linkine tıklar")
    public void kullanici_yazilim_kurslari_basligini_incelerken_altta_bulunan_daha_fazla_ogren_linkine_tıklar() {

        wiseQuarter.bodyDahaFazlaOgreninButonu.click();
    }

    @Given("kullanici daha fazla ogren ile ilgili sayfaya gittigini dogrular")
    public void kullanici_daha_fazla_ogren_ile_ilgili_sayfaya_gittigini_dogrular() {

        String expectedBaslikIcerik = "wise quarter";
        String actualBaslikTitle = Driver.getDriver().getTitle().toLowerCase();

        Assertions.assertTrue(actualBaslikTitle.contains(expectedBaslikIcerik));
    }

    @Given("kullanici body kısmındaki yeniliklerden haberdar olun menüsünü görür")
    public void kullanici_body_kısmındaki_yeniliklerden_haberdar_olun_menüsünü_görür() {

        Assertions.assertTrue(wiseQuarter.YeniliklerdenHaberdarOlunMenüsü.isDisplayed());
    }

    @Given("kullanici mail adresini girer")
    public void kullanici_mail_adresini_girer() {

        wiseQuarter.yeniliklerdenHaberdarOlunEmailBölümü.sendKeys("asdasd@gmail.com");

    }

    @Given("kullanici yeniliklerden haberdar olun butonuna tıklar")
    public void kullanici_yeniliklerden_haberdar_olun_butonuna_tıklar() {

        wiseQuarter.yeniliklerdenHaberdarOlunButonu.click();
        ReusableMethods.bekle(2);


    }

    @Given("kullanici isleminiz basarili olmustur geri bildirimi alir")
    public void kullanici_isleminiz_basarili_olmustur_geri_bildirimi_alir() {

        String expected = "Basarili Olmustur";
        String actual = wiseQuarter.yeniliklerdenHaberdarOlunGeriBildirim.getText();
        Assertions.assertEquals(expected, actual);

    }

    @Given("kullanici ilgili youtube videosunu görür ve tıklar")
    public void kullanici_ilgili_youtube_videosunu_görür_ve_tıklar() {

        Assertions.assertTrue(wiseQuarter.GelecekParmaklarinizUcundaVideosuPlayTusu.isDisplayed());
        wiseQuarter.GelecekParmaklarinizUcundaVideosuPlayTusu.click();


    }

    @Given("kullanici acilan sayfada videosunun ortasındaki play tusuna tıklar")
    public void kullanici_acilan_sayfada_videosunun_ortasındaki_play_tusuna_tıklar() {

        Driver.getDriver().switchTo().frame(wiseQuarter.GelecekParmaklarinizUucundaIframe);
        wiseQuarter.GelecekParmaklarinizUucundaIframePlayTusu.click();
        ReusableMethods.bekle(5);

    }

    @Given("kullanici ilgili videoyu izledikten sonra kapatır")
    public void kullanici_ilgili_videoyu_izledikten_sonra_kapatır() {

        Driver.getDriver().switchTo().defaultContent();
        wiseQuarter.videoyuKapatmaButonu.click();
        ReusableMethods.bekle(2);

    }

    @Given("kullanici body bölümündeki kurslarimiz basligini görür")
    public void kullanici_body_bölümündeki_kurslarimiz_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.bodyYazilimKurslariBasligi.isDisplayed());
    }

    @Given("kullanici kurslarimiz basligi altindaki Yazilim Test Uzmanligi basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_yazilim_test_uzmanligi_basligini_görür() {
        Assertions.assertTrue(wiseQuarter.kurslarimizYazilimTestUzmanıBasligi.isDisplayed());

    }

    @Given("kullanici Yazilim Test Uzmanlıgı yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_yazilim_test_uzmanlıgı_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.yazilimTestUzmanıDahaFazlaOkuLinki.click();

    }

    @Given("kullanici Yazilim Test Uzmanlıgı  sayfasına gittigini dogrular")
    public void kullanici_yazilim_test_uzmanlıgı_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "yazılım test uzmanlığı";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));
    }

    @Given("kullanici kurslarimiz basligi altindaki Siber Güvenlik Uzmanı basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_siber_güvenlik_uzmanı_basligini_görür() {
        Assertions.assertTrue(wiseQuarter.kurslarimizSiberGüvenlikBasligi.isDisplayed());

    }

    @Given("kullanici Siber Güvenlik Uzmanı yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_siber_güvenlik_uzmanı_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.siberGüvenlikUzmanıDahaFazlaOkuLinki.click();
    }

    @Given("kullanici Siber Güvenlik Uzmanı sayfasına gittigini dogrular")
    public void kullanici_siber_güvenlik_uzmanı_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "siber güvenlik";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Given("kullanici kurslarimiz basligi altindaki Front-End Developer basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_front_end_developer_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.kurslarimizFrontEndBasligi.isDisplayed());
    }

    @Given("kullanici Front-End Developer yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_front_end_developer_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.frontEndDahaFazlaOkuLinki.click();

    }

    @Given("kullanici Front-End Developer sayfasına gittigini dogrular")
    public void kullanici_front_end_developer_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "front-end developer";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Given("kullanici kurslarimiz basligi altindaki Salesforce basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_salesforce_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.kurslarimizSalesForceBasligi.isDisplayed());

    }

    @Given("kullanici Salesforce yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_salesforce_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.salesForceDahaFazlaOkuLinki.click();

    }

    @Given("kullanici Salesforce sayfasına gittigini dogrular")
    public void kullanici_salesforce_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "salesforce";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Given("kullanici kurslarimiz basligi altindaki Ücretsiz Kurslar basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_ücretsiz_kurslar_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.kurslarimizUcretsizKurslarBasligi.isDisplayed());
    }

    @Given("kullanici Ücretsiz Kurslar yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_ücretsiz_kurslar_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.ucretsizKurslarDahaFazlaOkuLinki.click();
    }

    @Given("kullanici Ücretsiz Kurslar sayfasına gittigini dogrular")
    public void kullanici_ücretsiz_kurslar_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "ücretsiz kurs";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Given("kullanici kurslarimiz basligi altindaki Amazon E-Ticaret Eğitimi basligini görür")
    public void kullanici_kurslarimiz_basligi_altindaki_amazon_e_ticaret_eğitimi_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.kurslarimizAmazonEticaretBasligi.isDisplayed());
    }

    @Given("kullanici Amazon E-Ticaret Eğitimi yazisindaki daha fazla oku linkine tıklar")
    public void kullanici_amazon_e_ticaret_eğitimi_yazisindaki_daha_fazla_oku_linkine_tıklar() {

        wiseQuarter.amazonDahaFazlaOkuLinki.click();
    }

    @Given("kullanici Amazon E-Ticaret Eğitimi sayfasına gittigini dogrular")
    public void kullanici_amazon_e_ticaret_eğitimi_sayfasına_gittigini_dogrular() {

        String expectedIcerik = "amazon e-ticaret";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));

    }

    @Given("kullanici body bölümündeki çocuklar için kurslarimiz basligini görür")
    public void kullanici_body_bölümündeki_çocuklar_için_kurslarimiz_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.cocuklarIcınKurslarimizBasligi.isDisplayed());
    }

    @Given("kullanici çocuklar için kurslar altındaki Scratch İle Programlama basligini görür")
    public void kullanici_çocuklar_için_kurslar_altındaki_scratch_i̇le_programlama_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.scratchIleProgramlamaBasligi.isDisplayed());

    }

    @Given("kullanici Scratch İle Programlama yazisindaki daha fazla bilgi edin linkine tıklar")
    public void kullanici_scratch_i̇le_programlama_yazisindaki_daha_fazla_bilgi_edin_linkine_tıklar() {

        wiseQuarter.dahaFazlaBilgiEdininLinki.click();
    }

    @Given("kullanıcı daha fazla bilgi edinin sayfasına gitigini dogrular")
    public void kullanıcı_daha_fazla_bilgi_edinin_sayfasına_gitigini_dogrular() {

        String expectedIcerik = "wise quarter kids";
        String actualTitle = Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(expectedIcerik));


    }

    @Given("kullanici body bölümündeki Öğrenci Yorumları basligini görür")
    public void kullanici_body_bölümündeki_öğrenci_yorumları_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.bodyOgrenciYorumlariBasligi.isDisplayed());
    }

    @Given("kullanici body bölümündeki Başarı Hikayeleri başlığını görür")
    public void kullanici_body_bölümündeki_başarı_hikayeleri_başlığını_görür() {

        Assertions.assertTrue(wiseQuarter.basarıHikayeleriBasligi.isDisplayed());
    }

    @Given("kullanici  salesforce developer videosuna tıklar")
    public void kullanici_salesforce_developer_videosuna_tıklar() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();

        WebElement salesForceIframeElementi = Driver.getDriver().findElement(By.xpath("(//iframe)[3]"));
        Driver.getDriver().switchTo().frame(salesForceIframeElementi);

        wiseQuarter.salesforceVideosuPlayTusu.click();
    }


    @Given("kullanici ilgili videoyu izler ve kapatır")
    public void kullanici_ilgili_videoyu_izler_ve_kapatır() {

        ReusableMethods.bekle(5);

    }


    @Given("kullanici ilgili sitenin footer bölümüne ilerler")
    public void kullanici_ilgili_sitenin_footer_bölümüne_ilerler() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();

    }

    @Given("kullanici footer bölümünde wisequarter resmini görür")
    public void kullanici_footer_bölümünde_wisequarter_resmini_görür() {

        Assertions.assertTrue(wiseQuarter.footerWiseQuarterResmi.isDisplayed());


    }

    @Given("kullanici wisequarter resmine tıklayıp anasayfaya tekrar döner")
    public void kullanici_wisequarter_resmine_tıklayıp_anasayfaya_tekrar_döner() {

        Assertions.assertTrue(wiseQuarter.footerWiseQuarterResmi.isEnabled());

    }

    @Given("kullanici footer bölümündeki youtube ikonuna tıklar")
    public void kullanici_footer_bölümündeki_youtube_ikonuna_tıklar() {

        wiseQuarter.footerYoutubeIkonu.click();
    }

    @Given("kullanici footer bölümündeki instagram ikonuna tıklar")
    public void kullanici_footer_bölümündeki_instagram_ikonuna_tıklar() {
        wiseQuarter.footerInstagramIkonu.click();
    }

    @Given("kullanici footer bölümündeki linkedIn ikonuna tıklar")
    public void kullanici_footer_bölümündeki_linked_in_ikonuna_tıklar() {
        wiseQuarter.footerLinkedInIkonu.click();
    }

    @Given("kullanici footer bölümündeki facebook ikonuna tıklar")
    public void kullanici_footer_bölümündeki_facebook_ikonuna_tıklar() {
        wiseQuarter.footerFacebookIkonu.click();
    }

    @Given("kullanici footer bölümündeki twitter ikonuna tıklar")
    public void kullanici_footer_bölümündeki_twitter_ikonuna_tıklar() {
        wiseQuarter.footerTwitterIkonu.click();
    }

    @Given("kullanici footer bölümündeki Baslangic basligini görür")
    public void kullanici_footer_bölümündeki_baslangic_basligini_görür() {

        Assertions.assertTrue(wiseQuarter.footerBaslangicBasligi.isDisplayed());
    }
    @Given("kullanici LMS linkine tıklar ve ilgili sayfaya erişir")
    public void kullanici_lms_linkine_tıklar_ve_ilgili_sayfaya_erişir() {

        Assertions.assertTrue(wiseQuarter.footerLMSlinki.isEnabled());
    }

    @Given("kullanici RandevuAl linkine tıklar ve ilgili sayfaya erişir")
    public void kullanici_randevu_al_linkine_tıklar_ve_ilgili_sayfaya_erişir() {

        Assertions.assertTrue(wiseQuarter.footerRandevuAlLinki.isEnabled());

    }

    @Given("kullanici KayitOl linkine tıklar ve ilgili sayfaya erişir")
    public void kullanici_kayit_ol_linkine_tıklar_ve_ilgili_sayfaya_erişir() {

        Assertions.assertTrue(wiseQuarter.footerKayitOlLinki.isEnabled());
    }

    @Given("kullanici Iletisim linkine tıklar ve ilgili sayfaya erişir")
    public void kullanici_iletisim_linkine_tıklar_ve_ilgili_sayfaya_erişir() {

        Assertions.assertTrue(wiseQuarter.footerIletisimLinki.isEnabled());

    }





}
