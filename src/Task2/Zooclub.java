package Task2;
import java.util.*;
import java.util.function.Supplier;

public class Zooclub {
    static Scanner scanner=new Scanner(System.in);
    Map<Person, List<Pet>> map=new HashMap<>();

    public void addpartisipant(){
        Supplier<Person>personSupplier=()->{
        System.out.println("Введіть ім'я:");
        String name=scanner.next();
        System.out.println("Введіть вік:");
        int age=scanner.nextInt();
        return new Person(name,age);
        };

        Person person=personSupplier.get();
        map.put(person, new ArrayList<Pet>());
    }

    public void addpet(){
            Supplier<Person>personSupplier=()->{
            System.out.println("Введіть ім'я:");
            String name = scanner.next();
            System.out.println("Введіть вік:");
            int age = scanner.nextInt();
            return new Person(name,age);
        };

        Person person=personSupplier.get();
        if (map.containsKey(person)){
            Supplier<Pet>petSupplier=()-> {
                System.out.println("Введіть тип тваринки:");
                String petType = scanner.next();
                System.out.println("Введіть ім'я тваринки:");
                String petName = scanner.next();
                return new Pet(petType,petName);
            };
            map.get(person).add(petSupplier.get());
        }

    }


    public void deletepet() {
        Supplier<Person>personSupplier=()->{
        System.out.println("Введіть ім'я:");
        String name = scanner.next();
        System.out.println("Введіть вік:");
        int age = scanner.nextInt();
        return new Person(name,age);};
        Person person=personSupplier.get();
        if (map.containsKey(person)) {
            Supplier<Pet>petSupplier=()->{
            System.out.println("Введіть тип тваринки:");
            String petType = scanner.next();
            System.out.println("Введіть ім'я тваринки:");
            String petName = scanner.next();
            return new Pet(petType,petName);};
            Pet pet=petSupplier.get();
            map.get(person).remove(pet);
        }
    }

    public void deleteparticipant(){
        Supplier<Person>personSupplier=()->{
        System.out.println("Введіть ім'я:");
        String name = scanner.next();
        System.out.println("Введіть вік:");
        int age = scanner.nextInt();
        return new Person(name,age);};
        Person person=personSupplier.get();
        map.remove(person);
    }

    public void deletePetFromAll(){
        Supplier<Pet>petSupplier=()->{
        System.out.println("Введіть тип тваринки:");
        String petType = scanner.next();
        System.out.println("Введіть ім'я тваринки:");
        String petName = scanner.next();
        return new Pet(petType,petName);};

        Pet pet=petSupplier.get();

        Iterator<Map.Entry<Person,List<Pet>>>iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person,List<Pet>>next=iterator.next();
            next.getValue().remove(pet);
        }
    }

    public void showclub(){
       map.entrySet().stream().forEach(System.out::println);

        }
    }

