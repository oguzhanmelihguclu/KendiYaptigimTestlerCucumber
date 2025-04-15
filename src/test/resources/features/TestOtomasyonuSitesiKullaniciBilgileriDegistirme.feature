@wip
Feature:  Kullanici siteye kayit oldugu bilgileri degistirebilmeli

  Scenario: Kullanici siteye kayit oldugu ismi ve soy ismi degistirebilmelidir

    * kullanici testotomasyonu anasayfaya gider
    * account butonuna basar
    * email olarak "toGecerliEmail" girer
    * password olarak "toGecerliPassword" girer
    * signIn butonuna basar
    * basarili giris yapilabildigini test eder
    * senkronizasyon icin 3 saniye bekler
    * account butonuna basar
    * kayit oldugu ismini Wisee yapar
    * kayit oldugu soyismini Quarterr yapar
    * kayit oldugu mobilnumarasını 123456 yapar
    * uptade butonuna basar ve degisikliklerin gerceklestigini test eder.
    * logout butonuna basar

    Scenario: Kullanici siteye kayit oldugu mail sifresini degistirebilmelidir.
      * kullanici testotomasyonu anasayfaya gider
      * account butonuna basar
      * email olarak "toGecerliEmail" girer
      * password olarak "toGecerliPassword" girer
      * signIn butonuna basar
      * basarili giris yapilabildigini test eder
      * senkronizasyon icin 3 saniye bekler
      * account butonuna basar
      * kullanici change password butonuna basar
      * kullanıcı eski şifresini girer
      * kullanici yeni sifresini girer
      * kullanici yeni sifresini confirm eder.
      * kullanici uptade butonuna basar.
      * logout butonuna basar
      * kullanici testotomasyonu anasayfaya gider
      * degistirdigi sifre ile basarili giris yapildigini test eder
      * logout butonuna basar






