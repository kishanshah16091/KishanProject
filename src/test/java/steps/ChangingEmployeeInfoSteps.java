package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class ChangingEmployeeInfoSteps extends CommonMethods {

    @And("user navigates to PIM and Employee list")
    public void user_navigates_to_pim_employee_list() {
        click(employeeSearchPage.pimOption);
        click(employeeSearchPage.empListOption);
    }

    @Then("user search for employee by employee id {string}")
    public void user_search_for_employee_by_employee_id(String EmpId) {
        sendText(employeeSearchPage.idField, EmpId);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(contactDetailsPage.searchButton);
    }



    @Then("user clicks on contact details and click on edit button")
    public void user_clicks_on_contact_details_and_click_on_edit_button() {

        click(contactDetailsPage.contactDetails);
        click(contactDetailsPage.editBtn);
    }

    @Then("user add employees and verify they are added")
    public void user_add_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> empData = dataTable.asMaps();
        for (Map<String, String> emp : empData) {
            String street1 = emp.get("Address Street 1");
            String street2 = emp.get("Address Street 2");
            String cityValue = emp.get("City");

            String zipValue = emp.get("ZipCode");
            String country = emp.get("Country");
            String stateValue = emp.get("State");

            String homePhone = emp.get("Home Telephone");
            String mobile = emp.get("Mobile");
            String workPhone = emp.get("Work Telephone");
            String workEmail = emp.get("Work Email");
            String email = emp.get("Other Email");

            sendText(contactDetailsPage.street1, street1);
            sendText(contactDetailsPage.street2, street2);
            sendText(contactDetailsPage.cityValue, cityValue);
            sendText(contactDetailsPage.zipValue, zipValue);
            selectDdValue(contactDetailsPage.country, country);
            selectDdValue(contactDetailsPage.stateValue, stateValue);
            sendText(contactDetailsPage.homePhone, homePhone);
            sendText(contactDetailsPage.mobile, mobile);
            sendText(contactDetailsPage.workPhone, workPhone);
            sendText(contactDetailsPage.workEmail, workEmail);
            sendText(contactDetailsPage.email, email);

            click(contactDetailsPage.saveButton);
        }
    }

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
