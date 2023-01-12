package main;

import cat.Cat;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 1, "Grey");
        Cat cat2 = new Cat("Cat2", 2, "Brown");
        Cat cat3 = new Cat("Cat3", 3, "Black");
        Cat cat4 = new Cat("Cat4", 4, "White");
        Cat cat5 = new Cat("Cat5", 5, "Black and White");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        int [] nums = new int [100000000];
        for (int i = 0; i < 100000000; i++){
            nums [i] = i+1;
        }
//        for (Cat cat : cats){
//            System.out.println(cat + "\n");
//        }
//        System.out.println("INDEX_OF_CAT! --->>> " + cats.indexOf(cat1));
//        System.out.println("[CATS]_CONTAINS_CAT2 --->>> " + cats.contains(cat2));
//        System.out.println("CAT1_EQUALS_CAT2 --->>> " + cat1.equals(cat2));
//        System.out.println();
//        factorialComplexity(10);
//        searchCat(cats);
        long startTime1 = System.currentTimeMillis();
        {
            invalidSearch(nums, 99999999); //44-52 sec
        }
        long time1 = System.currentTimeMillis() - startTime1;
        System.out.println("INVALID_METHOD --->>> " + time1);

        System.out.println();

        long startTime2 = System.currentTimeMillis();
        {
            System.out.println(binarySearch(nums, 9999919)); //0 sec
        }
        long time2 = System.currentTimeMillis() - startTime2;
        System.out.println("VALID_METHOD --->>> " + time2);

    }
    public static void invalidSearch (int [] nums, int num){
        boolean truth = false;
        for (int i = 0; i < nums.length; i++){
            if (nums [i] == num){
                System.out.println("NUM'S_INDEX --->>> " + i);
                truth = true;
                break;
            }
        }
        if (!truth) System.out.println("NO_NUM");
    }
    public static void searchCat (ArrayList<Cat> cats){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your cat's name ");
        String name = scanner.next();
        System.out.print("Enter your cat's age ");
        int age = scanner.nextInt();
        boolean result = false;
        for (Cat cat : cats){
            if ((cat.getName().toLowerCase()).equals(name.toLowerCase()) && cat.getAge() == age){
                System.out.println(cat);
                result = true;
                break;
            }
        } if (!result) System.out.println("There is no such cat");
    }
    public static void factorialComplexity (int n){ // O (n!) factorial complexity
        for (int i = 0; i < n; i++){
            factorialComplexity(n-1);
        }
    }
    public static int binarySearch(int[] nums, int item) {
        if (nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int num = nums[mid];
            if (num == item) {
                return mid;
            } else if (num > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}