import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Input your word:");
        Scanner sc =new Scanner(System.in);
        StringBuffer sb=new StringBuffer(sc.next());
        String str=sb.toString();
        System.out.println(sb.length());
        try {
            if (sb.length() != 5)
                throw new MyException();
            }
        catch(MyException e){
                e.printStackTrace();
            System.out.println(e.toString());
            }
        String str2=sb.reverse().toString();
        if(str.equalsIgnoreCase(str2)){
            System.out.println("Word is palindrom");
        }else
            System.out.println("Word is not palindrom");


        System.out.println("==========Task2==========");
        String str3="I love my mother";
        String str4=str3.replace("a","-");
        String str5=str4.replace("e","-");
        String str6=str5.replace("i","-");
        String str7=str6.replace("o","-");
        String str8=str7.replace("u","-");
        String str9=str8.replace("y","-");
        System.out.println(str9);
        }


    }
