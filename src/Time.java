public class Time {

    int min;
    int hour;

    public Time(int min, int hour) {
        try {
            if (min < 0 || min > 60 || hour < 0 || hour > 24) {
                throw new MyException();
            }
        }catch (MyException e){
            System.out.println(e.toString());
        }
        this.min = min;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return hour + "год" +
                 min + "хв.";
    }
}
