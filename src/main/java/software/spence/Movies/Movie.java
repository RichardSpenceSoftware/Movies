package software.spence.Movies;
import javax.persistence.*;

@Entity
@Table(name ="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String summary;
    private int comedy;




    public Movie(String title, String summary, int comedy){
        this.title = title;
        this.summary = summary;
        this.comedy = comedy;


    }

    public Movie(){

    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public int getComedy() {
        return comedy;
    }

    public void setComedy(int comedy) {
        this.comedy = comedy;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int film_id) {
        this.id = id;
    }

    }