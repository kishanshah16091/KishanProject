package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddingQualificationsSteps extends CommonMethods {

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
