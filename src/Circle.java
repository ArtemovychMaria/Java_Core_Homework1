public class Circle {
    double radius;
    double d;
    public Circle(){
        this.radius=5;
    }
    public Circle(double d1){
        this.d =d1;
    }
    public double SquareCircle(double d){
        return (Math.PI*d*d)/4;
    }

    public double Length(double radius){
        return 2*Math.PI*radius;
    }
}
