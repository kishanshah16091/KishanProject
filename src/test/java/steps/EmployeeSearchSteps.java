package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeSearchPage;
import utils.CommonMethods;
import utils.Constants;

import java.util.List;
import java.util.Map;

public class EmployeeSearchSteps extends CommonMethods {

    @And("user navigates to PIM and Employee list")
    public void user_navigates_to_pim_employee_list() {
        click(employeeSearchPage.pimOption);
        click(employeeSearchPage.empListOption);
    }

    @Then("user search for employee by employee id {string}")
    public void user_search_for_employee_by_employee_id(String EmpId) {
        sendText(employeeSearchPage.idField, EmpId);
    }

    @Then("user click on search button")
    public void user_click_on_search_button() {
        click(employeeSearchPage.searchButton);
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

}
