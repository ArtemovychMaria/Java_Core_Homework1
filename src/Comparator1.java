import java.util.Comparator;

public class Comparator1 implements Comparator<Avto1> {
    @Override
    public int compare(Avto1 o, Avto1 o1) {
        return ((Avto1)o).getYear()-((Avto1) o1).getYear();
    }
}
