package steps;


import pages.QualificationsPage;
import pages.AdminAddLicensePage;
import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage login;
    public static DashboardPage dash;
    public static QualificationsPage qualificationsPage;
    public static AdminAddLicensePage adminAddLicense;

    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        qualificationsPage = new QualificationsPage();
        adminAddLicense = new AdminAddLicensePage();

    }
}
