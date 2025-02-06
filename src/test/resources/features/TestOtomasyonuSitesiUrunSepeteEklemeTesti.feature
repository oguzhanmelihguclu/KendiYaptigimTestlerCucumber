Feature: Kullanici ilgili sitede arama kutusunda ürün aratıp sepete ekler.

  Scenario: Kullanici gecerli bilgilerle ilgili siteye giris yapabilmelidir.

    * kullanici testotomasyonu anasayfaya gider
    * account butonuna basar
    * email olarak "toGecerliEmail" girer
    * password olarak "toGecerliPassword" girer
    * signIn butonuna basar
    * basarili giris yapilabildigini test eder
    * senkronizasyon icin 3 saniye bekler
    * logout butonuna basar

  Scenario:  Kullanici testotomasyonu sitesinde dress bulabilmelidir.

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

    Scenario:  Kullanici testotomasyonu sitesinde dress bulabilmeli ve sepete ekleyebilmelidir.

      * kullanici testotomasyonu anasayfaya gider
      * account butonuna basar
      * email olarak "toGecerliEmail" girer
      * password olarak "toGecerliPassword" girer
      * signIn butonuna basar
      * arama kutusuna "dress" yazip aratir
      * arama sonucunda urun bulunabildigini test eder
      * ilk urunu tiklar
      * urunu sepete ekle butonuna tıklar
      * sepetime tıklar
      * urunun sepette oldugunu test eder
      * account butonuna basar
      * logout butonuna basar

  Scenario: Kullanici dress ve phone bulabilmeli ve sepete ikisini de ekleyebilmelidir.

    * kullanici testotomasyonu anasayfaya gider
    * account butonuna basar
    * email olarak "toGecerliEmail" girer
    * password olarak "toGecerliPassword" girer
    * signIn butonuna basar
    * arama kutusuna "dress" yazip aratir
    * arama sonucunda urun bulunabildigini test eder
    * ilk urunu tiklar
    * urunu sepete ekle butonuna tıklar
    * arama kutusuna "phone" yazip aratir
    * arama sonucunda urun bulunabildigini test eder
    * ilk urunu tiklar
    * urunu sepete ekle butonuna tıklar
    * sepetime tıklar
    * urunlerin sepette oldugunu test eder
    * account butonuna basar
    * logout butonuna basar

  Scenario:  Kullanici sepete attigi phone'un adedini 5 yapıp , toplam fiyatının adet fiyatının 5 katı oldugunu görebilmelidir.

    * kullanici testotomasyonu anasayfaya gider
    * account butonuna basar
    * email olarak "toGecerliEmail" girer
    * password olarak "toGecerliPassword" girer
    * signIn butonuna basar
    * arama kutusuna "phone" yazip aratir
    * arama sonucunda urun bulunabildigini test eder
    * ilk urunu tiklar
    * urunu sepete ekle butonuna tıklar
    * sepetime tıklar
    * sepette olan phone adedini 5 yapar.
    * toplam fiyatın unit fiyatının 5 katı oldugunu görür
    * account butonuna basar
    * logout butonuna basar





