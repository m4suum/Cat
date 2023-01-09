package cat;

public class Cat {
    private int name;
    private int age;

    public Cat(int name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override

    public String toString () {
        return ("Cat:\nName " + this.name + "\nAge " + this.age);
    }
}
