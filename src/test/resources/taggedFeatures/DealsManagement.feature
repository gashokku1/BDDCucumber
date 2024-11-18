@PhaseOne
Feature: Deals Activities

Create, Update, View and Delete Task

#@SmokeTest
@SmokeTest @RegressionTest
Scenario: Create a new Deals
Given User login into app
When User create a new Deals

@RegressionTest
Scenario: View a new Deals
Given User login into app
When User view a new Deals

Scenario: Update a new Deals
Given User login into app
When User update a new Deals

Scenario: Delete a new Deals
Given User login into app
When User delete a Deals