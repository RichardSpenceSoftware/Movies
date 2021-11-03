package StepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import software.spence.Movies.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsitDune {

    Movie Dune = new Movie(1, 2021, "Dune", 123);
    private String title;
    private String actualtitle;

    @Given("Dune is movieName")
    public void punisher_is_title() {
        title = "Dune";
    }
    @When("I check if it's initialmovieName")
    public void i_check_if_it_s_actualtitle() {
        actualtitle = Dune.getTitle();
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String dupa) {
        assertEquals(title, actualtitle);
    }
}
