Feature: User able to see three hourly forecast after clicking on the day

Scenario: Get three hourly forecast
Given Launch the chrome browser
And Launch the url
And Maximize the window
And Set the timeouts
When User click on the day
Then User see the three hourly forecast details