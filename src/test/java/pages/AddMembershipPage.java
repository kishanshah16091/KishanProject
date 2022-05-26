package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddMembershipPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"sidenav\"]/li[11]/a")
    public static WebElement membershipButton;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeList;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement firstName;

    // locator for click add button to add membership
    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addMembershipButton;

    @FindBy(xpath = "//*[@id=\"membership_membership\"]")
    public WebElement membershipDD;


    @FindBy(xpath = "//*[@id=\"membership_subscriptionPaidBy\"]")
    public WebElement subscriptionPaidByDD;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionAmount\"]")
    public WebElement subscriptionAmountTextBox;

    @FindBy(xpath = "//*[@id=\"membership_currency\"]")
    public WebElement currencyDD;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionCommenceDate\"]")
    public WebElement subscriptionCommenceDate;

    @FindBy(xpath = "//*[@id=\"frmEmpMembership\"]/fieldset/ol/li[6]/img")
    public WebElement subscriptionRenewalDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement subscriptionMonth;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement subscriptionYear;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")
    public WebElement subscriptionDay;


    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement renewalMonth;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement renewalYear;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")
    public WebElement renewalDay;

    @FindBy(xpath = " //*[@id=\"btnSaveMembership\"]")
    public WebElement saveButton;

    //*[@id="btnSaveMembership"]
    public AddMembershipPage() {
        PageFactory.initElements(driver, this);
    }


}