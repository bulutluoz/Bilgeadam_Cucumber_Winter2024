
  @smoke
  Feature: US1004 kullanici gecerli bilgilerle sisteme giris yapar

    Scenario: TC10 kullanici gecerli email ve password ile giris yapabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      Then account butonuna basar
      And email olarak configuration dosyasindan "toGecerliEmail" girer
      And password olarak configuration dosyasindan "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilabildigini test eder
      And 3 saniye bekler
      Then logout linkini tiklayip sistemden cikar
      And sayfayi kapatir