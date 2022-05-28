package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class QualificationsPage extends CommonMethods {

    @FindBy(xpath = "//b[text()='Admin']")
    public WebElement adminTab;

    @FindBy(id = "menu_admin_Qualifications")
    public WebElement qualificationTab;

    @FindBy(id = "menu_admin_viewLanguages")
    public WebElement languageDD;

    @FindBy(id = "btnAdd")
    public WebElement qualificationAddButton;

    @FindBy(id = "language_name")
    public WebElement languageTextBox;

    @FindBy(id = "btnSave")
    public WebElement qualificationSaveButton;

    @FindBy (id = "menu_admin_membership")
    public WebElement membershipDD;

    @FindBy (id = "membership_name")
    public WebElement membershipTextBox;

    @FindBy(id = "menu_admin_viewLicenses")
    public WebElement licensesDD;

    @FindBy(id = "skill_name")
    public WebElement skillTextBox;

    @FindBy(xpath = "//*[@id=\"recordsListTable\"]/tbody/tr[1]/td[1]/input")
    public WebElement skillCheckBox;

    @FindBy (id = "btnDel")
    public WebElement deleteBtn;

    @FindBy(xpath="//*[@id=\"license_name\"]")
    public WebElement licenseTextBox;

    @FindBy(id = "menu_admin_viewSkills")
    public WebElement skillsDD;

    public QualificationsPage() {
        PageFactory.initElements(driver, this);
    }
}


