package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

    public class LoginSteps extends CommonMethods {
    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        sendText(login.usernameBox, "Admin");
        sendText(login.passwordBox, "Hum@nhrm123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginBtn);
    }


}