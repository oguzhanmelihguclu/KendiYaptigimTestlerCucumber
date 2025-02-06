package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoyalFriendCare_AdminPage {
    public LoyalFriendCare_AdminPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@class='form-control ']")
    public  WebElement createBedManagersSayfasiTitleYazmaButonu;

    @FindBy (xpath = "//span[text()='Bed managers save']")
    public  WebElement createBedManagersSayfasiSaveButonu;

    @FindBy (xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
    public  WebElement createBedManagersSayfasiBedManagersButonu;

    @FindBy (xpath = "(//span[@class='select2-selection select2-selection--single'])[2]")
    public WebElement createBedManagersSayfasiDoktorButonu;

    @FindBy (xpath = "(//span[@class='select2-selection select2-selection--single'])[3]")
    public WebElement createBedManagersSayfasiIlacButonu;

    @FindBy(xpath = "//input[@placeholder='Bed managers Price']")
    public WebElement createBedManagersSayfasiPriceKismi;

    @FindBy(xpath = "//small[@style='left: 20px; background-color: rgb(255, 255, 255); transition: left 0.2s;']")
    public  WebElement createBedManagersSayfasiAvabilityButonu;

    @FindBy(xpath = "//span[text()='Delete']")
    public  WebElement bedManagersDeleteButonu;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement rolesButonu;

    @FindBy(xpath = "//a[@href=\"https://qa.loyalfriendcare.com/Dashboard/Roles\"]")
    public WebElement rolesButonununAltindakiRolesButonu;

    @FindBy(xpath = "//a[@href=https://qa.loyalfriendcare.com/Dashboard/Roles/create]")
    public WebElement rolesButonununAltindakiCreaterRoleButonu;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement userButonu;

    @FindBy(xpath = "//a[@href=\"https://qa.loyalfriendcare.com/Dashboard/Users\"]")
    public WebElement userButonununAltindakiUsersButonu;

    @FindBy(xpath = "//a[@href=\"href=\"https://qa.loyalfriendcare.com/Dashboard/Users/create\"]")
    public WebElement usersButonununAltindakiCreaterUsersButonu;

    @FindBy(xpath = "//span[@class='thumbnail-wrapper d32 border-5  inline']")
    public WebElement backOfisAdminButonu;

    @FindBy(xpath = "//a[@class=\"clearfix bg-master-lighter dropdown-item\"]")
    public WebElement backOfisLogoutButonu;

    @FindBy(xpath = "//span[text()='Bed managers']")
    public WebElement backofisAcilirmenuBedManagers;

    @FindBy(xpath = "//a[text()='Bed managers']")
    public WebElement backofisAcilirmenuBedManagersAltMenuBedManagers;

    @FindBy(xpath = "//a[text()='Create Bed managers']")
    public WebElement backofisAcilirmenuBedManagersAltMenuCreateBedManagers;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement backofisAcilirmenuDepartments;

    @FindBy(xpath = "//a[text()='Departments']")
    public WebElement backofisAcilirmenuDepartmentsAltMenuDepartments;

    @FindBy(xpath = "//a[text()='Create Departments']")
    public WebElement backofisAcilirmenuDepartementsAltMenuCreateDepartements;

    @FindBy(xpath = "(//*[@class='form-control '])[1]")
    public WebElement backofisAcilirMenuCreateDepartmentsParentDepartment;

    @FindBy(xpath = "(//*[@class='form-control '])[2]")
    public WebElement backofisAcilirMenuCreateDepartmentsOrderDepartment;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement backofisAcilirMenuCreateDepartmentsTitleDepartment;

    @FindBy(xpath = "//*[@class='select2-selection__rendered']")
    public WebElement backofisAcilirMenuCreateDepartmentsDepartmentsColor;

    @FindBy (xpath = "//span[text()='save']")
    public WebElement backOfisAcilirMenuNewDepartmentSaveButonu;

    @FindBy(xpath = "//span[text()='Departments Store successfully.']")
    public WebElement backofisAcilirmenuDepartmentKaydiBasariliMesaji;

    @FindBy (xpath = "//*[@class='select2-search__field']")
    public WebElement backofisAcilirMenuNewDepartmentsColorAramaCubugu;

    @FindBy (xpath = "//button[@class='close']")
    public WebElement backofisAcilirMenuDepartmentBasariliKayitKapatma;

    @FindBy (xpath = "//*[@class='dataTables_info']")
    public WebElement backOfisAcilirMenuDepartsmentAltmenuDepartmantKayitSayisi;

    @FindBy(xpath = "(//*[@class='title'])[6]")
    public WebElement backOfisSolAcilirMenuDoctorBolumu;

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/Dashboard/Clients']")
    public WebElement backOfisSolAcilirMenuAltBaslikDoctors;

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/Dashboard/Clients/create']")
    public WebElement backOfisSolAcilirMenuAltBaslikCreateDostorsKutusu;

    @FindBy(xpath = "(//*[@class='title'])[7]")
    public WebElement backOfisSolAcilirMenuMediciniesBolumu;

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/Dashboard/Instagrams']")
    public WebElement backOfisSolAcilirMenuMediciniesBolumuAltmenuMedicinies;

    @FindBy(xpath = "//*[@href='https://qa.loyalfriendcare.com/Dashboard/Instagrams/create']")
    public WebElement backOfisSolAcilirMenuMediciniesBolumuAltmenuCreateMedicines;



    @FindBy(xpath = "//*[@id='Title_en']")
    public WebElement doktorAdiButonu;

    @FindBy(xpath = "//*[@id='body_en']")
    public WebElement doktorContentButonu;

    @FindBy(xpath = "//*[.='Doctors save']")
    public WebElement doktorSaveButonu;

    @FindBy(xpath = "//*[.='Doctors Store successfully.']")
    public  WebElement doktorKaydedildiYazisi;

    @FindBy(xpath = "(//*[@class='card-title'])[1] ")
    public WebElement createYourMedicinesYazisi;

    @FindBy(xpath = "(//*[@class=\"form-control \"])[1]")
    public WebElement MedicinesTitleYazisi;

    @FindBy(xpath = "(//*[@class=\"form-control \"])[2]")
    public WebElement MedicinesContentYazisi;

    @FindBy(xpath = "//*[@class='btn btn-success btn-cons btn-animated from-left fa fa-save pull-right']")
    public WebElement MedicinesEklemeSaveMedicinesButonu;

    @FindBy(xpath = "//*[@rel=\"next\"]")
    public WebElement nextButonu;

    @FindBy(xpath = "//*[@class='v-align-middle semi-bold']")
    public WebElement ilacListesi;


    @FindBy(xpath = "//span[@class='bg-primary icon-thumbnail']")
    public WebElement ruyaBackofficeKucukKareYazi;

    @FindBy(xpath = "//a[text()='Create Role']")
    public WebElement ruyaBackofficeCreateRoleButonu;

    @FindBy(xpath = "//*[@class='form-control '][1]")
    public WebElement ruyaBackofficeCreateRoleFormNameKutusu;

    @FindBy(xpath = "(//*[@class='form-control '])[2]")
    public WebElement ruyaBackofficeCreateRoleFormDisplayNameKutusu;

    @FindBy(xpath = "//span[text()='save']")
    public WebElement ruyaBackofficeCreateRoleFormSaveButonu;

    @FindBy(xpath = "//span[text()='Role Store successfully.']")
    public WebElement ruyaBackofficeCreateRoleFormBasariliKayitAlerti;

    @FindBy(xpath = "//button[@class='profile-dropdown-toggle']")
    public WebElement ruyaBackofficeCikisiIcinPersonalSimgesi;

    @FindBy (xpath = "//button[@class='close']")
    public WebElement ruyabackofisAcilirMenuDepartmentBasariliKayitKapatma;

@FindBy(xpath = "(//a[@href='https://qa.loyalfriendcare.com/en/Dashboard/Roles?page=2'])[1]")
    public WebElement ruyabackofficeListeOldugunaNextButonu;

@FindBy(xpath = "//button[@class='close']")
    public WebElement ruyabackofficeAlertKapama;

    @FindBy (xpath = "//div[@class='sidebar-header']")
    public WebElement backofisAcilirMenuSiyahUstKisim;

    @FindBy(xpath = "//*[@*='https://qa.loyalfriendcare.com/images/677697d6b2afeuser@2x.png']")
    public WebElement backofisProfilIkonu;

    @FindBy (xpath = "//div[@contenteditable='true']")
    public WebElement backofisCreateBedManagersYaziYazmaYeri;

    @FindBy (xpath = "//span[text()='Tracks Store successfully.']")
    public WebElement createBedManagersOlusturduktanSonraGelenBasariliMesaji;

    @FindBy (xpath = "//input[@class='form-control pull-right']")
    public  WebElement backofisCreateBedManagersAramaKutusu;


    @FindBy(xpath = "(//div[@class='card-title'])[1]")
    public WebElement backOfisCreateYourDoctorsYazisi;







    @FindBy (xpath = "//*[@class='alert alert-success']")
    public WebElement medicinesSuccesfullyYazisi;


    @FindBy(xpath = "//a[.='Doctors']")
    public WebElement backofisSolAcilirMenuDoktorAltBaslikDoktorButonu;



















}
