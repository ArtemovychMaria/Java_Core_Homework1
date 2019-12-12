package Task1;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Fraction {

    String name;

    public Fraction(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", deputats=" + deputats +
                '}';
    }

    List<Deputat>deputats=new ArrayList<>();
    public void adddeputat() {

        Supplier<Deputat> deputatSupplier = () -> {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Surname:");
            String firstname = scanner.next();
            System.out.println("Name:");
            String deputatname = scanner.next();
            System.out.println("Age:");
            int deputatage = scanner.nextInt();
            System.out.println("habarnyk:");
            boolean deputathabarnyk = scanner.nextBoolean();
            return new Deputat(firstname,deputatname,deputatage,deputathabarnyk);
        };
        Deputat deputat = deputatSupplier.get();
        deputats.add(deputat);
    }

    public void removedeputat(){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Surname:");
        String firstname=scanner1.next();
        Predicate<Deputat>deputatPredicate=x->x.getSurname()==firstname;
        for (Deputat deputat:deputats) {
            if(deputatPredicate.test(deputat)){
            deputats.remove(deputat);}
        }
    }

    public void habarnyky(){
           deputats.stream().filter(x->x.habarnyk==true).forEach(System.out::println);
    }

    public void besthabarnyk(){

        deputats.stream().forEach(x->x.givemoney());
        Comparator<Deputat>deputatComparator=(x,y)->(x.moneysize>y.moneysize)?1:(x.moneysize==y.moneysize)?0:1;
        Optional<Deputat>besthabarnyk=deputats.stream().max(deputatComparator).filter(Deputat::isHabarnyk);
        if(besthabarnyk.isPresent()){
            System.out.println(besthabarnyk.get().toString());
        }else
            System.out.println("");

    }

    public void showdeputats(){
      deputats.stream().forEach(System.out::println);

    }

    public void alldeputats(){
      deputats.clear();
    }
}
