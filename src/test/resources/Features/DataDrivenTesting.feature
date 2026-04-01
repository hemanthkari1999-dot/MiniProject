Feature: DataDriven Testing

@12345
Scenario Outline: performing the scenario outline to a test case
Given user navigates to the webpage
Then user Enter the name in the "<username>"

Examples:
| username |
| hemanth |
| Sunny |
| Munny |

