$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mmango/eclipse-workspace/ScenarioOutline/src/test/java/features/login1.feature");
formatter.feature({
  "name": "login feature test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "logintest once more",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user in login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cfirstname\u003e\" and \"\u003cSurname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "Surname"
      ]
    },
    {
      "cells": [
        "Aryan",
        "Aneesh"
      ]
    }
  ]
});
formatter.scenario({
  "name": "logintest once more",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.user_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Aryan\" and \"Aneesh\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.user_enters_firstname_and_Surname(String,String)"
});
formatter.result({
  "status": "passed"
});
});