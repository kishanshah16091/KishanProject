package steps;


import pages.AdminAddEmpSkillsPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.QualificationsPage;

public class PageInitializers {
    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;

    public static QualificationsPage qualificationsPage;
    //public static EmployeeSearchPage employeeSearchPage;
    //public static AddEmployeePage addEmployeePage;

    public static DashboardPage dash;

    public static AdminAddEmpSkillsPage adminAddEmpSkillsPage;


    public static void intializePageObjects() {
        login = new LoginPage();
        /*
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();

         */
        dash = new DashboardPage();

        qualificationsPage =new QualificationsPage();

        adminAddEmpSkillsPage = new AdminAddEmpSkillsPage();


    }
}
