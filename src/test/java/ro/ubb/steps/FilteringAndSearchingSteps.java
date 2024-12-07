package ro.ubb.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilteringAndSearchingSteps {

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String page) {}

    @When("the user selects {string} as {string}")
    public void theUserSelectsAs(String filterKey, String filerValue) {}

    @When("the user filters by {string} as {}")
    public void theUserFiltersBy(String filterKey, String filerValue) {}

    @Then("the internship matching the criteria should be displayed")
    public void theInternshipMatchingTheCriteriaShouldBeDisplayed() {}

    @When("the user enters {string} in the search bar")
    public void theUserEntersTheSearchBar(String searchKey) {}

    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String button) {}

    @Then("internships with {string} in the title or description should be displayed")
    public void internshipsWithTheTitleOrDescriptionShouldBeDisplayed(String title) {}

}
