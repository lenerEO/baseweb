Feature: Perform term searchs
  Scenario: Perform an existing term search
    Given User is in main page
    When User fills out the term "BDD"
    Then The page shows the results

  Scenario: Perform a non existing term search
    Given User is in main page
    When User fills out the term "EQRWWOW"
    Then The page shows the message ""