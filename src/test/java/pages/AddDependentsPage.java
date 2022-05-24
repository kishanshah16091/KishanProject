package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddDependentsPage extends CommonMethods {

    @FindBy(xpath ="//*[@id=\"sidenav\"]/li[4]/a")
    public WebElement DsideBar;

    @FindBy(id="btnAddDependent")
    public WebElement addDependentBtn;

    @FindBy(id="dependent_name")
    public WebElement dependentName;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeList;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement firstName;

    @FindBy(id="dependent_relationshipType")
    public WebElement relationship;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement BMonth;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement Byear;

    @FindBy(xpath = "//*[@id=\"dependent_dateOfBirth\"]") //
    public WebElement BDate;

    @FindBy(id="btnSaveDependent")
    public WebElement SaveBtnDpdnt;

    public AddDependentsPage(){
        PageFactory.initElements(driver,this);
    }

}

