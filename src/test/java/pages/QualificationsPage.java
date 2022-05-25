package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class QualificationsPage extends CommonMethods {
    @FindBy (id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy (id = "menu_admin_membership")
    public WebElement qualificationMembership;

    @FindBy (id = "btnAdd")
    public WebElement qualificationAddButton;

    @FindBy (id = "btnSave")
    public WebElement qualificationSaveButton;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationTab;

    @FindBy (id = "membership_name")
    public WebElement membershipTextBox;

    @FindBy (id = "menu_admin_membership")
    public WebElement memebershipDD;

    @FindBy(id = "menu_admin_viewLicenses")
    public WebElement licensesSub;





public QualificationsPage () {
    PageFactory.initElements(driver, this );
}


}
