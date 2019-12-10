public class Task5 {

    public static void main(String[] args) {


        Amphibia eat = () -> System.out.println("Amphibia is eating");
        Amphibia sleep = () -> System.out.println("Amphibia is sleeping");
        Amphibia swim = () -> System.out.println("Amphibia is swiming");
        Amphibia walk = () -> System.out.println("Amphibia is walking");

        eat.act();
        sleep.act();
        swim.act();
        walk.act();
    }

}
interface Amphibia{
    void act();
}
