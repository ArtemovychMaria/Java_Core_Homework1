import java.util.*;

public class Cinema {


    TreeMap<Days,Schedule>schedules;
    ArrayList<Movie>moviesLibrary=new ArrayList<>();
    Time open;
    Time close;

    public Cinema(TreeMap<Days, Schedule> schedules, Time open, Time close) {
        this.schedules = schedules;
        this.open = open;
        this.close = close;
    }

    public Time getOpen() {
        return open;
    }

    public Time getClose() {
        return close;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "Cinema{" + "\n" +
                "schedules=" + schedules + "\n" +
                ", moviesLibrary=" + moviesLibrary + "\n" +
                ", open=" + open +
                ", close=" + close +
                '}';
    }

    void addMovie(Movie movie){
        moviesLibrary.add(movie);
    }

    void addSeance(Seance seance,String day) {
        for (Days dayOfWeek : Days.values()) {
            if (dayOfWeek.name().equalsIgnoreCase(day)) {
                if (schedules.containsKey(dayOfWeek)) {
                    Schedule schedule = schedules.get(dayOfWeek);
                    schedule.addSeance(seance);
                } else {
                    schedules.put(dayOfWeek,new Schedule(new TreeSet<>()));
                    Schedule schedule=schedules.get(dayOfWeek);
                    schedule.addSeance(seance);
                }
            }
        }
    }

    void removeMovie(Movie movie){
        Iterator<Movie> iterator1 = moviesLibrary.iterator();
        while (iterator1.hasNext()){
            Movie next = iterator1.next();
            if (movie.title.equalsIgnoreCase(next.title)){
                iterator1.remove();
            }
        }
        for (Days dayOfWeek:Days.values()) {
            if(schedules.containsKey(dayOfWeek)) {
                Schedule schedule = schedules.get(dayOfWeek);
                Iterator<Seance> iterator = schedule.getSeances().iterator();
                if (iterator.hasNext()) {
                    Seance seance=iterator.next();
                    Movie movie1=seance.getMovie();
                    if(movie1.title.equalsIgnoreCase(movie.title)){
                        iterator.remove();
                        }
                    }
                }
            }
        }


    void removeSeance(Seance seance,String day){
        for (Days dayOfWeek:Days.values()) {
            if(dayOfWeek.name().equalsIgnoreCase(day)){
                Schedule schedule=schedules.get(dayOfWeek);
                schedule.removeSeance(seance);
            }
        }
    }

    void showMoviesLibrary(){
        System.out.println("Movies Library:");
        for (Movie movie:moviesLibrary) {
            System.out.println(movie);
        }
    }

    void showSchedule(String day){
        for (Days dayOfWeek:Arrays.asList(Days.values())) {
            if(dayOfWeek.name().equalsIgnoreCase(day)){
                Schedule schedule=schedules.get(dayOfWeek);
                Set<Seance>seances1=schedule.getSeances();
                Iterator<Seance> iterator = seances1.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next().toString());
                }
            }
        }
    }

    void showSchedules(){
        Iterator<Map.Entry<Days, Schedule>> iterator = schedules.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Days, Schedule> next = iterator.next();
            System.out.println(next.getKey());
            for (Seance seance:next.getValue().getSeances()) {
                System.out.println(seance);
            }
        }

    }



}
