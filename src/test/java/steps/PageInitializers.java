package steps;


import pages.AddWorkExperiencePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.QualificationsPage;

public class PageInitializers {

    public static AddWorkExperiencePage workExperiencePage;

    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;
   /* public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    */
    public static DashboardPage dash;
    public static QualificationsPage qualificationsPage;// Zulfiya
   // public static EmployeeProfilePage employeeProfilePage; //Zulfiya


    public static void intializePageObjects() {
        workExperiencePage = new AddWorkExperiencePage();

        login = new LoginPage();
        /*
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();

         */
        dash = new DashboardPage();
      //  employeeProfilePage = new EmployeeProfilePage;
        qualificationsPage =new QualificationsPage(); // Zulfiya

    }
}