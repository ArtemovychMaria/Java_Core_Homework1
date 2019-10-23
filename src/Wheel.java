public class Wheel {
    private int r=4;
    private int h;
    public int getR(){
        return r;
    }

    public int setH(){
        this.h=h;
        return h;
    }
    public String toString(){
        return "Cab{" + "hight=" + h +
                "; radius=" + r + "}";
    }
    public int AugmentRadius(int r){
        return r*3;
    }

}
