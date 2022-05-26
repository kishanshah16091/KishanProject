package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminAddEmpSkillsPage extends CommonMethods {
    @FindBy(xpath="//*[@id = 'menu_pim_viewPimModule']")
    public WebElement pimOption;

    @FindBy(xpath="//*[@id = 'menu_pim_viewEmployeeList']")
    public WebElement employeeList;

    @FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
    public WebElement firstUser;

    @FindBy(linkText="Qualifications")
    public WebElement qualificationButton;

    @FindBy (id="addSkill")
    public WebElement addSkillButton;

    @FindBy (id="skill_code")
    public WebElement selectSkillType;

    @FindBy (id="btnSkillSave")
    public WebElement saveButton;

    public AdminAddEmpSkillsPage(){
        PageFactory.initElements(driver, this);
    }
}

