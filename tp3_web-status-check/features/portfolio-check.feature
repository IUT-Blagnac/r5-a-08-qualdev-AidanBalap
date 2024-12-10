Feature: The web status check

    Scenario: Check the portfolio web status
        When I visit the URL "https://aidanbalap.dev"
        Then the status should be "200"