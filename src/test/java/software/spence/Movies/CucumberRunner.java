package software.spence.Movies;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(
        features = "src/test/resources/MovieTest.feature",
        glue = {"software.spence.Movies"}
)

public class CucumberRunner {
}
