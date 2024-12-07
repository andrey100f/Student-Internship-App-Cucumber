Feature: User Profiles
  Scenario: User creates a profile successfully
    Given the user is logged into the application
    When the user navigates into the "Create Profile" page
    And the user fills in their skills, academic background, and experience
    And the user clicks the "Save Profile" button
    Then the profile should be saved successfully
    And a confirmation message should be displayed

    Scenario: User edits their profile
      Given the user has an existing profile
      When the user navigates to the "Edit Profile" page
      And the user updates their skills and experience
      And the user clicks the "Update Profile" button
      Then the profile should be updated successfully
      And a confirmation message should be displayed