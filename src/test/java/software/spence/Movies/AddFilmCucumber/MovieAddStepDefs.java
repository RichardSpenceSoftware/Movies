package software.spence.Movies.AddFilmCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import software.spence.Movies.Employee;
import software.spence.Movies.EmployeeRepository;
import software.spence.Movies.Movie;
import software.spence.Movies.MovieRepository;
import java.util.Optional;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class MovieAddStepDefs {

    String title;
    int rating;
    int year;
    int film_id;
    String summary;
    int comedy;

    Movie trialMovie;
    @Autowired
    private MovieRepository movieRepository;
    @Given("film called Dune")
    public void Infoforthefilm() {

        film_id = 100;
        title = "Dune";
        rating = 5;
        year = 25;
        summary = "Hello";
        comedy = 1;



    }
    @When("I add it to the database")
    public void inputtinginfo() {

        trialMovie = new Movie(title,summary,comedy);
        movieRepository.save(trialMovie);

    }
    @Then("I should be told")
    public void checkifcorrect() {

        int testID = trialMovie.getId();
        Optional<Movie> actualMovieOptional = movieRepository.findById(testID);
        Movie actualMovie = actualMovieOptional.get();
        System.out.println(trialMovie);
        assertTrue(actualMovie.getTitle().equals(trialMovie.getTitle()));
    }
}
