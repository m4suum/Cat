package equalshashcodelesson;

import animals.Animals;

public class Cats extends Animals {

    public Cats(String name, int age, String color) {
        super(name, age, color);
    }

    @Override

    public String toString() {
        return ("\nCat:\nName -> " + super.getName() + "\nAge -> " + super.getAge() + "\nColor -> " + super.getColor());
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) return true;
        if (object instanceof Cats) {
            return (((Cats) object).getName().equals(this.getName()) && ((Cats) object).getAge() == this.getAge() && ((Cats) object).getColor().equals(this.getColor()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
