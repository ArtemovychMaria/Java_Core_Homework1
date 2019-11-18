import java.util.*;

public class Dog implements Comparable <Dog> {
    String name;
    Integer age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Comparator<Dog>dogComparator=new NameComparator().thenComparing(new AgeComparator());

        Set<Dog>dogSet=new TreeSet<Dog>(dogComparator);
        dogSet.add(new Dog("Archi",3));
        dogSet.add(new Dog("Bob",3));
        dogSet.add(new Dog("Betchoven",1));
        dogSet.add(new Dog("Barsic",2));
        dogSet.add(new Dog("Baron",2));
        dogSet.add(new Dog("Baron",3));
        dogSet.add(new Dog("Baron",4));


        for (Dog dog:dogSet) {
            System.out.println(dog);
        }

        Set<Dog>dogSet1=new TreeSet<Dog>();
        dogSet1.add(new Dog("Archi",3));
        dogSet1.add(new Dog("Bob",3));
        dogSet1.add(new Dog("Betchoven",1));
        dogSet1.add(new Dog("Barsic",2));
        dogSet1.add(new Dog("Baron",2));
        dogSet1.add(new Dog("Baron",3));
        dogSet1.add(new Dog("Baron",4));

        System.out.println();
        System.out.println();
        System.out.println();

        for (Dog dog:dogSet1) {
            System.out.println(dog);
        }


    }


    @Override
    public int compareTo(Dog o) {
        int diff=this.name.compareToIgnoreCase(o.getName());
        if(diff!=0){
            return diff;
        }else {
        return this.age.compareTo(o.getAge());
    }}
}


