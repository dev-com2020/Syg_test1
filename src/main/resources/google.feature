Feature: Test Google
#  Scenario: Succesfull load google page
#    Given Open the browser and navigate to Google
#    When Enter search term "Cucumber"
#    Then Verify the search results are "CUCUMBER"
  Scenario Outline: Several search
    Given Open the browser and navigate to Google
    When Enter search term <a>
    Then Verify the search results are <b>
    Examples:
      | a           | b          |
      | "Cucumber"  | "CUCUMBER" |
      | "Pillow"    | "PILLOW"   |