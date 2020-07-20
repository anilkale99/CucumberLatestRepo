Feature: Test Get

Scenario: Test GET request
Given when hit weburl
Then validate get "response" request status
