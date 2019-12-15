import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances=new TreeSet<>();

    public Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

   // @Override
    //public boolean equals(Object object) {
      // if (this == object) return true;
      //if (!(object instanceof Schedule)) return false;
      //Schedule schedule = (Schedule) object;
       //return Objects.equals(getSeances(), schedule.getSeances());
    //}

    //@Override
    //public int hashCode() {
     //  return Objects.hash(getSeances());
    //}

    void addSeance(Seance seance){
        this.seances.add(seance);
    }

    void removeSeance(Seance seance){
        this.seances.remove(seance);
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
