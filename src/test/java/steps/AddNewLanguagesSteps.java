package steps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class AddNewLanguagesSteps extends CommonMethods {

    @When("user clicks on Qualifications")
    public void user_clicks_on_qualifications() {
        click(addNewLanguagesPage.qualificationOption);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addNewLanguagesPage.addLanguageButton);
    }

    @Then("user fill out the language fields")
    public void userFillOutTheLanguageFields() {
        selectDdValue(addNewLanguagesPage.languageDropDown, 2);
        selectDdValue(addNewLanguagesPage.fluencyDropDown, 2);
        selectDdValue(addNewLanguagesPage.competencyDropDown, 2);
    }

    @Then("user clicks on language save button")
    public void userClicksOnLanguageSaveButton() {
        click(addNewLanguagesPage.addLanguageSaveButton);
    }


}
