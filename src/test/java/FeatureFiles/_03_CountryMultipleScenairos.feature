Feature: Country Multi Scenario

  Background:  # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page

  Scenario: Create country
    When create a country
    Then Success message should be displayed

  Scenario: Create a country 2
    When create a country name as "Mer1425" code as "1Mr1452"
    Then Success message should be displayed