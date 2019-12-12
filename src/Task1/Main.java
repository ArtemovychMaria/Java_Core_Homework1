package Task1;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        VerhovnaRada vr1=VerhovnaRada.getvr();
        menu();
        Scanner sc2 = new Scanner(System.in);
        String line = sc2.next();
        while (!line.equalsIgnoreCase("Exit")) {
            switch (line) {
                case "1":
                    vr1.addfraction();
                    break;
                case "2":
                    vr1.removefraction();
                    break;
                case "3":
                    vr1.showfractions();
                    break;
                case "4":
                    vr1.deletefractiondeputats();
                    break;
                case "5":
                    vr1.showfraction();
                    break;
                case "6":
                    vr1.addtofraction();
                    break;
                case "7":
                    vr1.removeinfraction();
                    break;
                case "8":
                    vr1.fractionhabarnyky();
                    break;
                case "9":
                    vr1.fractionbesthabarnyk();
                    break;
            }

            menu();
            line=sc2.next();
        }
    }
    public static void menu(){
        System.out.println("Make your choice");
        System.out.println("1.Додати фракцію");
        System.out.println("2.Видалити фракцію");
        System.out.println("3.Вивести усі фракції");
        System.out.println("4.Очистити фракцію");
        System.out.println("5.Вивести фракцію");
        System.out.println("6.Додати депутата в фракцію");
        System.out.println("7.Видалити депутата з фракції");
        System.out.println("8.Вивести список хабарників");
        System.out.println("9.Вивести найбільшого хабарника");
    }
}
