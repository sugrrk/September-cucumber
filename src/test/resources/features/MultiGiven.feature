Feature: How to use multiple given items
  Background:
    Given I have one cucumber.

  Scenario: Multiple Givens
    Given one thing
    And another thing
    And yet another thing
    When I open my eyes
    Then I should see something
    But I shouldn't see something else

    Scenario: This is another scenario
      Given Java is a programimg lang
      And php is also programimg lang
      When we write it
      Then it gives the response
      But we can reuse it in another program
