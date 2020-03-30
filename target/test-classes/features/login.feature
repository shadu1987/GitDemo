Feature: Login Application 

Scenario Outline: Positive test login validation
Given Open the Browser
And Hit the url "http://QAClickacademy.com"
And Click on Login link landed on login home page
When User enter the username <username> and password <password> and sign in
Then Verify user logged in successfully
And close the Browser


Examples:
|username			|password		|
|test99@gmail.com	|123456			|
|test100@gmail.com	|1234			|
|testuser@gmail/com	|748499			|

