package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminAddEmpSkillsPage extends CommonMethods {

    @FindBy(xpath="//*[@id = 'menu_pim_viewPimModule']")
    public WebElement pimOption;

    @FindBy (id="addSkill")
    public WebElement addSkillButton;

    @FindBy (xpath="//*[@id=\"skill_code\"]")
    public WebElement selectSkillType;

    @FindBy (id="btnSkillSave")
    public WebElement saveButton;

    @FindBy(id="skill_years_of_exp")
    public WebElement skillsYearsOfExperience;

    public AdminAddEmpSkillsPage(){
        PageFactory.initElements(driver, this);
    }
}

