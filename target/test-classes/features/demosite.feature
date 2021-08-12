@webpage
Feature: Demo login
  I want to use this template for my feature file

  Scenario: Title of your scenario
		Given I am on "http://thedemosite.co.uk/addauser.php"
		When I enter my username
		And I enter my password
		And I click save
		And I click to the next page
		And I enter my username again
		And I enter my password again
		And I click test
		Then I should see my login is succesful

