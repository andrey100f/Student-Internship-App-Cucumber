Feature: Application Tracking
  Scenario: User tracks the status of an application
    Given the user has applied for an internship
    When the user navigates to the "My Applications" page
    Then the status of the application should be displayed as "Under Review"

  Scenario: Application status is updated by the company
    Given the user has applied for an internship
    And the application status was previously "Under Review"
    When the company updates the status to "Accepted"
    Then the new status should be displayed on the "My Applications" page
    And the user should recieve a notification about the status change