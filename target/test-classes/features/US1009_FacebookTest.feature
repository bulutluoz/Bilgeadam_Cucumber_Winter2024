
  Feature: Kullanici facebook sayfasina gider


    Scenario: TC17 kullanici facebook sayfasina gidebilmeli

      Given kullanici configuration dosyasindaki "facebookUrl" anasayfaya gider
      Then facebook cookies kabul eder
      And facebook sayfasinda oldugunu test eder
      Then 3 saniye bekler
      And sayfayi kapatir
