package Tests;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArraySpeed {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            arrayList.add(i);
        }
        long startTime1 = System.currentTimeMillis();
        {
            for (int i = 0; i < 5000; i++){
                arrayList.add(50000, i);
            }
        }
        long time1 = System.currentTimeMillis() - startTime1;
        System.out.println("ARRAY_LIST'S SPEED --->>> " + time1); //SPEED 7333

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            linkedList.add(i);
        }
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        {
            for (int i = 0; i < 5000; i++){
                linkedList.add(50000, i);
            }
        }
        long time2 = System.currentTimeMillis() - startTime2;
        System.out.println("LINKED_LIST'S SPEED --->>> " + time2); //SPEED 77135
    }
}
