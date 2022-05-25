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
    public WebElement languageTab;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "language_name")
    public WebElement textBox;

    @FindBy(id = "btnSave")
    public WebElement saveButton;


    public QualificationsPage() {
        PageFactory.initElements(driver, this);
    }
}

