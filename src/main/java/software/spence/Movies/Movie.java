package software.spence.Movies;
import javax.persistence.*;

@Entity
@Table(name ="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int film_id;
    @Column(name="date")
    private int year;
    private String title;
    private int rating;


    public Movie(int film_id, int year, String title){
        this.film_id =film_id;
        this.year = year;
        this.title = title;

    }

    public Movie(){

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getId() {
        return film_id;
    }

    public void setId(int film_id) {
        this.film_id = film_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}