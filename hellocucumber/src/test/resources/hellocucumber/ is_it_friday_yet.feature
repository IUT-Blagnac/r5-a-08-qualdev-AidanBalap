Feature: Check if today's Friday

    Scenario: Sunday isn't Friday
        Given today is Sunday
        When I ask whether it's Friday yet
        Then I should be told "Nope"

    Scenario: Friday is Friday
        Given today is Friday
        When I ask whether it's Friday yet
        Then I should be told "Yes sir!"