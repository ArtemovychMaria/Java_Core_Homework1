package Task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VerhovnaRada {
    Fraction fraction1;
    Scanner scanner2;
    private static VerhovnaRada vr;
    private VerhovnaRada(){
    }
    public static VerhovnaRada getvr(){
        if(vr==null){
            vr=new VerhovnaRada();
        }
    return vr;
    }

    List<Fraction>fractionList=new ArrayList<>();

    public void addfraction(){
        Supplier<Fraction>fractionSupplier=()->{
            scanner2=new Scanner(System.in);
            System.out.println("Input fraction name:");
            String fract=scanner2.nextLine();
            return new Fraction(fract);
        };
        Fraction fraction=fractionSupplier.get();
        fractionList.add(fraction);
    }

    public void removefraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction index:");
        final int i=scanner2.nextInt();
        Predicate<Integer>fractionPredicate=x->x==i;
        for (Fraction fract:fractionList) {
            int j=0;
            if (fractionPredicate.test(j)){
                fractionList.remove(j);
            }
            j++;
        }

    }

    public void showfractions(){
        fractionList.stream().forEach(Fraction::showdeputats);
    }

    public void showfraction(){

        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.showdeputats());
    }

    public void addtofraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.adddeputat());
    }

    public void removeinfraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.removedeputat());
    }

    public void fractionhabarnyky(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.habarnyky());
    }

    public void fractionbesthabarnyk(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.besthabarnyk());
    }

    public void fraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.showdeputats());

    }

    public void deletefractiondeputats(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.stream().skip(i).limit(1).forEach(x->x.alldeputats());
    }


}
