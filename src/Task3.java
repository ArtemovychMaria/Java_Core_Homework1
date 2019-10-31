import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        Scanner scanner1=new Scanner(System.in);
        double m=scanner1.nextDouble();
        System.out.println(n+m);
        if(n%1!=0){
            System.out.println("Неправильно введене число!");
        }
        if (m%1!=0){
            System.out.println("Неправильно введене число!");
        }
    }
}
