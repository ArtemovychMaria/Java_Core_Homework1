import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int k;
        int n = random.nextInt(8);
        int m = random.nextInt(5);
        int y = (int) (1019 + Math.random() * 1000);
        Avto1 avto;
        Avto1[][] avtos = new Avto1[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                avtos[i][j]=new Avto1(random.nextInt(100),y);
            }
        }
        menu();
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        while (line != "exit") {
            switch (line) {
                case "1":
                    String [][] avtos1=new String[n][m];
                    for (int i = 0; i <n ; i++) {
                        for (int j = 0; j <m ; j++) {
                            avtos1[i][j]=avtos[i][j].toString();
                        }
                    }
                    System.out.println(Arrays.deepToString(avtos1));
                    break;

                case "2":
                    Integer [] years=new Integer[n*m];
                    k=0;
                    for (int i = 0; i <n ; i++) {
                        for (int j = 0; j <m ; j++) {
                            years[k]=avtos[i][j].year;
                            k++;
                        }
                    }
                    Arrays.fill(years,2009);
                    String [][]avtos3=new String[n][m];
                    k=0;
                    for (int i = 0; i <n ; i++) {
                        for (int j = 0; j <m ; j++) {
                            avtos[i][j].year=years[k];
                            avtos3[i][j]=avtos[i][j].toString();
                            k++;
                        }
                    }
                    System.out.println(Arrays.deepToString(avtos3));
                    break;
                case "3":
                    System.out.println("Input field");
                    String line1=sc.next();
                    if(line1.equals("year")){
                        Avto1[]avtos2=new Avto1[n*m];
                        k=0;
                        for (int i = 0; i <n ; i++) {
                            for (int j = 0; j <m ; j++) {
                                avtos2[k]=avtos[i][j];
                                k++;
                            }
                        }
                        Avto1 avto1;
                        for (int i = 0; i <avtos2.length ; i++) {
                            for (int j = 0; j <avtos2.length ; j++) {
                                if(avtos2[i].year>avtos2[j].year){
                                    avto1=avtos2[j-1];
                                    avtos2[j-1]=avtos2[j];
                                    avtos2[j]=avto1;
                                }
                            }
                        }

                        String [] avto2= new String[avtos2.length];

                        for (int i = 0; i <avtos2.length ; i++) {
                            avto2[i]=avtos2[i].toString();
                        }

                        System.out.println(Arrays.deepToString(avto2));
                }

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
