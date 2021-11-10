package software.spence.Movies;
import javax.persistence.*;

@Entity
@Table(name ="film")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="film_id")
    private int film_id;
    private String title;




    public Movie(int film_id, String title){
        this.film_id =film_id;
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

    public int getId() {
        return film_id;
    }

    public void setId(int film_id) {
        this.film_id = film_id;
    }

    }