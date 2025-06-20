Feature: User validate search function

Scenario Outline: user search for a product

Given User navigate to application
When user enter product name in "<search_Box>" 
And user Enter the search item
Then related products should display "iphone"

Examples:
|search_Box|
|iphone|
|Samsung|
|redmi|
  

