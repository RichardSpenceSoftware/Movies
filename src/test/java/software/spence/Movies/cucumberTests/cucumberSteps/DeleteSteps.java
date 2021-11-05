/*package software.spence.Movies.cucumberTests.cucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import software.spence.Movies.Movie;
import software.spence.Movies.MovieRepository;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class DeleteSteps {

    private Movie movie;

    @Autowired
    private MovieRepository movieRepository;
    private String outcome;
    private String otheroutcome;

    @Given("There is a film called The Room is on the database")
    public void infoishere(){

        Movie movie = new Movie(2019,"The Room",5);
        movieRepository.save(movie);
        int l = movie.getId();
        if (movie.getId() > 0){
            movieRepository.delete(movie);
            Movie othermovie = movieRepository.findById(l);
            if(othermovie == null);{
                outcome = "All good";
                otheroutcome = "Bad";
            }
        }
    }
    @When("They have removed a film called “The Room” is on the database")
    public void addtodatabase(){
    }

    @Then("I should be told The Room has been removed from the database")
    public void isitthere(){
        Movie movie = new Movie(2019,"Dune",5);
        movieRepository.save(movie);
        assertEquals(movieRepository.findById(movie.getId()), movie);
    }
}
 */




