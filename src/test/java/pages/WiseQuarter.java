package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WiseQuarter {
    public WiseQuarter() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[text()='Ana Sayfa'])[1]")
    public WebElement headerAnaSayfaButonu;

    @FindBy(xpath = "(//span[text()='Hakkımızda'])[1]")
    public WebElement headerHakkimizdaButonu;

    @FindBy(xpath = "(//span[text()='Etkinliklerimiz'])[1]")
    public WebElement headerEtkinliklerimizButonu;

    @FindBy (xpath = "(//span[text()='Kurslarımız'])[1]")
    public WebElement headerKurslarimizButonu;

    @FindBy (xpath = "(//span[text()='Blog'])[1]")
    public WebElement headerBlogButonu;

    @FindBy (xpath = "(//span[text()='İletişim'])[1]")
    public WebElement headerIletisimButonu;

    @FindBy (xpath = "(//span[text()='Kayıt Ol'])[1]")
    public WebElement headerKayitOlButonu;

    @FindBy (xpath = "(//span[text()='LMS'])[1]")
    public WebElement headerLMSbutonu;

    @FindBy (xpath = "//img[@class='swm-std-logo']")
    public  WebElement headerWiseQuarterResmi;

    @FindBy (xpath = "(//i[@class='fab fa-twitter'])[1]")
    public  WebElement headerTwitterIkonu;

    @FindBy (xpath = "(//i[@class='fab fa-facebook-f'])[1]")
    public  WebElement headerFacebookIkonu;

    @FindBy (xpath = "(//i[@class='fab fa-linkedin-in'])[1]")
    public  WebElement headerLinkedInIkonu;

    @FindBy (xpath = "(//i[@class='fab fa-instagram'])[1]")
    public WebElement headerInstagramIkonu;

    @FindBy (xpath = "(//i[@class='fab fa-youtube'])[1]")
    public WebElement headerYouTubeIkonu;

    @FindBy (xpath = "//iframe[@class='form-home']")
    public WebElement formMenüsüIframeElementi;

    @FindBy (xpath = "//em[text()='  Formu Doldur Kariyerini Değiştir']")
    public WebElement bodyFormYazisi;

    @FindBy (xpath = "(//input[@name='Name'])[1]")
    public  WebElement formIsımButonu;

    @FindBy (xpath = "(//input[@name='Name'])[2]")
    public  WebElement formSoyadButonu;

    @FindBy (xpath = "//input[@id='Email-arialabel']")
    public  WebElement formEmailButonu;

    @FindBy (xpath = "//input[@name='PhoneNumber']")
    public  WebElement formTelefonButonu;

    @FindBy (xpath = "(//button[@value='submit'])[1]")
    public WebElement formGönderButonu;

    @FindBy (xpath = "//p[@id='error-Name']")
    public  WebElement isimYazmamaHataYazisi;

    @FindBy (xpath = "//p[@id='error-Email']")
    public  WebElement emailYazmamaHataYazisi;

    @FindBy (xpath = "//p[@id='error-PhoneNumber']")
    public  WebElement telefonYazmamaHataYazisi;

    @FindBy (xpath = "//span[@class='alignCenter infoCont thankyouMsgText']")
    public  WebElement formSayfasiKayitOlusturulduMesaji;








}
