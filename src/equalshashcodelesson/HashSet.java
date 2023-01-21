package equalshashcodelesson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set <Cats> cats = new java.util.HashSet<>();
        Cats cat1 = new Cats("Garfield", 3, "Red");
        Cats cat5 = new Cats("Garfield", 3, "Red");
        Cats cat2 = new Cats("Vasily", 5, "White");
        Cats cat3 = new Cats("Murka", 6, "Black");
        Cats cat4 = new Cats("Kote", 8, "Grey");
        Cats cat6 = new Cats("Kote", 8, "Grey");
        cats.add (cat1);
        cats.add (cat2);
        cats.add (cat3);
        cats.add (cat4);
        cats.add (cat5);
        System.out.println("SIZE OF HASH SET --->>> " + cats.size());
        cats.add (cat1);
        cats.add (cat2);
        cats.add (cat3);
        cats.add (cat4);
        cats.add (cat5);
        System.out.println("SIZE OF HASH SET AFTER ADDING SAME CATS --->>> " + cats.size());
        cats.add(cat6);
        System.out.println("SIZE OF HASH SET AFTER ADDING NEW CAT --->>> " + cats.size());

        for (Iterator<Cats> it = cats.iterator(); it.hasNext();){
            Cats cat = it.next();
            if (cat.equals(cat3)) System.out.println("Cat3 was found in HashSet");
        }

        ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            for (int k = 1; k <= 100; k++){
                nums.add (k);
            }
        }
        int arraySum = 0;
        for (Integer num : nums){
            arraySum += num;
        }
        System.out.println("SUM OF INTS IN ARRAYLIST --->>> " + arraySum);

        Set <Integer> ints = new java.util.HashSet<>();
        for (Integer num : nums){
            ints.add(num);
        }
        int hashSetSum = 0;
        for (Integer num : ints){
            hashSetSum += num;
        }
        System.out.println("SUM OF INTS IN HASHSET --->>> " + hashSetSum);
    }
}
