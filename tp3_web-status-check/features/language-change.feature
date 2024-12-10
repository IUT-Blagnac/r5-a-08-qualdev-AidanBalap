Feature: The language of the website can be changed

    Scenario Outline: Check if the website is available in English
        When I visit the URL "<url>"
        Then the language should be "<lang>"

        Examples:
            | url                               | lang |
            | https://aidanbalap.dev            | en   |
            | https://aidanbalap.dev/en         | en   |
            | https://aidanbalap.dev/fr         | fr   |
            | https://aidanbalap.dev/es         | es   |
            | https://aidanbalap.dev/random-url | en   |
