package steps;


import org.openqa.selenium.interactions.Actions;
import pages.AddNewLanguagesPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.QualificationsPage;

import javax.swing.*;

import static utils.CommonMethods.driver;

public class PageInitializers {
    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;
   /* public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;

    */
    public static DashboardPage dash;
    public static QualificationsPage qualificationsPage;
    public static Actions actions;
    public static AddNewLanguagesPage addNewLanguagesPage;

    public static void intializePageObjects() {
        login = new LoginPage();
        /*
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();

         */
        dash = new DashboardPage();
        qualificationsPage=new QualificationsPage();
        actions=new Actions(driver);
        addNewLanguagesPage=new AddNewLanguagesPage();

    }
}
