public class Helm {
    private int size;
    private  int d;

    public int getSize(){
        return size;
    }

    public int setDiametr(){
        this.d=d;
        return d;
    }
    public String toString(){
        return "Helm{" + "size=" + size +
                "; diametr=" + d + "}";
    }

    public int Augment(int d){
        return d+5;
    }


}
