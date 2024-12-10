Feature: The language of the website can be changed

    Scenario: Check if the website is available in English
        When I visit the URL "https://aidanbalap.dev/en"
        Then the language should be "en"

    Scenario: Check if the website is available in French
        When I visit the URL "https://aidanbalap.dev/fr"
        Then the language should be "fr"

    Scenario: Check if the website is available in Spanish
        When I visit the URL "https://aidanbalap.dev/es"
        Then the language should be "es"

    Scenario: Check the default language of the website
        When I visit the URL "https://aidanbalap.dev/random-url"
        Then the language should be "en"