#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız


Feature: Exam multiple values functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Exam Create and Delete
    And Click on the element in LeftNav
      | entranceExamOne|
      | setupTwo       |
      | entranceExamTwo |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | MerveExam2 |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel       |
      | gradeLevel2      |

    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamOne|
      | setupTwo       |
      | entranceExamTwo |

    And User delete item from Dialog Content
      | MerveExam2 |

    Then Success message should be displayed


