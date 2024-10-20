
  Feature: US1001 phone arama testi

    Scenario: TC01 kullanici testotomasyonu sitesinde phone aratip sonuc bulabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


