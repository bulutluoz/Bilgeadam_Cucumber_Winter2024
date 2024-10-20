
  Feature: US1003 kullanici aranacak kelime icin parametre kullanabilmeli

    Scenario: TC07 kullanici testotomasyonu sitesinde baby aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "baby" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And 3 saniye bekler
      And sayfayi kapatir


    Scenario: TC08 kullanici testotomasyonu sitesinde samsung aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "samsung" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

    Scenario: TC09 kullanici testotomasyonu sitesinde backpack aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      Then arama kutusuna "backpack" yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir