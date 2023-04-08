Feature: ApachePOI Citizen Functionality
  Background:  # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip page

    Scenario: Create and Delete CitizenShip from Excel
      When User Create citizenship with ApachePoi
      Then User Delete citizenship with ApachePoi