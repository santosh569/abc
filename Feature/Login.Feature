Feature: Login Action Test
Scenario: Successfull login with the Valid Credentials
 Given The login page is opened
  When user enters "lalitha" as a username and "password123" as a password
  When user clicks login Button 
  Then user will Finds a testmeapp homepage
 