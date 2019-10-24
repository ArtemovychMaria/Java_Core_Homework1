import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cow cow=new Cow();
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.voice();
        cow.voice();
        dog.voice();

        System.out.println("====Task2===========");

        Random random=new Random();
        if(random.nextBoolean()==true){
            System.out.println("Випав Орел");
        }
        else
            System.out.println("Випала Решка");

        System.out.println("=========Task3============");


        System.out.println(String.format("Min float: %e, Max float: %e, Min double: %e, Max double: %e",Float.MIN_VALUE,Float.MAX_VALUE,Double.MIN_VALUE,Double.MAX_VALUE));

        System.out.println("=========Task4============");

        Triangle triangle=new Triangle(2,1,3);

        System.out.println("================Task5=============");

        Amphibia frog=new Frog();
        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();



    }

}
