import java.util.Scanner;

public class Deputat extends Person{
    String surname;
    String name;
    int age;
    boolean habarnyk;
    int moneysize;

    public Deputat(String surname, String name, int age, boolean habarnyk) {
      this.surname = surname;
        this.name = name;
        this.age = age;
        this.habarnyk = habarnyk;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHabarnyk() {
        return habarnyk;
    }

    public void setHabarnyk(boolean habarnyk) {
        this.habarnyk = habarnyk;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", habarnyk=" + habarnyk +
                ", moneysize=" + moneysize +
                '}';
    }

    public void givemoney(){
        int money;
        Scanner sc=new Scanner(System.in);
        if(this.habarnyk==false){
            System.out.println("Цей депутат не бере хабарів");
        }else {
            System.out.println("Введіть кількість грошей");
            money=sc.nextInt();
            if(money>5000){
                System.out.println("Міліція ув'язнить депутата");
            }else
                moneysize=money;
        }

    }
}
