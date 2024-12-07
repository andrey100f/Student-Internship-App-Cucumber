package ro.ubb.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserProfileSteps {

    @Given("the user is logged into the application")
    public void theUserIsLoggedIntoThe_Application() {}

    @When("the user navigates into the {string} page")
    public void theUserNavigatesIntoThePage(String page) {}

    @When("the user fills in their skills, academic background and experience")
    public void theUserFillsInTheirSkillsAcademicBackgroundAndExperience() {}

    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String button) {}

    @Then("the profile should be saved successfully")
    public void theProfileShouldBeSavedSuccessfully() {}

    @Then("a confirmation message should be displayed")
    public void aConfirmationMessageShouldBeDisplayed() {}

    @Given("the user has an existing profile")
    public void theUserHasAnExistingProfile() {}

    @When("the user updates their skills and experience")
    public void theUserUpdatesTheirSkillsAndExperience() {}

}
