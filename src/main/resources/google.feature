Feature: Test Google
  Scenario: Succesfull load google page
    Given Open the browser and navigate to Google
    When Enter search term "Cucumber"
    Then Verify the search results are displayed