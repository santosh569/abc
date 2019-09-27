Feature: Login action test
Scenario Outline: Successful Login
 Given The signup page is opened
 When user enters "<username>" as username and "<password>" as password
  When user clicks login button 
  Then message displayed login sucessful

  Examples:
  |username|password   |
  |lalitha |password123|
  |admin   |password456|
  