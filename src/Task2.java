import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double n=scanner.nextDouble();
        if(n%1!=0){
            System.out.println("Неправильно введене число");
        }
        if(n%2==0){
            System.out.println("Число парне");
        }else
            System.out.println("Число непарне");

    }
}

