package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AdminAddLicenseSteps extends CommonMethods {
    @Given("navigates to PIM option and click EmployeeList")
    public void navigates_to_pim_option_and_click_employee_list() {
        click(adminAddLicense.pimOption);
        click(adminAddLicense.employeeList);
    }

    @Given("selects first employee")
    public void selects_first_employee() {
        click(adminAddLicense.firstUser);
    }

    @Given("user navigates to Qualifications")
    public void user_navigates_to_qualifications() {
        click(adminAddLicense.qualificationOption);
    }

    @Given("clicks Add under License Box")
    public void clicks_add_under_license_box() {
        click(adminAddLicense.addLicenceButton);
    }

    @When("user able to fill out all license fields")
    public void user_able_to_fill_out_all_license_fields() throws InterruptedException {
        click(adminAddLicense.licenseType);
        // selectDdValue(adminAddLicense.licenseType, "Jowher");
        selectDdValue(adminAddLicense.licenseType, 3);

        click(adminAddLicense.licenseNumber);
        sendText(adminAddLicense.licenseNumber, "000000000");

        click(adminAddLicense.issueDate);
        handlingCalendar(adminAddLicense.calendarDays, "7", adminAddLicense.calendarMonth, "May", adminAddLicense.calendarYear, "2022");

        click(adminAddLicense.expiryDate);
        handlingCalendar(adminAddLicense.calendarDays, "15", adminAddLicense.calendarMonth, "August", adminAddLicense.calendarYear, "2022");

//         selectDdValue(adminAddLicense.calendarMonth, "June");
//        selectDdValue(adminAddLicense.calendarYear, "2023");
//        Thread.sleep(2000);
//        //selectDay(adminAddLicense.calendarDays, "7");

    }

    @Then("clicks on save button")
    public void clicks_on_save_button() {
        click(adminAddLicense.saveButton);
    }

}
