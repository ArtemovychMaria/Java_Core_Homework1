public class Cab {
private int width =150;
private int length;

public int getWidth(){
    return  width;
}

public int setLength(){
    this.length=length;
    return length;
}
public String toString(){
    return "Cab{" + "width=" + width +
            "; length=" + length + "}";
}
public int AugmentWidth(int width){
    return width+15;
}
}
