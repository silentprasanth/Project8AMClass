@smoke @Regression
Feature:validation of facebook details
@login
Scenario outline: validate the login functionality
Given user is on facebook page
When user enters username"<username>"and password"<password>"
And user clicks login button
Then user login success message displayed
Examples:
|username|password|
|test1@gmail.com|aabbcc|
|test2@gmail.com|ddeeff|
|test3@gmail.com|gghhii| 