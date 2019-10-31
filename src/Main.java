import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static String month1;

    public static void main(String[] args) {
        System.out.println("Input your month");
        scanner = new Scanner(System.in);
        month1=scanner.next();
        showmenu();
        String line = scanner.next();
        while (!line.equalsIgnoreCase("quit")) {
            switch (line) {
                case "1":
                    searchmonth();
                    break;
                case "2":
                    seasonmonth();
                    break;
                case "3":
                    samedays();
                    break;
                case "4":
                    fewerdays();
                    break;
                case "5":
                    moredays();
                    break;
                case "6":
                    nextseason();
                    break;
                case "7":
                    preliminaryseason();
                    break;
                case "8":
                    pair();
                    break;
                case "9":
                    odd();
                    break;
                case "10":
                    pairmonth();
                    break;
            }
            showmenu();
            line = scanner.next();
        }

    }


    private static void pairmonth() {
        for (Month month : Month.values()) {
            boolean f5 = month.name().equalsIgnoreCase(month1);
            if (f5 == true) {
                if (month.getDay() % 2 != 0) {
                    System.out.println(month.name());
                }
            }
        }
    }
    private static void odd(){
        for(Month month:Month.values()){
            if(month.getDay()%2!=0){
                System.out.println(month.name());
            }
        }
    }
    private static void pair(){
        for(Month month:Month.values()){
            if(month.getDay()%2==0){
                System.out.println(month.name());
            }
        }
    }
    private static void moredays() {
        for (Month month : Month.values()) {
            boolean f4 = month.name().equalsIgnoreCase(month1);
            if (f4 == true) {
                int d = month.getDay();
                for (Month monthes : Month.values()) {
                    if (monthes.getDay()>d) {
                        System.out.println(monthes.name());
                    }
                }
            }
        }
    }
    private static void fewerdays() {
        for (Month month : Month.values()) {
            boolean f4 = month.name().equalsIgnoreCase(month1);
            if (f4 == true) {
                int d = month.getDay();
                for (Month monthes : Month.values()) {
                    if (monthes.getDay()<d) {
                        System.out.println(monthes.name());
                    }
                }
            }
        }
    }
    private static void samedays() {
        for (Month month : Month.values()) {
            boolean f4 = month.name().equalsIgnoreCase(month1);
            if (f4 == true) {
                int d = month.getDay();
                for (Month monthes : Month.values()) {
                    if (monthes.getDay()==d) {
                        System.out.println(monthes.name());
                    }
                }
            }
        }
    }
    private static void preliminaryseason(){
        for (Month month : Month.values()) {
            boolean f3=month.name().equalsIgnoreCase(month1);
            if(f3==true){
                System.out.println(month.getSeason());
                if(month.getSeason().equals(Seasons.WINTER)){
                    System.out.println("Fall");}
                else
                if(month.getSeason().equals(Seasons.FALL)){
                    System.out.println("Summer");
                }
                else
                if(month.getSeason().equals(Seasons.SUMMER)){
                    System.out.println("Spring");}
                else
                if(month.getSeason().equals(Seasons.SPRING)){
                    System.out.println("Winter");}
            }
        }
    }
    private static void nextseason() {
        for (Month month : Month.values()) {
            boolean f3=month.name().equalsIgnoreCase(month1);
            if(f3==true){
                System.out.println(month.getSeason());
                 if(month.getSeason().equals(Seasons.WINTER)){
                     System.out.println("Spring");}
                     else
                     if(month.getSeason().equals(Seasons.FALL)){
                System.out.println("Winter");
                 }
                else
                    if(month.getSeason().equals(Seasons.SUMMER)){
                System.out.println("Fall");}
                else
                    if(month.getSeason().equals(Seasons.SPRING)){
                System.out.println("Summer");}
             }
    }
    }

    private static void seasonmonth() {
        for (Month month : Month.values()) {
            boolean f2 = month.name().equalsIgnoreCase(month1);
            if (f2 == true) {
                Seasons s = month.getSeason();
                for (Month monthes : Month.values()) {
                    boolean f3 = monthes.getSeason().equals(s);
                    if (f3 == true) {
                        System.out.println(monthes.name());
                    }
                }
            }
        }
    }

    private static void searchmonth() {
        boolean isFinded = false;
        for (Month month : Month.values()) {
            if (month.name().equalsIgnoreCase(month1)) {
                System.out.println("Such month exists");
                isFinded = true;
            }
            if (!isFinded) {
                System.out.println("Such month is not exists");
            }
        }
    }

    public static void showmenu() {
        System.out.println("Make your choice");
        System.out.println("\t1.Check if such month exists");
        System.out.println("\t2.All month ofseason");
        System.out.println("\t3.All month with same number of days");
        System.out.println("\t4.All month with fewer days");
        System.out.println("\t5.All month have more days");
        System.out.println("\t6.Next season");
        System.out.println("\t7.Preliminary season");
        System.out.println("\t8.All month with pair number of days");
        System.out.println("\t9.All month with odd number of days");
        System.out.println("\t10.Check if such munth has pair number of days ");
        System.out.println("\tType\"quit\" for exit");
    }
}


