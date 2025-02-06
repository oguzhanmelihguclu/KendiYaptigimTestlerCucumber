package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoyalFriendCare_HomePage {

    public LoyalFriendCare_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@alt='LoyalFriendCare'])[1]")
    public WebElement footerLoyalFriendsCareLinki;

    @FindBy(xpath = "//div[@id='collapse_ft_1']")
    public WebElement footerLoyalFriendsCareSirketBilgisi;

    @FindBy(xpath = "//h3[text()=' Departments ']")
    public WebElement footerDepartmentsYazisi;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/wellness\"])[3]")
    public WebElement footerWellnessLinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/dental-care\"])[3]")
    public WebElement footerDentalCareLinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/anaesthesia\"])[3]")
    public WebElement footerAnaesthesiaLinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/dermatology\"])[3]")
    public WebElement footerDermatologyLinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/diagnostics\"])[3]")
    public WebElement footerDiagnosticsLinki;

    @FindBy(xpath = "(//a[@href=\"https://qa.loyalfriendcare.com/Departments/wellness\"])[4]")
    public WebElement DepartmensIcindekiWellnessLinki;

    @FindBy(xpath = "//h5[text()='Appointment Booking']")
    public WebElement randevuBaslikYazisi;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement randevuMenusuTarihButonu;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement randevuMenusuTelefonButonu;

    @FindBy(xpath = "(//div[@class='nice-select wide'])[1]")
    public WebElement randevuMenusuDepartmanButonu;

    @FindBy(xpath = "(//div[@class='nice-select wide'])[2]")
    public WebElement randevuMenusuDoktorButonu;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement randevuMenusuMesajYazKismi;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement randevuMenusuRandevuAlButonu;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement randevuMenusuOnayMesaji;

    @FindBy(xpath = "//h3[text()='Follow Us']")
    public WebElement footerFollowUsYazisi;

    @FindBy(xpath = "//i[@class=\"fab fa-facebook-square\"]")
    public WebElement footerFacebookIkonu;

    @FindBy(xpath = "//i[@class=\"fab fa-twitter-square\"]")
    public WebElement footerTwiterIkonu;

    @FindBy(xpath = "//i[@class=\"fab fa-youtube-square\"]")
    public WebElement footerYoutubeIkonu;

    @FindBy(xpath = "//i[@class=\"fab fa-instagram\"]")
    public WebElement footerInstagramIkonu;

    @FindBy(xpath = "//li[text()=\" 7634 S Reed Ave, Reedley, CA 93654\"]")
    public WebElement footerAdresYazisi;

    @FindBy(xpath = "//li[text()=\" /li[text()=\" +15596938754\"]\"]")
    public WebElement footerTelefonNumarasiYazisi;

    @FindBy(xpath = "//a[text()=\"info@loyalfriendcare.com\"]")
    public WebElement footerMailAdresiYazisi;

    @FindBy(xpath = "(//a[@class='btn_add'])[2]")
    public WebElement headerSignUpButonu;

    @FindBy(xpath = "(//input[@class='form-control'])")
    public WebElement headerAramaKutusu;

    @FindBy(xpath = "//p[text()='Profession: Veterinarian ']")
    public WebElement doctorsLinkindenSonrakiDrAlejandroBilgileri;

    @FindBy(xpath = "//p[text()='Profession: Veterinarian ']")
    public WebElement doctorsLinkindenSonrakiDrMarcusBilgileri;

    @FindBy(tagName = "(//p)[1]")
    public WebElement medicinesLinkindenSonrakiRimadylIlacBilgisi;

    @FindBy(tagName = "(//p)[1]")
    public WebElement medicinesLinkindenSonrakiRevolutionIlacBilgileri;

    @FindBy(tagName = "(//p)[1]")
    public WebElement vaccinationsLinkindenSonrakiRabiesVaccineBilgileri;

    @FindBy(tagName = "(//p)[1]")
    public WebElement vaccinationsLinkindenSonrakiDhppVaccineBilgileri;

    @FindBy(xpath = "//*[@alt='Wellness']")
    public WebElement bodysayfasiWellnesDepartmani;

    @FindBy(xpath = "//*[@alt='Dental Care']")
    public WebElement bodysayfasiDentalCareDepartmani;

    @FindBy(xpath = "//*[@alt='Anaesthesia']")
    public WebElement bodysayfasiAnastasiaDepartmani;

    @FindBy(xpath = "//*[@alt='Dermatology']")
    public WebElement bodysayfasiDermatologyDepartmani;

    @FindBy(xpath = "//*[@alt='Diagnostics']")
    public WebElement bodysayfasiDiagnosticDepartmani;

    @FindBy(xpath = "//*[@alt='Vaccinations']")
    public WebElement bodysayfasiVaccinationsDepartmani;

    @FindBy(xpath = "//*[@alt='Pain Control']")
    public WebElement bodysayfasiPainControlDepartmani;

    @FindBy(xpath = "//*[@alt='Boarding']")
    public WebElement bodysayfasiBoardingDepartmani;

    @FindBy(xpath = "//*[text()='Departments'][2]")
    public WebElement bodysayfasiDepartmentsYazisi;

    @FindBy(xpath = "//*[text()='Your Pets Nutritional Health is Very Important & Our Priority']")
    public WebElement bodysayfasiDepartmensbaslikyazisi;

    @FindBy(xpath = "//*[text()='Popular Doctors']")
    public WebElement bodysayfasiPopulerDoctosYazisi;

    @FindBy(xpath = "(//*[text()='Doctors'])[3]")
    public WebElement bodysayfasikucukDoctorsYazisi;

    @FindBy(xpath = "//*[text()='Meet With Professional Doctor.']")
    public WebElement bodysayfasiDoctorsMeetWeetYazisi;

    @FindBy(xpath = "//*[@alt='Dr. Alejandro Martinez']")
    public WebElement bodysayfasidoktorAlejandro;

    @FindBy(xpath = "//*[@alt='Dr. Olivia Bennett']")
    public WebElement bodysayfasidoktorOlivia;

    @FindBy(xpath = "//*[@alt='Dr. Emily Chang']")
    public WebElement bodysayfasidoktorEmily;

    @FindBy(xpath = "///*[@alt='Dr. Nathan Patel']")
    public WebElement bodysayfasidoktorNathan;

    @FindBy(xpath = "//*[@alt='Dr. Isabella Wong']")
    public WebElement bodysayfasidoktorIsabella;

    @FindBy(xpath = "//*[@alt='Dr. Sophia Kim']")
    public WebElement bodysayfasidoktorSophia;

    @FindBy(xpath = "//*[text()='Your Pets Health is Very Important & Our Priority']")
    public WebElement bodysayfasiAsiyazisi;

    @FindBy(xpath = "//*[text()='Vaccinations for Pets']")
    public WebElement bodysayfasiAsiBasligi;

    @FindBy(xpath = "//*[@falt=\"Surgical Procedure: Spaying (Ovariohysterectomy)]")
    public WebElement bodysayfasiSurgicalAsisi;

    @FindBy(xpath = "//*[@alt=\"Bordetella (Kennel Cough) Vaccine\"]")
    public WebElement bodysayfasiBordotellaAsisi;

    @FindBy(xpath = "//*[@alt='Rabies Vaccine']")
    public WebElement bodysayfasiRabiesAsisi;

    @FindBy(xpath = "//*[@alt='DHPP Vaccine (Distemper, Hepatitis, Parainfluenza, Parvovirus Vaccine):']")
    public WebElement bodysayfasiDHPPAsisi;

    @FindBy(xpath = "//*[@alt='Feline Leukemia Vaccine']")
    public WebElement bodysayfasiFelineAsisi;

    @FindBy(xpath = "//*[@alt='Feline Immunodeficiency Virus (FIV) Vaccine']")
    public WebElement bodysayfasiFelineVirusAsisi;

    @FindBy(xpath = "//*[@alt=\"Feline Panleukopenia Vaccine\"]")
    public WebElement bodysayfasiFelinePanAsisi;

    @FindBy(xpath = "//*[@alt=\"Feline Herpesvirus Vaccine\"]")
    public WebElement bodysayfasiFelineHerpeAsisi;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement girisFormundaBulunanGirisFormEmailKutusu;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement girisFormundaBulunanGirisFormPasswordKutusu;

    @FindBy(xpath = "//*[@for='checkbox1']")
    public WebElement girisFormuRememberButonu;

    @FindBy(xpath = "//*[@class=\"text-info small\"]")
    public WebElement girisFormuForgotPaswordButonu;

    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-cons m-t-10\"]")
    public WebElement girisFormundaBulunanSignInButonu;

    @FindBy(xpath = "//input[@placeholder='User Name']")
    public WebElement kayitFormundakiUserNameKutusu;

    @FindBy(xpath = "//input[@placeholder='E-Mail Address']")
    public WebElement kayitFormundakiEmailKutusu;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement kayitFormundakiPaswordKutusu;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement kayitFormundakiConfirmPaswordKutusu;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement kayitFormundakiSignInButonu;

    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement headerHomeButonu;

    @FindBy(xpath = "(//a[text()='Departments '])[1]")
    public WebElement headerDepartmentsButonu;

    @FindBy(xpath = "(//a[text()='Medicines'])[1]")
    public WebElement headerMedicinesButonu;

    @FindBy(xpath = "(//a[@class='btn_add'])[1]")
    public WebElement headerSignInButonu;

    @FindBy(xpath = "//*[@value='Search']")
    public WebElement headerSearchButonu;

    @FindBy(xpath = "(//a[@class='btn_add'])[2]")
    public WebElement headerSignoutButonu;

    @FindBy(xpath = "(//a[@class='btn_add'])[1]")
    public WebElement headerBackOfisIsimButonu;

    @FindBy(xpath = "(//a[@href='https://qa.loyalfriendcare.com/Doctors'])[3]")
    public WebElement headersDoctors;

    @FindBy(xpath = "(//a[@href='https://qa.loyalfriendcare.com/Departments'])[3]")
    public WebElement headersDepartments;

    @FindBy(xpath = "(//a[@href='https://qa.loyalfriendcare.com/Medicines'])[2]")
    public WebElement headersMedicines;

    @FindBy(xpath = "(//a[@href='https://qa.loyalfriendcare.com/Pets'])[3]")
    public WebElement headersVaccinations;

    @FindBy(xpath = "(//*[@class='strip grid'])[1]")
    public WebElement departmentsIcindekiWellness;

    @FindBy(xpath = "(//*[@class='strip grid'])[2]")
    public WebElement departmensicindekiDentalCare;

    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement headersDoctorsBirincidoktor;

    @FindBy(xpath = "(//*[@class='strip grid'])[2]")
    public WebElement headersDoctorsIkincidoktor;

    @FindBy(xpath = "(//*[@class='strip grid'])[1]")
    public WebElement medicinesBirinciIlac;

    @FindBy(xpath = "(//*[@class='strip grid'])[2]")
    public WebElement medicinesIkinciIlac;

    @FindBy(xpath = "(//*[@class='strip grid'])[1]")
    public WebElement vaccinationsBirinciIlac;

    @FindBy(xpath = "(//*[@class='strip grid'])[2]")
    public WebElement vaccinationsIkinciIlac;

    @FindBy(xpath = "//*[@alt='logo']")
    public WebElement loginLoyalFriendYazisi;

    @FindBy(xpath = "(//*[@class='current'])[3]")
    public WebElement ahmetRandevuMenusuDoktorButonu;

    @FindBy(xpath = "//*[@placeholder='Create Message']")
    public WebElement ahmetRandevuMenusuMesajYazKismi;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement ahmetRandevuMenusuOnayMesaji;

    @FindBy(xpath = "//*[@value='Appointment Booking']")
    public WebElement ahmetRandevuMenusuRandevuAlButonu;

    @FindBy(xpath = "//span[@role='alert']")
    public WebElement girisFormundaHataliGirisYaptinizMesaji;

    @FindBy(id ="filters_col_bt" )
    public WebElement departmentsSayfasiDepartmentsYazisi;


    @FindBy(xpath = " //*[.='Dental Care']")
    public WebElement headerDentalCareDepartmanSecim;

    @FindBy(xpath = "(//*[.=' Dental Care'])[1]")
    public WebElement departmentsSayfaDentalCareDepartmanYazisi;

    @FindBy(xpath = "//*[.='Wellness']")
    public WebElement headerWellnessDepartmanSecim;

    @FindBy(xpath = "//li[text()='Dental Care']")
    public WebElement dropDownDentalCareDepartman;

    @FindBy(xpath = "//li[.='Dr. Emily Chang']")
    public WebElement dropDownMenuDrEmilyChang;

    @FindBy(id = "filters_col_bt")
    public WebElement departmentsSayfasiListeDepartmentsBasligi;

    @FindBy(xpath = "//div[@id='filters_col']")
    public WebElement departmentsListesi;

    @FindBy(xpath = "//a[.='Pain Control']")
    public WebElement departmentListesiPainControlDepartment;

    @FindBy(xpath = "(//*[.=' Pain Control'])[1]")
    public WebElement painControlDepartmentsYazisi;



    @FindBy(xpath = "(//*[@class='img-fluid'])[1]")
    public WebElement ahmetheadersDoctorsBirincidoktor;

    @FindBy(xpath = " //*[text()=' Medicines']")
    public WebElement medicineskismibaslik;

    @FindBy(xpath = "(//*[@class='current'])[2]")
    public WebElement ahmetdoktorRandevukismi;

    @FindBy(xpath = "(//*[@class='nice-select wide'])[1]")
    public WebElement ahmetRandevudepartmentkismi;

    @FindBy(xpath = "(//*[text()='Wellness'])[2]")
    public WebElement ahmetrandevukismidepartment;

    @FindBy(xpath = "//li[text()='Wellness']")
    public WebElement ahmetrandevukismidepartmenaltalanlarwelness;



    @FindBy (xpath = "(//div[@class='wrapper'])[7]")
    public WebElement headersDepartmanPainKontrol;

    @FindBy (xpath = "(//div[@class='wrapper'])[8]")
    public WebElement headersDepartmanBoarding;

    @FindBy(xpath = "//option[text()='Wellness']")
    public WebElement randevuMenusuWellnessOpsiyonu;

    @FindBy (xpath = "//li[text()='Dr. Alejandro Martinez']")
    public WebElement randevuMenusuDrAlejandroOpsiyonu;



}


