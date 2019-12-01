import java.util.Scanner;

public class RunnableThread implements Runnable{
    String name;
    int delay;

    public RunnableThread(String name, int delay) {
        super();
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
        System.out.print("\n"+ name+" ");
        for (int i = a-1; i >= 0; i--) {
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
