Feature: Google Page Search Functionality

#Scenario: Java Search
#Given User is on Google Page 
#When User search Java Tutorial
#Then Should display Java Tutorial Page

#Scenario: Login Page
#Given User is on Google Page 
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Java Tutorial Page

Scenario Outline: Login Page
Given User is on Google Page 
When User enters "<username>" and "<password>"
Then Should display Java Tutorial Page

Examples:
 | username | password |
 | tomsmith | SuperSecretPassword! |
 | testuser1 | SuperSecretPassword! |
 | testuser2 | SuperSecretPassword! |
 
 Scenario: Login Page
Given User is on Google Page 
When User enters credentials
| tomsmith | SuperSecretPassword! |
Then Should display Java Tutorial Page
| You logged into a secure area! |