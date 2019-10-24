public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a,int b){
        this.a=a;
        this.b=b;
    }

    public Triangle(int a,int b,int c){
        this(a,b);
        this.c=c;
    }
}
