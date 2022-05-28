package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddingQualificationToEmployeeSteps extends CommonMethods {
    @When("user navigates to PIM option and clicks on EmployeeList")
    public void user_Navigates_To_PIM_Option_And_Clicks_On_EmployeeList() {
        click(workExperiencePage.pimOption);
        click(workExperiencePage.employeeList);
    }
    @Then("user selects the first employee")
    public void user_Selects_The_First_Employee() {
        click(workExperiencePage.firstUser);
    }

    @Given("user navigates to Qualifications")
    public void user_navigates_to_qualifications() {
        click(adminAddLicense.qualificationOption);
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
    @Then("user clicks on work experience save button")
    public void user_Clicks_On_work_experience_Save_Button() {
        click(workExperiencePage.saveButton);
    }

    @Given("clicks Add under Skills Box")
    public void clicks_add_under_skills_box() {
        click(adminAddEmpSkillsPage.addSkillButton);
    }
    @When("user able to fill out skill field")
    public void user_able_to_fill_out_skill_field() {
        click(adminAddEmpSkillsPage.selectSkillType);
        selectDdValue(adminAddEmpSkillsPage.selectSkillType, 3);
        sendText(adminAddEmpSkillsPage.skillsYearsOfExperience, "5");
    }
    @Then("saves the skill")
    public void clicks_on_skills_save_button() {
        click(adminAddEmpSkillsPage.saveButton);
    }
    @Given("clicks Add under License Box")
    public void clicks_add_under_license_box() {
        click(adminAddLicense.addLicenceButton);
    }

    @When("user able to fill out all license fields")
    public void user_able_to_fill_out_all_license_fields() throws InterruptedException {
        click(adminAddLicense.licenseType);
        selectDdValue(adminAddLicense.licenseType, 3);
        click(adminAddLicense.licenseNumber);
        sendText(adminAddLicense.licenseNumber, "000000000");

        click(adminAddLicense.issueDate);
        handlingCalendar(adminAddLicense.calendarDays, "7", adminAddLicense.calendarMonth, "May", adminAddLicense.calendarYear, "2022");

        click(adminAddLicense.expiryDate);
        handlingCalendar(adminAddLicense.calendarDays, "15", adminAddLicense.calendarMonth, "August", adminAddLicense.calendarYear, "2022");
    }

    @Then("clicks on save button")
    public void clicks_on_save_button() {
        click(adminAddLicense.saveButton);
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
