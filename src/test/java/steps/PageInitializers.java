package steps;
import pages.AdminAddEmpSkillsPage;
import pages.AddNewLanguagesPage;
import pages.*;
import pages.AddWorkExperiencePage;
import pages.DashboardPage;
import pages.ContactDetailsPage;
import pages.EmergencyContactPage;

import pages.EmployeeSearchPage;
import pages.EmployeeTerminationPage;
import pages.LoginPage;
import pages.QualificationsPage;
import pages.AddDependentsPage;

public class PageInitializers {

    public static AddWorkExperiencePage workExperiencePage;
    public static LoginPage login;
    public static QualificationsPage qualificationsPage;
    public static DashboardPage dash;
    public static AdminAddEmpSkillsPage adminAddEmpSkillsPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddMembershipPage addmembershipPage;
    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactPage emergencyContactPage;
    public static AddDependentsPage addDependents;
    public static AddNewLanguagesPage addNewLanguagesPage;
    public static EmployeeTerminationPage employeeTerminationPage;

    public static void intializePageObjects() {

        employeeTerminationPage = new EmployeeTerminationPage();
        dash = new DashboardPage();
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addmembershipPage = new AddMembershipPage();
      //  employeeProfilePage = new EmployeeProfilePage;
        adminAddEmpSkillsPage = new AdminAddEmpSkillsPage();
        qualificationsPage=new QualificationsPage();
        addNewLanguagesPage=new AddNewLanguagesPage();
        contactDetailsPage = new ContactDetailsPage();
        emergencyContactPage = new EmergencyContactPage();
        workExperiencePage = new AddWorkExperiencePage();
        addDependents = new AddDependentsPage();
        qualificationsPage = new QualificationsPage();

    }
}