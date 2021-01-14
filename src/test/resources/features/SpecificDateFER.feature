Feature: Specific date foreign exchange rates end to end scenarios

  @Smoke
  Scenario: Verify response status
    When specific date rates API is available
    Then specific date rates response status should be 200

  Scenario: Verify rates API base response details
    When specific date rates API is available
    Then the response for specific date for GBP should match

  Scenario: Verify error for invalid rates API URL
    When specific date rates API is available
    Given user hits a future date rates API
    Then specific date rates response status should be 200
    Then the response for specific date for GBP should match



