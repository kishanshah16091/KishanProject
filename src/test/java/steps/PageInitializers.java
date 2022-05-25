package steps;


import pages.DashboardPage;
import pages.ContactDetailsPage;
import pages.EmergencyContactPage;
import pages.LoginPage;

public class PageInitializers {
    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;
    public static ContactDetailsPage contactDetailsPage;
    public static EmergencyContactPage emergencyContactPage;
    public static DashboardPage dash;

    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        contactDetailsPage = new ContactDetailsPage();
        emergencyContactPage=new EmergencyContactPage();

    }
}
