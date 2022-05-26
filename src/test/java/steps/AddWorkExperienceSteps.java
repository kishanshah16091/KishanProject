package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddWorkExperienceSteps extends CommonMethods {
    @When("user navigates to PIM option and clicks on EmployeeList")
    public void user_Navigates_To_PIM_Option_And_Clicks_On_EmployeeList() {
        click(workExperiencePage.pimOption);
        click(workExperiencePage.employeeList);
    }

    @Then("user selects the first employee")
    public void user_Selects_The_First_Employee() {
        click(workExperiencePage.firstUser);
    }

    @And("clicks on add work experience button")
    public void clicks_On_Add_Work_Experience_Button() {
        click(workExperiencePage.addWork);
    }

    @When("user fills out all the required fields")
    public void user_Fills_Out_All_The_Required_Fields() throws InterruptedException {
        sendText(workExperiencePage.companyName,"Syntax");
        sendText(workExperiencePage.jobTitle,"Product Manager");

        click(workExperiencePage.fromCalender);
        handlingCalendar(workExperiencePage.workExperienceCalendarDays,"10", workExperiencePage.month, "June",workExperiencePage.year,"2020");

        click(workExperiencePage.toCalender);
        handlingCalendar(workExperiencePage.workExperienceCalendarDays,"15", workExperiencePage.month, "June",workExperiencePage.year,"2022");

        sendText(workExperiencePage.addComment,"Shows Great Effort");
    }

  /*  @Then("user clicks on save button")
    public void user_Clicks_On_Save_Button() {
        click(workExperiencePage.saveButton);
    }*/

}