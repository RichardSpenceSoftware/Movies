Feature: Testing Adding Movie
  Scenario: addDune
    Given film called Dune
    When I add it to the database
    Then I should be told


