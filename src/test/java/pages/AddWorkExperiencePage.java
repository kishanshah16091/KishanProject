package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddWorkExperiencePage extends CommonMethods {

    @FindBy(xpath = "//*[@id = 'menu_pim_viewPimModule']")
    public WebElement pimOption;

    @FindBy(xpath = "//*[@id = 'menu_pim_viewEmployeeList']")
    public WebElement employeeList;

    @FindBy(xpath = "//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
    public WebElement firstUser;

    @FindBy(id="addWorkExperience")
    public WebElement addWork;

    @FindBy(id="experience_employer")
    public WebElement companyName;

    @FindBy(id="experience_jobtitle")
    public WebElement jobTitle;

    @FindBy(id="experience_from_date")
    public WebElement fromCalender;

    @FindBy(id="experience_to_date")
    public WebElement toCalender;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement month;

    @FindBy( xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement year;

    @FindBy(id="experience_comments")
    public WebElement addComment;

    @FindBy(id="btnWorkExpSave")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody//tr/td")
    public List<WebElement> workExperienceCalendarDays;

    public AddWorkExperiencePage(){
        PageFactory.initElements( driver, this );
    }
}