@webpage
Feature: Select page
  I want to use this template for my feature file

  Scenario: Title of your scenario
		Given I am on "http://way2automation.com/way2auto_jquery/selectable.php#load_box"
		And I am on iframe 0
		When I select the item
		Then I can verify the item is selected
