package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AdminAddEmpSkillsSteps extends CommonMethods {

    @Given("clicks Add under Skills Box")
    public void clicks_add_under_skills_box() {
        click(adminAddEmpSkillsPage.addSkillButton);
    }

    @When("user able to fill out skill field")
    public void user_able_to_fill_out_skill_field() {
        click(adminAddEmpSkillsPage.selectSkillType);
        selectDdValue(adminAddEmpSkillsPage.selectSkillType, 3);
        sendText(adminAddEmpSkillsPage.skillsYearsOfExperience, "5");
    }

    @Then("saves the skill")
    public void clicks_on_save_button() {
        click(adminAddEmpSkillsPage.saveButton);
    }

}

