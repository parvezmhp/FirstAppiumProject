package step_definitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.Login;

public class LogInSteps {
    AppiumDriver driver = Hooks.driver;

    @When("^user enters username \"(.+?)\" and \"(.+?)\"$")
    public void userEntersUsernameAndPassword(String userName, String password) {
        new Login(driver)
                .enterUserName(userName)
                .enterPassword(password);
    }

    @And("^click on the LogIn button$")
    public void clickOnTheLogInButton() {
        new Login(driver)
                .clickOnTheLoginButton();
    }

    @Then("^user should get error message \"(.+?)\"$")
    public void userShouldGetErrorMessage(String errMsg) {
        new Login(driver)
                .unsuccessfulLoginError(errMsg);
    }

    @Then("^user should see product page with title \"(.+?)\"$")
    public void userShouldSeeProductPageWithTitle(String title) {
        new Login(driver)
                .LoginIsSuccessful(title);
    }
}
