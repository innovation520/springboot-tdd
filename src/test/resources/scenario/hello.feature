Feature: the greeting msg can be retrieved
  Scenario: client makes call to GET /hello
    Given name is "User"
    When the client calls "/hello"
    Then the client receives status code of 200
    Then the client receives content "hello User"

#    // Bad Scenario
#    Scenario: client makes call to GET /hello
#      Given name is "null"
#      When the client calls "/hello"
#      Then the client receives status code of 200
#      Then the client receives content "invalid parameter"