@regression
Feature: Ebay Search Functionality

  Scenario: Search for shirts
    Given Open Ebay Website
    When Search for shirts
    Then Item list should have only shirt related products
    
  Scenario: Search for pents
    Given Open Ebay Website
    When Search for pents
    Then Item list should have only shirt related products