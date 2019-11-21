import java.lang.reflect.*;
import java.util.Scanner;

public class Toy {
    public String type;
    int number;
    protected double weight;
    public String name;
    private double price;

    public Toy(){}


    public Toy(String type, double weight, String name, double price) {
        this.type = type;
        this.weight = weight;
        this.name = name;
        this.price = price;
    }

    public Toy(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Toy(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type='" + type + '\'' +
                ", number=" + number +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void myMethod(String name,int number){
        //збільшення кількості іграшок
        this.number+=number;
        System.out.println("Нова кількість іграшок" + name + "=" + this.number);
    }

    public void myMethod2(int suma){
        //знижка ціни на певну суму
        this.price-=suma;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class<Toy> toyClass = Toy.class;
        System.out.println("Створення екземпляру класу:");
        Toy toy = toyClass.newInstance();

        System.out.println(toy);
        System.out.println();

        System.out.println("Отримання імені класу:");

        System.out.println(toyClass.getName());
        System.out.println(toyClass.getSimpleName());
        System.out.println();

        System.out.println("Кількість модифікаторів:" + toyClass.getModifiers());
        System.out.println();

        System.out.println("Є публічні модифікатори? - " + Modifier.isPublic(toyClass.getModifiers()));

        System.out.println(Modifier.isStatic(toyClass.getModifiers()));

        System.out.println("Клас абстрактний? - " + Modifier.isAbstract(toyClass.getModifiers()));

        System.out.println();

        System.out.println("Constructors:");
        Constructor<?>[] constructors = toyClass.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }


        System.out.println();
        System.out.println("Типи параметрів усіх конструкторів:");
        for (Constructor constructor:constructors) {
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class type:parameterTypes) {
                System.out.println(type);
            }
            System.out.println();
        }

        System.out.println("Отримання конструктора за типами його параметрів:");
        Constructor<Toy> baseConstructor = toyClass.getConstructor(String.class,double.class, String.class,double.class);
        System.out.println(baseConstructor);
        System.out.println();

        System.out.println("Створення об'єкта за отриманим конструктором");

        Toy toy1 = baseConstructor.newInstance(new Object[]{"Doll", 0.2, "Anna", 45.9});
        System.out.println(toy1);
        System.out.println();

        System.out.println("Публічні поля:");
        Field[] fields = toyClass.getFields();
        for (Field field:fields) {
            System.out.println(field);
        }
        System.out.println();

        System.out.println("Усі поля класу:");

        Field[] allfields = toyClass.getDeclaredFields();
        for (Field field:allfields) {
            System.out.println(field);
        }
        System.out.println();

        System.out.println("Methods of class Toy:");
        System.out.println();

        Method[] methods = toyClass.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println();

        System.out.println("==================MAX===================");

        Field name = toy1.getClass().getField("name");
        name.set(toy1,"Izabella");
        System.out.println(toy1);

        Method myMethod = toyClass.getMethod("myMethod", String.class, int.class);
        myMethod.invoke(toy1,toy1.getName(),3);
        System.out.println(toy1);
        myMethod.invoke(toy1,toy1.getName(),3);
        System.out.println(toy1);
        System.out.println();

        Method myMethod2 = toyClass.getMethod("myMethod2", int.class);
        myMethod2.invoke(toy1,4);
        System.out.println(toy1);


    }


}

