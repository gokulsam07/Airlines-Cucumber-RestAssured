Feature: Airline APIs
  Description : Check create, get, get specific airline details

  Scenario: Check all airlines list
    When GET request for airline endpoint is hit
    Then Verify the status code and output schema

  Scenario: Check a specific airline
    When POST request for airline 1 is hit
    Then Verify the status code and output schema for specific airline

  Scenario Outline: Create an airline
    When POST request with "<payload>" is hit for create airline
    Then Verify the status code and output schema for create request

    Examples: 
      | payload                                                                             |
      | F:/Airlines-Cucumber-RestAssured/airlines/src/test/java/testdata/createAirline.json |
