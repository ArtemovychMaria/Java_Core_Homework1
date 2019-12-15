import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Scanner sc;


    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Введіть час відкриття кінотеатру:");
        Time openTime=createTime();
        System.out.println("Введіть час закриття кінотеатру:");
        Time closeTime=createTime();
        Cinema cinema=new Cinema(new TreeMap<>(),openTime,closeTime);
        showmenu();
        String line=sc.nextLine();
        while (!line.equals("9")) {
            switch (line) {
                case "1":
                    Movie movie = createMovie();
                    cinema.addMovie(movie);
                    break;
                case "2":
                    System.out.println("Введіть день:");
                    String day = sc.nextLine();
                    System.out.println();
                    Movie movie1 = createMovie();
                    System.out.println("Введіть час початку фільму");
                    Time startTime = createTime();
                    Seance seance=new Seance(movie1,startTime);
                    if(startTime.hour<cinema.getOpen().hour){
                        System.out.println("В цей час кінотеатр буде ще закритим");
                    }else if(seance.getEndTime().hour>=cinema.getClose().hour){
                        System.out.println("В цей час кінотеатр буде закритим");
                    }else{
                    cinema.addSeance(seance,day);}
                    break;
                case "3":
                    Movie movie2 = createMovie();
                    cinema.removeMovie(movie2);
                    break;
                case "4":
                    System.out.print("Введіть день:");
                    String day1 = sc.nextLine();
                    Movie movie3 = createMovie();
                    System.out.println("Введіть початок сеансу:");
                    Time startTime1 = createTime();
                    cinema.removeSeance(new Seance(movie3, startTime1), day1);
                    break;
                case "5":
                    System.out.print("Введіть день:");
                    String day2 = sc.nextLine();
                    cinema.showSchedule(day2);
                    break;
                case "6":
                    cinema.showSchedules();
                    break;
                case "7":
                    cinema.showMoviesLibrary();
                    break;
                case "8":
                    System.exit(0);
                    break;
            }
            showmenu();
            line=sc.nextLine();
        }

    }


    public static Movie createMovie(){
        System.out.println("Введіть назву фільму:");
        String title=sc.nextLine();
        System.out.println("Введіть тривалість фільму");
        Time time=createTime();
        return new Movie(title,time);
    }


    public static Time createTime(){
        System.out.println("Година:");
        int hour=Integer.parseInt(sc.nextLine());
        System.out.println("Хв.:");
        int min=Integer.parseInt(sc.nextLine());
        return new Time(min,hour);
    }

    public static void showmenu(){
        System.out.println("Make your choice:");
        System.out.println("1.Add movie in movies library");
        System.out.println("2.Add seance in day");
        System.out.println("3.Remove movie from movies library and schedule");
        System.out.println("4.Remove seance in day");
        System.out.println("5.Show schedule for day");
        System.out.println("6.Show schedule for week");
        System.out.println("7.Show movies library");
        System.out.println("8.Exit");
    }
}
