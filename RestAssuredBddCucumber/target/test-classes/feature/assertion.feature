Feature: Using Assertion
  API Url = https://reqres.in/api/users?page=2

  Scenario: Login to url
    Given user is on api
    When passing values from get method
    Then validate response received
