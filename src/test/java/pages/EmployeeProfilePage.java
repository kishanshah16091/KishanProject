package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;

public class EmployeeProfilePage extends CommonMethods {

   //zufiya
   @FindBy(id = " membership_name")
    public WebElement membershipTextBox;

    @FindBy (id = "btnAddMembershipDetail")
    public WebElement addMembershipBtn;

    @FindBy (xpath = "//*[@id='sidenav']/li[11]/a")
    public WebElement sidebarMembershipsBtn;

    @FindBy(id = "membership_membership")
    public WebElement membershipDropDown;



}
////locators for adding memberships on an employee by Sorbon
//    @FindBy (xpath = "//*[@id='sidenav']/li[11]/a") public WebElement sidebarMembershipsBtn;
//    @FindBy (id = "btnAddMembershipDetail") public WebElement addMembershipBtn;
//    @FindBy(id = "membership_membership") public WebElement membershipDropDown;