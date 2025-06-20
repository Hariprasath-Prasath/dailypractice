Feature:	user validate log in functionality

Scenario: User validate the login page with valid Credential
Given User navigate to the log web application
And User Enter user "OmrGreens"
And User Enter password "1YU0EO"
When user click the log in botton
Then User navigate to next page

Scenario: User validate the login page with invalid Credential
Given User navigate to the log web application
And User Enter user "OmrGreens"
And User Enter password "Hi"
When user click the log in botton
But invalid login error massage should display