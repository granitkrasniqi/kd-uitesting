Feature: User authentication

  Scenario: User login
    Given the user is on login page
    When the user is logged in with username "admin" and password "admin"
    Then the user should see system dashboard page

    Scenario: User login failed
      Given the user is on login page
      When the user tries to login with username "wrong" and password "wrong"
      Then the user should see invalid credentials message