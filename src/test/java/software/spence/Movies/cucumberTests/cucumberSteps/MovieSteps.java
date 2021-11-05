package software.spence.Movies.cucumberTests.cucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import software.spence.Movies.Movie;
import software.spence.Movies.MovieRepository;
import java.util.Optional;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class MovieSteps {

    String title;
    int rating;
    int year;
    int film_id;

    Movie trialMovie;
    @Autowired
    private MovieRepository movieRepository;
    @Given("film called Dune")
    public void Infoforthefilm() {

        film_id = 100;
        title = "Dune";
        rating = 5;
        year = 25;

    }
    @When("I add it to the database")
    public void inputtinginfo() {

        trialMovie = new Movie(film_id,year,title);
        movieRepository.save(trialMovie);

    }
    @Then("I should be told")
    public void checkifcorrect() {

        int testID = trialMovie.getId();
        Optional<Movie> actualMovieOptional = movieRepository.findById(5);
        Movie actualMovie = actualMovieOptional.get();
        System.out.println(trialMovie);
        assertTrue(actualMovie.getTitle().equals(trialMovie.getTitle()));
    }
}
