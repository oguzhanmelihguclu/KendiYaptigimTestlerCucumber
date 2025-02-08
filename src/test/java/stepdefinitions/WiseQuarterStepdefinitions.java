package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WiseQuarter;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class WiseQuarterStepdefinitions {

    WiseQuarter wiseQuarter =new WiseQuarter();

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

     String expectedIcerik= "wise quarter";
     String actualUrlTitle=Driver.getDriver().getTitle().toLowerCase();
     Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));




    }
    @Given("kullanici header bölümündeki LMS butonuna tıklar")
    public void kullanici_header_bölümündeki_lms_butonuna_tıklar() {

        wiseQuarter.headerLMSbutonu.click();

    }
    @Given("kullanici LMS sayfasına erisebildigini test eder")
    public void kullanici_lms_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "lms";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki kayitol butonuna tıklar")
    public void kullanici_header_bölümündeki_kayitol_butonuna_tıklar() {

      wiseQuarter.headerKayitOlButonu.click();
    }
    @Given("kullanici kayitol sayfasına erisebildigini test eder")
    public void kullanici_kayitol_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "kayıt";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));

    }
    @Given("kullanici header bölümündeki iletisim butonuna tıklar")
    public void kullanici_header_bölümündeki_iletisim_butonuna_tıklar() {

        wiseQuarter.headerIletisimButonu.click();

    }
    @Given("kullanici iletisim sayfasına erisebildigini test eder")
    public void kullanici_iletisim_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "iletişim";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki blog butonuna tıklar")
    public void kullanici_header_bölümündeki_blog_butonuna_tıklar() {

        wiseQuarter.headerBlogButonu.click();
    }
    @Given("kullanici blog sayfasına erisebildigini test eder")
    public void kullanici_blog_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "blog";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki kurslarimiz butonuna tıklar")
    public void kullanici_header_bölümündeki_kurslarimiz_butonuna_tıklar() {

        wiseQuarter.headerKurslarimizButonu.click();
    }
    @Given("kullanici kurslarimiz sayfasına erisebildigini test eder")
    public void kullanici_kurslarimiz_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "kurs";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki etkinliklerimiz butonuna tıklar")
    public void kullanici_header_bölümündeki_etkinliklerimiz_butonuna_tıklar() {

        wiseQuarter.headerEtkinliklerimizButonu.click();
    }
    @Given("kullanici etkinliklerimiz sayfasına erisebildigini test eder")
    public void kullanici_etkinliklerimiz_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "etkinlik";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki hakkımızda butonuna tıklar")
    public void kullanici_header_bölümündeki_hakkımızda_butonuna_tıklar() {

        wiseQuarter.headerHakkimizdaButonu.click();
    }
    @Given("kullanici hakkımızda sayfasına erisebildigini test eder")
    public void kullanici_hakkımızda_sayfasına_erisebildigini_test_eder() {

        String expectedIcerik= "hakkımızda";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlIcerik.contains(expectedIcerik));
    }
    @Given("kullanici header bölümündeki anasayfa butonuna tıklar")
    public void kullanici_header_bölümündeki_anasayfa_butonuna_tıklar() {

        wiseQuarter.headerAnaSayfaButonu.click();
    }
    @Given("kullanici anasayfaya erisebildigini test eder")
    public void kullanici_anasayfaya_erisebildigini_test_eder() {

        String expectedIcerik= "wise quarter";
        String actualUrlIcerik=Driver.getDriver().getTitle().toLowerCase();
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

        String expectedIcerik= "wise quarter";
        String actualUrlTitle=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki instagram ikonuna tiklar")
    public void kullanici_header_bölümündeki_instagram_ikonuna_tiklar() {

       wiseQuarter.headerInstagramIkonu.click();

    }
    @Given("kullanici ilgili sayfanin instagram sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_instagram_sayfasinda_oldugunu_görür() {


        String expectedIcerik= "wise quarter";
        String actualUrlTitle=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki linkedIn ikonuna tiklar")
    public void kullanici_header_bölümündeki_linked_in_ikonuna_tiklar() {

        wiseQuarter.headerLinkedInIkonu.click();
    }
    @Given("kullanici ilgili sayfanin linkedIn sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_linked_in_sayfasinda_oldugunu_görür() {

        String expectedIcerik= "wise quarter";
        String actualUrlTitle=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }


    @Given("kullanici header bölümündeki facebook ikonuna tiklar")
    public void kullanici_header_bölümündeki_facebook_ikonuna_tiklar() {

        wiseQuarter.headerFacebookIkonu.click();
    }
    @Given("kullanici ilgili sayfanin facebook sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_facebook_sayfasinda_oldugunu_görür() {

        String expectedIcerik= "wise quarter";
        String actualUrlTitle=Driver.getDriver().getTitle().toLowerCase();
        Assertions.assertTrue(actualUrlTitle.contains(expectedIcerik));
    }

    @Given("kullanici header bölümündeki twitter ikonuna tiklar")
    public void kullanici_header_bölümündeki_twitter_ikonuna_tiklar() {

        wiseQuarter.headerTwitterIkonu.click();
    }
    @Given("kullanici ilgili sayfanin twitter sayfasinda oldugunu görür")
    public void kullanici_ilgili_sayfanin_twitter_sayfasinda_oldugunu_görür() {

        String expectedIcerik= "wisequarter";
        String actualUrl=Driver.getDriver().getCurrentUrl().toLowerCase();
        Assertions.assertTrue(actualUrl.contains(expectedIcerik));
    }

    @Given("kullanici body bölümündeki form doldur menüsünü görür")
    public void kullanici_body_bölümündeki_form_doldur_menüsünü_görür() {

     WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
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




}
