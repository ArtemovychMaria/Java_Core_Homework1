import java.util.Scanner;
//Завдання 4
public class Artemovych2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введіть текст");
        String str1=sc.nextLine();
        String[]array=str1.split(" ");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i] + " " + array[i].length());
        }
    }
}
