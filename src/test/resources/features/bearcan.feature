Feature: whitebox login test

  Scenario: candidate user login test
    Given  given the login url
    When put login credential
    Then verify the profile title

