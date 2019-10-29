public abstract class Plane extends Control{
    int length;
    int width;
    int weight;

    void Plane(int length,int width,int weight){
        this.length=length;
        this.weight=weight;
        this.width=width;
    }
    void launch(int t1){
        System.out.println("До зльоту " + t1);
    }
    void fly(double t2){
        System.out.println("Політ триватиме " + t2);
    }
    void landing(){
        System.out.println("Літак іде на посадку");
    }


}

