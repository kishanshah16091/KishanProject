package steps;


import pages.AddWorkExperiencePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.QualificationsPage;
import pages.AddDependentsPage;

public class PageInitializers {

    public static AddWorkExperiencePage workExperiencePage;
    public static LoginPage login;
    public static AddDependentsPage addDependents; //Imran

    public static DashboardPage dash;
    public static QualificationsPage qualificationsPage;// Zulfiya



    public static void intializePageObjects() {
        workExperiencePage = new AddWorkExperiencePage();

        login = new LoginPage();
        addDependents=new AddDependentsPage();//Imran

        dash = new DashboardPage();
        qualificationsPage =new QualificationsPage(); // Zulfiya

    }
}