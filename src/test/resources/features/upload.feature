@upload
Feature: Upload a file to the course page

  Scenario: Upload a file
    Given user goes to homepage
    When user clicks login
    And user enters email
    And user enters password
    And user clicks login submit button
    And user clicks add button
    And user clicks click create document button
    And user selects course name
    And user uploads the file
    And user adds description
    And user selects semester
    And user selects document type
    And user clicks finish upload
    Then user verifies "Upload completed" text



