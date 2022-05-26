package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddingSkillsSteps extends CommonMethods {

    @When("user navigates to Qualifications page")
    public void user_navigates_to_qualifications_page() {
        click(qualificationsPage.adminTab);
        click(qualificationsPage.qualificationTab);
    }

    @When("selects skills from dropdown and clicks on it")
    public void selects_skills_from_dropdown_and_clicks_on_it() {
    selectingDDQualification("Skills");
    }

    @Then("user can add and save any skills")
    public void user_can_add_and_save_any_skills() {
    click(qualificationsPage.qualificationAddButton);

    sendText(qualificationsPage.skillTextBox, "Accountant Associate");

    click(qualificationsPage.qualificationSaveButton);

    click(qualificationsPage.skillCheckBox);

    click(qualificationsPage.deleteBtn);
    }

}

