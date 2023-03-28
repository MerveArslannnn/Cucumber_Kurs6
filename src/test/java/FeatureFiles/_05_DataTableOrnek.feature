Feature: DataTable Ornek
  Scenario: Users List
    When Write username "Merve"
    And Write username and Password "Merve" and "1234"
    And  Write username as DataTable
          |bugra|
          |funda|
          |nurgul|
          |ibrahim|

    And Write username and password as DataTable
     |bugra| |1234 |
     |funda| |2324 |
     |nurgul| |4545 |
     |ibrahim| |4554 |