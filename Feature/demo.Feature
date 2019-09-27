Feature: login Feature
 
 
 Scenario: User enters user name and password
 Given the login page is opened
 When user enters lalitha as username
 And user enters password123 as password
 Then user will find a testmeapp homepage
 