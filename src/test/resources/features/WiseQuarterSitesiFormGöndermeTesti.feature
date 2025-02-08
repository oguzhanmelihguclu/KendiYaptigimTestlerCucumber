
Feature: Kullanici body bölümünde bulunan form sayfasindan bilgileri girerek talep olusturabilmeli

  Scenario: Kullanici gecerli bilgilerle birlikte form sayfasinda talep gönderebilmeli
     * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
     * kullanici body bölümündeki form doldur menüsünü görür
     * kullanici gecerli bilgiler girer
     * kullanici gönder butonuna tıklar
     * talebinin gönderildiğine dair bir geri bildirim görür

  Scenario:  Kullanici isim bölümü haric her yeri doldurarak form sayfasina talep gönderdiginde uyarı almali.
     * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
     * kullanici body bölümündeki form doldur menüsünü görür
     * isim haric tüm bilgileri girer
     * kullanici gönder butonuna tıklar
     * isim ve soyisim bölümünü eksik yazdiniz uyarisini alır

   Scenario:  Kullanici soyisim bölümü haric her yeri doldurarak form sayfasina talep gönderdiginde uyarı almali.
      * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
      * kullanici body bölümündeki form doldur menüsünü görür
      * soyisim haric tüm bilgileri girer
      * kullanici gönder butonuna tıklar
      * isim ve soyisim bölümünü eksik yazdiniz uyarisini alır

   Scenario:  Kullanici eposta bölümü haric her yeri doldurarak form sayfasina talep gönderdiginde uyarı almali.
      * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
      * kullanici body bölümündeki form doldur menüsünü görür
      * e-posta haric tüm bilgileri girer
      * kullanici gönder butonuna tıklar
      * e-posta girmelisiniz uyarisi alir

   Scenario:  Kullanici telefon bölümü haric her yeri doldurarak form sayfasina talep gönderdiginde uyarı almali.
      * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
      * kullanici body bölümündeki form doldur menüsünü görür
      * telefon haric tüm bilgileri girer
      * kullanici gönder butonuna tıklar
      * telefon girmelisiniz uyarisi alir

   Scenario: Kullanici isim ve soy isim bölümüne rakam doldurarak gecerli mail ve gecerli telefon ile basvuru yaptiginda uyari almali.
      * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
      * kullanici body bölümündeki form doldur menüsünü görür
      * isim ve soy isim bölümüne rakam girer diger bölümleri gecerli bilgi girer
      * kullanici gönder butonuna tıklar
      * isim ve soyisim bölümünü eksik yazdiniz uyarisini alır

   Scenario: Kullanici gecersiz bir mail adresi ve gecerli diger bilgilerle formu doldurugunda uyari almali
      * kullanici test data dosyasinda verilen "wiseUrl" anasayfaya gider
      * kullanici body bölümündeki form doldur menüsünü görür
      * kullanici hatali bir mail adresi girer ve diger bilgileri dogru girer
      * kullanici gönder butonuna tıklar
      * e-posta girmelisiniz uyarisi alir







