import java.util.ArrayList;
import java.util.Scanner;

/**
 * Copyright all for you
 */

    /**
     * @since JDK 1.8
     * @author Marichka
     * @version 0.1
     */
    public class Main {
        //variable for read line input
        static Scanner scanner;
        //save line input
        static String month1;

        public static void main(String[] args) {
            String line;
            Main main=new Main();
            main.weeks(30);
            System.out.println("Input your month");
            scanner = new Scanner(System.in);
            month1 = scanner.next();
            boolean f7;
            Month[] month = Month.values();
            for (int i = 0; i < month.length; i++) {
                boolean f6 = month[i].name().equalsIgnoreCase(month1);
                if (!f6) {
                    try {
                        if (i == month.length-1)
                            throw new MyException();
                    } catch (MyException e) {
                        System.out.println(e.toString());
                    }
                } else {
                    i=month.length;
                    showmenu();
                    line = scanner.next();
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
            }
        }
        //chech if month has pair number of days
        private static void pairmonth() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month :monthArrayList) {
                boolean f5 = month.name().equalsIgnoreCase(month1);
                if (f5 == true) {
                    if (month.getDay() % 2 != 0) {
                        System.out.println(month.name());
                    }
                }
            }
        }

        //count number of weeks
        /**
         *
         * @param d - number of days
         * @author Marichka
         * @return - number of weeks
         * @see - header
         */
        private static double weeks(double d){
            double w=d/7;
            System.out.println("Number of weeks:" + w);
            return w;
        }

        //show month with odd number of days
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void odd() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month :monthArrayList) {
                if (month.getDay() % 2 != 0) {
                    System.out.println(month.name());
                }
            }
        }
        //show month with pair number of days
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void pair() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                if (month.getDay() % 2 == 0) {
                    System.out.println(month.name());
                }
            }
        }
//show month with more days
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void moredays() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f4 = month.name().equalsIgnoreCase(month1);
                if (f4 == true) {
                    int d = month.getDay();
                    for (Month monthes : monthArrayList) {
                        if (monthes.getDay() > d) {
                            System.out.println(monthes.name());
                        }
                    }
                }
            }
        }
//show month with fewer days
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void fewerdays() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f4 = month.name().equalsIgnoreCase(month1);
                if (f4 == true) {
                    int d = month.getDay();
                    for (Month monthes : monthArrayList) {
                        if (monthes.getDay() < d) {
                            System.out.println(monthes.name());
                        }
                    }
                }
            }
        }
//show month with same number of days
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void samedays() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f4 = month.name().equalsIgnoreCase(month1);
                if (f4 == true) {
                    int d = month.getDay();
                    for (Month monthes : monthArrayList) {
                        if (monthes.getDay() == d) {
                            System.out.println(monthes.name());
                        }
                    }
                }
            }
        }

        //show preleminary season for season of input month
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void preliminaryseason() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f3 = month.name().equalsIgnoreCase(month1);
                if (f3 == true) {
                    System.out.println(month.getSeason());
                    if (month.getSeason().equals(Seasons.WINTER)) {
                        System.out.println("Fall");
                    } else if (month.getSeason().equals(Seasons.FALL)) {
                        System.out.println("Summer");
                    } else if (month.getSeason().equals(Seasons.SUMMER)) {
                        System.out.println("Spring");
                    } else if (month.getSeason().equals(Seasons.SPRING)) {
                        System.out.println("Winter");
                    }
                }
            }
        }
//show next season for season of input month
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void nextseason() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f3 = month.name().equalsIgnoreCase(month1);
                if (f3 == true) {
                    System.out.println(month.getSeason());
                    if (month.getSeason().equals(Seasons.WINTER)) {
                        System.out.println("Spring");
                    } else if (month.getSeason().equals(Seasons.FALL)) {
                        System.out.println("Winter");
                    } else if (month.getSeason().equals(Seasons.SUMMER)) {
                        System.out.println("Fall");
                    } else if (month.getSeason().equals(Seasons.SPRING)) {
                        System.out.println("Summer");
                    }
                }
            }
        }
//show all month with same season such as input month
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void seasonmonth() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            for (Month month : monthArrayList) {
                boolean f2 = month.name().equalsIgnoreCase(month1);
                if (f2 == true) {
                    Seasons s = month.getSeason();
                    for (Month monthes : monthArrayList) {
                        boolean f3 = monthes.getSeason().equals(s);
                        if (f3 == true) {
                            System.out.println(monthes.name());
                        }
                    }
                }
            }
        }
//search month in enum
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
        private static void searchmonth() {
            ArrayList<Month>monthArrayList=new ArrayList<>();
            for (Month month : Month.values()) {
                monthArrayList.add(month);
            }
            boolean isFinded = false;
            for (Month month : monthArrayList) {
                if (month.name().equalsIgnoreCase(month1)) {
                    System.out.println("Such month exists");
                    isFinded = true;
                }
                if (!isFinded) {
                    System.out.println("Such month is not exists");
                }
            }
        }
        //show menu for user
        /**
         *
         * @author Marichka
         * @return - void
         * @see - header
         */
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



