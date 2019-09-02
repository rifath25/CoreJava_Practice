package tutoring_JDBC;

public class MovieShell {
    private int id;
    private String title;
    private int release_year;
    private  String genre;
    private String mpaa_rating;

    public MovieShell(int id, String title, int release_year, String genre, String mpaa_rating){
        this.id=id;
        this.title=title;
        this.release_year=release_year;
        this.genre=genre;
        this.mpaa_rating= mpaa_rating;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle (String title){
        this.title=title;
    }

    public int getRelease_year(){
        return release_year;
    }

    public void setRelease_year(int release_year){
        this.release_year= release_year;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre= genre;
    }

    public String getMpaa_rating(){
        return mpaa_rating;
    }

    public void setMpaa_rating(String mpaa_rating){
        this.mpaa_rating=mpaa_rating;
    }
}
