package software.spence.Movies.DeleteFilmCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "src/test/resources/DeleteTest.feature",
        glue = {"software.spence.Movies.DeleteFilmCucumber"}
)

public class CucumberRunner {
}
