package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AdminAddEmpSkillsSteps extends CommonMethods {
    @Given("navigates to PIM option and click EmployeeList")
    public void navigates_to_pim_option_and_click_employee_list() {
        click(adminAddEmpSkillsPage.pimOption);
        click(adminAddEmpSkillsPage.employeeList);
    }

    @Given("selects first employee")
    public void selects_first_employee() {
        click(adminAddEmpSkillsPage.firstUser);
    }

    @Given("user navigates to Qualifications")
    public void user_navigates_to_qualifications() {
        click(adminAddEmpSkillsPage.qualificationButton);
    }

    @Given("clicks Add under Skills Box")
    public void clicks_add_under_skills_box() {
        click(adminAddEmpSkillsPage.addSkillButton);
    }

    @When("user able to fill out skill field")
    public void user_able_to_fill_out_skill_field() {
       click(adminAddEmpSkillsPage.selectSkillType);
       selectDdValue(adminAddEmpSkillsPage.selectSkillType, 3);
    }

    @Then("clicks on save button")
    public void clicks_on_save_button() {
        click(adminAddEmpSkillsPage.saveButton);

    }

}

