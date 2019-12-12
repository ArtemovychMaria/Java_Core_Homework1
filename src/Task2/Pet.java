package Task2;
import java.util.Objects;

public class Pet {
    String petType;
    String petName;

    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pet animal = (Pet) obj;
        return Objects.equals(petType, animal.petType) && Objects.equals(petName, animal.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, petName);
    }
}
