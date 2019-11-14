public class Person {
    int weight;
    int hight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", hight=" + hight +
                '}';
    }
}
