Feature: Login Test Cases


Scenario: User should not allowed to login with invalid credentials

Given User is in login page
When User enters email address
And  User enters password
When User clicks sign in button
Then User should see error message on the screen


Scenario: User should be able to login successfully with valid credentials

Given User is in login page
When User enters email address
And  User enters password
When User clicks sign in button
Then User should be successfully login
