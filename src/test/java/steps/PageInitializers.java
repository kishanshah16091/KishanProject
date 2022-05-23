package steps;


import pages.AddLicensesPage;
import pages.AdminAddLicensePage;
import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage login;
    public static DashboardPage dash;
    public static AddLicensesPage addLicenses;
    public static AdminAddLicensePage adminAddLicense;

    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        addLicenses = new AddLicensesPage();
        adminAddLicense = new AdminAddLicensePage();

    }
}
