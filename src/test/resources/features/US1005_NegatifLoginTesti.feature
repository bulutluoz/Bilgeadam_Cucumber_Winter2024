
  Feature: US1005 kullanici gecersiz bilgilerle sisteme giremez

    Scenario: TC11 Kullanici gecersiz email, gecerli password ile sisteme giris yapamamali

      Given kullanici testotomasyonu anasayfaya gider
      When account butonuna basar
      Then email olarak "toGecersizEmail" girer
      And password olarak "toGecerliPassword" girer
      And signIn butonuna basar
      Then basarili olarak giris yapilamadigini test eder
      And sayfayi kapatir


    Scenario: TC12 Kullanici gecerli email ve gecersiz password ile sisteme giris yapamamali
      Given kullanici testotomasyonu anasayfaya gider
      When account butonuna basar
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      And basarili olarak giris yapilamadigini test eder
      And sayfayi kapatir


    Scenario: TC13 Kullanici gecersiz email ve gecersiz password ile sisteme giris yapamamali
      Given kullanici testotomasyonu anasayfaya gider
      When account butonuna basar
      And email olarak "toGecersizEmail" girer
      And password olarak "toGecersizPassword" girer
      Then signIn butonuna basar
      And basarili olarak giris yapilamadigini test eder
      And sayfayi kapatir