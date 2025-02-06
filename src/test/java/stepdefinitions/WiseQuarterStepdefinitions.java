package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.WiseQuarter;
import utilities.Driver;

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
}
