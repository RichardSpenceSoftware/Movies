package software.spence.Movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    void testgettitle(){
        Movie movie = new Movie(8,"Goblin");
        String title = movie.getTitle();
        assertEquals("Goblin",title,"correct");
    }
}
