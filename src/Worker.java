public class Worker implements Salary{
    int number;
    int hour=80;
    int s;

    void setNumber(int number){
        this.number=number;
    }
    public void salary(){
        int s=80*number;
        System.out.println("Month salary=" + s + "грн.");
    }
}
