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

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[1]")
    public  WebElement bodyDahaFazlaOgreninButonu;

    @FindBy (xpath = "//h1[@class='gyan-title-heading']")
    public  WebElement bodyYazilimKurslariBasligi;

    @FindBy (xpath = "(//div[@class='gyan-title-desc'])[1]")
    public  WebElement bodyYazilimKurslariIcerigi;

    @FindBy (xpath = "//div[@class='gyan-title-subtitle']")
    public  WebElement bodyBootCampNedirBasligi;

    @FindBy (xpath = "(//div[@class='gyan-title-desc'])[2]")
    public  WebElement bodyBootcampNedirIcerigi;

    @FindBy (xpath = "(//div[@class='elementor-widget-container'])[9]")
    public  WebElement bootCampNedirResimleri;

    @FindBy (xpath = "(//div[@class='elementor-widget-wrap elementor-element-populated'])[7]")
    public  WebElement YeniliklerdenHaberdarOlunMenüsü;

    @FindBy (xpath = "//input[@type='email']")
    public  WebElement yeniliklerdenHaberdarOlunEmailBölümü;

    @FindBy (xpath = "//button[@type='submit']")
    public  WebElement yeniliklerdenHaberdarOlunButonu;

    @FindBy (xpath = "//p[@class='gyan-subs-error']")
    public  WebElement yeniliklerdenHaberdarOlunGeriBildirim;

    @FindBy (xpath = "(//img[@loading='lazy'])[5]")
    public  WebElement GelecekParmaklarinizUcundaVideosuPlayTusu;

    @FindBy (xpath = "//iframe[@class='mfp-iframe']")
    public  WebElement GelecekParmaklarinizUucundaIframe;

    @FindBy (xpath = "//button[@class='mfp-close']")
    public  WebElement videoyuKapatmaButonu;

    @FindBy (xpath = "//button[@  aria-label='Oynat']")
    public  WebElement GelecekParmaklarinizUucundaIframePlayTusu ;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[2]")
    public  WebElement yazilimTestUzmanıDahaFazlaOkuLinki;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[3]")
    public  WebElement siberGüvenlikUzmanıDahaFazlaOkuLinki;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[4]")
    public  WebElement frontEndDahaFazlaOkuLinki;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[5]")
    public  WebElement salesForceDahaFazlaOkuLinki;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[6]")
    public  WebElement ucretsizKurslarDahaFazlaOkuLinki;

    @FindBy (xpath = "(//span[@class='elementor-button-text'])[7]")
    public  WebElement amazonDahaFazlaOkuLinki;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[3]")
    public  WebElement bodyKurslarimizBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[4]")
    public  WebElement kurslarimizYazilimTestUzmanıBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[5]")
    public  WebElement kurslarimizSiberGüvenlikBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[6]")
    public  WebElement kurslarimizFrontEndBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[7]")
    public  WebElement kurslarimizSalesForceBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[8]")
    public  WebElement kurslarimizUcretsizKurslarBasligi;

    @FindBy (xpath = "(//h2[@class='gyan-title-heading'])[9]")
    public  WebElement kurslarimizAmazonEticaretBasligi;

    @FindBy (xpath = "//h2[text()='Çocuklar İçin Kurslarımız']")
    public  WebElement cocuklarIcınKurslarimizBasligi;

    @FindBy (xpath = "//a[text()='Scratch İle Programlama ']")
    public  WebElement scratchIleProgramlamaBasligi;

    @FindBy (xpath = "(//span[text()='Daha fazla bilgi edin'])[1]")
    public  WebElement dahaFazlaBilgiEdininLinki;

    @FindBy (xpath = "//h2[text()='Öğrenci Yorumları']")
    public  WebElement bodyOgrenciYorumlariBasligi;

    @FindBy (xpath = "//h2[text()='Başarı Hikayeleri']")
    public  WebElement basarıHikayeleriBasligi;

    @FindBy (tagName = "(//iframe)[3]")
    public  WebElement salesforceVideosuIframe;

    @FindBy (xpath = "//button[@title='Oynat']")
    public  WebElement salesforceVideosuPlayTusu;




;



























}
