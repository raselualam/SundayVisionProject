@regression
Feature: Ebay Cart Functionality

  Scenario: Add product to cart
		Given Open Ebay Website
		When Search for shirts
		And Select first shirt product on item list
		And Select size on shirt
		And Select color on shirt
		And Select quantity of shirt
		Then Add to cart