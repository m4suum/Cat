package animals;

public abstract class Animals {
    private String name;
    private int age;
    private String color;

    public Animals(String name, int age, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override

    public String toString() {
        return ("Animal:\nName -> " + this.name + "\nAge -> " + this.age + "\nColor -> " + this.color);
    }
}
