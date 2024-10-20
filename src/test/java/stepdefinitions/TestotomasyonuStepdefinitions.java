package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        String aramaSonucuYazisi = testotomasyonuPage.aramaSonucuYaziElementi.getText();
        // 4 Products Found

        String sonucBulunamadiYazisi = ConfigReader.getProperty("toBulunamadiSonucu");

        // urun bulundu ise bu ikisi esit olmamali

        Assertions.assertNotEquals(sonucBulunamadiYazisi,aramaSonucuYazisi);


    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @Then("arama kutusuna apple yazip aratir")
    public void aramaKutusunaAppleYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("apple" + Keys.ENTER);
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakKelime) {

        testotomasyonuPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        ReusableMethods.bekle(saniye);
    }

    @Then("account butonuna basar")
    public void account_butonuna_basar() {
       testotomasyonuPage.accountLinki.click();
    }


    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {

        testotomasyonuPage.loginSayfasiSignInButonu.click();

    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {

        Assertions.assertTrue( testotomasyonuPage.logoutLinki.isDisplayed());
    }

    @Then("logout linkini tiklayip sistemden cikar")
    public void logoutLinkiniTiklayipSistemdenCikar() {
        testotomasyonuPage.logoutLinki.click();
    }

    @Then("basarili olarak giris yapilamadigini test eder")
    public void basariliOlarakGirisYapilamadiginiTestEder() {

        Assertions.assertTrue(testotomasyonuPage.loginSayfasiEmailKutusu.isDisplayed());
    }

    @Then("email olarak configuration dosyasindan {string} girer")
    public void emailOlarakConfigurationDosyasindanGirer(String configurationMail) {
        testotomasyonuPage.loginSayfasiEmailKutusu.sendKeys(ConfigReader.getProperty(configurationMail));

    }

    @And("password olarak configuration dosyasindan {string} girer")
    public void passwordOlarakConfigurationDosyasindanGirer(String configurationPasswordTuru) {
        testotomasyonuPage.loginSayfasiPasswordKutusu.sendKeys(ConfigReader.getProperty(configurationPasswordTuru));

    }

    @Then("email olarak direkt {string} girer")
    public void emailOlarakDirektGirer(String email) {

        testotomasyonuPage.loginSayfasiEmailKutusu.sendKeys(email);
    }

    @And("password olarak direkt {string} girer")
    public void passwordOlarakDirektGirer(String password) {
        testotomasyonuPage.loginSayfasiPasswordKutusu.sendKeys(password);
    }

    @Then("testotomasyonu anasayfada oldugunu test eder")
    public void testotomasyonu_anasayfada_oldugunu_test_eder() {
        // actual url'in configuration dosyasindaki ile ayni oldugunu test edelim

        String expectedUrl = ConfigReader.getProperty("toUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assertions.assertNotEquals(expectedUrl,actualUrl);
    }
    @Then("bulunan urunlerden ilkini tiklar")
    public void bulunan_urunlerden_ilkini_tiklar() {

        testotomasyonuPage.bulunanUrunElementleriList.get(0).click();

    }
    @Then("acilan sayfada urun isminde case sensitive olmadan {string} bulundugunu test eder")
    public void acilan_sayfada_urun_isminde_case_sensitive_olmadan_bulundugunu_test_eder(String expectedIsimIcerik) {

        String actualIlkUrunIsmi = testotomasyonuPage.ilkUrunSayfasindakiIsimElementi
                                                        .getText()
                                                        .toLowerCase();

        Assertions.assertTrue(actualIlkUrunIsmi.contains(expectedIsimIcerik));
    }

}
