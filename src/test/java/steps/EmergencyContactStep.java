package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class EmergencyContactStep extends CommonMethods {

    @Then("user clicks on  Emergency contact details and click on add button")
    public void user_clicks_on_emergency_contact_details_and_click_on_add_button() {

        click(emergencyContactPage.emergencyContact);
        click(emergencyContactPage.addBtn);

    }

    @Then("user send Emergency Details")
    public void user_send_emergency_details(DataTable dataTable) {
        List<Map<String, String>> empData1 = dataTable.asMaps();
        for (Map<String, String> empl : empData1) {
            String name = empl.get("Name");
            String relationship = empl.get("RelationShip");
            String homePhone = empl.get("Home Telephone");
            String mobile = empl.get("Mobile");
            String workPhone = empl.get("Work Telephone");

            sendText(emergencyContactPage.Name, name);
            sendText(emergencyContactPage.relationship, relationship);
            sendText(emergencyContactPage.homePhone, homePhone);
            sendText(emergencyContactPage.mobile, mobile);
            sendText(emergencyContactPage.workPhone, workPhone);
        }
    }

    @Then("user click on save button")
    public void user_click_on_save_button() {
        click(emergencyContactPage.saveButton);
    }

}










