Feature: Login Page Features
Scenario: validate login functionality with valid user name and password
Given user is on login page
When enters valid username "10656254" and password "123"And click on login button
Then home page is gets open
