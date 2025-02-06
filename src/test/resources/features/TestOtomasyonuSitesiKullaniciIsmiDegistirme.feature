Feature:  Kullanici siteye kayit oldugu bilgileri degistirebilmeli
@wip
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


