public class Main {
    public static void main(String[] args) {
        //Використовуючи конструктор без параметрів
        Rectangle rectangle= new Rectangle();
        System.out.println("Площа прямокутника =" + rectangle.Square(rectangle.length,rectangle.width));
        System.out.println("Периметр прямокутника =" + rectangle.Perimetr(rectangle.length,rectangle.width));
        //Використовуючи конструктор з параметрами
        Rectangle rectangle1 = new Rectangle(4, 2);
        System.out.println("Площа прямокутника =" + rectangle.Square(rectangle1.length,rectangle1.width));
        System.out.println("Периметр прямокутника =" + rectangle.Perimetr(rectangle1.length,rectangle1.width));
        Circle circle1=new Circle();
        System.out.println("Площа круга =" + circle1.SquareCircle(4));
        System.out.println("Довжина кола=" + circle1.Length(2));
    }
}
