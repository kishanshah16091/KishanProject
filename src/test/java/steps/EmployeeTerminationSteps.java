package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class EmployeeTerminationSteps extends CommonMethods {

    @And("user clicks on Job button")
    public void user_clicks_on_job_button()  {
        click(employeeSearchPage.jobbtn);
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
