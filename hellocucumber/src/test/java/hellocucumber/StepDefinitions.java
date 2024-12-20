package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    private String today;

    @Given("today is anything else!")
    public void today_is_anything_else() {
        this.today = "Monday";
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        this.today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        this.today = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, IsItFriday.isItFriday(this.today));
    }

    @Then("I should be told Yes sir!")
    public void i_should_be_told_yes_sir() {
        assertEquals(IsItFriday.isItFriday(this.today), "Yes sir!");
    }

    @Then("I should be told Nope")
    public void i_should_be_told_nope() {
        assertEquals(IsItFriday.isItFriday(this.today), "Nope");
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "Yes sir!";
        }

        return "Nope";
    }
}