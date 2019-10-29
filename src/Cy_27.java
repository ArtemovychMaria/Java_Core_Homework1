public class Cy_27 extends Plane implements Specialfunction{
    int MaxSpeed;
    String color;

    public Cy_27(int MaxSpeed,String color){
        this.MaxSpeed=MaxSpeed;
        this.color=color;
    }
    @Override
    public void turboAcceleration(int a1) {
        System.out.println("Швидкість " + a1);

    }

    @Override
    public void technologyStels(int t3) {
        System.out.println("Літака не видно " + t3);
    }

    @Override
    public void nuclearStrike(int n) {
        System.out.println("Скинуто боєголовок " + n);
    }
}
