import java.util.Objects;

public class Movie {

    String title;
    Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    //@Override
    //public boolean equals(Object object) {
      //  if (this == object) return true;
        //if (!(object instanceof Movie)) return false;
        //Movie movie = (Movie) object;
        //return Objects.equals(title, movie.title) &&
          //      Objects.equals(duration, movie.duration);
    //}

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }
}
