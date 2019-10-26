public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.setNumber(170);
        worker.salary();
        FixWorker fixWorker=new FixWorker();
        fixWorker.salary();
        System.out.println("======Task2==========");

    }
}
