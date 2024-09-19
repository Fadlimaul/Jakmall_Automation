Feature: LOG-01

  Scenario: TC-LOG-01
    Given The user is on the login page
    When The user filling email field "ilham@rupiapp.me"
    And The user filling password field "Ilham23"
    And The user click login button
    Then the user directed to home page

  Scenario: TC-LOG-02
    Given The user is on the login page
    When The user filling email field "ilham@rupiapp"
    And The user filling password field "Ilham23"
    And The user click login button
    Then the user get error message

  Scenario: TC-LOG-03
    Given The user is on the login page
    When The user filling email field "ilham@rupiapp.me"
    And The user filling password field "Ilham234"
    And The user click login button
    Then the user get error message

  Scenario: TC-LOG-04
    Given The user is on the login page
    When The user filling password field "Ilham23"
    And The user click login button
    Then the user still on the login page

  Scenario: TC-LOG-05
    Given The user is on the login page
    When The user filling email field "ilham@rupiapp.me"
    And The user click login button
    Then the user still on the login page

  Scenario: TC-LOG-06
    Given The user is on the login page
    When The user click login button
    Then the user still on the login page

  Scenario: TC-LOG-07
    Given The user is on the login page
    When The user filling password field "Ilham23"
    And The user clicks eye icon
    Then the user can see password that he typed