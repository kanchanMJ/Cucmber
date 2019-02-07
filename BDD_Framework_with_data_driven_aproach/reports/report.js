$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Features",
  "description": "",
  "id": "login-page-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "validate login functionality with valid user name and password",
  "description": "",
  "id": "login-page-features;validate-login-functionality-with-valid-user-name-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enters valid username \"10656254\" and password \"123\"And click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "home page is gets open",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefination.user_opened_url()"
});
formatter.result({
  "duration": 54227769236,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginPageStepDefination.user_logged_in_system_successfuly()"
});
formatter.result({
  "status": "skipped"
});
});