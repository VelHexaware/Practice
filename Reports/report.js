$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Adactin hotel validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\" details",
  "keyword": "When "
});
formatter.step({
  "name": "Click the button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Hello",
        "Java"
      ]
    },
    {
      "cells": [
        "Bye",
        "Java"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User \"Hello\" and \"Java\" details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User \"Bye\" and \"Java\" details",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});