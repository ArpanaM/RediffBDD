Feature: Login Action
Scenario: Validate Login for Valid Inputs and display Successful message
Given user is on Home page
When user clicks on Signin link check title
When user enters valid username password
And clicks on Submit button
Then validate User and display successful message

Scenario: Validate Login for inValid Inputs and display error message
Given user is on Home page
When user clicks on Signin link check title
When user enters invalid username or valid password
And clicks on Submit button
Then validate error message
