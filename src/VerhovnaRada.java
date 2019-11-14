import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Fraction fraction=new Fraction();
        fractionList.add(fraction);
    }

    public void removefraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fractionList.remove(i);
    }

    public void showfractions(){
        for (Fraction fraction:fractionList) {
            System.out.println("========");
            fraction.showdeputats();
        }
    }

    public void showfraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.showdeputats();
    }

    public void addtofraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        Fraction fraction2=fractionList.get(i);
        fraction2.adddeputat();
    }

    public void removeinfraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.removedeputat();
    }

    public void fractionhabarnyky(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.habarnyky();
    }

    public void fractionbesthabarnyk(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.besthabarnyk();
    }

    public void fraction(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.showdeputats();
    }

    public void deletefractiondeputats(){
        scanner2=new Scanner(System.in);
        System.out.println("Input fraction number:");
        int i=scanner2.nextInt();
        fraction1=fractionList.get(i);
        fraction1.alldeputats();
    }


}
