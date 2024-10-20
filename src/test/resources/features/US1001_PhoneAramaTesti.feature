
  Feature: US1001 phone arama testi

    Scenario: TC01 kullanici testotomasyonu sitesinde phone aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC02 kullanici testotomasyonu sitesinde dress aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

    Scenario: TC03 kullanici testotomasyonu sitesinde apple aratip sonuc bulabilmeli
      Given kullanici testotomasyonu anasayfaya gider
      Then arama kutusuna apple yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir



