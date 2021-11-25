package software.spence.Movies.DeleteFilmCucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import software.spence.Movies.Movie;
import software.spence.Movies.MovieRepository;

import java.util.List;

@SpringBootTest
public class MovieDeleteStepDefs {


    Movie trialMovie;
    String title;
    String summary;
    int comedy;

    @Autowired
    private MovieRepository movieRepository;
    @Given("I have the necessary data")
    public void getData(){

        title = "The Room";
        summary = "Drama";
        comedy = 0;

    }

    @When("I add the film to the database")
    public void EntertoDataBase(){
        trialMovie = new Movie(title,summary,comedy);
        movieRepository.save(trialMovie);

    }

    @Then("I delete the film")
    public void RemoveMovie(){
        int testID = trialMovie.getId();
        movieRepository.deleteById(testID);
        }




}


