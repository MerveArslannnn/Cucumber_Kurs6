#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.
  Feature: Fees multiple values functionality
    Background:
      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login succesfully

    Scenario Outline: Fees Functionality
  And Click on the element in LeftNav
  | setup      |
  | parameters |
  | fees |
  And Click on the element in Dialog
  |addButton|
  And User sending the keys in Dialog Content
  | nameInput       | <name>|
  | codeInput       | <code>  |
  | integrationCode |<intCode>|
  | priorityCode    | <priority> |

  And Click on the element in Dialog
  | toogleBar  |
  | saveButton |

  Then Success message should be displayed

  And User delete item from Dialog Content
  | <name>|
  Then Success message should be displayed
      Examples:
        |name  | code|intCode|priority|
        |armin |52469|85966 |454541  |
        |bugra |55558|80966 |666652  |
        |zumra |52499|85960 |454543  |
        |merve |00169|99952 |859674  |
        |findik|52469|85966 |045455  |

