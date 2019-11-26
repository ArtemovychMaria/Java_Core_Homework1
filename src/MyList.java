import java.util.ArrayList;
import java.util.List;

public class MyList{

    public static void addElement(List list){
        list.add("Marichka");
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        addElement(list);
        System.out.println(list.get(0));
    }
}

