
  Feature: US1008 kullanici detayli arama yapar


    Scenario: TC16 kullanici sayfaya gidip verilen urunu bulabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      Then testotomasyonu anasayfada oldugunu test eder
      When arama kutusuna "phone" yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      Then bulunan urunlerden ilkini tiklar
      And acilan sayfada urun isminde case sensitive olmadan "phone" bulundugunu test eder
      Then sayfayi kapatir