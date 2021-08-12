@webpage
Feature: Alert page
  I want to use this template for my feature file

  Scenario: Title of your scenario
		Given I am on "http://way2automation.com/way2auto_jquery/alert.php#load_box"
		And I am on the correct tab
		And I am on iframe 1
		When I click the alert button
		And I submit and close the alert
		Then my message should be visible
