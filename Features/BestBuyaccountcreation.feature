Feature:best buy homepage

@BestBuyaccountcreation
Scenario Outline: 

Given user visit best buy homepage
When user clicks account
When user click create account
When user enter valid “<First name>” and “<Last name>” and "<email>” and “<password>” and “<confirm password>” and “<mobile number>”
Then user should be able to redirect successfully

Examples:
|First name|Last name|email|password|confirm password|mobile number|
|Shima|Alam|shima.alam1992@gmail.com|Denton@595|Denton@595|9405950515|