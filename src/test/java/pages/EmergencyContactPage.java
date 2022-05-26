package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmergencyContactPage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;



    @FindBy(id="empsearch_id")
    public WebElement idField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(id="ohrmList_chkSelectRecord_33655")
    public WebElement click;

    @FindBy(xpath = "//a[normalize-space()='7908464']")
    public WebElement SearchedEmp;

    @FindBy(xpath = "//a[normalize-space()='Emergency Contacts']")
    public WebElement emergencyContact;

    @FindBy(xpath = "//input[@id='btnAddContact']")
    public WebElement addBtn;

   @FindBy(xpath = "//input[@id='emgcontacts_name']")
   public WebElement Name;

   @FindBy(xpath = "//input[@id='emgcontacts_relationship']")
    public WebElement relationship;

   @FindBy(xpath = "//input[@id='emgcontacts_homePhone']")
    public WebElement homePhone;

   @FindBy(xpath ="//input[@id='emgcontacts_mobilePhone']" )
    public WebElement mobile;

   @FindBy(xpath = "//input[@id='emgcontacts_workPhone']")
    public WebElement workPhone;

   @FindBy(xpath = "//input[@id='btnSaveEContact']")
    public WebElement saveButton;

    public EmergencyContactPage() {
        PageFactory.initElements(driver, this);
    }

}
