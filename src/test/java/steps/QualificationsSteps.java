package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class QualificationsSteps extends CommonMethods {
    @When("user navigate to Admin tab")
    public void user_navigate_to_admin_tab() {
     click(qualificationsPage.adminTab);
     click(qualificationsPage.qualificationTab);
    }

    @When("user clicks on Languages")
    public void user_clicks_on_languages() {
        click(qualificationsPage.languageTab);
    }

    @When("user is able to clicks on Add button")
    public void user_is_able_to_clicks_on_add_button() {
        click(qualificationsPage.addButton);
    }

    @When("user can add any Languages")
    public void user_can_add_any_languages() {
     sendText(qualificationsPage.textBox,"Azari");
    }

    @Then("user click on save button & done successfully")
    public void user_click_on_save_button_done_successfully() {
    click(qualificationsPage.saveButton);
    }
}
