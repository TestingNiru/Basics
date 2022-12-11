Feature: login feature
@login
 Scenario Outline:logintest once more
 Given user in login page 
Then user enters "<firstname>" and "<Surname>"

Examples:
|firstname|Surname|
 |Aryan|Aneesh|