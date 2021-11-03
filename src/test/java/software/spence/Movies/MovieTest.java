package software.spence.Movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    void testgettitle(){
        Movie movie = new Movie(89,2011,"Goblin",5);
        String title = movie.getTitle();
        assertEquals("Goblin",title,"correct");
    }
}
