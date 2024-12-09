Feature: Check if today's Friday

    Scenario: Check if <day> is Friday
        Given today is <day>
        When I ask whether it's Friday yet
        Then I should be told <answer>

        Examples:
            | day            | answer   |
            | Friday         | Yes sir! |
            | Sunday         | Nope     |
            | anything else! | Nope     |