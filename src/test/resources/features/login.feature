Feature: Testing Login Page for DemoBlaze

  Scenario Outline:[Happy Path] Log in with valid credentials
    Given I am on home page
    When clicking on "Log In" button
    And I login with "<username>" and "<password>"
    Then I should see login home page with "<username>"
    And I should be able to log out

    Examples:
      | username | password |
      | admin    | admin    |
      | test     | test     |

  Scenario Outline: [Unhappy Path] Trying to log in with an invalid information
    Given I am on home page
    When clicking on "Log In" button
    And I login with "<username>" and "<password>"
    Then an alert should be present with "<message>"
    And I press accept button

    Examples: Invalid username
      | username              | password | message              |
      | invalid_username_test | admin    | User does not exist. |

    Examples: Invalid password
      | username | password              | message         |
      | admin    | invalid_username_test | Wrong password. |

    Examples: Empty fields
      | username | password | message                                |
      |          |          | Please fill out Username and Password. |


