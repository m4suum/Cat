package animals;

public class Mouse extends Animals {

    public Mouse(String name, int age, String color) {
        super(name, age, color);
    }

    @Override

    public String toString() {
        return ("\nMouse:\nName -> " + super.getName() + "\nAge -> " + super.getAge() + "\nColor -> " + super.getColor());
    }
}
