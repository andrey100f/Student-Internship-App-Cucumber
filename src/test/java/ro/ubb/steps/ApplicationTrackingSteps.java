package ro.ubb.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationTrackingSteps {

    @Given("the user has applied for an internship")
    public void theUserHasAppliedForAnInternship() {}

    @When("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String page) {}

    @Then("the status of the application should be displayed as {string}")
    public void theStatusOfTheApplicationShouldBeDisplayedAs(String status) {}

    @Given("the application status was previously {string}")
    public void theApplicationStatusWasPreviously(String status) {}

    @When("the company updates the status to {string}")
    public void theCompanyUpdatesTheStatusTo(String status) {}

    @Then("the new status should be displayed on tbe {string} page")
    public void theNewStatusShouldBeDisplayedOnTbe(String status) {}

    @Then("the user should receive a notification about the status change")
    public void theUserShouldReceiveANotificationAboutTheStatusChange(String status) {}

}
