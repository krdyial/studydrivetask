@upload
Feature: Upload a file to the course page
  Background: User logs in the system
    Given user goes to homepage
    When user clicks login
    And user enters email
    And user enters password
    And user clicks login submit button

  Scenario: User uploads a text document and validates the uploaded document
    And user clicks add button
    And user clicks click create document button
    And user selects course name
    And user uploads the file
    And user adds description
    And user selects semester
    And user selects document type
    And user clicks finish upload
    Then user verifies "Upload completed" text

    Scenario Outline: Find uploaded documents in My Documents menu
    And user clicks user icon
    And user clicks My documents menu
    And user clicks  name of VeryImportantDocument.doc document
    And user clicks download document
    Then user verifies the file downloaded into "<downloadspath>"
      Examples:
        |downloadspath                                                      |
        |C:\\Users\\UXU\\Downloads\\VeryImportantDocument.doc               |





