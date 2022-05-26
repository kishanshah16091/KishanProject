package steps;

import pages.AddLicenseQualificationsPage;
import pages.AdminAddLicensePage;
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

    public static LoginPage login;
    public static DashboardPage dash;
    public static AddLicenseQualificationsPage addLicenseQualificationsPage;
    public static AdminAddLicensePage adminAddLicense;
    public static AddWorkExperiencePage workExperiencePage;
    public static AdminAddEmpSkillsPage adminAddEmpSkillsPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddMembershipPage addmembershipPage;
    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactPage emergencyContactPage;
    public static AddDependentsPage addDependents;
    public static AddNewLanguagesPage addNewLanguagesPage;
    public static EmployeeTerminationPage employeeTerminationPage;
    public static QualificationsPage  qualificationsPage;



    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        addLicenseQualificationsPage = new AddLicenseQualificationsPage();
        adminAddLicense = new AdminAddLicensePage();
        employeeTerminationPage = new EmployeeTerminationPage();
        employeeSearchPage = new EmployeeSearchPage();
        addmembershipPage = new AddMembershipPage();
        adminAddEmpSkillsPage = new AdminAddEmpSkillsPage();
        addNewLanguagesPage = new AddNewLanguagesPage();
        contactDetailsPage = new ContactDetailsPage();
        emergencyContactPage = new EmergencyContactPage();
        workExperiencePage = new AddWorkExperiencePage();
        addDependents = new AddDependentsPage();
        qualificationsPage = new QualificationsPage();


    }
}