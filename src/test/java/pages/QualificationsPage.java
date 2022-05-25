package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class QualificationsPage extends CommonMethods {

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationTab;

//    @FindBy(id = "menu_admin_viewLicenses")
//    public WebElement licensesSub;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"license_name\"]")
    public WebElement licenseName;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public QualificationsPage() {
        PageFactory.initElements(driver, this);
    }

}
