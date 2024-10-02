Feature: Login feature
         This feature is used for user login functinality
         
@sanity
Scenario: verify valid user login
Given launch application
When user enters user name in user name text field
And user enters password in password text field
And click submit btn
Then user login successfully msg displayed
And close browser