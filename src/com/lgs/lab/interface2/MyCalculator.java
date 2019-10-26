package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MyCalculator implements Numerable {
    int a;
    int b;
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        MyCalculator myCalculator=new MyCalculator();
        System.out.println("Сума=" + myCalculator.add(a,b));
        System.out.println("Різниця=" + myCalculator.sub(a,b));
        System.out.println("Добуток=" + myCalculator.mul(a,b));
        System.out.println("Частка=" + myCalculator.div(a,b));
    }
        public int add(int a,int b){
            return a+b;
        }
        public int sub(int a,int b){
            return a-b;
        }
        public int mul(int a,int b){
            return a*b;
        }

        public int div(int a,int b){
            return a/b;
        }

}
