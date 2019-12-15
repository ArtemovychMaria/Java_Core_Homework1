import java.util.Comparator;
import java.util.Objects;

public class Seance implements Comparable<Seance> {

    Movie movie;
    Time startTime;
    Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime=endTime(this.startTime,movie.duration);
    }

    public Time getEndTime() {
        return endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    // @Override
   //public boolean equals(Object object) {
     //  if (this == object) return true;
      // if (!(object instanceof Seance)) return false;
       // Seance seance = (Seance) object;
        //return Objects.equals(movie, seance.movie) &&
          //      Objects.equals(startTime, seance.startTime) &&
            //  Objects.equals(endTime, seance.endTime);
   //}

    //@Override
    //public int hashCode() {
      //  return Objects.hash(movie, startTime, endTime);
    //}

    Time endTime(Time time, Time time1){
       int resultEndTimeMin=time.min+time1.min;
       int resultendTimeHour=time.hour+time1.hour;
       if(resultEndTimeMin==60){
           resultEndTimeMin=0;
           resultendTimeHour+=1;
       }
       if(resultendTimeHour==24){
           resultendTimeHour=0;
       }
       return new Time(resultEndTimeMin,resultendTimeHour);
    }


    @Override
    public int compareTo(Seance o) {
        return this.startTime.hour-o.startTime.hour;
    }
}
