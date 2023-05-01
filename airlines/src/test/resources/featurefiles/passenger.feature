Feature: Passenger APIs
  Description : Check create, get, update, partial updata and delete passenger details

  Scenario Outline: Create a passenger detail
    When POST request with "<payload>" is hit for create passenger
    Then Verify the status code and output schema for passenger creation

    Examples: 
      | payload                                                                                |
      | F:/Airlines-Cucumber-RestAssured/airlines/src/test/java/testdata/passengerPayload.json |

  Scenario: Get passenger with specific id
    When GET request with passengerId is hit
    Then Verify the status code and output schema for passenger

  Scenario Outline: Update passenger with a specific Id
    When PUT request with passengerId is hit with "<payload>"
    Then Verify the status code and output schema for passenger update
    Examples:
  | payload                                                                                      |
  | F:/Airlines-Cucumber-RestAssured/airlines/src/test/java/testdata/passengerUpdatePayload.json |
  
  
  Scenario: Delete passenger with a specific Id
    When DELETE request with passengerId is hit
    Then Verify the status code after delete
  
