package software.spence.Movies.cucumberTests.cucumberSteps;

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
public class MovieSteps {

    String title;
    int rating;
    int year;
    int film_id;
    String summary;
    String comedy;

    Employee trialMovie;
    @Autowired
    private EmployeeRepository movieRepository;
    @Given("film called Dune")
    public void Infoforthefilm() {

        film_id = 100;
        title = "Dune";
        rating = 5;
        year = 25;
        summary = "Hello";
        comedy = "1";



    }
    @When("I add it to the database")
    public void inputtinginfo() {

        trialMovie = new Employee(title,summary,comedy);
        movieRepository.save(trialMovie);

    }
    @Then("I should be told")
    public void checkifcorrect() {

        Long testID = trialMovie.getId();
        Optional<Employee> actualMovieOptional = movieRepository.findById(testID);
        Employee actualMovie = actualMovieOptional.get();
        System.out.println(trialMovie);
        assertTrue(actualMovie.getEmailId().equals(trialMovie.getEmailId()));
    }
}
