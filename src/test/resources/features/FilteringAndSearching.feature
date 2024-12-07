Feature: Advanced Filtering and Sorting Options
  Scenario: User applies advanced filters for internships
    Given the user is on the "Internship Search page"
    When the user selects "Location" as "Cluj-Napoca"
    And the user selects "Industry" as "Software Development"
    And the user filters by "Experience Level" as "Entry-Level"
    Then the internship matching the criteria should be displayed

  Scenario: User searches for internships using keywords
    Given the user is on the "Internship Search" page
    When the user enters "Java Developer" in the search bar
    And the user clicks the "Search" button
    Then internships with "Java Developer" in the title or description should be displayed