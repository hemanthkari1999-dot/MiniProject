Feature: WindowHandles

@windowHandles
Scenario: Performing testing on multiple webpages
Given user navigates to the webpage
When user clicks on the popUp windows button
Then new popUp window opened successfully "Selenium"
Then user validates the title of the new popUp window