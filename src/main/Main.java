package main;

import cat.Cat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1,1);
        Cat cat2 = new Cat(2,2);
        Cat cat3 = new Cat(3,3);
        Cat cat4 = new Cat(4,4);
        Cat cat5 = new Cat(5,5);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        System.out.println(cats.indexOf(cat1));
        System.out.println(cats.contains(cat2));
        System.out.println(cat1.equals(cat2));
    }
}