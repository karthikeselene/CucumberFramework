Feature: User able to see five days weather forecast for entered city.

Scenario Outline: Enter City Name Positive Flow
When Enter the <cityName>
And Click the enter
Then User should see only five days of weather forecast

Examples:
| cityName  |
| Aberdeen  |
| Dundee    |
| Edinburgh |
| Glasgow   |
| Perth     |
| Stirling  |

Scenario Outline: Enter City Name Negative Flow
When Enter the <cityName>
And Click the enter
But User should see error message

Examples:
| cityName |
| London   |
| Newyork  |
| Mumbai   |
| Chennai  |