package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@smoke")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/standartRapor/20Ekim2024_htmlRaporHook.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")

public class Runner {

    /*
        Runner class'i BOS bir class'dir

        amaci belirlenen feature ve/veya Scenario'larin toplu calistirilmasi
        ve istenen raporlarin olusturulmasidir

        Runner class'i gorevlerini notasyonlar sayesinde yapar

        SelectClasspathResource : temel calisma klasorumuzun dosya yolu
        FEATURES_PROPERTY_NAME : feature dosyalarimizin icinde oldugu
                                 features klasorunun dosya yolu
                                 (calistirmak istedigimiz TUM FEATURE'larin icinde oldugu ana klasorun dosya yolu)

        GLUE_PROPERTY_NAME : java olmayan feature'larin calismasi icin
                             ihtiyac duydugumuz java method'larinin bulundugu
                             ana package'in dosya yolu

       FILTER_TAGS_PROPERTY_NAME : EGER tum feature dosyalarini degil,
                                   belirlediginiz spesifik feature dosyalarini calistirmak isterseniz
                                   calismasi istenen Feature ve/veya Scenario'lara ortak tag atayabilirsiniz

        EXECUTION_DRY_RUN_PROPERTY_NAME : degeri true veya false olabilir
                        false oldugunda : Runner calismasina etki etmez,
                                          Runner'da tamnimlanan feature/Scenario'lar calisir
                        true oldugunda  : Belirlenen testleri CALISTIRMADAN
                                          sadece eksik stepdefinition'lari olusturur
                                          EGER eksik adim bulamazsa TEST PASSED der
                                          bu Test PASSED testin calisip PASSED oldugu anlamina gelmez
                                          SADECE eksik adim olmadigini gosterir

     */

}






















