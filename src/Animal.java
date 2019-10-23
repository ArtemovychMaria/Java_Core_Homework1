public class Animal {
    String name;
    int speed;
    int age;

    public Animal(){
        this.name="Лев";
        this.speed=14;
        this.age=5;}
     public Animal(String name,int speed,int age){
        this.name=name;
        this.speed=speed;
        this.age=age;
     }

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name=name;
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    public int setSpeed(int speed){
        this.speed=speed;
        return speed;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        this.age=age;
        return age;
    }

    public String toString(){
        return "Назва тварини=" + name + ", Швидкість тварини=" + speed + ", Вік тварини=" + age;
    }

}
