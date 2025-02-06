package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestotomasyonuPage {
    /*
        Page class'larinda locate yapabilmesi icin
        WebDriver objemizi bu class'a tanitmamiz gerekiyor

        Bu tanitma islemini yapmak icin constructor ici tercih edilmis
        bu islemin sebebi,
        Test class'larindan page class'ina ulasmak icin
        obje olusturma yontemini kullanmamizdir
        Test class'inda page class'indan obje olusturmak icin
        constructor calistiginda, constructor icine koydugumuz
        initElements() calisir ve page class'ina WebDriver objemizi tanitir

        Bir page class'i olusturdugumuzda
        ILK YAPILMASI GEREKEN ISLEM
        constructor'i gorunur hale getirip
        icerisinde initElements() method'u ile WebDriver'i tanitmak olacaktir.
     */

    public TestotomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucuElementi;

    @FindBy(xpath = "(//*[@class='prod-img'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public WebElement ilkUrunSayfasindakiIsimElementi;

    @FindBy(xpath = "(//span[.='Account'])[1]")
    public WebElement accountLinki;

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "submitlogin")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[.='Logout']")
    public WebElement logoutButonu;

    @FindBy (xpath = "//button[@class='add-to-cart']")
    public WebElement addToCartButonu;

    @FindBy (xpath = "(//span[@class='menu-icon-text'])[3]")
    public WebElement sepetimButonu;

    @FindBy (xpath = "//button[@class='remove']")
    public WebElement sepettenCikartmaButonu;

    @FindBy (xpath = "//a[@class='product-title text-center']")
    public  WebElement sepettekiUrunler;

    @FindBy (xpath = "//input[@class='input-text qty text']")
    public  WebElement sepettekiUrunAdedi;

    @FindBy (xpath = "//span[@class='w-50 cart-label-right unitprice4701']")
    public  WebElement sepetttekiUnitPrice;

    @FindBy (xpath = "//*[@class='product-price-amount mx-3 amount totalPrice4701']")
    public  WebElement sepettekiTotalPrice;

    @FindBy (xpath = "(//input[@class='form-control'])[1]")
    public  WebElement firtNameButonu;

    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public  WebElement lastNameButonu;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public  WebElement kayitOlunanEmailDegistirmeButonu;

    @FindBy (xpath = "(//input[@class='form-control'])[4]")
    public  WebElement mobilNumberButonu;

    @FindBy (xpath = "(//input[@class='form-control'])[5]")
    public  WebElement profilPicButonu;

    @FindBy (xpath = "//*[@class='submitbtn ']")
    public  WebElement uptadeButonu;

    @FindBy (xpath = "(//span[@class='item'])[5]")
    public WebElement changePasswordButonu;

    @FindBy (xpath = "(//input[@class='form-control'])[1]")
    public WebElement oldPasswordKutusu;

    @FindBy (xpath = "(//input[@class='form-control'])[2]")
    public  WebElement newPassswordKutusu;

    @FindBy (xpath = "(//input[@class='form-control'])[3]")
    public  WebElement confirmPasswordKutusu;












}
