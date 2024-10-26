
  @E2E
  Feature: US1006 verilen toplu kullanici email ve password degerleri ile giris yapilamaz

    Scenario Outline: TC14 verilen listedeki bilgilerle giris yapilamamali

      Given kullanici testotomasyonu anasayfaya gider
      And account butonuna basar
      Then email olarak direkt "<direktEmail>" girer
      And password olarak direkt "<direktPassword>" girer
      Then signIn butonuna basar
      And basarili olarak giris yapilamadigini test eder
      Then 3 saniye bekler


    Examples:
    |direktEmail      |direktPassword |
    |ali@gmail.com    | 34567         |
    |veli@hotmail.com | 23345566      |
    |hasan@gmail.com  | 324ewr        |