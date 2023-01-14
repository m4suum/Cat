package animals;

public class Cat extends Animals {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override

    public String toString() {
        return ("\nCat:\nName -> " + super.getName() + "\nAge -> " + super.getAge() + "\nColor -> " + super.getColor());
    }
}
