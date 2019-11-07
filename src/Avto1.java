public class Avto1 {
    int horsepower;
    int year;

    public Avto1(int horsepower,int year){
        this.horsepower=horsepower;
        this.year=year;
    }

    @Override
    public String toString() {
        return "avto: " + horsepower + "," + year;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
