Feature: Main page
  This test will verify the functionality of the software testing course

  Scenario: Verify enrollment button functionality
    Given I am on the main page
    When I click on the enrollment button
    Then the page title should start with "software testing | enrollment"

  Scenario: Verifying first instructor twitter button functionality
    Given I am on the main page
    When I scroll to the instructors header
    And I click on the twitter button
    Then the page title should start with "twitter"

  Scenario: Verifying first instructor facebook button functionality
    Given I am on the main page
    When I scroll to the instructors header
    And I click on the facebook button
    Then the page title should start with "facebook"

  Scenario: Verifying first instructor linkedin button functionality
    Given I am on the main page
    When I scroll to the instructors header
    And I click on the linkedIn button
    Then the page title should start with "linkedin"

  Scenario: Verifying first instructor instagram button functionality
    Given I am on the main page
    When I scroll to the instructors header
    And I click on the instagram button
    Then the page title should start with "instagram"

  Scenario: Should access the Virtual page
    Given I am on the main page
    When I move to the "Virtual" card
    And I click on the "Read More" button
    Then the page title should start with "Virtual"

  Scenario: Should access the Hybrid page
    Given I am on the main page
    When I move to the "Hybrid" card
    And I click on the "Read More" button
    Then the page title should start with "Hybrid"

  Scenario: Should access the In Person page
    Given I am on the main page
    When I move to the "In Person" card
    And I click on the "Read More" button
    Then the page title should start with "In person"






