package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddMembershipAndDependentsSteps extends CommonMethods {

    @Given("navigates to PIM option and click EmployeeList")
    public void navigates_to_pim_option_and_click_employee_list() {
        click(adminAddLicense.pimOption);
        click(adminAddLicense.employeeList);
    }

    @Given("selects first employee")
    public void selects_first_employee() {
        click(adminAddLicense.firstUser);
    }
    @Then("select Dependends")
    public void select_dependends() {
        click(addDependents.DsideBar);
    }

    @Then("clicks on add button")
    public void clicks_on_add_button() {
        click(addDependents.addDependentBtn);
    }

    @When("admin user able to add all dependent details")
    public void admin_user_able_to_add_all_dependent_details() {
        sendText(addDependents.dependentName,"Khattak");

        selectDdValue(addDependents.relationship,1);

        click(addDependents.BDate);
        selectDdValue(addDependents.BMonth, "May");
        selectDdValue(addDependents.Byear, "2006");
    }

    @Then("click save button")
    public void click_save_button() {
        click(addDependents.SaveBtnDpdnt);
    }

    @When("click the membership option")
    public void click_the_membership_option() {
        click(addmembershipPage.membershipButton);
    }

    @When("click the add button")
    public void click_the_add_button() {
        click(addmembershipPage.addMembershipButton);
    }

    @Then("user can select {string} from drop down list")
    public void user_can_select_membership_from_drop_down_list(String membershipOption) {
        selectDdValue(addmembershipPage.membershipDD, membershipOption);
        click(addmembershipPage.membershipDD);
    }

    @Then("click on the subscription paid by drop down and select {string}")
    public void click_on_the_subscription_paid_by_drop_down_and_select(String subscriptionPaidBy) {
        selectDdValue(addmembershipPage.subscriptionPaidByDD, subscriptionPaidBy);
        click(addmembershipPage.subscriptionPaidByDD);
    }

    @Then("enters the subscription {string} in the text box")
    public void enters_the_subscription_amount_in_the_text_box(String amount) {
        click(addmembershipPage.subscriptionAmountTextBox);
        sendText(addmembershipPage.subscriptionAmountTextBox, amount);
    }


    @Then("click on the currency drop down and select {string}")
    public void click_on_the_currency_drop_down_and_select_the_value(String currency) {
        selectDdValue(addmembershipPage.currencyDD, currency);
        click(addmembershipPage.currencyDD);
    }

    @Then("click the Subscription Start Date field and select {string} {string}")
    public void click_the_subscription_start_date_field_and_select_values(String month, String year) {
        click(addmembershipPage.subscriptionCommenceDate);
        selectDdValue(addmembershipPage.subscriptionMonth, month );
        selectDdValue(addmembershipPage.subscriptionYear, year);
        click(addmembershipPage.subscriptionDay);
    }

    @Then("click on the subscription renewal date calendar and select {string} {string}")
    public void click_on_the_subscription_renewal_date_calendar_and_select_a_date(String month, String year) {
        click(addmembershipPage.subscriptionRenewalDate);
        selectDdValue(addmembershipPage.renewalMonth, month);
        selectDdValue(addmembershipPage.renewalYear, year);
        click(addmembershipPage.renewalDay);
    }

    @Then("click on save button")
    public void click_on_save_button() {
        click(addmembershipPage.saveButton);
    }

}
