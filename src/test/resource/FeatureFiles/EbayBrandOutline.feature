@regression
Feature: Ebay Brand Outline
    
   Scenario Outline: Search for items with Brand
    Given Open Ebay Website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then Item list should have product of "<Brand>"
    
   Examples:
	  |Items	|Brand		|
	  |Shirts	|Adidas		|
	  |Pants 	|Nike			|
	  |Shoes	|Unbranded|