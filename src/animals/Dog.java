package animals;

public class Dog extends Animals {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override

    public String toString() {
        return ("\nDog:\nName -> " + super.getName() + "\nAge -> " + super.getAge() + "\nColor -> " + super.getColor());
    }
}
