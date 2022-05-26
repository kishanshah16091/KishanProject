package pages;


import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(id="empsearch_id")
    public WebElement idField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(xpath ="//ul[@id='sidenav']//a[contains(text(),'Job')]")
    public WebElement jobbtn;

    @FindBy(xpath ="//input[@id='btnSave']")
    public WebElement EditBtn;

    @FindBy(xpath ="//select[@id='job_job_title']")
    public WebElement JobTitledd;

    @FindBy(xpath ="//select[@id='job_emp_status']")
    public WebElement empstatusdd;

    @FindBy(xpath ="//select[@id='job_eeo_category']")
    public WebElement jobCategorydd;

    @FindBy(css ="input#job_joined_date")
    public WebElement calendar;

    @FindBy(xpath ="//*[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> day;

    @FindBy(xpath ="//select[@class='ui-datepicker-month']")
    public WebElement month;

    @FindBy(xpath ="//select[@class='ui-datepicker-year']")
    public WebElement year;

    @FindBy(xpath ="//select[@id='job_sub_unit']")
    public WebElement subUnit;

    @FindBy(xpath ="//select[@id='job_location']")
    public WebElement Location;

    @FindBy(xpath ="//li[9]//img[1]")
    public WebElement startDate;

    @FindBy(xpath ="//body[1]/div[1]/div[3]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/ol[1]/li[10]/img[1]")
    public WebElement endDate;

    @FindBy(xpath ="//label[normalize-space()='Replace Current']")
    public WebElement replsCurrent;

    @FindBy(id ="job_contract_file")
    public WebElement chooseFile;

    @FindBy(xpath ="//input[@id='btnSave']")
    public WebElement saveBtn;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }

}


