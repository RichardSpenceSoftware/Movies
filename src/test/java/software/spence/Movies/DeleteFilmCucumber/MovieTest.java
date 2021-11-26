package software.spence.Movies.DeleteFilmCucumber;

import org.junit.jupiter.api.Test;
import software.spence.Movies.Movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    void testgettitle(){
        Movie movie = new Movie("Goblin","Bout a Goblin",1);
        String title = movie.getTitle();
        assertEquals("Goblin",title,"correct");
    }
}
