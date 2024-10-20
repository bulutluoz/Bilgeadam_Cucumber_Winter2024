package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
        Cucumber'da stepdefinition'lari bir class veya bir feature'a ozel degildir

        feature dosyasinda yazilan bir step'e ait stepdefinion
        hangi stepdefinitions class'inda olursa olsun calisir

        Bu yuzden stepdefinitions package'i altina HERHANGI bir class'a
        @Before.. veya @After... kondugunda
        bu method'un ISTISNASIZ her Scenario icin devreye girecegini UNUTMAMALIYIZ

        bu ozelliginden dolayi Cucumber'da @Before.. ve @After.. cok tercih edilmez

        Sadece ekran resmi almak icin
        her Scenario'dan sonra calisip,
        Scenario failed olursa ekran resmi alip rapora ekleyecek
        bir @AfterScenario kullanilir
     */

    @After // her Scenario'dan sonra calisacak
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }

        Driver.quitDriver();
    }
}
