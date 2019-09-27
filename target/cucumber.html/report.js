$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User enters user name and password",
  "description": "",
  "id": "login-feature;user-enters-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters lalitha as username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password123 as password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user will find a testmeapp homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMeLogin.the_login_page_is_opened()"
});
formatter.result({
  "duration": 18041702009,
  "status": "passed"
});
formatter.match({
  "location": "TestMeLogin.user_enters_lalitha_as_username()"
});
formatter.result({
  "duration": 146207416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 20
    }
  ],
  "location": "TestMeLogin.user_enters_password_as_password(int)"
});
formatter.result({
  "duration": 145198493,
  "status": "passed"
});
formatter.match({
  "location": "TestMeLogin.user_will_find_a_testmeapp_homepage()"
});
formatter.result({
  "duration": 375472060,
  "status": "passed"
});
});