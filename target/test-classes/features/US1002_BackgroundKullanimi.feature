
  Feature: US1002 kullanici ortak on adimlar icin Background kullanabilir

    Background: anasayfaya gitme
      Given kullanici testotomasyonu anasayfaya gider

    Scenario: TC04 kullanici testotomasyonu sitesinde phone aratip sonuc bulabilmeli
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC05 kullanici testotomasyonu sitesinde dress aratip sonuc bulabilmeli
      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC06 kullanici testotomasyonu sitesinde apple aratip sonuc bulabilmeli
      Then arama kutusuna apple yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir