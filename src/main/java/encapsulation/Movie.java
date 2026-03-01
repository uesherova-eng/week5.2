package encapsulation;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public String getTitle(){
        return title;

    }
    public String getDirector(){
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director=director;

    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getMovieDetails(){
        return "Movie: "+title+", Director: "+director+", Duration: "+duration+" minutes";
    }
}
