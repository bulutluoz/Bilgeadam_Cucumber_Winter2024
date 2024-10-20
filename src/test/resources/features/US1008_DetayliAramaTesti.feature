
  Feature: US1008 kullanici detayli arama yapar

    @WIP
    Scenario: TC16 kullanici sayfaya gidip verilen urunu bulabilmeli

      Given kullanici configuration dosyasindaki "toUrl" anasayfaya gider
      Then testotomasyonu anasayfada oldugunu test eder
      When arama kutusuna "phone" yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      Then bulunan urunlerden ilkini tiklar
      And 1 saniye bekler
      And acilan sayfada urun isminde case sensitive olmadan "phone" bulundugunu test eder
