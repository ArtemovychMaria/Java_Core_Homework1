import java.util.*;

public class Zooclub {
    static Scanner scanner=new Scanner(System.in);
    Map<Person, List<Pet>> map=new HashMap<>();

    public void addpartisipant(){
        System.out.println("Введіть ім'я:");
        String name=scanner.next();
        System.out.println("Введіть вік:");
        int age=scanner.nextInt();
        Person person=new Person(name,age);
        map.put(person, new ArrayList<Pet>());
    }

    public void addpet(){
        System.out.println("Введіть ім'я:");
        String name=scanner.next();
        System.out.println("Введіть вік:");
        int age=scanner.nextInt();
        Person person=new Person(name,age);
        if (map.containsKey(person)){
            System.out.println("Введіть тип тваринки:");
            String petType = scanner.next();
            System.out.println("Введіть ім'я тваринки:");
            String petName = scanner.next();
            map.get(person).add(new Pet(petType, petName));
        }

    }


    public void deletepet() {
        System.out.println("Введіть ім'я:");
        String name = scanner.next();
        System.out.println("Введіть вік:");
        int age = scanner.nextInt();
        Person person=new Person(name,age);
        if (map.containsKey(person)) {
            System.out.println("Введіть тип тваринки:");
            String petType = scanner.next();
            System.out.println("Введіть ім'я тваринки:");
            String petName = scanner.next();
            Pet pet=new Pet(petType,petName);
            map.get(person).remove(pet);
        }
    }

    public void deleteparticipant(){
        System.out.println("Введіть ім'я:");
        String name = scanner.next();
        System.out.println("Введіть вік:");
        int age = scanner.nextInt();
        Person person=new Person(name,age);
        map.remove(person);
    }

    public void deletePetFromAll(){
        System.out.println("Введіть тип тваринки:");
        String petType = scanner.next();
        System.out.println("Введіть ім'я тваринки:");
        String petName = scanner.next();
        Pet pet=new Pet(petType,petName);

        Iterator<Map.Entry<Person,List<Pet>>>iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person,List<Pet>>next=iterator.next();
            next.getValue().remove(pet);
        }
    }

    public void showclub(){
        Iterator<Map.Entry<Person,List<Pet>>>iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Person,List<Pet>>next=iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }

}
