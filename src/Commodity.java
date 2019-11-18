import java.util.*;

public class Commodity {

    Scanner scanner;

    String name;
    int weight;
    int length;
    int width;

    public Commodity(){

    }

    public Commodity(String name, int weight, int length, int width) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    List<Commodity> commodityArrayList = new ArrayList<>();

    public void addCommodity(){
        System.out.println("Введіть назву товару:");
        scanner=new Scanner(System.in);
        String inputName=scanner.nextLine();
        System.out.println("Введіть вагу");
        int inputWeight=scanner.nextInt();
        System.out.println("Введіть довжину");
        int inputLength=scanner.nextInt();
        System.out.println("Введіть ширину");
        int inputWidth=scanner.nextInt();
        commodityArrayList.add(new Commodity(inputName,inputWeight,inputLength,inputWidth));
    }

    public void deleteCommodity(){
        System.out.println("Введіть назву товару:");
        scanner=new Scanner(System.in);
        String name1=scanner.nextLine();
        Iterator<Commodity>iterator=commodityArrayList.iterator();
        while (iterator.hasNext()){
            Commodity commodity2=iterator.next();
            if(commodity2.name.equalsIgnoreCase(name1)){
                commodityArrayList.remove(commodity2);
            }
        }
    }

    public void replaceCommodity(){
        System.out.println("Введіть назву товару:");
        scanner=new Scanner(System.in);
        String name2=scanner.nextLine();
        for (Commodity commodity :commodityArrayList) {
            if(commodity.name.equals(name2)){
                scanner=new Scanner(System.in);
                System.out.println("Введіть назву товару:");
                commodity.name=scanner.nextLine();
                System.out.println("Введіть вагу");
                commodity.weight=scanner.nextInt();
                System.out.println("Введіть довжину");
                commodity.length=scanner.nextInt();
                System.out.println("Введіть ширину");
                commodity.width=scanner.nextInt();
            }
        }
    }

    public void sortName(){
        Collections.sort(commodityArrayList,new NameComparator1());
        for (Commodity commodity:commodityArrayList) {
            System.out.println(commodity);
        }

    }

    public void sortLength(){
        Collections.sort(commodityArrayList,new LengthComparator());
        for (Commodity commodity:commodityArrayList) {
            System.out.println(commodity);
        }

    }

    public void sortWidth(){
        Collections.sort(commodityArrayList,new WidthComparator());
        for (Commodity commodity:commodityArrayList) {
            System.out.println(commodity);
        }

    }

    public void sortWeight(){
        Collections.sort(commodityArrayList,new WeightComparator());
        for (Commodity commodity:commodityArrayList) {
            System.out.println(commodity);
        }

    }

    public  void element(){
        System.out.println("Введіть індекс");
        scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        Commodity commodity1=commodityArrayList.get(i);
        System.out.println(commodity1);
    }

    public  void exit(){
        System.exit(0);
    }

    public static void menu(){
        System.out.println("Зроби свій вибір");
        System.out.println("1.Додати товар");
        System.out.println("2.Видалити товар");
        System.out.println("3.Замінити товар");
        System.out.println("4.Відсортувати за назвою");
        System.out.println("5.Відсортувати за довжиною");
        System.out.println("6.Відсортувати за шириною");
        System.out.println("7.Відсортувати за вагою");
        System.out.println("8.Отримати і-тий товар");
        System.out.println("9.Вийти з програми");
    }


    public static void main(String[] args) {
        menu();
        Commodity commodity=new Commodity();
        Scanner scanner1=new Scanner(System.in);
        String line=scanner1.next();
        while (!line.equals("10")) {
            switch (line) {
                case "1":
                    commodity.addCommodity();
                    break;
                case "2":
                    commodity.deleteCommodity();
                    break;
                case "3":
                    commodity.replaceCommodity();
                    break;
                case "4":
                    commodity.sortName();
                    break;
                case "5":
                    commodity.sortLength();
                    break;
                case "6":
                    commodity.sortWidth();
                    break;
                case "7":
                    commodity.sortWeight();
                    break;
                case "8":
                    commodity.element();
                    break;
                case "9":
                    commodity.exit();
                    break;

            }

            menu();
            line = scanner1.next();
        }

    }

    }



