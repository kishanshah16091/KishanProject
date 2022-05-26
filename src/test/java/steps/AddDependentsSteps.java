package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class AddDependentsSteps extends CommonMethods {

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
}
