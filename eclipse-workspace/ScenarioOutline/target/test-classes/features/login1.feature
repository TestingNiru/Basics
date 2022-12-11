Feature: login feature test

Scenario: logintest

Given user in login page 
Then user enters details

|firstname|Surname|
|Aru|Eon|

@login
 Scenario Outline:logintest once more
 Given user in login page 
Then user enters "<firstname>" and "<Surname>"

Examples:
|firstname|Surname|
 |Aryan|Aneesh|

