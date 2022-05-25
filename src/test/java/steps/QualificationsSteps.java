package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class QualificationsSteps extends CommonMethods {

    @When("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        adminSubTabs("Qualifications");

    }

    @When("selects licenses")
    public void selects_licenses() {
    selectingDDQualification("Licenses");

   }
    @When("clicks on add button and fill the name box")
    public void clicks_on_add_button_and_fill_the_name_box() {
        click(qualificationsPage.addButton);
        sendText(qualificationsPage.licenseName, "Merjen");
    }
   @Then("Admin can add licence and confirm message is displayed")
  public void admin_can_add_licence_and_confirm_message_is_displayed() {
      click(qualificationsPage.saveButton);

   }

}
