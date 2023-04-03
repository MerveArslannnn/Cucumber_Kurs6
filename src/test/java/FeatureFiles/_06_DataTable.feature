Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
@Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries |
    And Click on the element in Dialog
      |addButton|
    And User sending the keys in Dialog Content
      | nameInput | merve1456 |
      | codeInput | i3434     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | merve1456 |
    Then Success message should be displayed
@Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | merve1456 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed
    And User delete item from Dialog Content
      | merve1456 |
    Then Success message should be displayed

@Regression
    Scenario: Fees Functionality
      And Click on the element in LeftNav
        | setup      |
        | parameters |
        | fees |
      And Click on the element in Dialog
        |addButton|
      And User sending the keys in Dialog Content
        | nameInput       | merve1456 |
        | codeInput       | i3434     |
        | integrationCode |25455     |
        | priorityCode    | 669999    |

      And Click on the element in Dialog
        | toogleBar  |
        | saveButton |

      Then Success message should be displayed

      And User delete item from Dialog Content
        | merve1456 |
      Then Success message should be displayed



