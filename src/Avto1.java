public class Avto1 {
    int horsepower;
    int year;

    public Avto1(int horsepower,int year){
        this.horsepower=horsepower;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Avto1{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                '}';
    }
}

