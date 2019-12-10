import java.util.function.Supplier;

public class Person {

    String name;
    int age;
    String nick;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name,int age,String nick){
        this(name,age);
        this.nick=nick;
    }

    public Person() {

    }

    public static void main(String[] args) {
        PersonFactory personFactory=Person::new;
        Person person =personFactory.create("Mariia",23,"Marichka");
        System.out.println("Person:" + person.name+ " " + person.age + " " + person.nick);
    }
}

interface PersonFactory{
    Person create(String name,int age,String nick);
}


