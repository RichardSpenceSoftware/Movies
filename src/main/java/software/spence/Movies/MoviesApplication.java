package software.spence.Movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@SpringBootApplication
@RestController
@RequestMapping("/movies")
public class MoviesApplication {

	@Autowired
	private MovieRepository movieRepository;


	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Movie> getAllMovies() {
		return movieRepository.findAll();
	}



	@PostMapping("/addMovie")
	public @ResponseBody String addAMovie (@RequestParam int film_id, @RequestParam int year,
										   @RequestParam String title ,@RequestParam int rating){
		Movie savedMovie = new Movie(film_id, year, title);
		movieRepository.save(savedMovie);
		return "Saved";
	}

	@PostMapping("/deleteMovie")
	public @ResponseBody String deleteMovie (@RequestParam int film_id){
		movieRepository.deleteById(film_id);
		return "Deleted";
	}

	@PostMapping("/updateMovie")
	public @ResponseBody String updateMovie (@RequestParam int film_id, @RequestParam int year,
											 @RequestParam String title){
		Optional<Movie> movie = movieRepository.findById(film_id);
		Movie film = movie.get();
		film.setTitle(title);
		film.setYear(year);
		movieRepository.save(film);
		return "Movie updated";
	}

	@GetMapping("/id/{film_id}")
	public @ResponseBody Movie findByID(@PathVariable("film_id") int film_id){
		Movie movieresponse = movieRepository.findById(film_id).orElse(null);
		///Movie newMovie = movieresponse.get();
		return movieresponse;
	}

	@GetMapping("/addRating")
	public @ResponseBody String addMovieRating (@RequestParam int film_id, @RequestParam int rating){
		Optional<Movie> movie = movieRepository.findById(film_id);
		Movie film = movie.get();
		int previous_rating = film.getRating();
		int newrating = (previous_rating + rating)/5;
		film.setRating(newrating);
		movieRepository.save(film);
		return "Rating updated";
	}

	@GetMapping("/getMovie")
	public @ResponseBody Movie getFilm(@RequestParam int film_id) {
		Optional<Movie> filmResponse = movieRepository.findById(film_id);
		Movie film = filmResponse.get();
		return film;
	}

}
