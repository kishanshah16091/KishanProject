package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddingQualificationsSteps extends CommonMethods {

    @When("user navigates to Qualifications page from admin tab")
    public void user_navigates_to_qualifications_page_from_admin_tab() {
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
    @When("selects licenses")
    public void selects_licenses() {
        selectingDDQualification("Licenses");
    }
    @When("clicks on add button and fill the name box")
    public void clicks_on_add_button_and_fill_the_name_box() {
        click(qualificationsPage.qualificationAddButton);
        sendText(qualificationsPage.licenseTextBox, "Merjen");
    }
    @Then("Admin can add licence and confirm message is displayed")
    public void admin_can_add_licence_and_confirm_message_is_displayed() {
        click(qualificationsPage.qualificationSaveButton);
    }
    @When("user clicks on Languages")
    public void user_clicks_on_languages() {
        click(qualificationsPage.languageDD);
    }

    @When("user is able to clicks on Add button")
    public void user_is_able_to_clicks_on_add_button() {
        click(qualificationsPage.qualificationAddButton);
    }

    @When("user can add any Languages")
    public void user_can_add_any_languages() {
        sendText(qualificationsPage.languageTextBox,"Azari");
    }
    @Then("user click on save button & done successfully")
    public void user_click_on_save_button_done_successfully() {
        click(qualificationsPage.qualificationSaveButton);
    }

    @When("selects Memberships from the drop-down and clicks on it")
    public void selects_memberships_from_the_drop_down_and_clicks_on_it() {
        selectingDDQualification("Memberships");
    }

    @Then("user can add and save new Membership")
    public void user_can_add_and_save_new_membership() {
        click(qualificationsPage.qualificationAddButton);
        sendText(qualificationsPage.membershipTextBox, "Costcoo Membership");
        click(qualificationsPage.qualificationSaveButton);



    }

}
