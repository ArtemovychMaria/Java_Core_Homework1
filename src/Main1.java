import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        int k=(int)(2+Math.random()*4);
        Avto1 avto;
        ArrayList<Avto1>avtos=new ArrayList<>();
        for (int i = 0; i <k; i++) {
                avtos.add(new Avto1(random.nextInt(100),((int)(1019 + Math.random()*1019))));

        }
        menu();
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        while (!line.equals("exit")) {
            switch (line) {
                case "1":
                    //ArrayList<String>stringAvtos=new ArrayList<String>();
                    //for (int i = 0; i <avtos.size() ; i++) {
                       //avto=avtos.get(i);
                       // stringAvtos.add(i,avto.toString());
                    //}
                    System.out.println(avtos);
                    break;

                case "2":
                    ArrayList<String>years=new ArrayList<String>(avtos.size());
                    k=0;
                    for (int i = 0; i <avtos.size() ; i++) {
                        avto=avtos.get(i);
                        avto.year=2018;
                            years.add(i,avto.toString());
                    }
                    System.out.println(years);
                    break;
                case "3":
                    System.out.println("Input field");
                    String line1=sc.next();
                    if(line1.equals("year")){
                        Collections.sort(avtos, new Comparator1());

                        for (int i = avtos.size()-1; i>=0 ; i--) {
                            System.out.println(avtos.get(i));
                        }
                        //System.out.println(avtos);
                }
                    break;
                case "4":

                    Collections.sort(avtos, new Comparator1());
                    for (int i = 0; i <avtos.size() ; i++) {
                        System.out.println(avtos.get(i));
                    }
                    break;

            }
            menu();
            line=sc.next();
        }
    }




    public static void menu(){
        System.out.println("\t1.Output massive");
        System.out.println("\t2.Set for avto");
        System.out.println("\t3.Сортувати за спаданням");
        System.out.println("\t4.Сортувати за зростанням");
        System.out.println("\tInput exit for exit");
    }
}
