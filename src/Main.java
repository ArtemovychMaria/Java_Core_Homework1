
public class Main {
    public static void main(String[] args) {
        Cy_27 cy_27=new Cy_27(140,"red");
        int max= cy_27.MaxSpeed;
        cy_27.launch((int)(Math.random()*69+20));
        cy_27.fly((Math.random()*1001));
        cy_27.moveup((int) (Math.random()*50));
        cy_27.movedown((int)(Math.random()*50));
        cy_27.moveback((int)(Math.random()*50));
        cy_27.moveforvard((int)(Math.random()*50));
        cy_27.technologyStels((int)(Math.random()*10));
        cy_27.nuclearStrike((int)(Math.random()*50));
        cy_27.turboAcceleration((int)(Math.random()*max+10));
        cy_27.landing();
    }
}
