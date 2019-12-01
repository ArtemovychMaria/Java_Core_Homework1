import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread{
    String name;
    int delay = 1;

    public MyThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість чисел Фібоначі:");
        a = scanner.nextInt();
        int m0 = 1;
        int m1 = 1;
        int m2;
        int[] array = new int[a];
        array[0] = m0;
        array[1] = m1;
        for (int i = 2; i < a; i++) {
            m2 = m0 + m1;
            array[i] = m2;
            m0 = m1;
            m1 = m2;
        }
        System.out.print(name+" ");
        for (int i =0; i<a; i++) {
            System.out.print(array[i] + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
