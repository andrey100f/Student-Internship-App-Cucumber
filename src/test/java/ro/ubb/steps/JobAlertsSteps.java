package ro.ubb.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobAlertsSteps {

    @Given("the user is on the {page}")
    public void theUserIsOnThePage(String page) {}

    @When("the user creates an alert for {string} internship")
    public void theUserCreatesAnAlertForInternship(String alert) {}

    @When("the user sets the location to {string}")
    public void theUserSetsTheLocationTo(String location) {}

    @Then("the alert should be saved successfully")
    public void theAlertShouldBeSavedSuccessfully() {}

    @Then("the user should receive notifications for matching internships")
    public void theUserShouldReceiveNotificationsForMatchingInternships() {}

    @Given("the user has a job alert for {string} internships")
    public void theUserHasAJobAlertForInternships(String alert) {}

    @Given("a new internship matching the criteria is posted")
    public void aNewInternshipMatchesTheCriteriaIsPosted() {}

    @When("the user logs into the application")
    public void theUserLogsIntoTheApplication() {}

    @Then("a notification should be displayed about the new internship")
    public void aNotificationShouldBeDisplayedAboutTheNewInternship() {}

}
