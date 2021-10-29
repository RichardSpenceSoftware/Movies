package software.spence.Movies;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;


public class MovieList {
    private List<Movie> movieList = new ArrayList<>();

    public MovieList() {
        this.movieList.add(new Movie("Psycho", 1960));
        this.movieList.add(new Movie("Movie 43", 2010));
    }

    public List<Movie> getMovieList() {
        return this.movieList;
    }

    public String toString() {
        String json = new Gson().toJson(movieList);
        return json;
    }
}
