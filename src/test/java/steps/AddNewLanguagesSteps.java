package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class AddNewLanguagesSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       click(addNewLanguagesPage.pimOption);
    }

    @When("user clicks on Employee List option")
    public void user_clicks_on_employee_list_option() {
       click(addNewLanguagesPage.empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(addNewLanguagesPage.idField,"7908464");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(addNewLanguagesPage.searchButton);
    }

    @When("user choose the employee name and clicks on it")
    public void user_choose_the_employee_name_and_clicks_on_it() {
        click(addNewLanguagesPage.employeeName);

    }

    @When("user clicks on Qualifications")
    public void user_clicks_on_qualifications() {
        click(addNewLanguagesPage.qualificationOption);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addNewLanguagesPage.addLanguageButton);
    }

    @When("user can select values from Language dropdown when it displayed")
    public void user_can_select_values_from_language_dropdown_when_it_displayed() {
       Assert.assertTrue(addNewLanguagesPage.languageDropDown.isDisplayed());
    }

    @When("user can select values from Fluency dropdown when it displayed")
    public void user_can_select_values_from_fluency_dropdown_when_it_displayed() {
        Assert.assertTrue(addNewLanguagesPage.fluencyDropDown.isDisplayed());
    }

    @When("user can select values from Competency dropdown when it displayed")
    public void user_can_select_values_from_competency_dropdown_when_it_displayed() {
        Assert.assertTrue(addNewLanguagesPage.competencyDropDown.isDisplayed());
    }

    @When("user can enters values in Comments textBox when it displayed")
    public void user_can_enters_values_in_comments_text_box_when_it_displayed() {
       sendText(addNewLanguagesPage.commentsBox,"Done Successfully");
    }
    @Then("user by clicking on save button is able to add new language for any any employee successfully")
    public void user_by_clicking_on_save_button_is_able_to_add_new_language_for_any_any_employee_successfully() {
        click(addNewLanguagesPage.addLanguageSaveButton);
    }
}
