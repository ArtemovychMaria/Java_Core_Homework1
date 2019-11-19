import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zooclub zooclub=new Zooclub();
        menu();
        Scanner scanner1 = new Scanner(System.in);
        String line = scanner1.next();
        while (!line.equalsIgnoreCase("8")) {
            switch (line) {
                case "1":
                    zooclub.addpartisipant();
                    break;
                case "2":
                    zooclub.addpet();
                    break;
                case "3":
                    zooclub.deletepet();
                    break;
                case "4":
                    zooclub.deleteparticipant();
                    break;
                case "5":
                    zooclub.deletePetFromAll();
                    break;
                case "6":
                    zooclub.showclub();
                    break;
                case "7":
                    System.exit(0);
                    break;
            }

            menu();
            line=scanner1.next();
        }
    }

        public static void menu() {
            System.out.println("1.Додати учасника");
            System.out.println("2.Додати тваринку до учасника ");
            System.out.println("3.Видалити тваринку з учасника");
            System.out.println("4.Видалити учасника");
            System.out.println("5.Видалити тваринку з усіх учасників клубу");
            System.out.println("6.Вивести зооклуб");
            System.out.println("7.Вийти");

        }
}
