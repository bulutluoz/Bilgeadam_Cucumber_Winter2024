package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ConcurrentModificationException;

public class FacebookStepdefinitions {
    FacebookPage facebookPage = new FacebookPage();

    @Then("facebook cookies kabul eder")
    public void facebook_cookies_kabul_eder() {
        facebookPage.cookiesKabulButonu.click();
    }
    @Then("facebook sayfasinda oldugunu test eder")
    public void facebook_sayfasinda_oldugunu_test_eder() {

        // actual url configuration dosyasindaki url ile ayni olmali
        String expectedurl = ConfigReader.getProperty("facebookUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assertions.assertEquals(expectedurl,actualUrl);

    }

    @Given("kullanici configuration dosyasindaki {string} anasayfaya gider")
    public void kullaniciConfigurationDosyasindakiAnasayfayaGider(String gidilecekUrl) {
        // facebookUrl

        Driver.getDriver().get(ConfigReader.getProperty(gidilecekUrl));
    }
}
