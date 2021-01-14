Feature: Rates API for Latest Foreign Exchange rates

  @Smoke
  Scenario: Verify rates API response status
    When the API is available
    Then the response status code should be 200

  @Smoke
  Scenario: Verify rates API base response details
    When the API is available
    Then the response for GBP should match

  @Regression
  Scenario: Verify error for invalid rates API URL
    When the API is available
    And user hits an invalid URL
    Then user should get error message



