Feature: test
  Scenario: test example
    Given name is "test"
    When the client calls "/test"
    Then the client receives status code of 200
    Then the client receives content "test"