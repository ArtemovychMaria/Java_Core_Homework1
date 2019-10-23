public class Car {
    private int hight;
    private int width;
    Cab cab1= new Cab() ;
    Wheel wheel1 =new Wheel();
    Helm helm1= new Helm();

    public int getHight(){
        return hight;
    }

    public int setWidth(){
        this.width=width;
        return width;
    }

    public String toString(){
        return "Car {" + "Hight=" + hight + "; Width=" + width + "}";
    }
    public void ChangeWheel(){
        System.out.println("Початковий радіус=" + wheel1.getR());
        System.out.println("Колесо замінено , Новий радіус=" + wheel1.AugmentRadius(wheel1.getR()));
    }
    public void AugmentHelm(){
        int d3=helm1.setDiametr();
        System.out.println("Діаметр нового керма=" + helm1.Augment(d3));
    }

    public void WidthCab(){
        int width2=cab1.getWidth();
        System.out.println("Нова ширина=" + cab1.AugmentWidth(width2));
    }


}
