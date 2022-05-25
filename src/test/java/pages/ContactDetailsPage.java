package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {
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

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement editBtn;


    @FindBy(xpath = "//a[normalize-space()='Contact Details']")
    public  WebElement contactDetails;

    @FindBy(xpath ="//input[@id='contact_street1']")
    public WebElement street1;

    @FindBy(xpath= "//input[@id='contact_street2']")
    public WebElement street2;

    @FindBy(xpath = "//input[@id='contact_city']")
    public WebElement cityValue;

    @FindBy(id = "contact_state")
    public WebElement stateValue;

    @FindBy(xpath = "//input[@id='contact_emp_zipcode']")
    public WebElement zipValue;

    @FindBy(xpath="//select[@id='contact_country']")
    public WebElement country;

    @FindBy(xpath=" //input[@id='contact_emp_hm_telephone']")
    public WebElement homePhone;

    @FindBy(xpath ="//input[@id='contact_emp_mobile']")
    public WebElement mobile;

    @FindBy(xpath = "//input[@id='contact_emp_work_telephone']")
    public WebElement workPhone;

    @FindBy(xpath = "//input[@id='contact_emp_work_email']")
    public WebElement workEmail;

    @FindBy(xpath ="//input[@id='contact_emp_oth_email']" )
    public WebElement email;

 @FindBy(xpath ="//input[@id='btnSave']")
 public WebElement saveButton;




    public ContactDetailsPage() {
        PageFactory.initElements(driver, this);





    }
}
