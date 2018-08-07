Feature: Search

Scenario: Verify search with valid data

Given when I am in homepage
When I enter valid search
And select search button
Then I should see search results