Feature: End to End functionality for adaction Web Application

Background: user lanuch the browser
Given user should launch the browser
And user wait for 5 seconds

@Tc1
Scenario: User verify for valid login details
Then user should verify the Welcome to AdactIn Group of Hotels displayed
When user should enter the valid username in the loginpage
And user should enter the valid password in the loginpage
And user should cliks the Login Button in login page
And user wait for 3 seconds
And user should signout to exit from the loggedin page
And user wait for 3 seconds
And user should close the browsers

