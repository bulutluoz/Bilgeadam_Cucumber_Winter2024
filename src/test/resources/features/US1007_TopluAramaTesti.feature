
  Feature: US1007 Kullanici liste olarak verilen tum urunleri aratir

    @smoke @E2E
    Scenario Outline: TC15 liste olarak verilen tum urunler icin sonuc bulunabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      Then arama kutusuna "<aranacakUrun>" yazip aratir
      And arama sonucunda urun bulunabildigini test eder


    Examples:
      |aranacakUrun|
      |dress       |
      |apple       |
      |samsung     |
      |backpack    |
      |phone       |