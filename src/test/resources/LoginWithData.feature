@smoke @Regression
Feature: validation of facebook details
@loginWithData
Scenario: validate the login functionality
Given user is on facebook page
When user enters username and passwords in facebook
|Test1@gmail.com|Test|Test2@gmail.com|
|Tset3@gmail.com|Test2|Test3@gmail.com|
|Test4@gmail.com|Test4@gmail.com|Test5@gmail.com|
Then user click login button