package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static utils.CommonMethods.driver;

public class AdminAddLicensePage {

    @FindBy(xpath = "//*[@id = 'menu_pim_viewPimModule']")
    public WebElement pimOption;

    @FindBy(xpath = "//*[@id = 'menu_pim_viewEmployeeList']")
    public WebElement employeeList;

    @FindBy(xpath = "//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
    public WebElement firstUser;

    @FindBy ( xpath = "//*[@id='sidenav']/li[10]/a")
    public WebElement qualificationOption;

    @FindBy (xpath = "//*[@id='addLicense']")
    public WebElement addLicenceButton;

    @FindBy (xpath = "//*[@id='license_code']")
    public WebElement licenseType;

    @FindBy (xpath = "//*[@id='license_license_no']")
    public WebElement licenseNumber;

    @FindBy (xpath = "//*[@id = 'license_date']")
    public WebElement issueDate;
    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[1]")
    public WebElement calendarMonth;

    @FindBy (xpath = "//*[@id='ui-datepicker-div']/div/div/select[2]")
    public WebElement calendarYear;


    @FindBy (xpath = "//*[@id='license_renewal_date']")
    public WebElement expiryDate;

    @FindBy (xpath = "//*[@id='btnLicenseSave']")
    public WebElement saveButton;

    @FindBy(xpath = " //*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")
    public List<WebElement> calendarDays;



    public AdminAddLicensePage(){
        PageFactory.initElements(driver, this);
    }
}
