Feature: Job Alerts and Notifications
  Scenario: User sets up a job alert
    Given the user is on the "Job Alerts" page
    When the user creates an alert for "Software Development" internships
    And the user sets the location to "Remote"
    Then the alert should be saved successfully
    And the user should receive notifications for matching internships

  Scenario: User receives a job alert notification
    Given the user has a job alert for "Software Development" internships
    And a new internship matching the criteria is posted
    When the user logs into the application
    Then a notification should be displayed about the new internship