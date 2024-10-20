package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestotomasyonuPage {
    /*
        Bir page class'i ilk defa olusturuldugunda
        ilk yapilmasi gereken sey
        kullanilan WebDriver'i bu class'a tanitmaktir.

        WebDriver'i class'a tanitmak icin
        constructor'i gorunur hale getirip
        icerisinde initElements() kullanilir
     */

    public TestotomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucuYaziElementi;

    @FindBy(xpath = "(//*[@class='prod-img'])")
    public List<WebElement> bulunanUrunElementleriList;

    @FindBy(xpath = "//*[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;

    @FindBy(xpath = "(//span[text()='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(xpath = "//a[text()=' Sign Up']")
    public WebElement signUpLinki;

    @FindBy(id = "firstName")
    public WebElement signUpFormuFirstnameKutusu;

    @FindBy(id = "btn-submit-form")
    public WebElement signUpFormuSignUpButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginSayfasiPasswordKutusu;

    @FindBy(xpath = "//button[@id='submitlogin']")
    public WebElement loginSayfasiSignInButonu;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logoutLinki;

}
