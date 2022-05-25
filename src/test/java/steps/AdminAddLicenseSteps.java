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
        selectDdValue(adminAddLicense.licenseType,3);

        click(adminAddLicense.licenseNumber);
        sendText(adminAddLicense.licenseNumber, "000000000");

        click(adminAddLicense.issueDate);
        selectDdValue(adminAddLicense.calendarMonth, "May");
        selectDdValue(adminAddLicense.calendarYear, "2022");
        Thread.sleep(2000);
        selectDay(adminAddLicense.calendarDays, "4");

         click(adminAddLicense.expiryDate);
         selectDdValue(adminAddLicense.calendarMonth, "June");
        selectDdValue(adminAddLicense.calendarYear, "2023");
        Thread.sleep(2000);
        selectDay(adminAddLicense.calendarDays, "7");

    }

    @Then("clicks on save button")
    public void clicks_on_save_button() {
        click(adminAddLicense.saveButton);
    }

}
