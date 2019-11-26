import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

class Map<K,V> extends MyEntry<K,V>{

    private LinkedHashMap<K,V>map=new LinkedHashMap<K,V>();

    public Map(K k, V v) {
        super(k,v);
        this.map = new LinkedHashMap<K, V>();
        this.map.put(k,v);
    }

    public void addMap(K k, V v){
        map.put(k,v);
    }

    public void deleteKey(K k){
        map.remove(k);
    }

    public void deletevalue(V v){
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            java.util.Map.Entry<K, V> next = iterator.next();
            if(next.getValue().equals(v)) {
                iterator.remove();
            }
        }

    }

    public void showSetKey(){
        Iterator<K> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }

    public void showListValue(){
        Iterator<java.util.Map.Entry<K, V>> iterator3 = map.entrySet().iterator();
        while (iterator3.hasNext()){
            System.out.println(iterator3.next().getValue());
        }
    }

    public void showMap(){
        Set<java.util.Map.Entry<K, V>> entries = map.entrySet();
        for(java.util.Map.Entry<K, V> item :entries){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
