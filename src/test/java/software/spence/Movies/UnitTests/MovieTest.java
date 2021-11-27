package software.spence.Movies.UnitTests;

import org.junit.Test;
import software.spence.Movies.Movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void testgettitle(){
        Movie movie = new Movie("Goblin","Bout a Goblin",1);
        movie.setTitle("Goblin 2");
        String title = movie.getTitle();
        assertEquals("Goblin 2",title,"correct");
    }

    @Test
    public void testgetcomedy(){
        Movie movie = new Movie("Goblin","Bout a Goblin",1);
        movie.setComedy(0);
        int comedy = movie.getComedy();
        assertEquals(0,comedy,"correct");
    }

    @Test
    public void testgetID(){
        Movie movie = new Movie("Goblin","Bout a Goblin",1);
        movie.setId(1000);
        int id = movie.getId();
        assertEquals(1000,id,"correct");
    }

    @Test
    public void testgetSummary(){
        Movie movie = new Movie("Goblin","Bout a Goblin",1);
        movie.setSummary("Vegetarianism");
        String summary = movie.getSummary();
        assertEquals("Vegetarianism",summary,"correct");
    }
}
