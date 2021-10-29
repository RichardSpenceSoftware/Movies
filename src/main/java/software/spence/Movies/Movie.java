package software.spence.Movies;

public class Movie {

    private String title;
    private int date;

    public Movie(String title, int date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public String getJsonObjectOfMovie() {
        return "{" +
                "\"title\" : \" " + title + "\"," +
                "\" date\" : \" " + date + "\"" +
                "}";

    }
}