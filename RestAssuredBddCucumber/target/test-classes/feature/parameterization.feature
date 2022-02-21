Feature:
API URL: https://reqres.in/api/users?page=2

@smoke
Scenario: user is able to send requests to the server with Delete(204) method 
   Given user is able to hit the API
   When user set request Header with body and Delete some values  
   Then user recieves Delete response

