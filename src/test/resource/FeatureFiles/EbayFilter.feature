@regression
Feature: Ebay Filter Functionality

  Scenario: Filter shirts
		Given Open Ebay Website
		When Search for shirts
		And Select filter as Long Sleeve
		Then Validate displaying Long Sleeve shirts
