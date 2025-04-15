@wip
Feature: Kullanici ilgili sitede arama kutusunda ürün aratır.

    Scenario: Kullanici gecerli bilgilerle ilgili siteye giris yapabilmeli.

    * kullanici testotomasyonu anasayfaya gider
    * account butonuna basar
    * email olarak "toGecerliEmail" girer
    * password olarak "toGecerliPassword" girer
    * signIn butonuna basar
    * basarili giris yapilabildigini test eder
    * senkronizasyon icin 3 saniye bekler
    * logout butonuna basar

    Scenario:  Kullanici testotomasyonu sitesinde dress bulabilmeli

      * kullanici testotomasyonu anasayfaya gider
      * account butonuna basar
      * email olarak "toGecerliEmail" girer
      * password olarak "toGecerliPassword" girer
      * signIn butonuna basar
      * arama kutusuna "dress" yazip aratir
      * arama sonucunda urun bulunabildigini test eder
      * senkronizasyon icin 3 saniye bekler
      * account butonuna basar
      * logout butonuna basar

    Scenario: Kullanici testotomasyonu sitesinde phone bulabilmeli

      * kullanici testotomasyonu anasayfaya gider
      * account butonuna basar
      * email olarak "toGecerliEmail" girer
      * password olarak "toGecerliPassword" girer
      * signIn butonuna basar
      * arama kutusuna "phone" yazip aratir
      * arama sonucunda urun bulunabildigini test eder
      * senkronizasyon icin 3 saniye bekler
      * account butonuna basar
      * logout butonuna basar