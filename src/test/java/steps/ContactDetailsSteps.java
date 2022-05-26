package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class ContactDetailsSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLauchApplication();
    }

        @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        click(contactDetailsPage.pimOption);
    }

    @When("user navigated to employee list page")
    public void user_navigated_to_employee_list_page() {
        click(contactDetailsPage.empListOption);
    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(contactDetailsPage.idField, "7908464");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(contactDetailsPage.searchButton);

    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed");
    }
    @Then("user click on searched employee")
    public void user_click_on_searched_employee() {
       click(contactDetailsPage.SearchedEmp);
    }

    @Then("user clicks on contact details and click on edit button")
    public void user_clicks_on_contact_details_and_click_on_edit_button() {

            click(contactDetailsPage.contactDetails);
            click(contactDetailsPage.editBtn);
    }

    @Then("user add employees and verify they are added")
    public void user_add_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>>empData=dataTable.asMaps();
        for (Map<String, String> emp:empData){
            String street1=emp.get("Address Street 1");
            String street2=emp.get("Address Street 2");
            String cityValue=emp.get("City");

            String zipValue=emp.get("ZipCode");
            String country=emp.get("Country");
            String stateValue=emp.get("State");

            String homePhone= emp.get("Home Telephone");
            String mobile =emp.get("Mobile");
            String workPhone=emp.get("Work Telephone");
            String workEmail=emp.get("Work Email");
            String email=emp.get("Other Email");

            sendText(contactDetailsPage.street1,street1);
            sendText(contactDetailsPage.street2,street2);
            sendText(contactDetailsPage.cityValue,cityValue);
            sendText(contactDetailsPage.zipValue,zipValue);
            selectDdValue(contactDetailsPage.country,country);
            selectDdValue(contactDetailsPage.stateValue,stateValue);
            sendText(contactDetailsPage.homePhone,homePhone);
            sendText(contactDetailsPage.mobile,mobile);
            sendText(contactDetailsPage.workPhone,workPhone);
            sendText(contactDetailsPage.workEmail,workEmail);
            sendText(contactDetailsPage.email,email);

           click(contactDetailsPage.saveButton);


        }
    }

}
