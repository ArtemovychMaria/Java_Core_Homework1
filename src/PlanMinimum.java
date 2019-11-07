import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PlanMinimum {
    public static void main(String[] args) {
        Integer [] myarray=new Integer[12];
        Random myRandom=new Random();
        for(int i=0;i<myarray.length;i++){
            myarray[i]=myRandom.nextInt(15);
            System.out.println("[" + i + "]= " + myarray[i]);
        }
        //Сортування по зростанню
        Arrays.sort(myarray);
        for(int i=0;i<myarray.length;i++){
        System.out.println("[" + i + "] = " + myarray[i]);
        }
        System.out.println("Сортування по спаданню");
        Arrays.sort(myarray, Collections.reverseOrder());
        for(int i=0;i<myarray.length;i++){
            System.out.println("[" + i + "] = " + myarray[i]);
        }






    }
}
