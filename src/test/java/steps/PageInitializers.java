package steps;


import pages.AddWorkExperiencePage;
import pages.DashboardPage;
import pages.ContactDetailsPage;
import pages.EmergencyContactPage;
import pages.LoginPage;
import pages.QualificationsPage;
import pages.AddDependentsPage;

public class PageInitializers {

    public static AddWorkExperiencePage workExperiencePage;
    public static LoginPage login;

    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactPage emergencyContactPage;

    public static AddDependentsPage addDependents; //Imran


    public static DashboardPage dash;
    public static QualificationsPage qualificationsPage;// Zulfiya


    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        contactDetailsPage = new ContactDetailsPage();
        emergencyContactPage=new EmergencyContactPage();
        workExperiencePage = new AddWorkExperiencePage();
        addDependents=new AddDependentsPage();
        qualificationsPage =new QualificationsPage();
    }
}