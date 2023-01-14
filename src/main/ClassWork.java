package main;

import animals.Animals;
import animals.Cat;
import animals.Dog;
import animals.Mouse;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassWork {
    public static void main(String[] args) {
        String name;
        ArrayList<Cat> cats = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            name = "cat" + Integer.toString(i + 1);
            cats.add(i, new Cat(name, i + 2, "BLACK"));
        }
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            name = "dog" + Integer.toString(i + 1);
            dogs.add(i, new Dog(name, i + 2, "WHITE"));
        }
        LinkedList<Animals> animals = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                animals.add(cats.get(i));
            } else {
                animals.add(dogs.get(i));
            }
        }
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                animals.add(cats.get(i));
            } else {
                animals.add(dogs.get(i));
            }
        }
        int countOfCat = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                countOfCat++;
            }
            if (countOfCat == 5) {
                animals.remove(i);
                countOfCat = 0;
            }
        }
        int countOfDog = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                countOfDog++;
            }
            if (countOfDog == 3) {
                animals.add(i + 1, new Mouse(("Mouse" + Integer.toString(i + 1)), i - 2, "Grey"));
                countOfDog = 0;
            }
        }
        LinkedList<Animals> enemies = new LinkedList<>();
        for (int i = 0; i < animals.size() - 1; i++) {
            if ((animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse) || (animals.get(i) instanceof Mouse && animals.get(i + 1) instanceof Cat)) {
                enemies.add(animals.get(i));
                enemies.add(animals.get(i + 1));
            }
        }
        ArrayList<Animals> arrayOfAnimals = new ArrayList<>(animals);
        int catsAge = 0;
        int catsCount = 0;
        int dogsAge = 0;
        int dogsCount = 0;
        int miceAge = 0;
        int miceCount = 0;
        for (Animals arrayOfAnimal : arrayOfAnimals) {
            if (arrayOfAnimal instanceof Cat) {
                catsAge += arrayOfAnimal.getAge();
                catsCount++;
            } else if (arrayOfAnimal instanceof Dog) {
                dogsAge += arrayOfAnimal.getAge();
                dogsCount++;
            } else if (arrayOfAnimal instanceof Mouse) {
                miceAge += arrayOfAnimal.getAge();
                miceCount++;
            }
        }
        System.out.println("CATS'_AGE --->>> " + catsAge);
        System.out.println("CATS'_COUNT --->>> " + catsCount);
        System.out.println("DOGS'_AGE --->>> " + dogsAge);
        System.out.println("DOGS'_COUNT --->>> " + dogsCount);
        System.out.println("MICE'_AGE --->>> " + miceAge);
        System.out.println("MICE'_COUNT --->>> " + miceCount);
        LinkedList <Animals> peacefulAnimals = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i) instanceof Cat){
                peacefulAnimals.add(animals.get(i));
            }
        }
        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i) instanceof Dog){
                peacefulAnimals.add(animals.get(i));
            }
        }
        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i) instanceof Mouse){
                peacefulAnimals.add(animals.get(i));
            }
        }
        System.out.println(peacefulAnimals);
    }
}
