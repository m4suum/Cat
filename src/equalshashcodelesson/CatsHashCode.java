package equalshashcodelesson;


import java.util.ArrayList;

public class CatsHashCode {
    public static void main(String[] args) {
        ArrayList<Cats> cats = new ArrayList<>();
        Cats cat1 = new Cats("Garfield", 3, "Red");
        Cats cat5 = new Cats("Garfield", 3, "Red");
        Cats cat2 = new Cats("Vasily", 5, "White");
        Cats cat3 = new Cats("Murka", 6, "Black");
        Cats cat4 = new Cats("Kote", 8, "Grey");
        cats.add (cat1);
        cats.add (cat2);
        cats.add (cat3);
        cats.add (cat4);
        cats.add (cat5);

        for (int i = 0; i < cats.size(); i++){
            for (int k = i+1; k < cats.size(); k++){
                if (cats.get(i).equals(cats.get(k))){
                    System.out.println("Cat №" + i + " == " + "Cat №" + k);
                }
            }
        }

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());
    }
}
