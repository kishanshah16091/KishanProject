package steps;


import pages.DashboardPage;
import pages.LoginPage;
import pages.AddDependentsPage;

public class PageInitializers {
    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;
    public static DashboardPage dash;
    public static AddDependentsPage addDependents;


    public static void intializePageObjects() {
        login = new LoginPage();
        dash = new DashboardPage();
        addDependents=new AddDependentsPage();

    }
}
