package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ReusableMethods {

    public static List<String> stringListeDonustur(List<WebElement> elementList){

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : elementList) {

            stringList.add(eachElement.getText());
        }

        return stringList;
    }

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);

        } catch (InterruptedException e) {

            System.out.println("bekleme yapilamadi");
        }

    }

    public static void switchToWindowTitle(WebDriver driver,String hedefTitle){

        Set<String> whdSeti = driver.getWindowHandles();

        for ( String eachWhd : whdSeti
        ) {

            driver.switchTo().window(eachWhd);

            if (driver.getTitle().equals(hedefTitle)){
                break;
            }
        }

    }

    public static void switchToWindowUrl(WebDriver driver,String hedefUrl){

        Set<String> whdSeti = driver.getWindowHandles();

        for ( String eachWhd : whdSeti){

            driver.switchTo().window(eachWhd);

            if (driver.getCurrentUrl().equals(hedefUrl)){
                break;
            }
        }
    }

    public static void tumSayfaScreenshot(WebDriver driver) {

        // rapora tarih etiketi ekleyelim
        LocalDateTime localDateTime = LocalDateTime.now(); // 2024-10-12T09-26-13-456785
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = localDateTime.format(format); // 241012092613



        // 1- olusturacagimiz resim icin dosya yolu hazirla (uzantisi jpg, jpeg, png olabilir)
        String dosyaYolu = "target/screenshots/"+ tarihEtiketi +"_tumSayfa.png";

        // 2- dosya yolunu kullanarak, resmi kaydedecegimiz File olusturalim
        File tumSayfaResmi = new File(dosyaYolu);

        // 3- fotografi cekmek icin TakeScreenshot objesi olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 4- takesScreenshot objesini kullanarak fotografi cekip, gecici bir dosyaya kaydedelim

        File geciciResim = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 5- geciciresim'i asil dosyaya kopyalayalim


        try {
            FileUtils.copyFile(geciciResim,tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Verilen dosya yolu yanlis");
        }

    }

    public static void tumSayfaScreenshot(WebDriver driver,String raporIsmi) {

        // 1- olusturacagimiz resim icin dosya yolu hazirla (uzantisi jpg, jpeg, png olabilir)
        String dosyaYolu = "target/screenshots/" + raporIsmi + ".png";

        // 2- dosya yolunu kullanarak, resmi kaydedecegimiz File olusturalim
        File tumSayfaResmi = new File(dosyaYolu);

        // 3- fotografi cekmek icin TakeScreenshot objesi olusturalim
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        // 4- takesScreenshot objesini kullanarak fotografi cekip, gecici bir dosyaya kaydedelim

        File geciciResim = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // 5- geciciresim'i asil dosyaya kopyalayalim


        try {
            FileUtils.copyFile(geciciResim,tumSayfaResmi);
        } catch (IOException e) {
            System.out.println("Verilen dosya yolu yanlis");
        }

    }

    public static void webelementScreenshot(WebElement istenenElement, String raporIsmi){
        // 1- olusturacagimiz resim icin dosya yolu hazirla (uzantisi jpg, jpeg, png olabilir)
        String dosyaYolu = "target/screenshots/"+raporIsmi+".png";

        // 2- dosya yolunu kullanarak, resmi kaydedecegimiz File olusturalim
        File webelementScreenshot = new File(dosyaYolu);

        // 3- screenshot alinacak Webelementi locate edip kaydedin
        //    biz yukarda aramaSonucyaziElementi'ni olusturduk

        // 4- kaydettigimiz webElement'i kullanarak fotografi cekip,
        //    gecici bir dosyaya kaydedelim
        File geciciResim = istenenElement.getScreenshotAs(OutputType.FILE);

        // 5- geciciresim'i asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciResim,webelementScreenshot);
        } catch (IOException e) {
            System.out.println("Dosya islemlerinde sorun olustu");
        }

    }

    public static void webelementScreenshot(WebElement istenenElement){
        // rapora tarih etiketi ekleyelim
        LocalDateTime localDateTime = LocalDateTime.now(); // 2024-10-12T09-26-13-456785
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = localDateTime.format(format); // 241012092613


        // 1- olusturacagimiz resim icin dosya yolu hazirla (uzantisi jpg, jpeg, png olabilir)
        String dosyaYolu = "target/screenshots/"+tarihEtiketi+"_istenenWebelement.png";

        // 2- dosya yolunu kullanarak, resmi kaydedecegimiz File olusturalim
        File webelementScreenshot = new File(dosyaYolu);

        // 3- screenshot alinacak Webelementi locate edip kaydedin
        //    biz yukarda aramaSonucyaziElementi'ni olusturduk

        // 4- kaydettigimiz webElement'i kullanarak fotografi cekip,
        //    gecici bir dosyaya kaydedelim
        File geciciResim = istenenElement.getScreenshotAs(OutputType.FILE);

        // 5- geciciresim'i asil dosyaya kopyalayalim
        try {
            FileUtils.copyFile(geciciResim,webelementScreenshot);
        } catch (IOException e) {
            System.out.println("Dosya islemlerinde sorun olustu");
        }

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


}
