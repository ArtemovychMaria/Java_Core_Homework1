import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread("Потік Thread",1000);
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RunnableThread runnableThread=new RunnableThread("Потік Runnable",1000);
        new Thread(runnableThread).start();



    }
}


