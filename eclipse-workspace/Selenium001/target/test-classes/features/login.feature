Feature: Login functionality of ServiceNow application

Scenario: Login with positive data
Given Open the Chrome Browser
And Load application url
And Enter the Username as admin
And Enter the password as m3GkKEKU8atr
When Click on Login button
Then HomePage should be displayed
