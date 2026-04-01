Feature: BackgroundExample

Background:
Given user navigates to the webpage



@TestCase1
Scenario: Test case1
Given the user clicks on the alertButton
When the alertPopup is displayed in the webpage
Then user accepts the alertPopup


@TestCase2
Scenario: Test case2
Given the user clicks on the confirmButton
When the confirmPopup is displayed in the webpage
Then user decline the Popup