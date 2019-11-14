import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {
    List<Deputat>deputats=new ArrayList<>();
    public void adddeputat(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Surname:");
        String firstname=scanner.next();
        System.out.println("Name:");
        String deputatname=scanner.next();
        System.out.println("Age:");
        int deputatage=scanner.nextInt();
        System.out.println("habarnyk:");
        boolean deputathabarnyk=scanner.nextBoolean();
        Deputat deputat=new Deputat(firstname,deputatname,deputatage,deputathabarnyk);
        deputats.add(deputat);
    }

    public void removedeputat(){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Surname:");
        String firstname=scanner1.next();
        for (Deputat deputat:deputats) {
            if(deputat.surname.equals(firstname)){
            deputats.remove(deputat);}
        }
    }

    public void habarnyky(){
        for (Deputat deputat:deputats) {
            if(deputat.habarnyk==true){
                System.out.println(deputat);
            }
        }
    }

    public void besthabarnyk(){
        for (Deputat deputat:deputats) {
            deputat.givemoney();
        }
        int max=0;
        for (Deputat deputat:deputats) {
            if(deputat.moneysize>max){
                max=deputat.moneysize;
            }
        }

        for (Deputat deputat:deputats) {
            if(max==deputat.moneysize){
                System.out.println(deputat.surname);
            }
        }
    }

    public void showdeputats(){
        for (Deputat deputat:deputats) {
            System.out.println(deputat.toString());
        }

    }

    public void alldeputats(){
      deputats.clear();
    }





}
