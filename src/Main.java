import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        RobotDancer robot2 = new RobotDancer();
        RobotCooker robot3 = new RobotCooker();
        CoffeeRobot robot4 = new CoffeeRobot();
        robot1.work();
        robot2.work();
        robot3.work();
        robot4.work();
        ArrayList<Robot> robots =new ArrayList<Robot>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        robots.add(robot4);
        for (Robot robot:robots){
            robot.work();
        }

        System.out.println("===========Task2==============");
        Car car1=new Car();
        car1.ChangeWheel();
        car1.AugmentHelm();
        car1.WidthCab();

        System.out.println("======Task3=========");
        Animal animal1=new Animal();
        animal1.getName();
        animal1.getAge();
        animal1.getSpeed();
        System.out.println(animal1.toString());
        System.out.println("======================");
        animal1.setName("Тигр");
        animal1.setAge(5);
        animal1.setSpeed(15);
        System.out.println(animal1.toString());











    }
}
