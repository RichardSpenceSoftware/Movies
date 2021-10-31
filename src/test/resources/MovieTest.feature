Feature: Testing Movie
  Scenario: seriesName is initialSeriesName
    Given Dune is movieName
    When I check if it's initialmovieName
    Then I should be told "Pass"