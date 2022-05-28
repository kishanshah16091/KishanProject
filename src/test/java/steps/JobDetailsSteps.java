package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;

import java.util.List;
import java.util.Map;

public class JobDetailsSteps extends CommonMethods {

    @Then("user click on search button")
    public void user_click_on_search_button() {
        click(employeeSearchPage.searchButton);
    }

    @Then("user click on searched employee")
    public void user_click_on_searched_employee() {
        click(contactDetailsPage.SearchedEmp);
    }

    @And("user clicks on Job button")
    public void user_clicks_on_job_button()  {
        click(employeeSearchPage.jobbtn);
    }

    @Then("user click on  Edit button")
    public void user_click_on_edit_button() {
        click(employeeSearchPage.EditBtn);
    }

    @Then("user select Job Title, Employment status, Job Category form dropdowns")
    public void user_select_job_title_employment_status_jobb_category_form_dropdowns() {
        click(employeeSearchPage.JobTitledd);
        click(employeeSearchPage.empstatusdd);
        click(employeeSearchPage.jobCategorydd);
    }

    @Then("user select Joined Date from calender")
    public void user_select_joined_date_from_calender(DataTable dataTable) {
        click((employeeSearchPage.calendar));
        List<Map<String, String>> joinedDate = dataTable.asMaps();
        for (Map<String, String> date : joinedDate) {

            String year = date.get("Year");
            String month = date.get("Month");
            String day = date.get("Day");

            selectDdValue(employeeSearchPage.year, year);
            selectDdValue(employeeSearchPage.month, month);
            chooseDate(employeeSearchPage.day, day);
        }
    }

    @Then("user select Sub Unit {string}, Location {string} from dropdowns")
    public void user_select_sub_unit_location_from_dropdowns(String SubUnit, String Location) throws InterruptedException {
        selectDdValue(employeeSearchPage.subUnit, SubUnit);
        selectDdValue(employeeSearchPage.Location, Location);
    }

    @Then("user select StartDate from Calendar")
    public void user_select_start_date_from_calendar(DataTable dataTable) {
        click((employeeSearchPage.startDate));
        List<Map<String, String>> StartDate = dataTable.asMaps();
        for (Map<String, String> date : StartDate) {
            String year = date.get("Year");
            String month = date.get("Month");
            String day = date.get("Day");

            selectDdValue(employeeSearchPage.year, year);
            selectDdValue(employeeSearchPage.month, month);
            chooseDate(employeeSearchPage.day, day);
        }
    }

    @And("user select EndDate from Calendar")
    public void user_select_EndDate_from_calendar(DataTable dataTable) {
        click((employeeSearchPage.endDate));
        List<Map<String, String>> EndDate = dataTable.asMaps();
        for (Map<String, String> date : EndDate) {
            String year = date.get("Year");
            String month = date.get("Month");
            String day = date.get("Day");

            selectDdValue(employeeSearchPage.year, year);
            selectDdValue(employeeSearchPage.month, month);
            chooseDate(employeeSearchPage.day, day);
        }
    }

    @Then("user uploads file to ContractDetails")
    public void user_uploads_file_to_contract_details() {
        if (employeeSearchPage.replsCurrent.isDisplayed()) {
            click(employeeSearchPage.replsCurrent);
        }
        sendText(employeeSearchPage.chooseFile, Constants.CHOOSE_FILEPATH);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(employeeSearchPage.saveBtn);
    }

    @When("then clicks on Terminate Employment")
    public void then_clicks_on_terminate_employment()  {
        click(employeeTerminationPage.termBtn);
    }

    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
        click(employeeTerminationPage.Confirm);
        click(employeeTerminationPage.Activate);
    }
}
