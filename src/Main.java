import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer,Integer>map= new Map<>(2,3);
        map.addMap(1,4);
        map.addMap(4,6);
        map.addMap(5,6);
        map.addMap(3,5);
        map.showMap();
        System.out.println();

        map.deleteKey(1);
        map.showMap();
        System.out.println();

        map.deletevalue(6);
        System.out.println();
        map.showMap();
        System.out.println();


        map.showMap();
        System.out.println("Ключі мапи");
        map.showSetKey();


        map.showMap();
        System.out.println("Значення мапи");
        map.showListValue();
    }


}
