Feature: user validate log in functionality

  @reg
  Scenario: User validate the login page with valid Credential
    And User Enter user "OmrGreens"
    And User Enter password "1YU0EO"
    When user click the log in botton
    Then User navigate to next page

  @smoke @reg
  Scenario: User validate the login page with invalid Credential
    And User Enter user "OmrGreens"
    And User Enter password "Hi"
    When user click the log in botton
    But invalid login error massage should display
