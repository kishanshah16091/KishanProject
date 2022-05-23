package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class AddLicensesSteps  extends CommonMethods {

    @When("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        click(addLicenses.adminTab);
        moveToElement(addLicenses.qualificationTab);
        click(addLicenses.qualificationTab);

    }

    @When("selects licenses")
    public void selects_licenses() {
    selectingDDQualification("Licenses");

   }
    @When("clicks on add button and fill the name box")
    public void clicks_on_add_button_and_fill_the_name_box() {
        click(addLicenses.addButton);
        sendText(addLicenses.licenseName, "Jowher");
    }
   @Then("Admin can add licence and confirm message is displayed")
  public void admin_can_add_licence_and_confirm_message_is_displayed() {
      click(addLicenses.saveButton);
        //throw new io.cucumber.java.PendingException();
   }

}
