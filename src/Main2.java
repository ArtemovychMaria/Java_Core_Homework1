import java.util.Random;
import java.util.function.Predicate;
public class Main2 {

    public static void main(String[] args) {
        Predicate<Boolean>predicate = x -> x==true;
        if(predicate.test(new Random().nextBoolean())){
            System.out.println("Випала Решка");
        }else {
            System.out.println("Випав Орел");
        }

        System.out.println();

        System.out.println("==============Task3============");
        System.out.println();


        MaxMinValue floatMaxValue=str-> System.out.println(str);
        floatMaxValue.operate("Max Float:" + " "+ Float.MAX_EXPONENT);
        MaxMinValue doubleMaxValue=str-> System.out.println(str);
        doubleMaxValue.operate("Max Double:" + " " + Double.MAX_EXPONENT);
        MaxMinValue floatMinValue=str-> System.out.println(str);
        floatMinValue.operate("Min Float:" + " " + Float.MIN_EXPONENT);
        MaxMinValue doubleMinValue=str-> System.out.println(str);
        doubleMinValue.operate( "Min Double:" + " " + Double.MIN_EXPONENT);
    }

}

interface MaxMinValue{
    void operate(String str);
}

