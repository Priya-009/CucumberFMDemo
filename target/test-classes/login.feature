Feature: Application login
Background:
Given I navigate to the login page
When I submit username and password
Then I should be logged in 

@Sanity
Scenario Outline:  Salesforce page login
Given Intializae thr bowser with chrome
And navigate to "https://login.salesforce.com/?locale=in"
When user enters <username> and <password> and clicks on  click
Then user should be logged in succesfuuly

Examples:
|username||password|
|test| |secure123|
|test2||secure345|