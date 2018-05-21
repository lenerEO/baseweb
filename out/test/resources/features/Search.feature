Feature: Perform term searchs
  Scenario: Perform an existing term search
    Given User is in main page
    When User fills out the term "Microsoft"
    Then The page shows title "Microsoft"

  Scenario: Perform a non existing term search
    Given User is in main page
    When User fills out the term "EQRWWOW"
    Then The page shows the message ""